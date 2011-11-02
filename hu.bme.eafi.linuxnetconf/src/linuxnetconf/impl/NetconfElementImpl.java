/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import linuxnetconf.IFConfigType;
import linuxnetconf.LinuxnetconfPackage;
import linuxnetconf.NetconfElement;
import linuxnetconf.StaticIPConfig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Netconf Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link linuxnetconf.impl.NetconfElementImpl#getIpconfig <em>Ipconfig</em>}</li>
 *   <li>{@link linuxnetconf.impl.NetconfElementImpl#getConfigType <em>Config Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NetconfElementImpl extends EObjectImpl implements NetconfElement {
	/**
	 * The cached value of the '{@link #getIpconfig() <em>Ipconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpconfig()
	 * @generated
	 * @ordered
	 */
	protected StaticIPConfig ipconfig;

	/**
	 * The default value of the '{@link #getConfigType() <em>Config Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigType()
	 * @generated
	 * @ordered
	 */
	protected static final IFConfigType CONFIG_TYPE_EDEFAULT = IFConfigType.STATIC;

	/**
	 * The cached value of the '{@link #getConfigType() <em>Config Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigType()
	 * @generated
	 * @ordered
	 */
	protected IFConfigType configType = CONFIG_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetconfElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxnetconfPackage.Literals.NETCONF_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticIPConfig getIpconfig() {
		return ipconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIpconfig(StaticIPConfig newIpconfig, NotificationChain msgs) {
		StaticIPConfig oldIpconfig = ipconfig;
		ipconfig = newIpconfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.NETCONF_ELEMENT__IPCONFIG, oldIpconfig, newIpconfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpconfig(StaticIPConfig newIpconfig) {
		if (newIpconfig != ipconfig) {
			NotificationChain msgs = null;
			if (ipconfig != null)
				msgs = ((InternalEObject)ipconfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LinuxnetconfPackage.NETCONF_ELEMENT__IPCONFIG, null, msgs);
			if (newIpconfig != null)
				msgs = ((InternalEObject)newIpconfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LinuxnetconfPackage.NETCONF_ELEMENT__IPCONFIG, null, msgs);
			msgs = basicSetIpconfig(newIpconfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.NETCONF_ELEMENT__IPCONFIG, newIpconfig, newIpconfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFConfigType getConfigType() {
		return configType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigType(IFConfigType newConfigType) {
		IFConfigType oldConfigType = configType;
		configType = newConfigType == null ? CONFIG_TYPE_EDEFAULT : newConfigType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.NETCONF_ELEMENT__CONFIG_TYPE, oldConfigType, configType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinuxnetconfPackage.NETCONF_ELEMENT__IPCONFIG:
				return basicSetIpconfig(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinuxnetconfPackage.NETCONF_ELEMENT__IPCONFIG:
				return getIpconfig();
			case LinuxnetconfPackage.NETCONF_ELEMENT__CONFIG_TYPE:
				return getConfigType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LinuxnetconfPackage.NETCONF_ELEMENT__IPCONFIG:
				setIpconfig((StaticIPConfig)newValue);
				return;
			case LinuxnetconfPackage.NETCONF_ELEMENT__CONFIG_TYPE:
				setConfigType((IFConfigType)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LinuxnetconfPackage.NETCONF_ELEMENT__IPCONFIG:
				setIpconfig((StaticIPConfig)null);
				return;
			case LinuxnetconfPackage.NETCONF_ELEMENT__CONFIG_TYPE:
				setConfigType(CONFIG_TYPE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LinuxnetconfPackage.NETCONF_ELEMENT__IPCONFIG:
				return ipconfig != null;
			case LinuxnetconfPackage.NETCONF_ELEMENT__CONFIG_TYPE:
				return configType != CONFIG_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (configType: ");
		result.append(configType);
		result.append(')');
		return result.toString();
	}

} //NetconfElementImpl
