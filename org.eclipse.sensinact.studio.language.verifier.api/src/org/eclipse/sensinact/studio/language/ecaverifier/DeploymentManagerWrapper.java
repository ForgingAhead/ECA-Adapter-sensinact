package org.eclipse.sensinact.studio.language.ecaverifier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.sensinact.studio.language.ecaverifier.api.IDeploymentManager;
import org.eclipse.sensinact.studio.language.ecaverifier.gui.ConflictsInfoDialog;


public class DeploymentManagerWrapper implements IDeploymentManager {
	
	private static final Logger LOGGER = Logger.getLogger(DeploymentManagerWrapper.class.getName());
	//private AdaptMethod studioAdaptMethod;//reflecting back to the studio...
	private static final String IDEPLOYMENT_MANAGER_ID = "org.eclipse.sensinact.studio.language.ecaverifier";
	
	private static Map<String, IFile> deployedApps = new HashMap<String, IFile>();
	
	public static final String DEPLOY = "deploy";
	public static final String UNDEPLOY = "undeploy";
	
	public DeploymentManagerWrapper(){
		//this.studioAdaptMethod = adaptMethod;
	}
	
	public static File getBaseFile(){
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		return workspace.getRoot().getLocation().toFile();
	}
	
	public static IFile getFile(String fileName) {

		return deployedApps.get(fileName);
		
	}
	
    private IDeploymentManager getDeploymentManager() {
    	
    	System.out.println("DeploymentManagerWrapper -> getDeploymentManager()");//////////////testing
    	
    	IDeploymentManager manager = null;
        IConfigurationElement[] config =  Platform.getExtensionRegistry(
        		).getConfigurationElementsFor(IDEPLOYMENT_MANAGER_ID);
        try {
            for (IConfigurationElement e : config) {
                final Object o = e.createExecutableExtension("class");
                if (o instanceof IDeploymentManager) {
                    manager = (IDeploymentManager)o;
                    break;
                }
            }
        } catch (CoreException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return manager;
    }
    

	@Override
	public void addRule(String ruleID, InputStream sna) {
		System.out.println("Finally, in the sensinact studio, going to add this rule by creating this file: " 
				+ ruleID +".sna");
		//TODO whether here the parameter should be a DSL_SENSINACT model or a file...

	}

	@Override
	public void removeRule(String ruleID) {
		System.out.println("Finally, in the sensinact platform, going to remove this rule by deleting the file: " + ruleID);
		
		//remove rule could mean un-deploy the app.
		
		//TODO when remove a rule, remove the corresponding resources and extra constraints added to other rules too...
		
	}

	@Override
	public void modifyRule(String ruleID, InputStream newSNA) {

	}

	@Override
	public void stopDeployment(String ruleID, String explanation) {
		// TODO prompt ui to inform the developer...
		
	}

/**
	@Override
	public void modifyRule(String ruleID, InputStream newSNA) {
		IDeploymentManager manager = getDeploymentManager();
		if(manager == null){
			 LOGGER.log(Level.CONFIG,"No IDeploymentManager available");
			 return;
		}
        ISafeRunnable runnable = new ISafeRunnable() {
            @Override
            public void handleException(Throwable e) {
                LOGGER.log(Level.SEVERE, e.getMessage(), e);
            }

            @Override
            public void run() throws Exception {
               //manager.modifyRule(ruleID, newSNA);
              // studioAdaptMethod.modifyRule(ruleID, newSNA);
               System.out.println("DeploymentManagerWrapper: -> modify rule!!!");////////////test
    		  
               Rectangle rect = new Rectangle(110,220,200,110);
    		   ConflictInfoPopup pop = new ConflictInfoPopup( new Shell() , rect ,"Conflict Identified!","Select and press ESC to close");
    		   pop.setText("The application \'"+ ruleID+"\' is in conflict. We suggested to modify it to :\n "+newSNA);
    		   pop.open();
    		   
    		  //ConflictsInfoDialog dialog = new ConflictsInfoDialog(null, )
               
            }
        };
        SafeRunner.run(runnable);
	}
*/



	@Override
	public List<IdentifiedConflict> addApp(String appID, InputStream appECA) {
		IDeploymentManager manager = getDeploymentManager();
		if(manager == null){
			 LOGGER.log(Level.CONFIG,"No IDeploymentManager available");
			 return null;
		}
        ISafeRunnable runnable = new ISafeRunnable() {
            @Override
            public void handleException(Throwable e) {
                LOGGER.log(Level.SEVERE, e.getMessage(), e);
            }

            @Override
            public void run() throws Exception {
            	System.out.println("DeploymentManagerWrapper: -> addApp()!!! --- " + appID);////////////test
            	List<IdentifiedConflict> resolved = manager.addApp(appID,appECA);
            	
            	resolveConflict(resolved, DEPLOY);
            }
        };
        SafeRunner.run(runnable);	
        
        return null;
	}


	@Override
	public List<IdentifiedConflict> removeApp(String appID) {
		IDeploymentManager manager = getDeploymentManager();
		if(manager == null){
			 LOGGER.log(Level.CONFIG,"No IDeploymentManager available");
			 return null;
		}
        ISafeRunnable runnable = new ISafeRunnable() {
            @Override
            public void handleException(Throwable e) {
                LOGGER.log(Level.SEVERE, e.getMessage(), e);
            }

            @Override
            public void run() throws Exception {
            	System.out.println("DeploymentManagerWrapper: -> removeApp()!!! --- " + appID);////////////test
            	List<IdentifiedConflict> conflicts = manager.removeApp(appID);
                
                resolveConflict(conflicts, UNDEPLOY);
            }
        };
        
        SafeRunner.run(runnable);	
        
        return null;
	}
	
	/**
	 * Update the current deployed apps by adding the newly deployed one.
	 * @param name
	 * @param app
	 */
	public static void deployed(String name, IFile app) {
		System.out.println("DeploymentManagerWrapper---> deployed app name: " + name);///////////////////////
		deployedApps.put(name, app);
	}
	
	/**
	 * Update the current deployed apps by removing the undeployed one.
	 * @param name
	 */
	public static void undeployed(String name) {
		deployedApps.remove(name);
	}

	/**
	 * Resolve conflicts according to the deploy type, i.e., deploy or undeploy.
	 * If the conflict happens when a new app is deployed, then resolve by modify the app's rule.
	 * If it is about to be undeployed, then ROLL_BACK is applied.
	 * @param conflicts
	 * @param deployType
	 */
	public void resolveConflict(List<IdentifiedConflict> conflicts, String deployType) {
		//TODO add the ResolutionType emun into consideration...
    	ResolutionType type;
    	boolean stopDeployment = false;
    	if(deployType.equals(DEPLOY))
    		type = ResolutionType.MODIFY_RULE;
    	else type = ResolutionType.ROLL_BACK;
    	
    	if(conflicts != null && conflicts.size()!=0) {
    		
    		for(IdentifiedConflict resolve : conflicts) {
    			if(resolve.getModifiedAppID() == null) {
    				resolve.setResolutionType(ResolutionType.STOP_DEPLOYMENT);
    				stopDeployment  = true;
    				stopDeployment(null, resolve.getExplanation());//TODO stop deployment here???
    				break;
    			} else 
    				resolve.setResolutionType(type);
    		}
    		
    		if(stopDeployment == false) {
    			
                ConflictsInfoDialog dialog = new ConflictsInfoDialog(null, conflicts, type);
        		dialog.create();
        		dialog.open();   			
    		}
    	}
	}
	
}
