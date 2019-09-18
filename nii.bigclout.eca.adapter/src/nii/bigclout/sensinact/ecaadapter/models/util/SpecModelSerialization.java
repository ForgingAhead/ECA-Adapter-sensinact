package nii.bigclout.sensinact.ecaadapter.models.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import org.eclipse.xtext.serializer.ISerializer;

import nii.bigclout.ecaadapter.dsl.Element;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.controller.AppDeployConflictHandler;
import nii.bigclout.sensinact.ecaadapter.translator.Translator;
import nii.bigclout.sensinact.ecaadapter.translator.util.ECAConstants;

/**
 * 
 *@author Feng Chen
 */
public class SpecModelSerialization {

	public static void write2file(InputStream spec, String appID, String filePath) {
		
	}

	public static String model2filePath(RunTimeModel model, String name) {
		String serialized = "";

		serialized = ((XtextResource)model.eResource()).getSerializer().serialize(model);
		System.out.println("================Serialized: \n" + serialized);

		//rename the old file
		String fileName = AppDeployConflictHandler.getBaseFile().getAbsolutePath() + "/" + 
				ECAConstants.OUTPUT_FILE_LOCATION + name + ECAConstants.SNA_FILE_EXTENSION;
		renameFile(name);
		
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(serialized);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//Translator.write2file(new FileInputStream(new File(fileName)), name, filePath);
		
		return fileName;
	}
	
	public static String element2String(Element element) {
		if(element == null) {
			System.out.println("SpecModelSerialization: NULL element received to serialize to string...");
		}
		if( ((XtextResource)element.eResource() ) == null) {
			System.out.println("SpecModelSerialization: NULL XtextResource");
		}
		return ((XtextResource)element.eResource()).getSerializer().serialize(element);
	}
	
	public static String toString(RunTimeModel model) {
		return ((XtextResource)model.eResource()).getSerializer().serialize(model);
	}
	
	/**
	 * 
	 * @param name the name of the file without extension
	 */
	public static void renameFile(String name) {
		String fileName = AppDeployConflictHandler.getBaseFile().getAbsolutePath() + "/" + 
				ECAConstants.OUTPUT_FILE_LOCATION + name + ECAConstants.SNA_FILE_EXTENSION;
		File file = new File(fileName);
		if(file.exists()) {
			file.renameTo(new File(AppDeployConflictHandler.getBaseFile().getAbsolutePath() + "/" + 
					ECAConstants.OUTPUT_FILE_LOCATION + name + 
					new java.util.Date().getTime()+ ECAConstants.SPEC_FILE_EXTENSION));
		} else {
			System.out.println("File not found when trying to rename it: " + name +ECAConstants.SPEC_FILE_EXTENSION);
		}
		
	}

}
