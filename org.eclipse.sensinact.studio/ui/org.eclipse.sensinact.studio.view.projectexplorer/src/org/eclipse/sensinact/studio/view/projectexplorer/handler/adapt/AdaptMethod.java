package org.eclipse.sensinact.studio.view.projectexplorer.handler.adapt;

import java.io.InputStream;

public interface AdaptMethod {
	/**
	 * Add a new rule with the specified name ruleID, and the rule is contained in the specified InputStream sna
	 * @param ruleID is the .sna file fileName
	 * @param sna contains the ECA rule, i.e., the .sna file content 
	 */
	public void addRule(String ruleID, InputStream sna);
	
	/**
	 * Remove the specified rule by the .sna file name, i.e. ruleID.
	 * This may be unlikely to be invoked... it means to un-deploy the rule.
	 * @param ruleID is the .sna file name
	 */
	public void removeRule(String ruleID);//ruleID is the .sna file name.
	
	/**
	 * Modify the existing specified rule, i.e. ruleID, by replacing it with the new rule specified by newSNA
	 * @param ruleID the existing rule to be modified
	 * @param newSNA the new ECA rule, i.e., the .sna file content
	 */
	public void modifyRule(String ruleID, InputStream newSNA); 
	
	/**
	 * Stop the deployment of the specified rule.
	 * @param ruleID the .sna file name of the specified rule
	 * @param explanation why to stop the deployment
	 */
	public void stopDeployment(String ruleID, String explanation);
}
