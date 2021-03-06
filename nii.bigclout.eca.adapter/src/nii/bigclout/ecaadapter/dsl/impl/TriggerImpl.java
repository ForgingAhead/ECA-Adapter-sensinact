/**
 * generated by Xtext 2.13.0.RC1
 */
package nii.bigclout.ecaadapter.dsl.impl;

import nii.bigclout.ecaadapter.dsl.DslPackage;
import nii.bigclout.ecaadapter.dsl.Resource;
import nii.bigclout.ecaadapter.dsl.State;
import nii.bigclout.ecaadapter.dsl.Trigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.impl.TriggerImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.impl.TriggerImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger
{
  /**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
  protected Resource resource;

  /**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
  protected State state;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TriggerImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return DslPackage.Literals.TRIGGER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Resource getResource()
  {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.TRIGGER__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Resource basicGetResource()
  {
		return resource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setResource(Resource newResource)
  {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TRIGGER__RESOURCE, oldResource, resource));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public State getState()
  {
		return state;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetState(State newState, NotificationChain msgs)
  {
		State oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.TRIGGER__STATE, oldState, newState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setState(State newState)
  {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.TRIGGER__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.TRIGGER__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TRIGGER__STATE, newState, newState));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case DslPackage.TRIGGER__STATE:
				return basicSetState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case DslPackage.TRIGGER__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case DslPackage.TRIGGER__STATE:
				return getState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case DslPackage.TRIGGER__RESOURCE:
				setResource((Resource)newValue);
				return;
			case DslPackage.TRIGGER__STATE:
				setState((State)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case DslPackage.TRIGGER__RESOURCE:
				setResource((Resource)null);
				return;
			case DslPackage.TRIGGER__STATE:
				setState((State)null);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case DslPackage.TRIGGER__RESOURCE:
				return resource != null;
			case DslPackage.TRIGGER__STATE:
				return state != null;
		}
		return super.eIsSet(featureID);
	}

} //TriggerImpl
