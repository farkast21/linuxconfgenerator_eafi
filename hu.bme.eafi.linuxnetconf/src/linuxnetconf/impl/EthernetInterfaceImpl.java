/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import linuxnetconf.BondingInterface;
import linuxnetconf.EthernetInterface;
import linuxnetconf.LinuxnetconfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ethernet Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link linuxnetconf.impl.EthernetInterfaceImpl#getBondMaster <em>Bond Master</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EthernetInterfaceImpl extends VlanOwnerImpl implements EthernetInterface {
	/**
	 * The cached value of the '{@link #getBondMaster() <em>Bond Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBondMaster()
	 * @generated
	 * @ordered
	 */
	protected BondingInterface bondMaster;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EthernetInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxnetconfPackage.Literals.ETHERNET_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BondingInterface getBondMaster() {
		if (bondMaster != null && bondMaster.eIsProxy()) {
			InternalEObject oldBondMaster = (InternalEObject)bondMaster;
			bondMaster = (BondingInterface)eResolveProxy(oldBondMaster);
			if (bondMaster != oldBondMaster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinuxnetconfPackage.ETHERNET_INTERFACE__BOND_MASTER, oldBondMaster, bondMaster));
			}
		}
		return bondMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BondingInterface basicGetBondMaster() {
		return bondMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBondMaster(BondingInterface newBondMaster, NotificationChain msgs) {
		BondingInterface oldBondMaster = bondMaster;
		bondMaster = newBondMaster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.ETHERNET_INTERFACE__BOND_MASTER, oldBondMaster, newBondMaster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBondMaster(BondingInterface newBondMaster) {
		if (newBondMaster != bondMaster) {
			NotificationChain msgs = null;
			if (bondMaster != null)
				msgs = ((InternalEObject)bondMaster).eInverseRemove(this, LinuxnetconfPackage.BONDING_INTERFACE__SLAVES, BondingInterface.class, msgs);
			if (newBondMaster != null)
				msgs = ((InternalEObject)newBondMaster).eInverseAdd(this, LinuxnetconfPackage.BONDING_INTERFACE__SLAVES, BondingInterface.class, msgs);
			msgs = basicSetBondMaster(newBondMaster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.ETHERNET_INTERFACE__BOND_MASTER, newBondMaster, newBondMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinuxnetconfPackage.ETHERNET_INTERFACE__BOND_MASTER:
				if (bondMaster != null)
					msgs = ((InternalEObject)bondMaster).eInverseRemove(this, LinuxnetconfPackage.BONDING_INTERFACE__SLAVES, BondingInterface.class, msgs);
				return basicSetBondMaster((BondingInterface)otherEnd, msgs);
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
			case LinuxnetconfPackage.ETHERNET_INTERFACE__BOND_MASTER:
				return basicSetBondMaster(null, msgs);
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
			case LinuxnetconfPackage.ETHERNET_INTERFACE__BOND_MASTER:
				if (resolve) return getBondMaster();
				return basicGetBondMaster();
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
			case LinuxnetconfPackage.ETHERNET_INTERFACE__BOND_MASTER:
				setBondMaster((BondingInterface)newValue);
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
			case LinuxnetconfPackage.ETHERNET_INTERFACE__BOND_MASTER:
				setBondMaster((BondingInterface)null);
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
			case LinuxnetconfPackage.ETHERNET_INTERFACE__BOND_MASTER:
				return bondMaster != null;
		}
		return super.eIsSet(featureID);
	}

} //EthernetInterfaceImpl
