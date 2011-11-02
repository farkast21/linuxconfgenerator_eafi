/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import java.util.Collection;

import linuxnetconf.CMDB;
import linuxnetconf.LinuxnetconfPackage;
import linuxnetconf.ServerComputer;
import linuxnetconf.ServerGroup;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMDB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link linuxnetconf.impl.CMDBImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link linuxnetconf.impl.CMDBImpl#getComputers <em>Computers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMDBImpl extends EObjectImpl implements CMDB {
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerGroup> groups;

	/**
	 * The cached value of the '{@link #getComputers() <em>Computers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputers()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerComputer> computers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxnetconfPackage.Literals.CMDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<ServerGroup>(ServerGroup.class, this, LinuxnetconfPackage.CMDB__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerComputer> getComputers() {
		if (computers == null) {
			computers = new EObjectContainmentEList<ServerComputer>(ServerComputer.class, this, LinuxnetconfPackage.CMDB__COMPUTERS);
		}
		return computers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinuxnetconfPackage.CMDB__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case LinuxnetconfPackage.CMDB__COMPUTERS:
				return ((InternalEList<?>)getComputers()).basicRemove(otherEnd, msgs);
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
			case LinuxnetconfPackage.CMDB__GROUPS:
				return getGroups();
			case LinuxnetconfPackage.CMDB__COMPUTERS:
				return getComputers();
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
			case LinuxnetconfPackage.CMDB__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends ServerGroup>)newValue);
				return;
			case LinuxnetconfPackage.CMDB__COMPUTERS:
				getComputers().clear();
				getComputers().addAll((Collection<? extends ServerComputer>)newValue);
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
			case LinuxnetconfPackage.CMDB__GROUPS:
				getGroups().clear();
				return;
			case LinuxnetconfPackage.CMDB__COMPUTERS:
				getComputers().clear();
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
			case LinuxnetconfPackage.CMDB__GROUPS:
				return groups != null && !groups.isEmpty();
			case LinuxnetconfPackage.CMDB__COMPUTERS:
				return computers != null && !computers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CMDBImpl
