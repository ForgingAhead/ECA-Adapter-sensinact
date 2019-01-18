package nii.bigclout.sensinact.ecaadapter;

import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression;
import org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT;

import org.junit.Assert;
import org.junit.Test;

import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelLoader;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelSerialization;
import nii.bigclout.sensinact.ecaadapter.translator.SnaModelLoader;
import nii.bigclout.sensinact.ecaadapter.translator.SnaModelSerialization;

/**
 *@author Feng Chen
 */
public class SerializationTest {
	
	@Test
	public void test1() {

		RunTimeModel model = SpecModelLoader.loadModelFromFile("output/lightControl.spec");
		
		String newID = "lightControl-input";
		
		model.getAppData().get(0).setAppID(newID);
		
		String fileURL = SpecModelSerialization.model2filePath(model, "lightControl");
		
		RunTimeModel modifiedModel = SpecModelLoader.loadModelFromFile(fileURL);
		
		Assert.assertEquals(modifiedModel.getAppData().get(0).getAppID(), newID);
		
	}
	
	@Test
	public void test2() {
		DSL_SENSINACT model = SnaModelLoader.loadModelFromFilePath("input/lightControl.sna");
		
		System.out.println("The first Resource name: " + model.getResources().get(0).getName() );
		String newName =  "aNewResourceName";
		model.getResources().get(0).setName(newName);
		
		String fileURL = SnaModelSerialization.model2filePath(model, "lightControl");
		
		DSL_SENSINACT modifiedModel = SnaModelLoader.loadModelFromFilePath(fileURL);
		Assert.assertEquals(modifiedModel.getResources().get(0).getName(), newName);
		
	}
	
	@Test
	public void test3() {
		DSL_SENSINACT model = SnaModelLoader.loadModelFromFilePath("input/lightControl.sna");
		
		DSL_Expression exp = model.getEca().getIfdo().getCondition();
		
		String condition = SnaModelSerialization.expression2String(exp);
		System.out.println("The if do condition is: " + condition);
		
		//SnaConditionModifier.addCondition(exp, "and", "");
	}

}
