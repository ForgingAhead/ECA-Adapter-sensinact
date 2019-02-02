package nii.bigclout.sensinact.ecaadapter.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.sensinact.studio.language.ecaverifier.DeploymentManagerWrapper;
import org.eclipse.sensinact.studio.language.ecaverifier.IdentifiedConflict;
import org.eclipse.sensinact.studio.language.ecaverifier.ResolutionType;
import org.eclipse.sensinact.studio.language.ecaverifier.api.ConflictAdaptation;
import org.eclipse.sensinact.studio.language.ecaverifier.api.IDeploymentManager;

import nii.bigclout.sensinact.ecaadapter.verifier.Conflict;

/**
 * 
 * @author Feng
 *
 */
public class AppDeployConflictHandler implements IDeploymentManager {
	
	private ConflictAdaptation adaptMethod;

	public static File getBaseFile(){
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		return workspace.getRoot().getLocation().toFile();
	}
	
	private static Monitor monitor;
	
	public AppDeployConflictHandler() {

		File root = getBaseFile();
		
		System.out.println("base file location: "+ root.getAbsolutePath());/////////////////////test
		
		File input = new File(root,"input");
		if(!input.exists()){
			input.mkdir();
		}
		File output = new File(root,"output");
		if(!output.exists()){
			output.mkdir();
		}
		if(monitor == null)
			monitor = new MonitorHandler(this);
		else monitor.setHandler(this);
		
	}

	@Override
	public void addRule(String ruleID, InputStream sna) {
		System.out.println("Finally, in the sensinact platform, going to add this rule by creating this file: " 
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
		
		System.out.println("Finally, in the sensinact platform, the modified sna model received!");
		//TODO when modify a rule, re-do model checking for conflicts...
		String sna = new BufferedReader(new InputStreamReader(newSNA)).lines().collect(Collectors.joining("\n"));
		System.out.println(ruleID+ " is modified to: " + sna);
		
		/**
		IFile modified = DeploymentManagerWrapper.getFile(ruleID);
		
		if(modified == null) {
			System.out.println("ConflictInfoDialog --> to be modified app" + ruleID);
			System.out.println("Null pointer for the modified IFile - auto resolve conflicts...");/////////////////////testing
		} else {
			System.out.println("auto-resolve conflict = IFile not null for: " + modified.getName());////////////
			File file = new File(DeploymentManagerWrapper.getBaseFile(), "output/"+modified.getName());
			if(file.exists()) {
				try {
					
					 //update the file!!!
					 
					System.out.println("going to auto-resolve conflict by modifying this file: " + modified.getName());////////////
					modified.setContents(new FileInputStream(file), true, true, null);
					System.out.println("IFile Modification finished....");
					
				} catch (FileNotFoundException | CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("auto resolve conflict --> File not found for "+ modified.getName());
			}
		} */
		
		
		
	}
	
	@Override
	public void stopDeployment(String ruleID, String explanation) {
		// TODO Auto-generated method stub
		System.out.println("Because " + explanation + ", the application " + ruleID + " will not be deployed!");
		
	}
	

	@Override
	public List<IdentifiedConflict> addApp(String appID, InputStream appECA) {
		//notify the monitor in the ECA Adapter that a new app is going to be deployed.
		
		List<Conflict> conflicts = monitor.notifyAddRule(appID, appECA);

		return getIdentifiedConflicts(conflicts);
		
	}

	@Override
	public List<IdentifiedConflict> removeApp(String appID) {
		//notify the monitor in the ECA Adapter that an app is going to be un-deployed.
		List<Conflict> conflicts = monitor.notifyRemoveRule(appID);
		
		return getIdentifiedConflicts(conflicts); 
	}
	
	private List<IdentifiedConflict> getIdentifiedConflicts(List<Conflict> conflicts) {
		List<IdentifiedConflict> resolved = new ArrayList<IdentifiedConflict>();
		if(conflicts!=null && conflicts.size()>0) {
			for(Conflict conf : conflicts) {
				IdentifiedConflict resolve = new IdentifiedConflict(conf.getRule1ID(), conf.getRule2ID(), conf.getModified());
				
				resolved.add(resolve);
			}
			return resolved;
			
		} else return null;
	}
	
}

