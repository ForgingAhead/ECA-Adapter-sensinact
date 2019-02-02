package nii.bigclout.sensinact.ecaadapter.verifier;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nii.bigclout.ecaadapter.dsl.RunTimeModel;


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

	@Override
	public List<Conflict> checkConflict(Collection<RunTimeModel> models) {
		// TODO Auto-generated method stub
		//this may not be needed...
		
		
		return null;
	}
	
	


}
