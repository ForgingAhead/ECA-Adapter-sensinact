package org.eclipse.sensinact.studio.language.ecaverifier;

public class IdentifiedConflict {
	//the App ID that's in conflict, i.e. the file name of the rule
	private String appID1;
	private String appID2;
	
	//which app is modified (supposed to be the lower priority one)
	private String modifiedAppID = null;
	
	//why we recommend the suggested modification 
	private String explanation;
	
	//type of conflict resolution
	private ResolutionType resolution_type;
	
	public IdentifiedConflict() {
		
	}
	
	/**
	 * Constructor, creating the object by giving the IDs of the two conflicting apps,
	 *  along with the appID to be modified.
	 * @param app1
	 * @param app2
	 * @param modified
	 */
	public IdentifiedConflict(String app1, String app2, String modified) {
		appID1 = app1;
		appID2 = app2;
		modifiedAppID = modified;
		if(modified == null) {
			setResolutionType(ResolutionType.STOP_DEPLOYMENT);
			explanation = "\'" + app1 +"\' is in conflict with \'" +
							app2+"\'. However, we have not found a solution to resolve the conflict. ";
		}
		else resolution_type = ResolutionType.MODIFY_RULE;//TODO to be modified later... should be more possibilities
	}
	
	
	public String getAppID1() {
		return appID1;
	}
	
	public String getAppID2() {
		return appID2;
	}
	
	public String getModifiedAppID() {
		return modifiedAppID;
	}
	
	public void setAppID1(String id) {
		appID1 = id;
	}
	
	public void setAppID2(String id) {
		appID2 = id;
	}
	
	public void setModifiedAppID(String id) {
		modifiedAppID = id;
	}
	
	public void setExplanation(String exp) {
		this.explanation = exp;
	}

	public String getExplanation() {
		return this.explanation;
	}
	
	public void setResolutionType(ResolutionType type) {
		this.resolution_type = type;
	}
	
	public ResolutionType getResolutionType() {
		return this.resolution_type;
	}
}
