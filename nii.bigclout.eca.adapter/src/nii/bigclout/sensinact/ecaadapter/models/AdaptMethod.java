package nii.bigclout.sensinact.ecaadapter.models;

import java.util.Collection;
import java.util.Map;

import nii.bigclout.ecaadapter.dsl.AppMetaData;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.ecaadapter.dsl.Specification;
import nii.bigclout.sensinact.ecaadapter.adaptation.ModelAdaptationObserver;

/**
 * AdaptMethod is the 
 * @author chenf
 *
 */
public interface AdaptMethod {
	
	public Map<String, RunTimeModel> getModels();
	
	public void addModel(String appID, RunTimeModel model);
	
	public void removeModel(String appID);
	
	public void modifyModel(String appID, RunTimeModel newModel); // a rule is one specification
	
	public void updateEnvModel(String envModelID, String newEnvModel); //TBD---...what kind of update??

	public void subscribe(ModelAdaptationObserver ob); //TBD---
	
	public void unsubscribe(ModelAdaptationObserver ob); //TBD---
	
	public void notifyAdaptationObserver(String changeType, String appID, RunTimeModel model);
}
