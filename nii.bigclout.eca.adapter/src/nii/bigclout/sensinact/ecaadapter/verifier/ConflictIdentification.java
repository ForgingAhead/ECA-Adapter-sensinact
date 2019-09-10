package nii.bigclout.sensinact.ecaadapter.verifier;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nii.bigclout.ecaadapter.dsl.Action;
import nii.bigclout.ecaadapter.dsl.ElseIfDoSpec;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.adaptation.Adaptation;
import nii.bigclout.sensinact.ecaadapter.models.ModelManager;
import nii.bigclout.sensinact.ecaadapter.translator.Translator;


public class ConflictIdentification implements ECAVerifier{
	
	private static List<Conflict> conflicts = new ArrayList<Conflict>();

	@Override
	public List<Conflict> checkConflict(Collection<RunTimeModel> models, RunTimeModel model) {
		// TODO Auto-generated method stub
		conflicts.clear();
		if(models == null || models.isEmpty()) {
			if(models.isEmpty())
				System.out.println("ConflictIdentification--------the collection of models is empty");
			return null;
		} else {
			//TODO for now, hard code one example for testing the overall flow only
			System.out.println("ConflictIdentification - models size: " + models.size());////
			
			for(RunTimeModel existingModel : models) {
				//conflicts.add(checkConflict(existingModel, model));
			}
			
			RunTimeModel tmp = models.iterator().next();
			
			Conflict conf = new Conflict();
			conf.setRule1ID(tmp.getAppData().get(0).getAppID());
			conf.setRule2ID(model.getAppData().get(0).getAppID());
			conf.setCondition1(tmp.getAppData().get(0).getSpecification().getIfdo().getCondition());
			conf.setCondition2(model.getAppData().get(0).getSpecification().getIfdo().getCondition());
			
			conflicts.add(conf);
			
			return conflicts;
		}
	}
	
	private void checkConflict(String one, String two, RunTimeModel model) {
		RunTimeModel model1 = Adaptation.getModel(one);
		RunTimeModel model2 = model;
		
		//get the actuator, and check for the states...
		List<ConditionActionPair> pair1 = getConditionActionPairs(model1);
		List<ConditionActionPair> pair2 = getConditionActionPairs(model2);
		
		for(ConditionActionPair condAct1 : pair1) {
			for(ConditionActionPair condAct2 : pair2) {
				if(condAct1.conflictsWith(condAct2)) {
					System.out.println("Found a conflict");///////////test
					conflicts.add(createConflict(condAct1, condAct2, one, two));
				}
			}
		}

	}
	
	private Conflict createConflict(ConditionActionPair pair1, ConditionActionPair pair2, String app1, String app2) {
		Conflict conf = new Conflict();
		conf.setRule1ID(app1);
		conf.setRule2ID(app2);
		conf.setCondition1(pair1.condition);
		conf.setCondition2(pair2.condition);
		
		return conf;
	}
	
	private List<ConditionActionPair> getConditionActionPairs(RunTimeModel model){
		List<ConditionActionPair> pair = new ArrayList<>();
		if(model.getAppData().get(0).getSpecification().getIfdo()!=null) {
			pair.add(new ConditionActionPair(model.getAppData().get(0).getSpecification().
					getIfdo().getCondition(), model.getAppData().get(0).getSpecification().
					getIfdo().getAction()));
		}
		if(model.getAppData().get(0).getSpecification().getElseIfDo()!=null) {
			for(ElseIfDoSpec elseif : model.getAppData().get(0).getSpecification().getElseIfDo()) {
				pair.add(new ConditionActionPair(elseif.getCondition(), elseif.getAction()));
			}
		}
		if(model.getAppData().get(0).getSpecification().getElseDo()!=null) {
			pair.add(new ConditionActionPair(null, model.getAppData().get(0).getSpecification().getElseDo()
					.getAction()));
		}
		return pair;
	}

	@Override
	public List<Conflict> checkConflict(Collection<RunTimeModel> models) {
		// TODO Auto-generated method stub
		//this may not be needed...
		
		
		return null;
	}

	@Override
	public List<Conflict> checkConflict(Collection<String> apps, String newApp, RunTimeModel model) {
		// TODO Auto-generated method stub
		conflicts.clear();
		if(apps == null || apps.isEmpty()) {
			System.out.println("ConflictIdentification--------the collection of models is empty");
			return null;
		} else {
			for(String app : apps) {
				checkConflict(app, newApp, model);
			}
		}
		
		return conflicts;
	}
	
	


}
