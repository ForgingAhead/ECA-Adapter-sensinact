package nii.bigclout.sensinact.ecaadapter;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT;
import org.junit.Assert;
import org.junit.Test;

import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelLoader;
import nii.bigclout.sensinact.ecaadapter.translator.SnaModelLoader;
import nii.bigclout.sensinact.ecaadapter.translator.Translator;

/**
 *@author Feng Chen
 */
public class SNAModelLoaderTest {
	
	RunTimeModel model;
	
	@Test
	public void test() {
		//1. from .sna file to .spec file
		DSL_SENSINACT rules = SnaModelLoader.loadModelFromFilePath("input/lightControl.sna");
		
		
		System.out.println("Trigger: " + rules.getOn().getTriggers().get(0).getRef().getName());
		System.out.println("If Do statement: " + rules.getEca().getIfdo().getCondition());
		
		Assert.assertEquals(3, rules.getResources().size());
	}
	
	@Test
	public void testTranslation() {
		//1. from .sna file to .spec file
		
		DSL_SENSINACT rules = SnaModelLoader.loadModelFromFilePath("input/lightControl.sna");
		String specURL = Translator.snaModel2specFilePath("lightControl", rules);
		
		model = SpecModelLoader.loadModelFromFile(specURL);
		
		System.out.println("ID: " + model.getAppData().get(0).getAppID());
		//System.out.println("resources: " + model.getEnvData().get(0).getResources().get(0).getName());
		
		Assert.assertEquals(1, model.getAppData().size());
	}

}
