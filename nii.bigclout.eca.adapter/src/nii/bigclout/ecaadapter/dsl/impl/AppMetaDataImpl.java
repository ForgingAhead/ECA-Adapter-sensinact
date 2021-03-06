/**
 * generated by Xtext 2.13.0.RC1
 */
package nii.bigclout.ecaadapter.dsl.impl;

import nii.bigclout.ecaadapter.dsl.AppMetaData;
import nii.bigclout.ecaadapter.dsl.DslPackage;
import nii.bigclout.ecaadapter.dsl.Specification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.impl.AppMetaDataImpl#getAppID <em>App ID</em>}</li>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.impl.AppMetaDataImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppMetaDataImpl extends MinimalEObjectImpl.Container implements AppMetaData
{
  /**
	 * The default value of the '{@link #getAppID() <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAppID()
	 * @generated
	 * @ordered
	 */
  protected static final String APP_ID_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getAppID() <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAppID()
	 * @generated
	 * @ordered
	 */
  protected String appID = APP_ID_EDEFAULT;

  /**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
  protected Specification specification;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AppMetaDataImpl()
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
		return DslPackage.Literals.APP_META_DATA;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getAppID()
  {
		return appID;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAppID(String newAppID)
  {
		String oldAppID = appID;
		appID = newAppID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.APP_META_DATA__APP_ID, oldAppID, appID));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Specification getSpecification()
  {
		return specification;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSpecification(Specification newSpecification, NotificationChain msgs)
  {
		Specification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.APP_META_DATA__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSpecification(Specification newSpecification)
  {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.APP_META_DATA__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.APP_META_DATA__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.APP_META_DATA__SPECIFICATION, newSpecification, newSpecification));
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
			case DslPackage.APP_META_DATA__SPECIFICATION:
				return basicSetSpecification(null, msgs);
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
			case DslPackage.APP_META_DATA__APP_ID:
				return getAppID();
			case DslPackage.APP_META_DATA__SPECIFICATION:
				return getSpecification();
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
			case DslPackage.APP_META_DATA__APP_ID:
				setAppID((String)newValue);
				return;
			case DslPackage.APP_META_DATA__SPECIFICATION:
				setSpecification((Specification)newValue);
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
			case DslPackage.APP_META_DATA__APP_ID:
				setAppID(APP_ID_EDEFAULT);
				return;
			case DslPackage.APP_META_DATA__SPECIFICATION:
				setSpecification((Specification)null);
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
			case DslPackage.APP_META_DATA__APP_ID:
				return APP_ID_EDEFAULT == null ? appID != null : !APP_ID_EDEFAULT.equals(appID);
			case DslPackage.APP_META_DATA__SPECIFICATION:
				return specification != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (appID: ");
		result.append(appID);
		result.append(')');
		return result.toString();
	}

} //AppMetaDataImpl
