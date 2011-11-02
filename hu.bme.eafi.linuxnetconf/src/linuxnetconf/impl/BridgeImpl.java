/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import java.util.Collection;

import linuxnetconf.Bridge;
import linuxnetconf.Interface;
import linuxnetconf.LinuxnetconfPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link linuxnetconf.impl.BridgeImpl#getBridgePorts <em>Bridge Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BridgeImpl extends NetconfElementImpl implements Bridge {
	/**
	 * The cached value of the '{@link #getBridgePorts() <em>Bridge Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> bridgePorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BridgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxnetconfPackage.Literals.BRIDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getBridgePorts() {
		if (bridgePorts == null) {
			bridgePorts = new EObjectResolvingEList<Interface>(Interface.class, this, LinuxnetconfPackage.BRIDGE__BRIDGE_PORTS);
		}
		return bridgePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinuxnetconfPackage.BRIDGE__BRIDGE_PORTS:
				return getBridgePorts();
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
			case LinuxnetconfPackage.BRIDGE__BRIDGE_PORTS:
				getBridgePorts().clear();
				getBridgePorts().addAll((Collection<? extends Interface>)newValue);
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
			case LinuxnetconfPackage.BRIDGE__BRIDGE_PORTS:
				getBridgePorts().clear();
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
			case LinuxnetconfPackage.BRIDGE__BRIDGE_PORTS:
				return bridgePorts != null && !bridgePorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BridgeImpl
