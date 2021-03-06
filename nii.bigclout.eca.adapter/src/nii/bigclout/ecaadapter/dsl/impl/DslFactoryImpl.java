/**
 * generated by Xtext 2.13.0.RC1
 */
package nii.bigclout.ecaadapter.dsl.impl;

import nii.bigclout.ecaadapter.dsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslFactoryImpl extends EFactoryImpl implements DslFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static DslFactory init()
  {
		try {
			DslFactory theDslFactory = (DslFactory)EPackage.Registry.INSTANCE.getEFactory(DslPackage.eNS_URI);
			if (theDslFactory != null) {
				return theDslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DslFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DslFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case DslPackage.RUN_TIME_MODEL: return createRunTimeModel();
			case DslPackage.STATE: return createState();
			case DslPackage.RESOURCE: return createResource();
			case DslPackage.APP_META_DATA: return createAppMetaData();
			case DslPackage.SPECIFICATION: return createSpecification();
			case DslPackage.TRIGGER: return createTrigger();
			case DslPackage.IF_DO_SPEC: return createIfDoSpec();
			case DslPackage.ELSE_IF_DO_SPEC: return createElseIfDoSpec();
			case DslPackage.ELSE_DO_SPEC: return createElseDoSpec();
			case DslPackage.ENVIRONMENT_META_DATA: return createEnvironmentMetaData();
			case DslPackage.ACTION: return createAction();
			case DslPackage.ELEMENT: return createElement();
			case DslPackage.OR_ELEMENT: return createOrElement();
			case DslPackage.AND_ELEMENT: return createAndElement();
			case DslPackage.DIFF_ELEMENT: return createDiffElement();
			case DslPackage.EQUAL_ELEMENT: return createEqualElement();
			case DslPackage.LARGER_ELEMENT: return createLargerElement();
			case DslPackage.LARGER_EQUAL_ELEMENT: return createLargerEqualElement();
			case DslPackage.SMALLER_ELEMENT: return createSmallerElement();
			case DslPackage.SMALLER_EQUAL_ELEMENT: return createSmallerEqualElement();
			case DslPackage.PLUS_ELEMENT: return createPlusElement();
			case DslPackage.MINUS_ELEMENT: return createMinusElement();
			case DslPackage.MULTIPLICATION_ELEMENT: return createMultiplicationElement();
			case DslPackage.DIVISION_ELEMENT: return createDivisionElement();
			case DslPackage.MODULO_ELEMENT: return createModuloElement();
			case DslPackage.NUMBER_OBJECT: return createNumber_Object();
			case DslPackage.BOOLEAN_OBJECT: return createBoolean_Object();
			case DslPackage.RESOURCE_OBJECT: return createResource_Object();
			case DslPackage.STATE_OBJECT: return createState_Object();
			case DslPackage.NEGATE_ELEMENT: return createNegateElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RunTimeModel createRunTimeModel()
  {
		RunTimeModelImpl runTimeModel = new RunTimeModelImpl();
		return runTimeModel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public State createState()
  {
		StateImpl state = new StateImpl();
		return state;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Resource createResource()
  {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AppMetaData createAppMetaData()
  {
		AppMetaDataImpl appMetaData = new AppMetaDataImpl();
		return appMetaData;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Specification createSpecification()
  {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Trigger createTrigger()
  {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IfDoSpec createIfDoSpec()
  {
		IfDoSpecImpl ifDoSpec = new IfDoSpecImpl();
		return ifDoSpec;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ElseIfDoSpec createElseIfDoSpec()
  {
		ElseIfDoSpecImpl elseIfDoSpec = new ElseIfDoSpecImpl();
		return elseIfDoSpec;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ElseDoSpec createElseDoSpec()
  {
		ElseDoSpecImpl elseDoSpec = new ElseDoSpecImpl();
		return elseDoSpec;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EnvironmentMetaData createEnvironmentMetaData()
  {
		EnvironmentMetaDataImpl environmentMetaData = new EnvironmentMetaDataImpl();
		return environmentMetaData;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Action createAction()
  {
		ActionImpl action = new ActionImpl();
		return action;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Element createElement()
  {
		ElementImpl element = new ElementImpl();
		return element;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OrElement createOrElement()
  {
		OrElementImpl orElement = new OrElementImpl();
		return orElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AndElement createAndElement()
  {
		AndElementImpl andElement = new AndElementImpl();
		return andElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DiffElement createDiffElement()
  {
		DiffElementImpl diffElement = new DiffElementImpl();
		return diffElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EqualElement createEqualElement()
  {
		EqualElementImpl equalElement = new EqualElementImpl();
		return equalElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LargerElement createLargerElement()
  {
		LargerElementImpl largerElement = new LargerElementImpl();
		return largerElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LargerEqualElement createLargerEqualElement()
  {
		LargerEqualElementImpl largerEqualElement = new LargerEqualElementImpl();
		return largerEqualElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SmallerElement createSmallerElement()
  {
		SmallerElementImpl smallerElement = new SmallerElementImpl();
		return smallerElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SmallerEqualElement createSmallerEqualElement()
  {
		SmallerEqualElementImpl smallerEqualElement = new SmallerEqualElementImpl();
		return smallerEqualElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PlusElement createPlusElement()
  {
		PlusElementImpl plusElement = new PlusElementImpl();
		return plusElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MinusElement createMinusElement()
  {
		MinusElementImpl minusElement = new MinusElementImpl();
		return minusElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MultiplicationElement createMultiplicationElement()
  {
		MultiplicationElementImpl multiplicationElement = new MultiplicationElementImpl();
		return multiplicationElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DivisionElement createDivisionElement()
  {
		DivisionElementImpl divisionElement = new DivisionElementImpl();
		return divisionElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ModuloElement createModuloElement()
  {
		ModuloElementImpl moduloElement = new ModuloElementImpl();
		return moduloElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Number_Object createNumber_Object()
  {
		Number_ObjectImpl number_Object = new Number_ObjectImpl();
		return number_Object;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Boolean_Object createBoolean_Object()
  {
		Boolean_ObjectImpl boolean_Object = new Boolean_ObjectImpl();
		return boolean_Object;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Resource_Object createResource_Object()
  {
		Resource_ObjectImpl resource_Object = new Resource_ObjectImpl();
		return resource_Object;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public State_Object createState_Object()
  {
		State_ObjectImpl state_Object = new State_ObjectImpl();
		return state_Object;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NegateElement createNegateElement()
  {
		NegateElementImpl negateElement = new NegateElementImpl();
		return negateElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DslPackage getDslPackage()
  {
		return (DslPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static DslPackage getPackage()
  {
		return DslPackage.eINSTANCE;
	}

} //DslFactoryImpl
