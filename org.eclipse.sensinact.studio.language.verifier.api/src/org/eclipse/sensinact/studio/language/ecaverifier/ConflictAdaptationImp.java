package org.eclipse.sensinact.studio.language.ecaverifier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.sensinact.studio.language.ecaverifier.api.ConflictAdaptation;

public class ConflictAdaptationImp implements ConflictAdaptation{

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
		IFile modified = DeploymentManagerWrapper.getFile(ruleID);
		
		if(modified == null) {
			System.out.println("ConflictInfoDialog --> to be modified app" + ruleID);
			System.out.println("Null pointer for the modified IFile - auto resolve conflicts...");/////////////////////testing
		} else {
			System.out.println("auto-resolve conflict = IFile not null for: " + modified.getName());////////////
			File file = new File(DeploymentManagerWrapper.getBaseFile(), "output/"+modified.getName());
			if(file.exists()) {
				try {
					/**
					 * update the file!!!
					 */
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
		}
	}

	@Override
	public void stopDeployment(String ruleID, String explanation) {
		// TODO prompt ui to inform the developer...
		
	}

}
