package nii.bigclout.sensinact.ecaadapter;

import org.junit.Test;

import nii.bigclout.ecaadapter.dsl.Element;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelLoader;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelSerialization;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModifier;

public class SpecModifierTest {
	
	@Test
	public void test() {
		
		String fileName = "output/lightControlByButton.spec";

		RunTimeModel model = SpecModelLoader.loadModelFromFile(fileName);
		
		Element ele = model.getAppData().get(0).getSpecification().getIfdo().getCondition();
		
		System.out.println(SpecModelSerialization.element2String(ele));
		
		
		/**
		 * Right now, this method does not work as building a brand new element from the original EMF model is
		 * not feasible as every element has to be part of a whole to make sense.
		 */
		Element newEle = SpecModifier.negateElement(ele);
		String out = SpecModelSerialization.element2String(newEle);
		
		System.out.println(out);
	}

}
