/**
 * generated by Xtext 2.13.0.RC1
 */
package nii.bigclout.ecaadapter.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.Specification#getSpecID <em>Spec ID</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.Specification#getPriority <em>Priority</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.Specification#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.Specification#getIfdo <em>Ifdo</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.Specification#getElseIfDo <em>Else If Do</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.Specification#getElseDo <em>Else Do</em>}</li>
 * </ul>
 *
 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject
{
  /**
	 * Returns the value of the '<em><b>Spec ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spec ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec ID</em>' attribute.
	 * @see #setSpecID(String)
	 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getSpecification_SpecID()
	 * @model
	 * @generated
	 */
  String getSpecID();

  /**
	 * Sets the value of the '{@link nii.bigclout.ecaadapter.dsl.Specification#getSpecID <em>Spec ID</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec ID</em>' attribute.
	 * @see #getSpecID()
	 * @generated
	 */
  void setSpecID(String value);

  /**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getSpecification_Priority()
	 * @model
	 * @generated
	 */
  int getPriority();

  /**
	 * Sets the value of the '{@link nii.bigclout.ecaadapter.dsl.Specification#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
  void setPriority(int value);

  /**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link nii.bigclout.ecaadapter.dsl.Trigger}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getSpecification_Trigger()
	 * @model containment="true"
	 * @generated
	 */
  EList<Trigger> getTrigger();

  /**
	 * Returns the value of the '<em><b>Ifdo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifdo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifdo</em>' containment reference.
	 * @see #setIfdo(IfDoSpec)
	 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getSpecification_Ifdo()
	 * @model containment="true"
	 * @generated
	 */
  IfDoSpec getIfdo();

  /**
	 * Sets the value of the '{@link nii.bigclout.ecaadapter.dsl.Specification#getIfdo <em>Ifdo</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifdo</em>' containment reference.
	 * @see #getIfdo()
	 * @generated
	 */
  void setIfdo(IfDoSpec value);

  /**
	 * Returns the value of the '<em><b>Else If Do</b></em>' containment reference list.
	 * The list contents are of type {@link nii.bigclout.ecaadapter.dsl.ElseIfDoSpec}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else If Do</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Else If Do</em>' containment reference list.
	 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getSpecification_ElseIfDo()
	 * @model containment="true"
	 * @generated
	 */
  EList<ElseIfDoSpec> getElseIfDo();

  /**
	 * Returns the value of the '<em><b>Else Do</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Do</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Do</em>' containment reference.
	 * @see #setElseDo(ElseDoSpec)
	 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getSpecification_ElseDo()
	 * @model containment="true"
	 * @generated
	 */
  ElseDoSpec getElseDo();

  /**
	 * Sets the value of the '{@link nii.bigclout.ecaadapter.dsl.Specification#getElseDo <em>Else Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Do</em>' containment reference.
	 * @see #getElseDo()
	 * @generated
	 */
  void setElseDo(ElseDoSpec value);

} // Specification