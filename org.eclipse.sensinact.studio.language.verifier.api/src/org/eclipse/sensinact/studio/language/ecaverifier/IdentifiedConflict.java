package org.eclipse.sensinact.studio.language.ecaverifier;

public class IdentifiedConflict {
	
	private String appID1;
	private String appID2;
	
	private String modifiedAppID = null;
	
	private String explanation;
	
	private ResolutionType resolution_type;
	
	public IdentifiedConflict() {
		
	}
	
	public IdentifiedConflict(String app1, String app2, String modified) {
		appID1 = app1;
		appID2 = app2;
		modifiedAppID = modified;
		if(modified == null) {
			setResolutionType(ResolutionType.STOP_DEPLOYMENT);
			explanation = "We have identified conflict between the IoT applications \'" + app1 +"\' and \'" +
							app2+"\'. However, we have not found a solution to resolve the conflict. ";
		}
		else resolution_type = ResolutionType.MODIFY_RULE;//TODO to be modified later... should be more possibilities
	}
	
	public IdentifiedConflict(String app1, String app2) {
		appID1 = app1;
		appID2 = app2;
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
