package nii.bigclout.sensinact.ecaadapter.translator.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import nii.bigclout.ecaadapter.dsl.Action;
import nii.bigclout.ecaadapter.dsl.AndElement;
import nii.bigclout.ecaadapter.dsl.Boolean_Object;
import nii.bigclout.ecaadapter.dsl.DiffElement;
import nii.bigclout.ecaadapter.dsl.DivisionElement;
import nii.bigclout.ecaadapter.dsl.Element;
import nii.bigclout.ecaadapter.dsl.ElseIfDoSpec;
import nii.bigclout.ecaadapter.dsl.EqualElement;
import nii.bigclout.ecaadapter.dsl.LargerElement;
import nii.bigclout.ecaadapter.dsl.LargerEqualElement;
import nii.bigclout.ecaadapter.dsl.MinusElement;
import nii.bigclout.ecaadapter.dsl.ModuloElement;
import nii.bigclout.ecaadapter.dsl.MultiplicationElement;
import nii.bigclout.ecaadapter.dsl.NegateElement;
import nii.bigclout.ecaadapter.dsl.Number_Object;
import nii.bigclout.ecaadapter.dsl.OrElement;
import nii.bigclout.ecaadapter.dsl.PlusElement;
import nii.bigclout.ecaadapter.dsl.Resource;
import nii.bigclout.ecaadapter.dsl.Resource_Object;
import nii.bigclout.ecaadapter.dsl.RunTimeModel;
import nii.bigclout.ecaadapter.dsl.SmallerElement;
import nii.bigclout.ecaadapter.dsl.SmallerEqualElement;
import nii.bigclout.ecaadapter.dsl.State_Object;
/**
 * Parsing .spec file/model, so as to enable the translation into the original .sna file/model
 * @author Feng
 *
 */
public class SpecParser {
	
	/**
	 * Parse the condition of ECA rules. 
	 * @param element the condition
	 * @param writer the destination to write the parsing result.
	 * @throws IOException
	 */
	public static void parseElement (Element element, BufferedWriter writer) throws IOException {
		//OR: Left associative, priority 1
		if (element instanceof OrElement) {
			OrElement or = (OrElement) element;
			Element left = or.getLeft();
			Element right = or.getRight();
			
			System.out.println("OrElement ");////////////////////////test
			parseElementInternal(writer, " or ", left, right);

		}

		// And: left associative, priority 2
		else if (element instanceof AndElement) {
			AndElement and = (AndElement) element;
			Element left = and.getLeft();
			Element right = and.getRight();

			System.out.println("Element_And ");////////////////////////test
			parseElementInternal(writer, " and ", left, right);
		}

		// different/equal: left associative, priority 3
		else if (element instanceof DiffElement) {
			DiffElement diff = (DiffElement) element;
			Element left = diff.getLeft();
			Element right = diff.getRight();
			
			System.out.println("Element_Diff ");////////////////////////test
			parseElementInternal(writer, " != ", left, right);

		} else if (element instanceof EqualElement) {
			EqualElement equal = (EqualElement) element;
			Element left = equal.getLeft();
			Element right = equal.getRight();
			
			System.out.println("Element_Equal ");////////////////////////test
			
			parseElementInternal(writer, " == ", left, right);

		}

		// Comparisons: left associative, priority 4
		else if (element instanceof LargerElement) {
			LargerElement largerThan = (LargerElement) element;
			Element left = largerThan.getLeft();
			Element right = largerThan.getRight();

			parseElementInternal(writer, " > ", left, right);

		} else if (element instanceof LargerEqualElement) {
			LargerEqualElement largerEqual = (LargerEqualElement) element;
			Element left = largerEqual.getLeft();
			Element right = largerEqual.getRight();

			parseElementInternal(writer, " >= ", left, right);

		} else if (element instanceof SmallerElement) {
			SmallerElement smallerThan = (SmallerElement) element;
			Element left = smallerThan.getLeft();
			Element right = smallerThan.getRight();

			parseElementInternal(writer, " < ", left, right);

		} else if (element instanceof SmallerEqualElement) {
			SmallerEqualElement smallerEqual = (SmallerEqualElement) element;
			Element left = smallerEqual.getLeft();
			Element right = smallerEqual.getRight();

			parseElementInternal(writer, " <= ", left, right);
		}

		// addition/subtraction: left associative, priority 5
		else if (element instanceof PlusElement) {
			PlusElement plus = (PlusElement) element;
			Element left = plus.getLeft();
			Element right = plus.getRight();

			parseElementInternal(writer, " + ", left, right);

		} else if (element instanceof MinusElement) {
			MinusElement minus = (MinusElement) element;
			Element left = minus.getLeft();
			Element right = minus.getRight();

			parseElementInternal(writer, " - ", left, right);
		}

		// multiplication/division/modulo, left associative, priority 6
		else if (element instanceof MultiplicationElement) {
			MultiplicationElement multiply = (MultiplicationElement) element;
			Element left = multiply.getLeft();
			Element right = multiply.getRight();

			parseElementInternal(writer, " * ", left, right);

		} else if (element instanceof DivisionElement) {
			DivisionElement divide = (DivisionElement) element;
			Element left = divide.getLeft();
			Element right = divide.getRight();

			parseElementInternal(writer, " / ", left, right);

		} else if (element instanceof ModuloElement) {
			ModuloElement modulo = (ModuloElement) element;
			Element left = modulo.getLeft();
			Element right = modulo.getRight();
			parseElementInternal(writer, " % ", left, right);
		}

		// Unary operators: right associative, priority 7
		else if (element instanceof NegateElement) {
			NegateElement negate = (NegateElement) element;
			Element exp = negate.getExp();
			parseElementInternal(writer, " not ", exp);
		}

		else 
			throw new RuntimeException("Should never happend");
		
	}
	
	/**
	 * Parse the specified list of elements linked by the specified function.
	 * for instance, it could be an OrElement and thus the function is "or" which connects two conditions
	 * @param writer destination to which the specified elements will be written
	 * @param function denotes the connection algebra for the specified elements, e.g., "or", "and"
	 * @param params the specified element, could be one or two
	 * @throws IOException
	 */
	private static void parseElementInternal(BufferedWriter writer, String function, Element... params) throws IOException {
		if(params.length > 1) {
			parseParameter(params[0], writer);
			writer.write(" " + function + " ");
			parseParameter(params[1], writer);
		} else {
			writer.write(" " + function + " ");
			parseParameter(params[0], writer);
		}
	}
	
	/**
	 * Get the Triggers (of resource type) from the specified element
	 * @param element
	 * @return a list of Resource which serve as triggers in the specified element
	 */
	public static List<Resource> getResourceTrigger(Element element) {
		List<Resource> triggers = new ArrayList<Resource>();
		if(element instanceof Resource_Object) {
			Resource_Object res = (Resource_Object)element;
			triggers.add(res.getValue());
		} else if(element instanceof State_Object) {
			
		}
		return null;//TODO function not used actually
	}

	/**
	 * Parsing the Condition's (or Action's) parameters.
	 * @param element
	 * @param writer
	 * @throws IOException
	 */
	private static void parseParameter(Element element, BufferedWriter writer) throws IOException{

		if (element instanceof Number_Object) {
			Number_Object number = (Number_Object) element;

			try {
				long value = number.getValue().longValueExact();
				writer.write(String.valueOf(value));
			} catch (ArithmeticException e) {
				double value = number.getValue().doubleValue();
				writer.write(String.valueOf(value));
			}

		} else if (element instanceof State_Object) {
			//TODO still need to check here whether it's right.
			State_Object str = (State_Object) element;
			writer.write(str.getValue().getName());

		} else if (element instanceof Boolean_Object) {
			Boolean_Object bool = (Boolean_Object) element;
			//cb.parameter(bool.isValue());
			writer.write(String.valueOf(bool.isValue()));
			
		} else if (element instanceof Resource_Object) {
			Resource_Object objRef = (Resource_Object) element;
			Resource ref = objRef.getValue();
			writer.write(ref.getName()+".get()"); //////////////test. should think more on this...
			
			//if (triggers != null && refInList(ref, triggers)) 

		} else {
			parseElement(element, writer);
		}
	}
	
	/**
	 * Parsing the action of the ECA rule
	 * @param actions
	 * @param writer
	 * @param resMap
	 * @throws IOException
	 */
	public static void parseActions(EList<Action> actions, BufferedWriter writer, ResourceMapping resMap) throws IOException {
		int count = actions.size();
		for(Action action : actions) {
			String concept = action.getState().getName();
			//TODO now it's simplified without dealing with parameters... and set..
			writer.write(resMap.getDSL_Resource(concept).getName() + ".act() ");
			if(--count > 0) {
				writer.write(" , ");
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
	public static void parseConditionalActions (boolean triggerTrueFalse, EList<Action> actions, BufferedWriter writer) throws IOException {
		for(Action action : actions) {
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
	public static void parseConditionalAction(boolean triggerTrueFalse, Action action, BufferedWriter writer) throws IOException {

		/**
		String identifier = action.getVariable();
		boolean register = identifier != null;

		// First parameter is the resource name on which the act is applied 
		//cb.parameter(action.getRef());
		if (action.getListParam() != null && action.getListParam().getParam() != null)
		{
			for (Element param : action.ge) {
				parseParameter(param, writer);
			}
		}
		//components.put(cb.build());
		 * **
		 */
	}
	
	//TODO how to generate
	//public static void parseCEPStatement (DSL_CEP_STATEMENT statement) 
	
	/**
	 * Calculate the actuators within the specified .spec model
	 * @param model
	 * @return a list of actuator names
	 */
	public static List<String> getActuators(RunTimeModel model){
		List<String> actuators = new ArrayList<>();
		//to name an activator: original name... it's ok...
		actuators.addAll(getActuators(model.getAppData().get(0).
				getSpecification().getIfdo().getAction()));///if do
		
		if(model.getAppData().get(0).getSpecification().getElseIfDo() != null) {
			for(ElseIfDoSpec elseif : model.getAppData().get(0).getSpecification().getElseIfDo()) {
				actuators.addAll(getActuators(elseif.getAction()));////else if do
			}
		}
		
		actuators.addAll(getActuators(model.getAppData().get(0).
				getSpecification().getElseDo().getAction()));///else do...
		
		return actuators;
	}
	
	/**
	 * Calculate the list of actuators in the specified actions.
	 * Each action is a change of actuator's state.
	 * @param actions 
	 * @return a list of actuator names involved in the specified actions
	 */
	public static List<String> getActuators(List<Action> actions){
		List<String> actuators = new ArrayList<>();
		if(actions==null || actions.size()==0) return actuators;
		for(Action act : actions)
			actuators.add(act.getResource().getName());
		return actuators;
	}

}
