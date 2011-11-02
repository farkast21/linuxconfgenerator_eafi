/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import linuxnetconf.LinuxnetconfPackage;
import linuxnetconf.VlanInterface;
import linuxnetconf.VlanOwner;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vlan Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link linuxnetconf.impl.VlanInterfaceImpl#getRawInterface <em>Raw Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VlanInterfaceImpl extends InterfaceImpl implements VlanInterface {
	/**
	 * The cached value of the '{@link #getRawInterface() <em>Raw Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawInterface()
	 * @generated
	 * @ordered
	 */
	protected VlanOwner rawInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VlanInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxnetconfPackage.Literals.VLAN_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VlanOwner getRawInterface() {
		if (rawInterface != null && rawInterface.eIsProxy()) {
			InternalEObject oldRawInterface = (InternalEObject)rawInterface;
			rawInterface = (VlanOwner)eResolveProxy(oldRawInterface);
			if (rawInterface != oldRawInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinuxnetconfPackage.VLAN_INTERFACE__RAW_INTERFACE, oldRawInterface, rawInterface));
			}
		}
		return rawInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VlanOwner basicGetRawInterface() {
		return rawInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRawInterface(VlanOwner newRawInterface, NotificationChain msgs) {
		VlanOwner oldRawInterface = rawInterface;
		rawInterface = newRawInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.VLAN_INTERFACE__RAW_INTERFACE, oldRawInterface, newRawInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawInterface(VlanOwner newRawInterface) {
		if (newRawInterface != rawInterface) {
			NotificationChain msgs = null;
			if (rawInterface != null)
				msgs = ((InternalEObject)rawInterface).eInverseRemove(this, LinuxnetconfPackage.VLAN_OWNER__VLANS, VlanOwner.class, msgs);
			if (newRawInterface != null)
				msgs = ((InternalEObject)newRawInterface).eInverseAdd(this, LinuxnetconfPackage.VLAN_OWNER__VLANS, VlanOwner.class, msgs);
			msgs = basicSetRawInterface(newRawInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.VLAN_INTERFACE__RAW_INTERFACE, newRawInterface, newRawInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinuxnetconfPackage.VLAN_INTERFACE__RAW_INTERFACE:
				if (rawInterface != null)
					msgs = ((InternalEObject)rawInterface).eInverseRemove(this, LinuxnetconfPackage.VLAN_OWNER__VLANS, VlanOwner.class, msgs);
				return basicSetRawInterface((VlanOwner)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinuxnetconfPackage.VLAN_INTERFACE__RAW_INTERFACE:
				return basicSetRawInterface(null, msgs);
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
			case LinuxnetconfPackage.VLAN_INTERFACE__RAW_INTERFACE:
				if (resolve) return getRawInterface();
				return basicGetRawInterface();
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
			case LinuxnetconfPackage.VLAN_INTERFACE__RAW_INTERFACE:
				setRawInterface((VlanOwner)newValue);
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
			case LinuxnetconfPackage.VLAN_INTERFACE__RAW_INTERFACE:
				setRawInterface((VlanOwner)null);
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
			case LinuxnetconfPackage.VLAN_INTERFACE__RAW_INTERFACE:
				return rawInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //VlanInterfaceImpl
