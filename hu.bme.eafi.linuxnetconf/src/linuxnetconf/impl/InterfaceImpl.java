/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import java.util.Collection;

import linuxnetconf.Interface;
import linuxnetconf.LinuxnetconfPackage;
import linuxnetconf.SubInterface;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link linuxnetconf.impl.InterfaceImpl#getSubinterfaces <em>Subinterfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InterfaceImpl extends NetconfElementImpl implements Interface {
	/**
	 * The cached value of the '{@link #getSubinterfaces() <em>Subinterfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubinterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<SubInterface> subinterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxnetconfPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubInterface> getSubinterfaces() {
		if (subinterfaces == null) {
			subinterfaces = new EObjectWithInverseResolvingEList<SubInterface>(SubInterface.class, this, LinuxnetconfPackage.INTERFACE__SUBINTERFACES, LinuxnetconfPackage.SUB_INTERFACE__MAIN_INTERFACE);
		}
		return subinterfaces;
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
			case LinuxnetconfPackage.INTERFACE__SUBINTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubinterfaces()).basicAdd(otherEnd, msgs);
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
			case LinuxnetconfPackage.INTERFACE__SUBINTERFACES:
				return ((InternalEList<?>)getSubinterfaces()).basicRemove(otherEnd, msgs);
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
			case LinuxnetconfPackage.INTERFACE__SUBINTERFACES:
				return getSubinterfaces();
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
			case LinuxnetconfPackage.INTERFACE__SUBINTERFACES:
				getSubinterfaces().clear();
				getSubinterfaces().addAll((Collection<? extends SubInterface>)newValue);
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
			case LinuxnetconfPackage.INTERFACE__SUBINTERFACES:
				getSubinterfaces().clear();
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
			case LinuxnetconfPackage.INTERFACE__SUBINTERFACES:
				return subinterfaces != null && !subinterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
