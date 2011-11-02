/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.util;

import linuxnetconf.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see linuxnetconf.LinuxnetconfPackage
 * @generated
 */
public class LinuxnetconfSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LinuxnetconfPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinuxnetconfSwitch() {
		if (modelPackage == null) {
			modelPackage = LinuxnetconfPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LinuxnetconfPackage.CMDB: {
				CMDB cmdb = (CMDB)theEObject;
				T result = caseCMDB(cmdb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinuxnetconfPackage.SERVER_GROUP: {
				ServerGroup serverGroup = (ServerGroup)theEObject;
				T result = caseServerGroup(serverGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinuxnetconfPackage.SERVER_COMPUTER: {
				ServerComputer serverComputer = (ServerComputer)theEObject;
				T result = caseServerComputer(serverComputer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinuxnetconfPackage.STATIC_IP_CONFIG: {
				StaticIPConfig staticIPConfig = (StaticIPConfig)theEObject;
				T result = caseStaticIPConfig(staticIPConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinuxnetconfPackage.NETCONF_ELEMENT: {
				NetconfElement netconfElement = (NetconfElement)theEObject;
				T result = caseNetconfElement(netconfElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinuxnetconfPackage.ETHERNET_INTERFACE: {
				EthernetInterface ethernetInterface = (EthernetInterface)theEObject;
				T result = caseEthernetInterface(ethernetInterface);
				if (result == null) result = caseVlanOwner(ethernetInterface);
				if (result == null) result = caseInterface(ethernetInterface);
				if (result == null) result = caseNetconfElement(ethernetInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinuxnetconfPackage.BONDING_INTERFACE: {
				BondingInterface bondingInterface = (BondingInterface)theEObject;
				T result = caseBondingInterface(bondingInterface);
				if (result == null) result = caseVlanOwner(bondingInterface);
				if (result == null) result = caseInterface(bondingInterface);
				if (result == null) result = caseNetconfElement(bondingInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinuxnetconfPackage.VLAN_INTERFACE: {
				VlanInterface vlanInterface = (VlanInterface)theEObject;
				T result = caseVlanInterface(vlanInterface);
				if (result == null) result = caseInterface(vlanInterface);
				if (result == null) result = caseNetconfElement(vlanInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinuxnetconfPackage.BRIDGE: {
				Bridge bridge = (Bridge)theEObject;
				T result = caseBridge(bridge);
				if (result == null) result = caseNetconfElement(bridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinuxnetconfPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseNetconfElement(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinuxnetconfPackage.SUB_INTERFACE: {
				SubInterface subInterface = (SubInterface)theEObject;
				T result = caseSubInterface(subInterface);
				if (result == null) result = caseNetconfElement(subInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LinuxnetconfPackage.VLAN_OWNER: {
				VlanOwner vlanOwner = (VlanOwner)theEObject;
				T result = caseVlanOwner(vlanOwner);
				if (result == null) result = caseInterface(vlanOwner);
				if (result == null) result = caseNetconfElement(vlanOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CMDB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CMDB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCMDB(CMDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerGroup(ServerGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Computer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Computer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerComputer(ServerComputer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static IP Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static IP Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticIPConfig(StaticIPConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Netconf Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Netconf Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetconfElement(NetconfElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ethernet Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ethernet Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEthernetInterface(EthernetInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bonding Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bonding Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBondingInterface(BondingInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vlan Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vlan Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVlanInterface(VlanInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridge(Bridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubInterface(SubInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vlan Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vlan Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVlanOwner(VlanOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LinuxnetconfSwitch
