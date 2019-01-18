package nii.bigclout.sensinact.ecaadapter.translator.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.sensinact.studio.language.sensinact.DSL_Resource;

/**
 * A mapping between the .sna model and the .spec model. the main difference is that the SPEC model is asset-centric or device=centric
 * where the .sna model is action centric... they have different focuses
 * @author Feng
 *
 */
public class ResourceMapping {
	
	private String ruleID;//namely the .sna file name, i.e. the app name ...
	
	//should reflect the original .sna model resources
	private Map<String, DSL_Resource> resources; //<sna/spec resource name, Sna resource>
	
	//only those that have states can appear in the .spec model...
	private Map<String, Set<String>> states; //<.spec concept name,  its states>, the state is in fact a DSL_Resource which represents a function usually..
	
	public ResourceMapping() {
		resources = new HashMap<String, DSL_Resource>();
		states = new HashMap<String, Set<String>>();
	}
	
	/**
	 * Construct a ResourceMapping for the specified rule/application
	 * @param ruleID the .sna rule filename, which is also regarded as an ID
	 */
	public ResourceMapping(String ruleID) {
		this.ruleID = ruleID;
		resources = new HashMap<String, DSL_Resource>();
		states = new HashMap<String, Set<String>>();
	}
	
	public ResourceMapping(String ruleID, String concept, DSL_Resource rs, Set<String> sts) {
		this.ruleID = ruleID;
		resources = new HashMap<String, DSL_Resource>();
		states = new HashMap<String, Set<String>>();
		resources.put(concept, rs);
		states.put(concept, sts);
	}
	
	/**
	 * Add a mapping between the spec resource concept and the DSL_Resource
	 * @param name the spec resource concept
	 * @param rs the .sna resource
	 */
	public void addResource(String name, DSL_Resource rs) {
		resources.put(name, rs);
	}
	
	/**
	 * Add a state to the spec resource concept
	 * @param concept
	 * @param state
	 */
	public void addState(String concept, String state) {
		if(states.get(concept) == null) {
			Set<String> sts = new HashSet<String>();
			sts.add(state);
			states.put(concept, sts);
		} else
			states.get(concept).add(state);
	}
	
	/**
	 * add a list of states to the spec resource concept
	 * @param concept
	 * @param sts
	 */
	public void addStates(String concept, Set<String> sts) {
		if(states.get(concept) == null) {
			states.put(concept, sts);
		} else
			states.get(concept).addAll(sts);
	}
	
	/**
	 * Judge whether the specified .sna resource is equal to any resources in this rule/application
	 * @param rs
	 * @return true is the specified .sna resource is used in this rule/application
	 */
	public boolean isEqual(DSL_Resource rs) {
		for(DSL_Resource resource : resources.values()) {
			if(rs.getGatewayID()== resource.getGatewayID() &&
					rs.getDeviceID() == resource.getDeviceID() &&
					rs.getServiceID() == resource.getServiceID() &&
					rs.getResourceID() == resource.getResourceID())
				return true;
		}
		return false;
	}
	
	public Collection<DSL_Resource> getResources() {
		return resources.values();
	}
	
	public String getRuleID() {
		return ruleID;
	}
	
	public void  setRuleID(String newID) {
		this.ruleID = newID;
	}
	
	/**
	 * Find and return the corresponding .sna resource object for the specified .spec resource concept
	 * @param concept the specified spec resource concept
	 * @return
	 */
	public DSL_Resource getDSL_Resource(String concept) {
		return resources.get(concept);
	}
	
	/**
	 * return a set of states of the spec resource concepts
	 * @param concept
	 * @return
	 */
	public Set<String> getStates(String concept) {
		return states.get(concept);
	}
	
	/**
	 * Return true if the specified .spec resource concept has state(s).
	 * @param concept
	 * @return
	 */
	public boolean hasStates(String concept) {
		if(states.get(concept)==null || states.get(concept).size() == 0)
			return false;
		else return true;
	}
	
	/**
	 * Set the states of the .spec resource concept.
	 * @param stats
	 */
	public void setStates(Map<String, Set<String>> stats) {
		this.states = stats;
	}
	
}
