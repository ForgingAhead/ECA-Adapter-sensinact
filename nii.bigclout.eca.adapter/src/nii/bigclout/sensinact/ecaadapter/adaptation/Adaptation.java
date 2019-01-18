package nii.bigclout.sensinact.ecaadapter.adaptation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.models.AdaptMethod;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelSerialization;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModifier;
import nii.bigclout.sensinact.ecaadapter.translator.util.ECAConstants;
import nii.bigclout.sensinact.ecaadapter.verifier.Conflict;
import nii.bigclout.sensinact.ecaadapter.verifier.ConflictIdentification;
import nii.bigclout.sensinact.ecaadapter.verifier.ECAVerifier;
import nii.bigclout.ecaadapter.dsl.Element;

/**
 * Adaptation class implements the logic for the Adaptation Engine that handles the analysis, planning of the MAPE loop...
 * @author Feng
 *
 */
public class Adaptation implements ModelAdaptationObserver {
	//there is a need to distinguish the environment model and the app design models
	
	//should contain an up-to-date version of the run time models including the environment information and states...
	private static Map<String, RunTimeModel> models = new HashMap<String, RunTimeModel>();;//the models shall always be kept up-to-date since observer pattern used by subscription.
	private AdaptMethod adaptMethod;//adapt method provided by the model manager
	
	private ECAVerifier verifier;
	
	public static String ADD = "add";
	public static String REMOVE = "remove";
	public static String MODIFY = "modify"; //can be deleted...
	
	public Adaptation(AdaptMethod method) {
		this.adaptMethod = method;	
		
		verifier = new ConflictIdentification();
		//need an analyser, a planner, an executor...
	}
	
	
	/**
	 * Activate the adaptation engine. Four steps follow: get the current app models info and environment model info;
	 * analyse conflicts; plan how to solve it; and execute the adaptation strategy
	 * @param appID
	 * @param model
	 */
	public List<Conflict> activateAdaptation(String appID, RunTimeModel model) {
		
		// 1. analysis by using ECA Verifier to check if there is conflict
		//models represent the existing deployed applications and ideally environment as well. they are already up to date..
		System.out.println("Adaptation-> current size of RunTimeModel: "+ models.size());/////////////testing
		List<Conflict> conflicts = verifier.checkConflict(models.values(), model);
		
		// 2. here come the plan and execute
		if(conflicts == null) {
			
			System.out.println("No conflict is identified!");
			
			adaptMethod.addModel(appID, model);//indicating the app can be successfully deployed without a conflict...
			
			//TODO should we notify the platform and the studio about the deployment?????????????????????
			
		} else {
			//conflict(s) is identified
			System.out.println("Conflict is identified!");
			
			for(Conflict conf : conflicts) {
				System.out.println("************Application "+ conf.getRule1ID() + " and application "+ conf.getRule2ID() +
						" are in conflict!");
				//TODO Get the priority of the two applications.
				System.out.println("We consider application " + conf.getRule1ID() + " is of higher priority over " + 
						conf.getRule2ID()+". So, we will modify "+conf.getRule2ID() + " to resolve the conflict!");
				
				conf.setModified(conf.getRule2ID());
				
				//construct and set new condition for the conflicted application/rule
				Element newCond = SpecModifier.mergeCondition(conf.getCondition2(), ECAConstants.AND, conf.getCondition1());
				
				//System.out.println("Adaptation-> the new condition: "+ SpecModelSerialization.element2String(newCond));//////////////testing
				
				SpecModifier.setCondition(conf.getRule1ID(), conf.getRule2ID(), model, newCond, conf.getCondition1());
				
				adaptMethod.modifyModel(appID, model);//indicating conflict resolved by modifying the model...
			}
			
		}
		
		return conflicts;
		
	}

	@Override
	public void update(String changeType, String appID, RunTimeModel model) {
		// TODO Auto-generated method stub
		if(changeType.equals(ADD)) {
			
			models.put(appID, model);
			
		} else if(changeType.equals(REMOVE)) {
			
			models.remove(appID);
			
		} else if(changeType.equals(MODIFY)) {
			models.put(appID, model);
			
		} else {
			System.out.println("Shouldn't be here. the specified change type is incorrect: "+ changeType);
		}
	}

}