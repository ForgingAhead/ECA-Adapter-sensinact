package nii.bigclout.sensinact.ecaadapter;

import java.util.ArrayList;

import org.junit.Test;

import nii.bigclout.ecaadapter.dsl.Element;
import nii.bigclout.ecaadapter.dsl.Resource;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelLoader;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelSerialization;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModifier;
import nii.bigclout.sensinact.ecaadapter.translator.Translator;
import nii.bigclout.sensinact.ecaadapter.translator.util.ECAConstants;

public class ModifyRuleTest {
	
	@Test
	public void test() {
		
		
		String fileName1 = "input/env.sna";
		String fileName2 = "input/security.sna";
		
		String envSpec = Translator.snaFilePath2specFilePath(fileName1);
		String securitySpec =Translator.snaFilePath2specFilePath(fileName2);

		RunTimeModel envModel = SpecModelLoader.loadModelFromFile(envSpec);
		Element ele1 = envModel.getAppData().get(0).getSpecification().getIfdo().getCondition();
		System.out.println(SpecModelSerialization.element2String(ele1));
		
		RunTimeModel secModel = SpecModelLoader.loadModelFromFile(securitySpec);
		Element ele2 = secModel.getAppData().get(0).getSpecification().getIfdo().getCondition();
		System.out.println(SpecModelSerialization.element2String(ele2));
		
		
		/**mock up that we identified the conflict and is going to resolve the conflict by adding constraint 
		 * to the condition of the rule with lower priority...
		 * 
		 * That is to say, when identify conflict, it would be better to identify which conditions are conflicting
		 * with each other, then for those conditions, modify the one that with lower priority...
		 * 
		 */
		Element newEle = SpecModifier.mergeCondition(ele1, ECAConstants.AND, ele2);//////////test point
		
		ArrayList<Resource> resources = SpecModifier.getResources(ele2);
		envModel.getEnvData().get(0).getResources().addAll(resources);/////////////////////////test point
		
		for(Resource res : resources)
			Translator.addResource("security", "env", res);//////////////////////////test point
		
		if(newEle == null)
			System.out.println("Get null pointer for the new Element...");
		
		envModel.getAppData().get(0).getSpecification().getIfdo().setCondition(newEle);////////key point where update happens
		
		Element changed = envModel.getAppData().get(0).getSpecification().getIfdo().getCondition();
		
		//by serialization, we save the modified Spec model and save it into .spec file...
		SpecModelSerialization.model2filePath(envModel, "env");
		
		//check if the extra constraint is successfully added to the condition
		String out = SpecModelSerialization.element2String(changed);
		
		System.out.println(out);////////////////check if it's updated...
		
		//translate the .spec model into the .sna file...Thus, a modified .sna rule is generated.
		Translator.specModel2snaFilePath("env", envModel);
		
		
	}

}
