package nii.bigclout.sensinact.ecaadapter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Assert;
import org.junit.Test;

import com.google.inject.Injector;

import nii.bigclout.ecaadapter.DslStandaloneSetupGenerated;
import nii.bigclout.ecaadapter.dsl.Element;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelLoader;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelSerialization;

/**
 *@author Feng Chen
 */
public class DslModelTest {
	

	//@Test
	public void test() {
		
		String fileName = "input/lightControl.spec";

		RunTimeModel model = SpecModelLoader.loadModelFromFile(fileName);

		System.out.println(model.getAppData().get(0).getAppID());
		System.out.println(model.getEnvData().get(0).getResources().toString());
		
		Assert.assertEquals(1, model.getAppData().size());
	}
	
	@Test
	public void test2() {
		String fileName = "input/negTest.spec";

		RunTimeModel model = SpecModelLoader.loadModelFromFile(fileName);
		Element cond = model.getAppData().get(0).getSpecification().getIfdo().getCondition();
		
		System.out.println(SpecModelSerialization.element2String(cond));
	}

}
