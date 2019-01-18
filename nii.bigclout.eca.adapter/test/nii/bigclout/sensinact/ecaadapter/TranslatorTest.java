package nii.bigclout.sensinact.ecaadapter;

import org.junit.Assert;
import org.junit.Test;

import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelLoader;
import nii.bigclout.sensinact.ecaadapter.translator.Translator;

public class TranslatorTest {
	
	@Test
	public void test1() {
		
		String specPath = Translator.snaFilePath2specFilePath("input/lightControl.sna");
		
		RunTimeModel specModel = SpecModelLoader.loadModelFromFile(specPath);
		
		Assert.assertEquals(specModel.getAppData().get(0).getAppID(), "lightControl");
	}

}
