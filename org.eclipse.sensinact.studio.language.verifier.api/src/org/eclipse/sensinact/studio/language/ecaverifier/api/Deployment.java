package org.eclipse.sensinact.studio.language.ecaverifier.api;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;

import org.eclipse.sensinact.studio.language.ecaverifier.IdentifiedConflict;

/**
 * Simulating the behavior of adding and removing apps by developers from the sensinact studio
 * Additionally, there should be another interface method for assigning priorities for apps. 
 * 
 * TODO Here, appID as the unique identifier for deployed applications is an issue, since other clients may develop and 
 * deploy applications with the same name but developed from different sensiNact studios...
 * @author Feng
 *
 */
public interface Deployment {
	
	/**
	 * called when the specified application appID is going to be deployed in the platform, with the rule specified in
	 * the InputStream appECA.
	 * @param appID name of the application, i.e. the .sna file name.
	 * @param appECA ECA rule of the application. the original .sna file content as InputStream
	 * 
	 */
	public List<IdentifiedConflict>  addApp(String appID, InputStream appECA);
	//Collection<String>
	/**
	 * called when the specified application appID is going to be un-deployed in the platform.
	 * @param appID name of the application, assuming it's the unique identifier for applications deployed under one client...
	 * 
	 */
	public List<IdentifiedConflict> removeApp(String appID);	

}
