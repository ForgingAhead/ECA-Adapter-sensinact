package nii.bigclout.sensinact.ecaadapter.translator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Resource;
import org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT;
import org.eclipse.sensinact.studio.language.sensinact.SensinactFactory;

import nii.bigclout.ecaadapter.dsl.Action;
import nii.bigclout.ecaadapter.dsl.Element;
import nii.bigclout.ecaadapter.dsl.ElseDoSpec;
import nii.bigclout.ecaadapter.dsl.ElseIfDoSpec;
import nii.bigclout.ecaadapter.dsl.IfDoSpec;
import nii.bigclout.ecaadapter.dsl.Resource;
import nii.bigclout.ecaadapter.dsl.Resource_Object;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.ecaadapter.dsl.State;
import nii.bigclout.ecaadapter.dsl.Trigger;
import nii.bigclout.sensinact.ecaadapter.controller.AppDeployConflictHandler;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelLoader;
import nii.bigclout.sensinact.ecaadapter.translator.util.ECAConstants;
import nii.bigclout.sensinact.ecaadapter.translator.util.ResourceMapping;
import nii.bigclout.sensinact.ecaadapter.translator.util.SnaParser;
import nii.bigclout.sensinact.ecaadapter.translator.util.SpecParser;

public class Translator {
	
	/**resMappings is in fact a mapping between the original .sna resources and the .spec resources.
	 * Map<appID, the app's mapping of its resources from the .sna to .spec>
	*/
	private static Map<String, ResourceMapping> resMappings = new HashMap<String,ResourceMapping>();

	
	/**
	 * Translate the specified .sna file (from fileURL) to a .spec file.
	 * @param fileURL the given .sna file
	 * @return the file path of the generated .spec file
	 */
	public static String snaFilePath2specFilePath(String fileURL) {
		DSL_SENSINACT sna = SnaModelLoader.loadModelFromFilePath(fileURL);
		
		String fileName = new File(fileURL).getName();
		fileName = fileName.replaceFirst("[.][^.]+$", "");//remove the file extension
		
		return snaModel2specFilePath(fileName, sna);
	}
	
	/**
	 * Translate the .sna model to .spec file
	 * @param fileName this fileName does not contain extension
	 * @param sna the sensinact application/rule model
	 * @return the file URL. i.e. the file path, of the generated spec file.
	 */
	public static String snaModel2specFilePath(String fileName, DSL_SENSINACT sna) {
		
		try {
			//0. create the .spec file
			//TODO "input/" "/output" file location not specified yet...
			String outputFilePath = ECAConstants.OUTPUT_FILE_LOCATION + fileName + ECAConstants.SPEC_FILE_EXTENSION;
			File outputFile = new File(AppDeployConflictHandler.getBaseFile(),outputFilePath);
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
			writer.write("environment {\r\n");
			
			//1. write environment meta-data
			Map<String, Set<String>> states = null;	//<specResourceName, states>
			Map<String, String> belongs = new HashMap<String, String>(); //<state, device>
			
			//filter out the resources and their states...
			ArrayList<String> triggers = new ArrayList<String>(); //some kind of sensors or events...

			if(sna.getOn() != null) {
				for(DSL_REF_CONDITION condition : sna.getOn().getTriggers()) {
					triggers.add(condition.getRef().getName());
					writer.write("resource " + condition.getRef().getName() + " can be triggered \r\n");
				}
			}
			
			states = SnaParser.parseStatefulResources(sna);
			
			for(String res : states.keySet()) {
				System.out.println("Resource: " + res);
				writer.write("resource " + res + " can be ");
				int count=states.get(res).size();
				for(String val : states.get(res)) {
					count--;
					writer.write(val);
					belongs.put(val, res);
					if(count>0)
						writer.write(" , ");
				}
				writer.write("\r\n");

			}
			
			//TODO the mappings...
			resMappings.put(fileName, getResourceMapping(fileName, states, sna.getResources()));
			
			
			writer.write("}\r\n\r\n");
			
			writer.write("app " + fileName + "{\r\n");
			
			////2. get the events as triggers
			writer.write("on ");////////////////////TO-DO/////////////will there be cases that something is unsubscribed??
			for(int i=0; i<triggers.size();i++) {
				writer.write(triggers.get(i) + " is triggered");//////////???hard code for now...to check 
				if(i<triggers.size()-1)
					writer.write(", ");//....	
			}
			writer.write("\r\n if ");
			
			//3. get the if do rule.............. how to do it
			
			SnaParser.parseExpression(sna.getEca().getIfdo().getCondition(), writer);
			
			writer.write("\r\n do ");
			SnaParser.parseActions(sna.getEca().getIfdo().getActions().getActionList(), writer, belongs);
			
			
			//4. get the else if do rules....
			if(sna.getEca().getElseIfdo()!=null && sna.getEca().getElseIfdo().size() >0 ) {
				for(DSL_ElseIfDo eid : sna.getEca().getElseIfdo()) {
					writer.write(" else if ");
					SnaParser.parseExpression(eid.getCondition(), writer);
					writer.write(" do \r\n");
					SnaParser.parseActions(eid.getActions().getActionList(), writer, belongs);
					writer.write("\r\n");
				}
			}
			
			//5. get the else do rules...
			if(sna.getEca().getElsedo()!=null && sna.getEca().getElsedo().getActions().getActionList().size()>0) {
				writer.write(" else do \r\n");
				SnaParser.parseActions(sna.getEca().getElsedo().getActions().getActionList(), writer, belongs);
			}
			
			writer.write("}\r\n");
			writer.close();
			
			return outputFile.getAbsolutePath();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Should not be here... @Translator.snaModel2specFilePath ");
		return null;
	}
	
	/**
	 * 
	 * @param appID
	 * @param sna
	 * @return
	 */
	public static InputStream sna2specInputStream(String appID, InputStream sna) {
		//sna inputstream to sna model
		String specFilePath;
		try {
			
			specFilePath = snaModel2specFilePath(appID, SnaModelLoader.loadModel(appID, sna));
			
			return new FileInputStream(specFilePath);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Should't be here...sna2specInputStream. Null inputstream will be returned.");
		return null;
	}
	
	/**
	 * 
	 * @param appID
	 * @param spec
	 * @return
	 */
	public static InputStream spec2snaInputStream(String appID, InputStream spec) {
		//TODO
		String snaFilePath = specModel2snaFilePath(appID, SpecModelLoader.loadModel(appID, spec));
		
		try {
			return new FileInputStream(snaFilePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Should't be here...spec2snaInputStream. Null inputstream will be returned.");
		return null;
	}
	
	/**
	 * Translate the specified Spec Model to .sna file
	 * @param fileName the file path to store the generated .sna file
	 * @param model the to-be-translated Spec model
	 * @return
	 */
	public static String specModel2snaFilePath(String fileName, RunTimeModel model) {
		//TODO this method may not be necessary as any updates of the model can be done by directly updating the
		// .sna model, e.g. add/remove a condition...
		
		String outputFileName = AppDeployConflictHandler.getBaseFile().getAbsolutePath() + "/" + 
								ECAConstants.OUTPUT_FILE_LOCATION + fileName + ECAConstants.SNA_FILE_EXTENSION;
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
			
			//1. get the resources.
			/** List<String> resources = new ArrayList<String>();
			for( Resource rs : model.getEnvData().get(0).getResources() ) {
				resources.add(rs.getName());
				for(State s: rs.getStates()) {
					resources.add(s.getName());
				}
			} */
			//TODO make sure that this resMap contains all the concepts in the RunTimeModel...
			ResourceMapping resMap = resMappings.get(fileName);
			
			for(DSL_Resource rs : resMap.getResources()) {
				if(rs!=null) {
					//TODO write to the file...
					writer.write(SnaModelSerialization.resource2String(rs));
					writer.write("\n");
				}
			}
			writer.write("\r\n\r\n");
			//2. get the ECA rule
			//2.1. get the "On"...
			boolean flag = false;
			writer.write("on ");
			for(Trigger trigger : model.getAppData().get(0).getSpecification().getTrigger()) {
				if(flag == true) {
					writer.write(", ");
				}
				//TODO subscribe handled, unsubscribe() yet to be handled.
				writer.write(trigger.getResource().getName()+".subscribe()\r\n");
				flag = true;				
			}
			writer.write("\r\n");
			
			//2.2 write if do ....
			IfDoSpec ifDo = model.getAppData().get(0).getSpecification().getIfdo();
			writer.write("if ");
			SpecParser.parseElement(ifDo.getCondition(), writer);
			writer.write("\r\n do ");
			SpecParser.parseActions(ifDo.getAction(), writer, resMap);
			
			//2.3 write else if do 
			for(ElseIfDoSpec elseIfDo : model.getAppData().get(0).getSpecification().getElseIfDo()) {
				if(elseIfDo!=null && elseIfDo.getCondition()!=null) {
					writer.write("else if ");
					SpecParser.parseElement(elseIfDo.getCondition(), writer);
					writer.write("\r\n do ");
					SpecParser.parseActions(elseIfDo.getAction(), writer, resMap);
					writer.write("\r\n");
				}
			}
			
			//2.3 write else do
			ElseDoSpec elseDo = model.getAppData().get(0).getSpecification().getElseDo();
			if(elseDo!=null && elseDo.getAction()!=null && elseDo.getAction().size()!=0) {
				writer.write("else do \r\n");
				SpecParser.parseActions(elseDo.getAction(), writer, resMap);
			}
			writer.write("\r\n end if \r\n");
			writer.close();
			
			return outputFileName;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static InputStream specModel2snaStream(String appID, RunTimeModel model) {
		try {
			return new FileInputStream(Translator.specModel2snaFilePath(appID, model));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	private static ResourceMapping getResourceMapping(String fileName, Map<String, Set<String>> states, EList<DSL_Resource> resources) {
		//when add resource, do merge the original resources with the coming new resources as well and also build states
		//states:<specResourceName, states>

		ResourceMapping resMap = new ResourceMapping(fileName);//fileName is the ruleID, namely the .sna file name.
		
		for(DSL_Resource rs : resources) {
			resMap.addResource(rs.getName(), rs);//TODO rs.getName() may not be the spec. resource name!!
		}
		
		resMap.setStates(states);
		
		return resMap;
		
	}
	
	private void removeResource(String ruleID) {
		resMappings.remove(ruleID);
		//TODO what about the other related concepts? i.e. if a device is removed...then the states should be removed too??
	}
	
	/**
	 * Add a resource from the specified "fromFileName" rule to the "toFileName" rule. both file names are the .sna rule ID,
	 * namely the rule file name.
	 * @param fromFileName the .sna file name where the 'target' resource comes from...
	 * @param toFileName 
	 * @param target the spec resource concept correspond to the fromFileName
	 */
	public static void addResource(String fromFileName, String toFileName, Resource target) {
		ResourceMapping resMap = resMappings.get(fromFileName);
		DSL_Resource res = resMap.getDSL_Resource(target.getName());
		Set<String> states = resMap.getStates(target.getName());
		
		ResourceMapping toResMap = resMappings.get(toFileName);
		toResMap.addResource(target.getName(), res);
		toResMap.addStates(target.getName(), states);
		
		System.out.println("Translator->addResource: " + target.getName() + " from "+ fromFileName + 
				" is added to "+ toFileName);
	}
	
	public static ResourceMapping getResourceMapping(String appID) {
		return resMappings.get(appID);
	}
	
	private void mergeResources(RunTimeModel original, RunTimeModel toMerge) {
		//TODO 
		for(Resource tmrs : toMerge.getEnvData().get(0).getResources()) {
			int count = 0;
			for(Resource ors : original.getEnvData().get(0).getResources()) {
				if(tmrs.getName() == ors.getName()) break;
				count++;
			}
			if(count == original.getEnvData().get(0).getResources().size()) {
				original.getEnvData().get(0).getResources().add(tmrs);
			}
		}
		
	}
	
	public static DSL_Resource getSnaResource(String fileName, String conceptName) {
		if(resMappings.get(fileName)!=null) {
			return resMappings.get(fileName).getDSL_Resource(conceptName);
		}
		
		return null;
	}
	
	public static void removeResourceMapping(String appID) {
		//TODO modify necessary mappings...
		ResourceMapping resMap = resMappings.get(appID);
		resMappings.remove(appID);
		
		for(ResourceMapping tmp : resMappings.values()) {
			
		}
	}
	
	public static void write2file(InputStream ins, String appID, String filePath) {
		//File file = new File(AppDeployConflictHandler.getBaseFile(), 
			//	ECAConstants.OUTPUT_FILE_LOCATION +appID+ ECAConstants.SNA_FILE_EXTENSION);
		File file = new File(AppDeployConflictHandler.getBaseFile(),filePath);
		//write the string to file.
		OutputStream writer;
		try {
			writer = new FileOutputStream(file);
			byte[] buffer = new byte[ins.available()];
			ins.read(buffer);
			writer.write(buffer);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
