/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import linuxnetconf.BondingInterface;
import linuxnetconf.Bridge;
import linuxnetconf.EthernetInterface;
import linuxnetconf.IFConfigType;
import linuxnetconf.Interface;
import linuxnetconf.LinuxnetconfFactory;
import linuxnetconf.LinuxnetconfPackage;
import linuxnetconf.NetconfElement;
import linuxnetconf.ServerComputer;
import linuxnetconf.ServerGroup;
import linuxnetconf.StaticIPConfig;
import linuxnetconf.SubInterface;
import linuxnetconf.VlanInterface;
import linuxnetconf.VlanOwner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinuxnetconfPackageImpl extends EPackageImpl implements LinuxnetconfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmdbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverComputerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticIPConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netconfElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ethernetInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bondingInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vlanInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vlanOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ifConfigTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see linuxnetconf.LinuxnetconfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LinuxnetconfPackageImpl() {
		super(eNS_URI, LinuxnetconfFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LinuxnetconfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LinuxnetconfPackage init() {
		if (isInited) return (LinuxnetconfPackage)EPackage.Registry.INSTANCE.getEPackage(LinuxnetconfPackage.eNS_URI);

		// Obtain or create and register package
		LinuxnetconfPackageImpl theLinuxnetconfPackage = (LinuxnetconfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LinuxnetconfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LinuxnetconfPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLinuxnetconfPackage.createPackageContents();

		// Initialize created meta-data
		theLinuxnetconfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLinuxnetconfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LinuxnetconfPackage.eNS_URI, theLinuxnetconfPackage);
		return theLinuxnetconfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMDB() {
		return cmdbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMDB_Groups() {
		return (EReference)cmdbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMDB_Computers() {
		return (EReference)cmdbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerGroup() {
		return serverGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerGroup_Servers() {
		return (EReference)serverGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerComputer() {
		return serverComputerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerComputer_Group() {
		return (EReference)serverComputerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerComputer_Confitems() {
		return (EReference)serverComputerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticIPConfig() {
		return staticIPConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticIPConfig_IpAddress() {
		return (EAttribute)staticIPConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticIPConfig_Netmask() {
		return (EAttribute)staticIPConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticIPConfig_NetworkAddress() {
		return (EAttribute)staticIPConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticIPConfig_Gateway() {
		return (EAttribute)staticIPConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticIPConfig_Broadcast() {
		return (EAttribute)staticIPConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetconfElement() {
		return netconfElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetconfElement_Ipconfig() {
		return (EReference)netconfElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetconfElement_ConfigType() {
		return (EAttribute)netconfElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEthernetInterface() {
		return ethernetInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEthernetInterface_BondMaster() {
		return (EReference)ethernetInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBondingInterface() {
		return bondingInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBondingInterface_Slaves() {
		return (EReference)bondingInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVlanInterface() {
		return vlanInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVlanInterface_RawInterface() {
		return (EReference)vlanInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBridge() {
		return bridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBridge_BridgePorts() {
		return (EReference)bridgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Subinterfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubInterface() {
		return subInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubInterface_MainInterface() {
		return (EReference)subInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVlanOwner() {
		return vlanOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVlanOwner_Vlans() {
		return (EReference)vlanOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIFConfigType() {
		return ifConfigTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinuxnetconfFactory getLinuxnetconfFactory() {
		return (LinuxnetconfFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cmdbEClass = createEClass(CMDB);
		createEReference(cmdbEClass, CMDB__GROUPS);
		createEReference(cmdbEClass, CMDB__COMPUTERS);

		serverGroupEClass = createEClass(SERVER_GROUP);
		createEReference(serverGroupEClass, SERVER_GROUP__SERVERS);

		serverComputerEClass = createEClass(SERVER_COMPUTER);
		createEReference(serverComputerEClass, SERVER_COMPUTER__GROUP);
		createEReference(serverComputerEClass, SERVER_COMPUTER__CONFITEMS);

		staticIPConfigEClass = createEClass(STATIC_IP_CONFIG);
		createEAttribute(staticIPConfigEClass, STATIC_IP_CONFIG__IP_ADDRESS);
		createEAttribute(staticIPConfigEClass, STATIC_IP_CONFIG__NETMASK);
		createEAttribute(staticIPConfigEClass, STATIC_IP_CONFIG__NETWORK_ADDRESS);
		createEAttribute(staticIPConfigEClass, STATIC_IP_CONFIG__GATEWAY);
		createEAttribute(staticIPConfigEClass, STATIC_IP_CONFIG__BROADCAST);

		netconfElementEClass = createEClass(NETCONF_ELEMENT);
		createEReference(netconfElementEClass, NETCONF_ELEMENT__IPCONFIG);
		createEAttribute(netconfElementEClass, NETCONF_ELEMENT__CONFIG_TYPE);

		ethernetInterfaceEClass = createEClass(ETHERNET_INTERFACE);
		createEReference(ethernetInterfaceEClass, ETHERNET_INTERFACE__BOND_MASTER);

		bondingInterfaceEClass = createEClass(BONDING_INTERFACE);
		createEReference(bondingInterfaceEClass, BONDING_INTERFACE__SLAVES);

		vlanInterfaceEClass = createEClass(VLAN_INTERFACE);
		createEReference(vlanInterfaceEClass, VLAN_INTERFACE__RAW_INTERFACE);

		bridgeEClass = createEClass(BRIDGE);
		createEReference(bridgeEClass, BRIDGE__BRIDGE_PORTS);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__SUBINTERFACES);

		subInterfaceEClass = createEClass(SUB_INTERFACE);
		createEReference(subInterfaceEClass, SUB_INTERFACE__MAIN_INTERFACE);

		vlanOwnerEClass = createEClass(VLAN_OWNER);
		createEReference(vlanOwnerEClass, VLAN_OWNER__VLANS);

		// Create enums
		ifConfigTypeEEnum = createEEnum(IF_CONFIG_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ethernetInterfaceEClass.getESuperTypes().add(this.getVlanOwner());
		bondingInterfaceEClass.getESuperTypes().add(this.getVlanOwner());
		vlanInterfaceEClass.getESuperTypes().add(this.getInterface());
		bridgeEClass.getESuperTypes().add(this.getNetconfElement());
		interfaceEClass.getESuperTypes().add(this.getNetconfElement());
		subInterfaceEClass.getESuperTypes().add(this.getNetconfElement());
		vlanOwnerEClass.getESuperTypes().add(this.getInterface());

		// Initialize classes and features; add operations and parameters
		initEClass(cmdbEClass, linuxnetconf.CMDB.class, "CMDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMDB_Groups(), this.getServerGroup(), null, "groups", null, 1, -1, linuxnetconf.CMDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMDB_Computers(), this.getServerComputer(), null, "computers", null, 0, -1, linuxnetconf.CMDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverGroupEClass, ServerGroup.class, "ServerGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerGroup_Servers(), this.getServerComputer(), this.getServerComputer_Group(), "servers", null, 0, -1, ServerGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverComputerEClass, ServerComputer.class, "ServerComputer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerComputer_Group(), this.getServerGroup(), this.getServerGroup_Servers(), "group", null, 0, 1, ServerComputer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerComputer_Confitems(), this.getNetconfElement(), null, "confitems", null, 0, -1, ServerComputer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticIPConfigEClass, StaticIPConfig.class, "StaticIPConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticIPConfig_IpAddress(), ecorePackage.getEString(), "ipAddress", null, 0, 1, StaticIPConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticIPConfig_Netmask(), ecorePackage.getEString(), "netmask", null, 0, 1, StaticIPConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticIPConfig_NetworkAddress(), ecorePackage.getEString(), "networkAddress", null, 0, 1, StaticIPConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticIPConfig_Gateway(), ecorePackage.getEString(), "gateway", null, 0, 1, StaticIPConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticIPConfig_Broadcast(), ecorePackage.getEString(), "broadcast", null, 0, 1, StaticIPConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(netconfElementEClass, NetconfElement.class, "NetconfElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetconfElement_Ipconfig(), this.getStaticIPConfig(), null, "ipconfig", null, 0, 1, NetconfElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetconfElement_ConfigType(), this.getIFConfigType(), "configType", null, 0, 1, NetconfElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ethernetInterfaceEClass, EthernetInterface.class, "EthernetInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEthernetInterface_BondMaster(), this.getBondingInterface(), this.getBondingInterface_Slaves(), "bondMaster", null, 0, 1, EthernetInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bondingInterfaceEClass, BondingInterface.class, "BondingInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBondingInterface_Slaves(), this.getEthernetInterface(), this.getEthernetInterface_BondMaster(), "slaves", null, 1, -1, BondingInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vlanInterfaceEClass, VlanInterface.class, "VlanInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVlanInterface_RawInterface(), this.getVlanOwner(), this.getVlanOwner_Vlans(), "rawInterface", null, 1, 1, VlanInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bridgeEClass, Bridge.class, "Bridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBridge_BridgePorts(), this.getInterface(), null, "bridgePorts", null, 1, -1, Bridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Subinterfaces(), this.getSubInterface(), this.getSubInterface_MainInterface(), "subinterfaces", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subInterfaceEClass, SubInterface.class, "SubInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubInterface_MainInterface(), this.getInterface(), this.getInterface_Subinterfaces(), "mainInterface", null, 1, 1, SubInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vlanOwnerEClass, VlanOwner.class, "VlanOwner", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVlanOwner_Vlans(), this.getVlanInterface(), this.getVlanInterface_RawInterface(), "vlans", null, 0, -1, VlanOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ifConfigTypeEEnum, IFConfigType.class, "IFConfigType");
		addEEnumLiteral(ifConfigTypeEEnum, IFConfigType.STATIC);
		addEEnumLiteral(ifConfigTypeEEnum, IFConfigType.DYNAMIC);
		addEEnumLiteral(ifConfigTypeEEnum, IFConfigType.MANUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //LinuxnetconfPackageImpl
