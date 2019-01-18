package nii.bigclout.sensinact.ecaadapter.verifier;

import nii.bigclout.ecaadapter.dsl.Element;

/**
 * The class stores the information about a pair of rules/apps that are conflicting with each other.
 * Specifically, it will store the rule ID and the specific conditions that are in conflict.
 * @author Feng
 *
 */
public class Conflict {
	
	private String rule1ID; //two rules are conflicting with each other, namely rule1 and rule2
	private String rule2ID;
	
	private Element condition1; //this condition1 from rule1 is conflicted with condition2 of rule2
	private Element condition2;
	
	private String modified;
	
	public Conflict() {
		
	}
	
	public Conflict(String r1, String r2) {
		this.rule1ID = r1;
		this.rule2ID = r2;
	}
	
	public void setCondition1(Element con) {
		this.condition1 = con;
	}
	
	public void setCondition2(Element con) {
		this.condition2 = con;
	}
	
	public void setRule1ID(String id) {
		this.rule1ID = id;
	}
	
	public void setRule2ID(String id) {
		this.rule2ID = id;
	}
	
	public String getRule1ID() {
		return rule1ID;
	}
	
	public String getRule2ID() {
		return rule2ID;
	}
	
	public Element getCondition1() {
		return condition1;
	}
	
	public Element getCondition2() {
		return condition2;
	}
	
	public String getModified() {
		return modified;
	}
	
	public void setModified(String id) {
		modified = id;
	}

}
