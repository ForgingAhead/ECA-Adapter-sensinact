package nii.bigclout.sensinact.ecaadapter.models.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import nii.bigclout.ecaadapter.DslRuntimeModule;
import nii.bigclout.ecaadapter.DslStandaloneSetupGenerated;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.controller.AppDeployConflictHandler;
import nii.bigclout.sensinact.ecaadapter.translator.util.ECAConstants;

/**
 *@author Feng Chen
 */
public class SpecModelLoader {
	private static final String FILE_EXTENSION = ".spec";

	/**
	 * Load the EMF model object from the filePath of the xtext file.
	 * @param fileURL
	 * @return the model object
	 */
	public static RunTimeModel loadModelFromFile(String fileURL) {
		File file;
		if(!fileURL.contains(AppDeployConflictHandler.getBaseFile().getAbsolutePath())) {
			file = new File(AppDeployConflictHandler.getBaseFile(),fileURL);
			fileURL = file.getAbsolutePath();
		}
		else file = new File(fileURL);
		
		if(!file.exists()) {
			System.out.println("File does not exist: "+ fileURL);
			return null;
		}
		
		return loadModel(URI.createFileURI(file.getPath()));
	}
	
	/**
	 * Load the xtext EMF model object from the specified URI
	 * @param uri the URI of the xtext file
	 * @return the model object
	 */
	public static RunTimeModel loadModel(URI uri) {
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("spec", new EcoreResourceFactoryImpl ());
		Injector injector = new DslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		//Injector injector = Guice.createInjector(new DslRuntimeModule());
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(uri, true);
		
		resourceSet.getResources().add(resource);//////////////may be unnecessary////
		
		return (RunTimeModel) resource.getContents().get(0);
	}
	
	/**
	 * Parsing the specified spec InputStream into its EMF model object.
	 * @param appID the name of the .spec file, i.e. the name of the SPEC rule/app.
	 * @param spec as InputStream contains the specified spec text
	 * @return the EMF model object
	 */
	public static RunTimeModel loadModel(String appID, InputStream spec) {
		String specString = new BufferedReader(new InputStreamReader(spec)).lines().collect(Collectors.joining("\n"));
		
		return loadModel(appID, specString);
	}
	
	/**
	 * Load the top-level model object from the specified appSpec (textual content of the SPEC rule)
	 * @param appName the name of the .spec file, i.e. the name of the SPEC rule/app.
	 * @param appSpec as String represent the textual content of the SPEC rule
	 * @return the top-level model object
	 */
	public static RunTimeModel loadModel(String appName, String appSpec) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("spec", new EcoreResourceFactoryImpl ());
		Injector injector = new DslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		//Injector injector = Guice.createInjector(new DslRuntimeModule());
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);	
		System.out.println("load eca model - base file path: "+ AppDeployConflictHandler.getBaseFile());////////test
		
		String resourcePath = new File(AppDeployConflictHandler.getBaseFile(),ECAConstants.OUTPUT_FILE_LOCATION+appName+FILE_EXTENSION).getAbsolutePath();
		
		if(resourcePath == null) {
			System.out.println("load eca model - resource path is NULL!");/////////testing
		}
		System.out.println("load eca model - resource path: "+ resourcePath);//////////////////////////testing
		
		URI resourceUri = URI.createURI(resourcePath);
		Resource resource = resourceSet.createResource(resourceUri);
		
		Writer writer = null;
		//Path path = Paths.get(resourcePath);
		
		try {
			//writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
			//writer.write(appSpec); //write the SPEC rule of the application to the file.
			
			PrintWriter out = new PrintWriter(resourcePath);
			out.write(appSpec);
			out.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();			
		} 
		
		resource = resourceSet.getResource(URI.createFileURI(resourcePath), true); //after creating the file, reload it...
		return (RunTimeModel) resource.getContents().get(0);		
	}
	
	/**
	 * Load model from the actual xtext textual string
	 * @param appSpec
	 * @return the EMF model object
	 */
	public static RunTimeModel loadModel (String appSpec) {
		return loadModel("app"+String.valueOf(appSpec.length()), appSpec);
	}
	


	public static void printFile(File file) {
		try {
			System.out.println("---------------print out the file content for "+file.getAbsolutePath());////////////////
			System.out.println(Files.readAllLines(file.toPath()) +"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
