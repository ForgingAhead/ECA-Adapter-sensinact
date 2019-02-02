package nii.bigclout.sensinact.ecaadapter.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class NewInstallationSimulator {
	
	private AppDeployConflictHandler conflictHandler;
	
	public NewInstallationSimulator() {
		conflictHandler = new AppDeployConflictHandler();
	}
	
	/**
	 * invoked when a new app is going to be installed...
	 * This part of invocation should be done inside the sensiNact platform
	 * @param appID
	 * @param appECA
	 */
	public void addNewApp(String appID, InputStream appECA) {
		System.out.println("\n**step 1.** A new app is going to be installed, App ID: " + appID + ", app ECA rules: " + appECA); //for mock purpose
		//conflictHandler.addApp(appID, appECA);
	}
	
	public void undeployApp(String appID) {
		System.out.println("\n**step 1.** An app is going to be un-deployed, App ID: " + appID);
		//conflictHandler.removeApp(appID);
	}
	
	public static void main(String[] args) {
		
		NewInstallationSimulator newInstall = new NewInstallationSimulator();
		
		try {
			//mocking the deployment of application...
			String app1 = "env";
			String app2 = "security";
			
			newInstall.addNewApp(app1, new FileInputStream("input/env.sna"));//mock the deployment of the app - env.sna
			
			newInstall.addNewApp(app2, new FileInputStream("input/security.sna"));//mock the deployment of the app - security.sna
			
			
			/**this is to mock un-deploying a higher priority app if it has been in conflict with another lower priority app, 
			then changes will be made to the lower priority app*/
			
			//newInstall.undeployApp(app1); 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
