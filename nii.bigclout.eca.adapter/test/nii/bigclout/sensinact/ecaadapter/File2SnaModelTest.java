package nii.bigclout.sensinact.ecaadapter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT;
import org.junit.Assert;
import org.junit.Test;

import nii.bigclout.sensinact.ecaadapter.translator.SnaModelLoader;

/**
 *@author Feng Chen
 */
public class File2SnaModelTest {
	
	@Test
	public void test() {
		
		URI snaFileURI = URI.createFileURI("input/lightControl.sna");
		DSL_SENSINACT rules = SnaModelLoader.loadModel_standalone(snaFileURI);
		
		System.out.println("Trigger: " + rules.getOn().getTriggers().get(0).getRef().getName());
		System.out.println("If Do statement: " + rules.getEca().getIfdo().getCondition());
		//System.out.println("resources: " + model.getEnvData().get(0).getResources().get(0).getName());
		
		if(rules.getEca().getElseIfdo() == null) {
			System.out.println("null for -else if do-");
		} else {
			System.out.println("size of -else if do- :"+ rules.getEca().getElseIfdo().size());
		}
		
		if(rules.getEca().getElsedo() == null) {
			System.out.println("null for -else do-");
		} else {
			System.out.println("else do--variable: " + rules.getEca().getElsedo().getActions().getActionList().get(0).getVariable());
			System.out.println("else do--REF: " + rules.getEca().getElsedo().getActions().getActionList().get(0).getRef().getName());
		}
		
		
		
		Assert.assertEquals(3, rules.getResources().size());
	}

}
