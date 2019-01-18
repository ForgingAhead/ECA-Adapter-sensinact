package nii.bigclout.sensinact.ecaadapter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.sensinact.studio.language.SensinactStandaloneSetupGenerated;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or;
import org.eclipse.sensinact.studio.language.sensinact.Sensinact;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Test;

import com.google.inject.Injector;

public class PartialModelLoaderTest {
	
	@Test
	public void test() {
		/**
		 * CANNOT do it, as the returned result for the "resource.getContents().get(0)" is supposed to be the top-level
		 * or the whole EMF model rather than  partial of it. 
		 * So, if one wants to build an object which is one part of the whole model, i.e a resource from the model,
		 * the MyDslFactory has to be used and then programmatically add the parameter...
		 */
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sna", new EcoreResourceFactoryImpl ());
		Injector injector = new SensinactStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI("input/test.sna"));
		InputStream in = new ByteArrayInputStream("button.get() == true".getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DSL_Expression_Or exp = (DSL_Expression_Or) resource.getContents().get(0);
		
		if(exp != null) {
			System.out.println(exp.getRight().toString());
		}
	}

}
