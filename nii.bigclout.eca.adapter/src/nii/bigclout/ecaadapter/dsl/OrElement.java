/**
 * generated by Xtext 2.13.0.RC1
 */
package nii.bigclout.ecaadapter.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.OrElement#getLeft <em>Left</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.OrElement#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getOrElement()
 * @model
 * @generated
 */
public interface OrElement extends Element
{
  /**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Element)
	 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getOrElement_Left()
	 * @model containment="true"
	 * @generated
	 */
  Element getLeft();

  /**
	 * Sets the value of the '{@link nii.bigclout.ecaadapter.dsl.OrElement#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
  void setLeft(Element value);

  /**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Element)
	 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getOrElement_Right()
	 * @model containment="true"
	 * @generated
	 */
  Element getRight();

  /**
	 * Sets the value of the '{@link nii.bigclout.ecaadapter.dsl.OrElement#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
  void setRight(Element value);

} // OrElement
