package nii.bigclout.sensinact.ecaadapter.adaptation;

import nii.bigclout.ecaadapter.dsl.RunTimeModel;

/**
 * 
 * @author Feng
 *
 */
public interface ModelAdaptationObserver {
	
	
	/**
	 * For the ECA Adapter to send update of the run time model. 
	 * The update could be adding a new model or modifying an existing one
	 * @param changeType
	 * @param appID
	 * @param model
	 */
	public void update(String changeType, String appID, RunTimeModel model);

}
