/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import java.util.Collection;

import linuxnetconf.BondingInterface;
import linuxnetconf.EthernetInterface;
import linuxnetconf.LinuxnetconfPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bonding Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link linuxnetconf.impl.BondingInterfaceImpl#getSlaves <em>Slaves</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BondingInterfaceImpl extends VlanOwnerImpl implements BondingInterface {
	/**
	 * The cached value of the '{@link #getSlaves() <em>Slaves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaves()
	 * @generated
	 * @ordered
	 */
	protected EList<EthernetInterface> slaves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BondingInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxnetconfPackage.Literals.BONDING_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EthernetInterface> getSlaves() {
		if (slaves == null) {
			slaves = new EObjectWithInverseResolvingEList<EthernetInterface>(EthernetInterface.class, this, LinuxnetconfPackage.BONDING_INTERFACE__SLAVES, LinuxnetconfPackage.ETHERNET_INTERFACE__BOND_MASTER);
		}
		return slaves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinuxnetconfPackage.BONDING_INTERFACE__SLAVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSlaves()).basicAdd(otherEnd, msgs);
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
			case LinuxnetconfPackage.BONDING_INTERFACE__SLAVES:
				return ((InternalEList<?>)getSlaves()).basicRemove(otherEnd, msgs);
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
			case LinuxnetconfPackage.BONDING_INTERFACE__SLAVES:
				return getSlaves();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LinuxnetconfPackage.BONDING_INTERFACE__SLAVES:
				getSlaves().clear();
				getSlaves().addAll((Collection<? extends EthernetInterface>)newValue);
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
			case LinuxnetconfPackage.BONDING_INTERFACE__SLAVES:
				getSlaves().clear();
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
			case LinuxnetconfPackage.BONDING_INTERFACE__SLAVES:
				return slaves != null && !slaves.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BondingInterfaceImpl
