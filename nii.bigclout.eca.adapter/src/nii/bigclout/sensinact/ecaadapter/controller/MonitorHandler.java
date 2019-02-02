package nii.bigclout.sensinact.ecaadapter.controller;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.sensinact.studio.language.ecaverifier.api.ConflictAdaptation;
import org.eclipse.sensinact.studio.language.ecaverifier.api.IDeploymentManager;

import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.sensinact.ecaadapter.adaptation.Adaptation;
import nii.bigclout.sensinact.ecaadapter.models.ModelManager;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelLoader;
import nii.bigclout.sensinact.ecaadapter.models.util.SpecModelSerialization;
import nii.bigclout.sensinact.ecaadapter.translator.Translator;
import nii.bigclout.sensinact.ecaadapter.translator.util.ECAConstants;
import nii.bigclout.sensinact.ecaadapter.verifier.Conflict;

public class MonitorHandler implements Monitor{
	//the ultimate adaptation API that not only changes the ECA adapter models but also changes the sensinact code...
	
	private Adaptation adaptMgr; //triggers the adaptation process in response to changes of applications in the platform
	
	private static ModelManager modelMgr; //manages all the runtime models currently installed in the platform.

	private ConflictAdaptation platformAdapt;//the reflection API that manipulates rules/apps in the platform.

	public MonitorHandler(ConflictAdaptation conflictAdapt) {
		platformAdapt = conflictAdapt;
		
		if(modelMgr == null)
			modelMgr = new ModelManager(conflictAdapt);
		else modelMgr.setConflictAdaptation(conflictAdapt);
		
		adaptMgr = new Adaptation(modelMgr); //new ModelAdaptationHandler(modelMgr, conflictAdapt)
		modelMgr.subscribe(adaptMgr);
	}
	
	@Override
	public void notifyAddRule(String appID, String appECA) {
		//hard-coded for testing the logical flow and implementations...
		// TODO activate adaptation
		System.out.println("**2.** ECA Adapter is notified with the new installation for App: " + appID +
				", with the rules: "+appECA);
		
		//1. build the design model for the newly installed app
		
		RunTimeModel model = (RunTimeModel) SpecModelLoader.loadModel(appID, appECA);
			
		adaptMgr.activateAdaptation(appID, model);
	
	}

	@Override
	public List<Conflict> notifyAddRule(String appID, InputStream appECA) {
		
		//1.translate the .sna dsl into .spec model.
		InputStream specInputStream = Translator.sna2specInputStream(appID, appECA);
		
		RunTimeModel model = SpecModelLoader.loadModel(appID, specInputStream);//get the Java Object of the .spec DSL.
		
		if(model == null) {
			System.out.print("NULL pointer for generated RunTimeModel for " + appID);
		}
		
		//for testing purpose
		System.out.println("MonitorHandler - spec model for "+ appID+": \n" + SpecModelSerialization.toString(model));
		
		//at this point, after the translation, the resource data has been added to the ResourceMapping...
		
		//TODO and then analyze whether there are new states for the new or existing devices...this can be done at later stage
		
		//2. activate adaptation. this is one of the two spots only to call activateAdaptation()...
		return adaptMgr.activateAdaptation(appID, model); // here maybe... it should return an object that specifies the suggested solution...

	}
	

	@Override
	public List<Conflict> notifyRemoveRule(String appID) {
		List<Conflict> conflicts = null;
		//first of all, remove the spec model in the model manager.
		modelMgr.removeModel(appID);
		adaptMgr.update(Adaptation.REMOVE, appID, null);
		
		System.out.println("\n****MonitorHandler - remove rule: " + appID);///////////testing////////////
		
		if(ModelAdaptationHandler.isHighPrioApp(appID) == true) {
			
			conflicts = new ArrayList<Conflict> ();
			
			//if the appID was among the ones that used to have conflict with other app(s) but has NOT been changed
			//meaning it is the one that has higher priority.
			//make the adapted app back to its original eca rule...
			for(String adaptedAppID : ModelAdaptationHandler.getAdaptedAppID(appID)) {
				//make the app back to its original rule...
				String filePath = ECAConstants.INPUT_FILE_LOCATION + adaptedAppID + ECAConstants.SNA_FILE_EXTENSION;
				
				System.out.println("**** Removing one app that was in conflict with a lower priority application!\n" +
									"**** Going to make the lower priority app roll back to its previous rule.");
				String tmpPath = Translator.snaFilePath2specFilePath(filePath);
				
				modelMgr.modifyModel(adaptedAppID, SpecModelLoader.loadModelFromFile(tmpPath));
				Conflict tmp = new Conflict(adaptedAppID, appID);
				tmp.setModified(adaptedAppID);
				conflicts.add(tmp);
			}
			
			ModelAdaptationHandler.removeConflictedHighPrioApp(appID);
			
		} else if(ModelAdaptationHandler.isAdaptedApp(appID)) {
			//no model needs to change if this appID is of lower priority even if it's conflicted with another app...
			//but we need to update the recorded map of adaptedApps in the ModelAdaptationHandler
			ModelAdaptationHandler.removeConflictedLowPrioApp(appID);
		}
		
		return conflicts;
		
	}

	@Override
	public void setHandler(IDeploymentManager handler) {
		// TODO Auto-generated method stub
		platformAdapt = handler;
		modelMgr.setConflictAdaptation(handler);
	}

}
