package nii.bigclout.sensinact.ecaadapter.translator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Resource;
import org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT;
import org.eclipse.xtext.resource.XtextResource;

import nii.bigclout.sensinact.ecaadapter.controller.AppDeployConflictHandler;
import nii.bigclout.sensinact.ecaadapter.translator.util.ECAConstants;

/**
 *@author Feng Chen
 */
public class SnaModelSerialization {
	
	/**
	 * Transform the dsl model/object to dsl text file
	 * @param model the model that will be transformed into dsl file
	 * @param name the target file name
	 * @return the path of the generated text file of the dsl
	 * Alternatively, one can use this org.eclipse.xtext.nodemodel.util.NodeModelUtils:
	 * final String serialized = NodeModelUtils.getNode(model).getText();
	 */
	public static String model2filePath(DSL_SENSINACT model, String name) {
		String serialized = "";
		serialized = ((XtextResource)model.eResource()).getSerializer().serialize(model);
		System.out.println("================Serialized: " + serialized);

		//rename the old file
		String filePath = new File(AppDeployConflictHandler.getBaseFile(), 
				ECAConstants.OUTPUT_FILE_LOCATION +name+ ECAConstants.SNA_FILE_EXTENSION).getAbsolutePath();
		renameFile(name);
		
		//write the string to file.
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(filePath));
			writer.write(serialized);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return filePath;
	}
	

	/**
	 * Transform the DSL_Expression object to the corresponding dsl text string
	 * @param exp the target DSL_Expression
	 * @return the String representation of the DSL_Expression object
	 */
	public static String expression2String(DSL_Expression exp) {
		return ((XtextResource)exp.eResource()).getSerializer().serialize(exp);
	}
	
	public static String resource2String(DSL_Resource res) {
		return ((XtextResource) res.eResource()).getSerializer().serialize(res);
	}
	
	public static String toString(DSL_SENSINACT eca) {
		return ((XtextResource) eca.eResource()).getSerializer().serialize(eca);
	}
	
	/**
	 * 
	 * @param name the name of the file without extension
	 */
	public static void renameFile(String name) {
		String fileName = ECAConstants.OUTPUT_FILE_LOCATION +name+ ECAConstants.SNA_FILE_EXTENSION;
		File file = new File(AppDeployConflictHandler.getBaseFile(),fileName);
		if(file.exists()) {
			file.renameTo(new File(AppDeployConflictHandler.getBaseFile(),ECAConstants.OUTPUT_FILE_LOCATION +
					name + new java.util.Date().getTime() +ECAConstants.SNA_FILE_EXTENSION));
		} else {
			System.out.println("File not found when trying to rename it: " + name +ECAConstants.SNA_FILE_EXTENSION);
		}
	}

}
