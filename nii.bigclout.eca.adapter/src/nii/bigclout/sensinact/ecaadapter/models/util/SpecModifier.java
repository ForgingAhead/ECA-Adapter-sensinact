package nii.bigclout.sensinact.ecaadapter.models.util;

import nii.bigclout.ecaadapter.dsl.Element;
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
import nii.bigclout.ecaadapter.dsl.State;
import nii.bigclout.ecaadapter.dsl.State_Object;
import nii.bigclout.sensinact.ecaadapter.controller.ModelAdaptationHandler;
import nii.bigclout.sensinact.ecaadapter.translator.Translator;
import nii.bigclout.sensinact.ecaadapter.translator.util.ECAConstants;

import java.math.BigDecimal;
import java.util.ArrayList;

import nii.bigclout.ecaadapter.dsl.AndElement;
import nii.bigclout.ecaadapter.dsl.Boolean_Object;
import nii.bigclout.ecaadapter.dsl.DiffElement;
import nii.bigclout.ecaadapter.dsl.DivisionElement;
import nii.bigclout.ecaadapter.dsl.DslFactory;

public class SpecModifier {
	
	/**
	 * Construct a new condition by combining the two specified elements with the specified operator
	 * @param original
	 * @param operator
	 * @param toMerge
	 * @return
	 */
	public static Element mergeCondition(Element original, String operator, Element toMerge) {

		if(original != null && toMerge != null) {
			if(operator.equals(ECAConstants.OR)) {
				OrElement or = DslFactory.eINSTANCE.createOrElement();
				or.setLeft(original);
				or.setRight(toMerge);
				return or;
			} else if (operator.equals(ECAConstants.AND)) {
				AndElement and = DslFactory.eINSTANCE.createAndElement();
				and.setLeft(original);
				and.setRight(toMerge);
				return and;
			} else if (operator.equals(ECAConstants.DIFF_EQUAL)) {
				DiffElement ele = DslFactory.eINSTANCE.createDiffElement();
				ele.setLeft(original);
				ele.setRight(toMerge);
				return ele;
			} else if(operator.equals(ECAConstants.EQUAL)) {
				EqualElement ele = DslFactory.eINSTANCE.createEqualElement();
				ele.setLeft(original);
				ele.setRight(toMerge);
				return ele;
			} else if(operator.equals(ECAConstants.LARGER)) {
				LargerElement ele = DslFactory.eINSTANCE.createLargerElement();
				ele.setLeft(original);
				ele.setRight(toMerge);
			} else if(operator.equals(ECAConstants.LARGER_EQUAL)) {
				LargerEqualElement ele = DslFactory.eINSTANCE.createLargerEqualElement();
				ele.setLeft(original);
				ele.setRight(toMerge);
				return ele;
			} else if (operator.equals(ECAConstants.SMALLER)) {
				SmallerElement ele = DslFactory.eINSTANCE.createSmallerElement();
				ele.setLeft(original);
				ele.setRight(toMerge);
				return ele;
			} else if(operator.equals(ECAConstants.SMALLER_EQUAL)) {
				SmallerEqualElement ele = DslFactory.eINSTANCE.createSmallerEqualElement();
				ele.setLeft(original);
				ele.setRight(toMerge);
				return ele;
			} else if(operator.equals(ECAConstants.PLUS)) {
				PlusElement ele = DslFactory.eINSTANCE.createPlusElement();
				ele.setLeft(original);
				ele.setRight(toMerge);
				return ele;
			} else if(operator.equals(ECAConstants.MINUS)) {
				MinusElement ele = DslFactory.eINSTANCE.createMinusElement();
				ele.setLeft(original);
				ele.setRight(toMerge);
				return ele;
			} else if(operator.equals(ECAConstants.MULTIPLICATION)) {
				MultiplicationElement ele = DslFactory.eINSTANCE.createMultiplicationElement();
				ele.setLeft(original);
				ele.setRight(toMerge);
				return ele;
			} else if(operator.equals(ECAConstants.DIVISION)) {
				DivisionElement ele = DslFactory.eINSTANCE.createDivisionElement();
				ele.setLeft(original);
				ele.setRight(toMerge);
				return ele;
			} else if(operator.equals(ECAConstants.MODULO)) {
				ModuloElement ele = DslFactory.eINSTANCE.createModuloElement();
				ele.setLeft(original);
				ele.setRight(toMerge);
				return ele;
			} else if(operator.equals(ECAConstants.NEGATE)) {
				System.out.println("Shouldn't be here! the operator should not be NOT...");
			}
		}
		
		System.out.println("Something is wrong with the element - NULL pointer");
		
		return null;
	}

	public static void setCondition(String highPriApp, String lowPriApp, RunTimeModel model, Element newCond, Element addedCond) {
		
		//System.out.println("model to be modified: " +lowPriApp+" :\n" + SpecModelSerialization.toString(model));///////////test
		
		ArrayList<Resource> resources = SpecModifier.getResources(addedCond);
		model.getEnvData().get(0).getResources().addAll(resources);
		
		for(Resource res : resources) {
			Translator.addResource(highPriApp, lowPriApp, res);
		}
		
		model.getAppData().get(0).getSpecification().getIfdo().setCondition(newCond);
		
		ModelAdaptationHandler.addConflictedApp(highPriApp, lowPriApp);
		
		SpecModelSerialization.model2filePath(model, lowPriApp);/////////////////////testing the output
		
		Translator.specModel2snaFilePath(lowPriApp, model);
	}
	
	
	public static Element buildNegateObject(Element original) {
		NegateElement result = DslFactory.eINSTANCE.createNegateElement();
		if(result == null) {
			System.out.println("NULL NegateElement created from DslFactory!!!");
		} 
		result.setExp(original);
		return result;
	}
	
	
	public static Number_Object buildNumberObject(BigDecimal num) {
		Number_Object result = DslFactory.eINSTANCE.createNumber_Object();
		result.setValue(num);
		return result;
	}
	
	public static Resource_Object buildResourceObject(Resource res) {
		Resource_Object result = DslFactory.eINSTANCE.createResource_Object();
		result.setValue(res);
		return result;
	}
	
	public static Boolean_Object buildBooleanObject(boolean value) {
		Boolean_Object result = DslFactory.eINSTANCE.createBoolean_Object();
		result.setValue(value);
		return result;
	}
	
	public static State_Object buildStringObject(State value) {
		State_Object result = DslFactory.eINSTANCE.createState_Object();
		result.setValue(value);
		return result;
	}
	
	public static State buildState(String value) {
		State result = DslFactory.eINSTANCE.createState();
		result.setName(value);
		return result;
	}
	
	/**
	 * 
	 * @param element
	 * @return
	 */
	public static ArrayList<Resource> getResources(Element element) {
		ArrayList<Resource> results = new ArrayList<Resource>();
		
		if(element != null) {
			if(element instanceof Resource_Object) {
				results.add( ((Resource_Object)element ).getValue() );
				return results;
				
			}  else if (element instanceof Number_Object) {
				return results;

			} else if (element instanceof State_Object) {
				return results;

			} else if (element instanceof Boolean_Object) {
				return results;
				
			} else if( element instanceof OrElement) {
				OrElement tmp = (OrElement) element;
				Element left = tmp.getLeft();
				Element right = tmp.getRight();
				results.addAll(getResources(left));
				results.addAll(getResources(right));
			} 
			
			else if (element instanceof AndElement) {
				AndElement tmp = (AndElement) element;
				results.addAll(getResources( tmp.getLeft() ));
				results.addAll(getResources( tmp.getRight() ));
			}
			
			else if (element instanceof DiffElement) {
				DiffElement diff = (DiffElement) element;
				Element left = diff.getLeft();
				Element right = diff.getRight();
				
				System.out.println("Element_Diff ");////////////////////////test
				results.addAll(getResources(left));
				results.addAll(getResources(right));

			} else if (element instanceof EqualElement) {
				EqualElement equal = (EqualElement) element;
				Element left = equal.getLeft();
				Element right = equal.getRight();
				
				System.out.println("Element_Equal ");////////////////////////test
				
				results.addAll(getResources(left));
				results.addAll(getResources(right));

			}

			// Comparisons: left associative, priority 4
			else if (element instanceof LargerElement) {
				LargerElement largerThan = (LargerElement) element;
				Element left = largerThan.getLeft();
				Element right = largerThan.getRight();

				results.addAll(getResources(left));
				results.addAll(getResources(right));

			} else if (element instanceof LargerEqualElement) {
				LargerEqualElement largerEqual = (LargerEqualElement) element;
				Element left = largerEqual.getLeft();
				Element right = largerEqual.getRight();

				results.addAll(getResources(left));
				results.addAll(getResources(right));

			} else if (element instanceof SmallerElement) {
				SmallerElement smallerThan = (SmallerElement) element;
				Element left = smallerThan.getLeft();
				Element right = smallerThan.getRight();

				results.addAll(getResources(left));
				results.addAll(getResources(right));

			} else if (element instanceof SmallerEqualElement) {
				SmallerEqualElement smallerEqual = (SmallerEqualElement) element;
				Element left = smallerEqual.getLeft();
				Element right = smallerEqual.getRight();

				results.addAll(getResources(left));
				results.addAll(getResources(right));
			}

			// addition/subtraction: left associative, priority 5
			else if (element instanceof PlusElement) {
				PlusElement plus = (PlusElement) element;
				Element left = plus.getLeft();
				Element right = plus.getRight();

				results.addAll(getResources(left));
				results.addAll(getResources(right));

			} else if (element instanceof MinusElement) {
				MinusElement minus = (MinusElement) element;
				Element left = minus.getLeft();
				Element right = minus.getRight();

				results.addAll(getResources(left));
				results.addAll(getResources(right));
			}

			// multiplication/division/modulo, left associative, priority 6
			else if (element instanceof MultiplicationElement) {
				MultiplicationElement multiply = (MultiplicationElement) element;
				Element left = multiply.getLeft();
				Element right = multiply.getRight();

				results.addAll(getResources(left));
				results.addAll(getResources(right));

			} else if (element instanceof DivisionElement) {
				DivisionElement divide = (DivisionElement) element;
				Element left = divide.getLeft();
				Element right = divide.getRight();

				results.addAll(getResources(left));
				results.addAll(getResources(right));

			} else if (element instanceof ModuloElement) {
				ModuloElement modulo = (ModuloElement) element;
				Element left = modulo.getLeft();
				Element right = modulo.getRight();
				
				results.addAll(getResources(left));
				results.addAll(getResources(right));
			}

			// Unary operators: right associative, priority 7
			else if (element instanceof NegateElement) {
				NegateElement negate = (NegateElement) element;
				Element ele = negate.getExp();

				results.addAll(getResources(ele));
			}

		}
		
		return results;
	}
	

}
