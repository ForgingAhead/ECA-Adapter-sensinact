package nii.bigclout.sensinact.ecaadapter.models;

import java.util.Map;

import org.eclipse.sensinact.studio.language.ecaverifier.api.ConflictAdaptation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import nii.bigclout.ecaadapter.dsl.AppMetaData;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.adaptation.Adaptation;
import nii.bigclout.sensinact.ecaadapter.adaptation.ModelAdaptationObserver;
import nii.bigclout.sensinact.ecaadapter.translator.Translator;
import nii.bigclout.sensinact.ecaadapter.translator.util.ResourceMapping;

/**
 *@author Feng Chen
 */
public  class ModelManager implements AdaptMethod{
	
	protected static List<ModelAdaptationObserver> observers = new ArrayList<ModelAdaptationObserver>();
	
	//there is a problem about the appID and dsl file name. ideally, the unique reference should be the file name.
	//also, one file correspond to one rule, one spec which is the way .sna dsl does...
	//for the models@run.time, it should be assumed that one .spec file correspond to one specification...
	//in that way, one RunTimeModel is one spec, not one application...
	// map of <appID, RunTimeModel> ; appID is also the .spec file name...
	protected static Map<String, RunTimeModel> models = new HashMap<String, RunTimeModel>(); //the key is the .spec file name!
	
	private ConflictAdaptation platformAdapt;
	
	public ModelManager(ConflictAdaptation plat) {
		this.platformAdapt = plat;
	}
	
	public  void removeModel(RunTimeModel model) {
		for(AppMetaData app : model.getAppData()) {
			models.remove(app.getAppID());
		}
	}

	
	public RunTimeModel getModel(String appID) {
		return models.get(appID);
	}



	@Override
	public void updateEnvModel(String envModelID, String newEnvModel) {
		// TODO Auto-generated method stub
		//for this kind of update, no need to check conflict... but details yet to be implemented
	}


	@Override
	public void removeModel(String appID) {
		
		RunTimeModel removed = models.get(appID);
		
		ResourceMapping resMap = Translator.getResourceMapping(appID);
		
		models.remove(appID);
		Translator.removeResourceMapping(appID);
		
		
		
		//TODO more complicated here is that removing all the resources-related constraints in other apps...
		for(RunTimeModel rtm : models.values()) {
			
		}
		
	}

	@Override
	public void subscribe(ModelAdaptationObserver ob) {

		if(ob == null) throw new NullPointerException("Null Observer");
		
		if(!observers.contains(ob)) observers.add(ob);
		
	}

	@Override
	public void unsubscribe(ModelAdaptationObserver ob) {
		observers.remove(ob);
	}

	@Override
	public void notifyAdaptationObserver(String changeType, String appID, RunTimeModel model) {
	
		for(ModelAdaptationObserver ob : observers) {
			ob.update(changeType, appID, model);
		}
		
	}

	@Override
	public void modifyModel(String appID, RunTimeModel newModel) {
		//TODO to be checked and tested
		models.put(appID, newModel);
		platformAdapt.modifyRule(appID, Translator.specModel2snaStream(appID, newModel));
		notifyAdaptationObserver(Adaptation.MODIFY, appID, newModel); 
	}

	@Override
	public Map<String, RunTimeModel> getModels() {
		// TODO Auto-generated method stub
		return models;
	}

	@Override
	public void addModel(String appID, RunTimeModel model) {
		// TODO Auto-generated method stub
		models.put(appID, model);
		notifyAdaptationObserver(Adaptation.ADD, appID,  model); 
	}
	
	public void setConflictAdaptation(ConflictAdaptation adapt) {
		this.platformAdapt = adapt;
	}
}
