package org.eclipse.sensinact.studio.language.ecaverifier;

public class ResolvedConflict {
	
	private String appID1;
	private String appID2;
	
	private String modifiedAppID;
	
	public ResolvedConflict() {
		
	}
	
	public ResolvedConflict(String app1, String app2, String modified) {
		appID1 = app1;
		appID2 = app2;
		modifiedAppID = modified;
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

}
