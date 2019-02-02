package nii.bigclout.sensinact.ecaadapter.controller;

import java.io.InputStream;
import java.util.List;

import org.eclipse.sensinact.studio.language.ecaverifier.api.IDeploymentManager;

import nii.bigclout.sensinact.ecaadapter.verifier.Conflict;

public interface Monitor {
	
	/**
	 * This method is called when a new app is installed in the platform
	 * @param appID is the name of the ECA rule, i.e., the file name of the .sna file
	 * @param appECA as InputStream contains the ECA rule of the new app added
	 */
	public List<Conflict> notifyAddRule(String appID, InputStream appECA);
	
	/**
	 * This method is called to notify that an app is undeployed in the platform.
	 * @param appID the name of the app, i.e. the file name of the .sna file in the sensinact studio
	 */
	public List<Conflict> notifyRemoveRule(String appID);
	
	/**
	 * This method is called when a new app is installed in the platform
	 * @param appID is the name of the app - ECA rule, i.e., the file name of the .sna file
	 * @param appECA as String represents the ECA rule of the new app added
	 */
	public abstract void notifyAddRule(String appID, String appECA);
	
	public void setHandler(IDeploymentManager handler);
	
}
