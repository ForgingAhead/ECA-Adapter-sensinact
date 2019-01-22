package org.eclipse.sensinact.studio.language.ecaverifier;

import org.eclipse.swt.graphics.Rectangle;

import java.io.File;
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
import org.eclipse.sensinact.studio.language.ecaverifier.gui.ConflictInfoPopup;
import org.eclipse.sensinact.studio.language.ecaverifier.gui.ConflictsInfoDialog;
//import org.eclipse.sensinact.studio.view.projectexplorer.handler.adapt.AdaptMethod;
import org.eclipse.swt.widgets.Shell;


public class DeploymentManagerWrapper implements IDeploymentManager {
	
	private static final Logger LOGGER = Logger.getLogger(DeploymentManagerWrapper.class.getName());
	//private AdaptMethod studioAdaptMethod;//reflecting back to the studio...
	private static final String IDEPLOYMENT_MANAGER_ID = "org.eclipse.sensinact.studio.language.ecaverifier";
    
	private static Map<String, IFile> deployedApps = new HashMap<String, IFile>();
	
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
	public void addRule(final String ruleID, final InputStream sna) {
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
               manager.addRule(ruleID, sna);
               //studioAdaptMethod.addRule(ruleID, sna);
            }
        };
        SafeRunner.run(runnable);		
	}


	@Override
	public void removeRule(String ruleID) {
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
               manager.removeRule(ruleID);
               //studioAdaptMethod.removeRule(ruleID);
            }
        };
        SafeRunner.run(runnable);		
	}


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


	@Override
	public void stopDeployment(String ruleID, String explanation) {
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
            	//TODO show some stop deployment dialog...
            	
            	
            	
            }
        };
        SafeRunner.run(runnable);		
	}


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
            	
            	boolean stopDeployment = false;
            	
            	if(resolved != null && resolved.size()!=0) {
            		
            		for(IdentifiedConflict resolve : resolved) {
            			if(resolve.getModifiedAppID() == null) {
            				stopDeployment  = true;
            				stopDeployment(null, resolve.getExplanation());
            				break;
            			}
            		}
            		
            		if(stopDeployment == false) {
	                    ConflictsInfoDialog dialog = new ConflictsInfoDialog(null, resolved, false);
	            		dialog.create();
	            		dialog.open();   			
            		}
            	}
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
                manager.removeApp(appID);
                
                
            }
        };
        
        SafeRunner.run(runnable);	
        
        return null;
	}

	public static void deployed(String name, IFile app) {
		System.out.println("DeploymentManagerWrapper---> deployed app name: " + name);///////////////////////
		deployedApps.put(name, app);
	}
	
	public static void undeployed(String name) {
		deployedApps.remove(name);
	}

}
