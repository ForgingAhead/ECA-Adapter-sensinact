package nii.bigclout.sensinact.ecaadapter.controller;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.sensinact.studio.language.ecaverifier.api.ConflictAdaptation;

import nii.bigclout.sensinact.ecaadapter.models.AdaptMethod;

/**
 * This class connects the adaptation logic for synchronizing the two different models, i.e. the models@runtime and 
 * the models of the .sna ECA code in the sensinact studio.
 * Any changes made to the ECA adapter models through the interface - AdaptMethod, would be reflected to the studio models 
 * through the sensinact platform interface - ConflictAdaptation...
 * @author Feng
 *
 */
public class ModelAdaptationHandler {

	
	protected static AdaptMethod adaptModel;
	private static ConflictAdaptation platformAdapt;
	
	//<conflicted app with higher priority, adapted apps, i.e., lower priority apps that have been changed due to the conflict>
	private static Map<String, Set<String>> adaptedApps = new HashMap<String, Set<String>>();
	
	public ModelAdaptationHandler(AdaptMethod model, ConflictAdaptation platformAdapt) {
		this.adaptModel = model;
		this.platformAdapt = platformAdapt;
	}


	
	private void print(String msg) {
		System.out.println(msg);
	}
	
	/**
	 * Return true if the specified appID is one of the conflicted apps but has not been changed due to a higher priority
	 * @param appID
	 * @return false if the specified app is one of the conflicted apps and has been changed due to a lower priority or has no history of been conflicting with any other apps
	 */
	public static boolean isHighPrioApp(String appID) {
		if(adaptedApps.isEmpty()) {
			System.out.println("**** adaptedApps are empty, indicating no conflict occurred so far......");
			return false;
		}
		if(adaptedApps.containsKey(appID) && adaptedApps.get(appID).size()>0)
			return true;
		else return false;
	}
	
	public static Set<String> getAdaptedAppID(String conflictedAppID) {
		return adaptedApps.get(conflictedAppID);
	}
	
	public static void removeConflictedApps(String highPriority, String lowPriority) {
		adaptedApps.get(highPriority).remove(lowPriority);
	}
	
	public static void addConflictedApp(String highPriority, String lowPriority) {
		if(adaptedApps.containsKey(highPriority) == false) {
			adaptedApps.put(highPriority, new HashSet<String>());
		}
		adaptedApps.get(highPriority).add(lowPriority);
	}
	
	public static boolean isAdaptedApp(String appID) {
		for(Set<String> tmp : adaptedApps.values()) {
			if(tmp.contains(appID))
				return true;
		}
		return false;
	}
	
	public static void removeConflictedHighPrioApp(String highPriority) {
		adaptedApps.remove(highPriority);
	}
	
	public static void removeConflictedLowPrioApp(String lowPriority) {
		
		for(Set<String> tmp : adaptedApps.values()) {
			if(tmp.contains(lowPriority)) {
				tmp.remove(lowPriority);
			}
		}
	}

}
