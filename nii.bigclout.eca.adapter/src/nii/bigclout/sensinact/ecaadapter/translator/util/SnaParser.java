package nii.bigclout.sensinact.ecaadapter.translator.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Negate;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Boolean;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Number;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_String;
import org.eclipse.sensinact.studio.language.sensinact.DSL_REF;
import org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Resource;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction;
import org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Parsing the .sna file, namely the ECA application developed in sensiNact studio.
 * By parsing, here it helps converting the .sna grammar/model into .spec model
 *@author Feng Chen
 */
public class SnaParser {

	
	public static void parseExpression (DSL_Expression expr, BufferedWriter writer) throws IOException {
		//OR: Left associative, priority 1
		if (expr instanceof DSL_Expression_Or) {
			DSL_Expression_Or or = (DSL_Expression_Or) expr;
			DSL_Expression left = or.getLeft();
			DSL_Expression right = or.getRight();
			
			System.out.println("DSL_Expression_Or ");////////////////////////test
			parseExpressionInternal(writer, " or ", left, right);

		}

		// And: left associative, priority 2
		else if (expr instanceof DSL_Expression_And) {
			DSL_Expression_And and = (DSL_Expression_And) expr;
			DSL_Expression left = and.getLeft();
			DSL_Expression right = and.getRight();

			System.out.println("DSL_Expression_And ");////////////////////////test
			parseExpressionInternal(writer, " and ", left, right);
		}

		// different/equal: left associative, priority 3
		else if (expr instanceof DSL_Expression_Diff) {
			DSL_Expression_Diff diff = (DSL_Expression_Diff) expr;
			DSL_Expression left = diff.getLeft();
			DSL_Expression right = diff.getRight();
			
			System.out.println("DSL_Expression_Diff ");////////////////////////test
			parseExpressionInternal(writer, " != ", left, right);

		} else if (expr instanceof DSL_Expression_Equal) {
			DSL_Expression_Equal equal = (DSL_Expression_Equal) expr;
			DSL_Expression left = equal.getLeft();
			DSL_Expression right = equal.getRight();
			
			System.out.println("DSL_Expression_Equal ");////////////////////////test
			
			parseExpressionInternal(writer, " == ", left, right);

		}

		// Comparisons: left associative, priority 4
		else if (expr instanceof DSL_Expression_Larger) {
			DSL_Expression_Larger largerThan = (DSL_Expression_Larger) expr;
			DSL_Expression left = largerThan.getLeft();
			DSL_Expression right = largerThan.getRight();

			parseExpressionInternal(writer, " > ", left, right);

		} else if (expr instanceof DSL_Expression_Larger_Equal) {
			DSL_Expression_Larger_Equal largerEqual = (DSL_Expression_Larger_Equal) expr;
			DSL_Expression left = largerEqual.getLeft();
			DSL_Expression right = largerEqual.getRight();

			parseExpressionInternal(writer, " >= ", left, right);

		} else if (expr instanceof DSL_Expression_Smaller) {
			DSL_Expression_Smaller smallerThan = (DSL_Expression_Smaller) expr;
			DSL_Expression left = smallerThan.getLeft();
			DSL_Expression right = smallerThan.getRight();

			parseExpressionInternal(writer, " < ", left, right);

		} else if (expr instanceof DSL_Expression_Smaller_Equal) {
			DSL_Expression_Smaller_Equal smallerEqual = (DSL_Expression_Smaller_Equal) expr;
			DSL_Expression left = smallerEqual.getLeft();
			DSL_Expression right = smallerEqual.getRight();

			parseExpressionInternal(writer, " <= ", left, right);
		}

		// addition/subtraction: left associative, priority 5
		else if (expr instanceof DSL_Expression_Plus) {
			DSL_Expression_Plus plus = (DSL_Expression_Plus) expr;
			DSL_Expression left = plus.getLeft();
			DSL_Expression right = plus.getRight();

			parseExpressionInternal(writer, " + ", left, right);

		} else if (expr instanceof DSL_Expression_Minus) {
			DSL_Expression_Minus minus = (DSL_Expression_Minus) expr;
			DSL_Expression left = minus.getLeft();
			DSL_Expression right = minus.getRight();

			parseExpressionInternal(writer, " - ", left, right);
		}

		// multiplication/division/modulo, left associative, priority 6
		else if (expr instanceof DSL_Expression_Multiplication) {
			DSL_Expression_Multiplication multiply = (DSL_Expression_Multiplication) expr;
			DSL_Expression left = multiply.getLeft();
			DSL_Expression right = multiply.getRight();

			parseExpressionInternal(writer, " * ", left, right);

		} else if (expr instanceof DSL_Expression_Division) {
			DSL_Expression_Division divide = (DSL_Expression_Division) expr;
			DSL_Expression left = divide.getLeft();
			DSL_Expression right = divide.getRight();

			parseExpressionInternal(writer, " / ", left, right);

		} else if (expr instanceof DSL_Expression_Modulo) {
			DSL_Expression_Modulo modulo = (DSL_Expression_Modulo) expr;
			DSL_Expression left = modulo.getLeft();
			DSL_Expression right = modulo.getRight();
			parseExpressionInternal(writer, " % ", left, right);
		}

		// Unary operators: right associative, priority 7
		else if (expr instanceof DSL_Expression_Negate) {
			DSL_Expression_Negate negate = (DSL_Expression_Negate) expr;
			DSL_Expression exp = negate.getExp();
			parseExpressionInternal(writer, " not ", exp);
		}

		else 
			throw new RuntimeException("Should never happend");
		
	}
	

	private static void parseExpressionInternal(BufferedWriter writer, String function, DSL_Expression... params) throws IOException {
		if(params.length > 1) {
			parseParameter(params[0], writer);
			writer.write(function);
			parseParameter(params[1], writer);
		} else {
			writer.write(function);
			parseParameter(params[0], writer);
		}
	}

	private static void parseParameter(DSL_Expression expr, BufferedWriter writer) throws IOException{

		if (expr instanceof DSL_Object_Number) {
			DSL_Object_Number number = (DSL_Object_Number) expr;

			try {
				long value = number.getValue().longValueExact();
				writer.write(String.valueOf(value));
			} catch (ArithmeticException e) {
				double value = number.getValue().doubleValue();
				writer.write(String.valueOf(value));
			}

		} else if (expr instanceof DSL_Object_String) {
			DSL_Object_String str = (DSL_Object_String) expr;
			writer.write(str.getValue());

		} else if (expr instanceof DSL_Object_Boolean) {
			DSL_Object_Boolean bool = (DSL_Object_Boolean) expr;
			//cb.parameter(bool.isValue());
			writer.write(String.valueOf(bool.isValue()));
			
		} else if (expr instanceof DSL_Object_Ref) {
			DSL_Object_Ref objRef = (DSL_Object_Ref) expr;
			DSL_REF ref = objRef.getValue();
			writer.write(ref.getName()+".state"); //////////////test. should think more on this...
			
			//if (triggers != null && refInList(ref, triggers)) 

		} else {
			parseExpression(expr, writer);
		}
	}
	
	public static void parseActions(EList<DSL_ResourceAction> actions, BufferedWriter writer, Map<String, String> belongs) throws IOException {
		int count = actions.size();
		for(DSL_ResourceAction action : actions) {
			
			if (action.getListParam() != null && action.getListParam().getParam() != null) {
				System.out.println("this action has parameters, action: " + action.getRef().getName());///////////////////////test
			} else {
				writer.write(belongs.get(action.getRef().getName()) + " := " + action.getRef().getName());/////////////check....
				
			}
			if(--count > 0) {
				writer.write(" AND ");
			}
		}
		writer.write("\r\n");
	}
	
	/**
	 * Parse actions which are embedded into a conditional statement.
	 * @param triggerTrueFalse
	 * 			the conditional statement part
	 * @param actions
	 * @param writer
	 * @throws IOException 
	 */
	public static void parseConditionalActions (boolean triggerTrueFalse, EList<DSL_ResourceAction> actions, BufferedWriter writer) throws IOException {
		for(DSL_ResourceAction action : actions) {
			parseConditionalAction(triggerTrueFalse, action, writer);
		}
	}
	
	/**
	 * Parse an action which is embedded into a conditional statement. Creates
	 * statements in the generated model accordingly.
	 * 
	 * @param triggerTrueFalse
	 * @param action
	 * @param writer
	 * @throws IOException 
	 */
	public static void parseConditionalAction(boolean triggerTrueFalse, DSL_ResourceAction action, BufferedWriter writer) throws IOException {


		String identifier = action.getVariable();
		boolean register = identifier != null;

		// First parameter is the resource name on which the act is applied 
		//cb.parameter(action.getRef());
		if (action.getListParam() != null && action.getListParam().getParam() != null)
		{
			for (DSL_Expression param : action.getListParam().getParam()) {
				parseParameter(param, writer);
			}
		}
		//components.put(cb.build());
	}
	
	//TO-DO
	public static void parseCEPStatement (DSL_CEP_STATEMENT statement) {
		
	}
	
	//TODO !!!!!!!!!!!!!!
	public static Map<String, Set<String>> parseStatefulResources (DSL_SENSINACT sna) {
		Map<String, DSL_Resource> resources = new HashMap<String, DSL_Resource>();
		Map<String, Set<String>> states = new HashMap<String, Set<String>>();
		//ArrayList<String> triggers = new ArrayList<String>(); //some kind of sensors or events...
		Set<String> actuators = new HashSet<String>();//name of the DSL_Resource
		
		//filter out the actions...
		for(DSL_ResourceAction act: sna.getEca().getIfdo().getActions().getActionList()) {
			actuators.add(act.getRef().getName());
			System.out.println("actuator from if do: " + act.getRef().getName());////////////////////////test
		}
		
		if(sna.getEca().getElseIfdo() !=null) {
			for(DSL_ElseIfDo eid : sna.getEca().getElseIfdo()) {
				for(DSL_ResourceAction action : eid.getActions().getActionList()) {
					actuators.add(action.getRef().getName());
					System.out.println("actuator from else if do: " + action.getRef().getName());////////////////////////test
				}
			}
		}
		
		if(sna.getEca().getElsedo() != null) {
			for(DSL_ResourceAction act : sna.getEca().getElsedo().getActions().getActionList()) {
				actuators.add(act.getRef().getName());
				System.out.println("actuator from else do: " + act.getRef().getName());////////////////////////test
			}
		}
		
		Set<String> devices = new HashSet<String>();//the actual device that performs an action
		
		for(DSL_Resource resource : sna.getResources() ) {
			resources.put(resource.getName(), resource);
			devices.add(resource.getDeviceID());
			System.out.println("Resource ID: " + resource.getResourceID());/////////////////////test
		}
		
		for(String actuator : actuators) {
			String device = resources.get(actuator).getDeviceID();
			if(states.get(device) == null) {
				Set<String> tmp = new HashSet<String>(); 
				tmp.add(actuator);
				states.put(device, tmp);
			} else {
				states.get(device).add(actuator);
			}
		}
		
		/**
		////1. get the resources----environment meta data
		ArrayList<String> temp = new ArrayList<String>();
		temp.addAll(actuators);
		for(int j=0; j<temp.size()-1; j++) {
			String s1 = temp.get(j);
			String s2 = temp.get(j+1);
			if(resources.get(s1).getDeviceID().equals(resources.get(s2).getDeviceID()) && 
					resources.get(s1).getServiceID().equals(resources.get(s2).getServiceID())) {
				System.out.println("matching states found: " + s1 +", and " + s2);///////////////////////test
				if(states.containsKey(resources.get(s1).getDeviceID())) {
					states.get(resources.get(s1).getDeviceID()).add(s1);
					states.get(resources.get(s1).getDeviceID()).add(s2);
				} else {
					Set<String> state = new HashSet<String>();
					state.add(s1);
					state.add(s2);
					states.put(resources.get(s1).getDeviceID(), state);
				}
			}
		} */

		return states;
	}

}
