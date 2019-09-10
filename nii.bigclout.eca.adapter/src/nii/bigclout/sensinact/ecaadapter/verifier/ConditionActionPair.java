package nii.bigclout.sensinact.ecaadapter.verifier;

import java.util.List;

import nii.bigclout.ecaadapter.dsl.Action;
import nii.bigclout.ecaadapter.dsl.Element;

public class ConditionActionPair {
	protected Element condition; //TODO condition could be null if it is the ElseDoSpec...
	protected List<Action> actions;
	protected List<String> actuators;
	public ConditionActionPair(Element cond, List<Action> acts) {
		this.condition = cond;
		this.actions = acts;
		
	}
	
	public boolean conflictsWith(ConditionActionPair condAct) {
		for(Action act : actions) {
			for(Action act2 : condAct.actions) {
				System.out.println("ConditionActionPair: checking conflicts between: "+
							act.getResource().getName()+" - "+act.getState().getName() +"; "+
						act2.getResource().getName()+" - "+act2.getState().getName());///////////////testing
				
				//do they change the same device to different states
				if(act.getResource().getName().equals(act2.getResource().getName()) && !act.getState().getName().equals(act2.getState().getName())) {
					//change under different conditions?
					//if(this.condition!=condAct.condition)
					System.out.println("there is a conflict!!!");//////////test
						return true;
				}
			}
		}
		return false;
	}
}
