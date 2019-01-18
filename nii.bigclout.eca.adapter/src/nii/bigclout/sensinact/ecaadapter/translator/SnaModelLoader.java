package nii.bigclout.sensinact.ecaadapter.translator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.sensinact.studio.language.SensinactStandaloneSetupGenerated;
import org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT;
import org.eclipse.sensinact.studio.language.sensinact.Sensinact;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import nii.bigclout.sensinact.ecaadapter.controller.AppDeployConflictHandler;
import nii.bigclout.sensinact.ecaadapter.translator.util.ECAConstants;

/**
 * This class SnaModelLoader provides functions to load the EMF model, i.e. DSL_SENSINACT model object
 * from a variety of sources, e.g. from filepath, from InputStream, from String, etc.
 * 
 *@author Feng Chen
 */
public class SnaModelLoader {
	
	/**
	 * Load the DSL_SENSINACT model from the specified filepath of the .sna file.
	 * each .sna file contains only one rule, i.e. one "if ..do.. (else if...do...)* ..(else..do...)?"
	 * @param fileURL the filepath of the .sna file
	 * @return the DSL_SENSINACT model object
	 */
	public static DSL_SENSINACT loadModelFromFilePath(String fileURL) {
		File file;
		
		if(!fileURL.contains(AppDeployConflictHandler.getBaseFile().getAbsolutePath())) {
			file = new File(AppDeployConflictHandler.getBaseFile(),fileURL);
		}
		else file = new File(fileURL);
		
		if(!file.exists()) {
			System.out.println("Translator->loadModelFromFilePath->File does not exist: "+ fileURL);
			return null;
		}
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sna", new EcoreResourceFactoryImpl ());
		URI snaFileURI = URI.createFileURI(file.getPath()); 
		DSL_SENSINACT sna = loadModel(snaFileURI); //TODO right now it works in the stand-alone way... however, should make it work in the plugin approach.
		System.out.println("------------------------------------");
		System.out.println(sna);
		System.out.println("------------------------------------");
		return sna;
	}
	
	/**
	 * Load the DSL_SENSINACT model object from the specified URI
	 * @param uri the URI that points to the .sna file
	 * @return the DSL_SENSINACT object
	 */
	public static DSL_SENSINACT loadModel(URI uri) {
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sna", new EcoreResourceFactoryImpl ());
		Injector injector = new SensinactStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		ResourceSet rs = new ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = rs.getResource(uri, true);
		Sensinact sens = (Sensinact) resource.getContents().get(0);
		return sens.getEca();
	}
	
	/**
	 * Load the DSL_SENSINACT object from the specified InputStream
	 * @param appID the name of the app/rule
	 * @param sna the InputStream contains the .sna textual content
	 * @return the DSL_SENSINACT object
	 * @throws IOException 
	 */
	public static DSL_SENSINACT loadModel(String appID, InputStream sna) throws IOException {
		//String stringSNA = new BufferedReader(new InputStreamReader(sna)).lines().collect(Collectors.joining("\n"));
		byte[] buffer = new byte[sna.available()];
		sna.read(buffer);
		
		String filePath = ECAConstants.INPUT_FILE_LOCATION + appID + ECAConstants.SNA_FILE_EXTENSION;
		File targetFile = new File(AppDeployConflictHandler.getBaseFile(),filePath);
		OutputStream out = new FileOutputStream(targetFile.getAbsoluteFile());
		out.write(buffer);
		out.close();
		return loadModelFromFilePath(filePath);
	}
	
	/**
	 * Load the DSL_SENSINACT object from the specified URI for a stand-alone java application
	 * @param uri URI points to the .sna file
	 * @return the DSL_SENSINACT object
	 */
	public static DSL_SENSINACT loadModel_standalone(URI uri) {
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sna", new EcoreResourceFactoryImpl ());
		Injector injector = new SensinactStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		System.out.println("URI to translate to eca: " + uri.toString());
		
		Resource resource = resourceSet.getResource(uri, true);
		Sensinact sens = (Sensinact) resource.getContents().get(0);
		return sens.getEca();
		
	}
	
	/** This do not work....
	public static DSL_Expression string2Expression(String exp) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sna", new EcoreResourceFactoryImpl ());
		Injector injector = new SensinactStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		
		return null;
	} */

}
