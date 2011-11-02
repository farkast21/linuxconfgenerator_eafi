/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import linuxnetconf.Interface;
import linuxnetconf.LinuxnetconfPackage;
import linuxnetconf.SubInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link linuxnetconf.impl.SubInterfaceImpl#getMainInterface <em>Main Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubInterfaceImpl extends NetconfElementImpl implements SubInterface {
	/**
	 * The cached value of the '{@link #getMainInterface() <em>Main Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface mainInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxnetconfPackage.Literals.SUB_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getMainInterface() {
		if (mainInterface != null && mainInterface.eIsProxy()) {
			InternalEObject oldMainInterface = (InternalEObject)mainInterface;
			mainInterface = (Interface)eResolveProxy(oldMainInterface);
			if (mainInterface != oldMainInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinuxnetconfPackage.SUB_INTERFACE__MAIN_INTERFACE, oldMainInterface, mainInterface));
			}
		}
		return mainInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetMainInterface() {
		return mainInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainInterface(Interface newMainInterface, NotificationChain msgs) {
		Interface oldMainInterface = mainInterface;
		mainInterface = newMainInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.SUB_INTERFACE__MAIN_INTERFACE, oldMainInterface, newMainInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainInterface(Interface newMainInterface) {
		if (newMainInterface != mainInterface) {
			NotificationChain msgs = null;
			if (mainInterface != null)
				msgs = ((InternalEObject)mainInterface).eInverseRemove(this, LinuxnetconfPackage.INTERFACE__SUBINTERFACES, Interface.class, msgs);
			if (newMainInterface != null)
				msgs = ((InternalEObject)newMainInterface).eInverseAdd(this, LinuxnetconfPackage.INTERFACE__SUBINTERFACES, Interface.class, msgs);
			msgs = basicSetMainInterface(newMainInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.SUB_INTERFACE__MAIN_INTERFACE, newMainInterface, newMainInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinuxnetconfPackage.SUB_INTERFACE__MAIN_INTERFACE:
				if (mainInterface != null)
					msgs = ((InternalEObject)mainInterface).eInverseRemove(this, LinuxnetconfPackage.INTERFACE__SUBINTERFACES, Interface.class, msgs);
				return basicSetMainInterface((Interface)otherEnd, msgs);
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
			case LinuxnetconfPackage.SUB_INTERFACE__MAIN_INTERFACE:
				return basicSetMainInterface(null, msgs);
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
			case LinuxnetconfPackage.SUB_INTERFACE__MAIN_INTERFACE:
				if (resolve) return getMainInterface();
				return basicGetMainInterface();
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
			case LinuxnetconfPackage.SUB_INTERFACE__MAIN_INTERFACE:
				setMainInterface((Interface)newValue);
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
			case LinuxnetconfPackage.SUB_INTERFACE__MAIN_INTERFACE:
				setMainInterface((Interface)null);
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
			case LinuxnetconfPackage.SUB_INTERFACE__MAIN_INTERFACE:
				return mainInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //SubInterfaceImpl
