/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import linuxnetconf.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinuxnetconfFactoryImpl extends EFactoryImpl implements LinuxnetconfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LinuxnetconfFactory init() {
		try {
			LinuxnetconfFactory theLinuxnetconfFactory = (LinuxnetconfFactory)EPackage.Registry.INSTANCE.getEFactory("http://linuxnetconf/1.0"); 
			if (theLinuxnetconfFactory != null) {
				return theLinuxnetconfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LinuxnetconfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinuxnetconfFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LinuxnetconfPackage.CMDB: return createCMDB();
			case LinuxnetconfPackage.SERVER_GROUP: return createServerGroup();
			case LinuxnetconfPackage.SERVER_COMPUTER: return createServerComputer();
			case LinuxnetconfPackage.STATIC_IP_CONFIG: return createStaticIPConfig();
			case LinuxnetconfPackage.ETHERNET_INTERFACE: return createEthernetInterface();
			case LinuxnetconfPackage.BONDING_INTERFACE: return createBondingInterface();
			case LinuxnetconfPackage.VLAN_INTERFACE: return createVlanInterface();
			case LinuxnetconfPackage.BRIDGE: return createBridge();
			case LinuxnetconfPackage.SUB_INTERFACE: return createSubInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LinuxnetconfPackage.IF_CONFIG_TYPE:
				return createIFConfigTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LinuxnetconfPackage.IF_CONFIG_TYPE:
				return convertIFConfigTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMDB createCMDB() {
		CMDBImpl cmdb = new CMDBImpl();
		return cmdb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerGroup createServerGroup() {
		ServerGroupImpl serverGroup = new ServerGroupImpl();
		return serverGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerComputer createServerComputer() {
		ServerComputerImpl serverComputer = new ServerComputerImpl();
		return serverComputer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticIPConfig createStaticIPConfig() {
		StaticIPConfigImpl staticIPConfig = new StaticIPConfigImpl();
		return staticIPConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetInterface createEthernetInterface() {
		EthernetInterfaceImpl ethernetInterface = new EthernetInterfaceImpl();
		return ethernetInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BondingInterface createBondingInterface() {
		BondingInterfaceImpl bondingInterface = new BondingInterfaceImpl();
		return bondingInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VlanInterface createVlanInterface() {
		VlanInterfaceImpl vlanInterface = new VlanInterfaceImpl();
		return vlanInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bridge createBridge() {
		BridgeImpl bridge = new BridgeImpl();
		return bridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubInterface createSubInterface() {
		SubInterfaceImpl subInterface = new SubInterfaceImpl();
		return subInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFConfigType createIFConfigTypeFromString(EDataType eDataType, String initialValue) {
		IFConfigType result = IFConfigType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIFConfigTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinuxnetconfPackage getLinuxnetconfPackage() {
		return (LinuxnetconfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LinuxnetconfPackage getPackage() {
		return LinuxnetconfPackage.eINSTANCE;
	}

} //LinuxnetconfFactoryImpl
