/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see linuxnetconf.LinuxnetconfFactory
 * @model kind="package"
 * @generated
 */
public interface LinuxnetconfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "linuxnetconf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://linuxnetconf/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "linuxnetconf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinuxnetconfPackage eINSTANCE = linuxnetconf.impl.LinuxnetconfPackageImpl.init();

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.CMDBImpl <em>CMDB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.CMDBImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getCMDB()
	 * @generated
	 */
	int CMDB = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMDB__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Computers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMDB__COMPUTERS = 1;

	/**
	 * The number of structural features of the '<em>CMDB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMDB_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.ServerGroupImpl <em>Server Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.ServerGroupImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getServerGroup()
	 * @generated
	 */
	int SERVER_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_GROUP__SERVERS = 0;

	/**
	 * The number of structural features of the '<em>Server Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.ServerComputerImpl <em>Server Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.ServerComputerImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getServerComputer()
	 * @generated
	 */
	int SERVER_COMPUTER = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMPUTER__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Confitems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMPUTER__CONFITEMS = 1;

	/**
	 * The number of structural features of the '<em>Server Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COMPUTER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.StaticIPConfigImpl <em>Static IP Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.StaticIPConfigImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getStaticIPConfig()
	 * @generated
	 */
	int STATIC_IP_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_IP_CONFIG__IP_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Netmask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_IP_CONFIG__NETMASK = 1;

	/**
	 * The feature id for the '<em><b>Network Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_IP_CONFIG__NETWORK_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_IP_CONFIG__GATEWAY = 3;

	/**
	 * The feature id for the '<em><b>Broadcast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_IP_CONFIG__BROADCAST = 4;

	/**
	 * The number of structural features of the '<em>Static IP Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_IP_CONFIG_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.NetconfElementImpl <em>Netconf Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.NetconfElementImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getNetconfElement()
	 * @generated
	 */
	int NETCONF_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Ipconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETCONF_ELEMENT__IPCONFIG = 0;

	/**
	 * The feature id for the '<em><b>Config Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETCONF_ELEMENT__CONFIG_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Netconf Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETCONF_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.InterfaceImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Ipconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IPCONFIG = NETCONF_ELEMENT__IPCONFIG;

	/**
	 * The feature id for the '<em><b>Config Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONFIG_TYPE = NETCONF_ELEMENT__CONFIG_TYPE;

	/**
	 * The feature id for the '<em><b>Subinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SUBINTERFACES = NETCONF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = NETCONF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.VlanOwnerImpl <em>Vlan Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.VlanOwnerImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getVlanOwner()
	 * @generated
	 */
	int VLAN_OWNER = 11;

	/**
	 * The feature id for the '<em><b>Ipconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_OWNER__IPCONFIG = INTERFACE__IPCONFIG;

	/**
	 * The feature id for the '<em><b>Config Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_OWNER__CONFIG_TYPE = INTERFACE__CONFIG_TYPE;

	/**
	 * The feature id for the '<em><b>Subinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_OWNER__SUBINTERFACES = INTERFACE__SUBINTERFACES;

	/**
	 * The feature id for the '<em><b>Vlans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_OWNER__VLANS = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vlan Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_OWNER_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.EthernetInterfaceImpl <em>Ethernet Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.EthernetInterfaceImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getEthernetInterface()
	 * @generated
	 */
	int ETHERNET_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Ipconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_INTERFACE__IPCONFIG = VLAN_OWNER__IPCONFIG;

	/**
	 * The feature id for the '<em><b>Config Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_INTERFACE__CONFIG_TYPE = VLAN_OWNER__CONFIG_TYPE;

	/**
	 * The feature id for the '<em><b>Subinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_INTERFACE__SUBINTERFACES = VLAN_OWNER__SUBINTERFACES;

	/**
	 * The feature id for the '<em><b>Vlans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_INTERFACE__VLANS = VLAN_OWNER__VLANS;

	/**
	 * The feature id for the '<em><b>Bond Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_INTERFACE__BOND_MASTER = VLAN_OWNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ethernet Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_INTERFACE_FEATURE_COUNT = VLAN_OWNER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.BondingInterfaceImpl <em>Bonding Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.BondingInterfaceImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getBondingInterface()
	 * @generated
	 */
	int BONDING_INTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Ipconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BONDING_INTERFACE__IPCONFIG = VLAN_OWNER__IPCONFIG;

	/**
	 * The feature id for the '<em><b>Config Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BONDING_INTERFACE__CONFIG_TYPE = VLAN_OWNER__CONFIG_TYPE;

	/**
	 * The feature id for the '<em><b>Subinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BONDING_INTERFACE__SUBINTERFACES = VLAN_OWNER__SUBINTERFACES;

	/**
	 * The feature id for the '<em><b>Vlans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BONDING_INTERFACE__VLANS = VLAN_OWNER__VLANS;

	/**
	 * The feature id for the '<em><b>Slaves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BONDING_INTERFACE__SLAVES = VLAN_OWNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bonding Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BONDING_INTERFACE_FEATURE_COUNT = VLAN_OWNER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.VlanInterfaceImpl <em>Vlan Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.VlanInterfaceImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getVlanInterface()
	 * @generated
	 */
	int VLAN_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Ipconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_INTERFACE__IPCONFIG = INTERFACE__IPCONFIG;

	/**
	 * The feature id for the '<em><b>Config Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_INTERFACE__CONFIG_TYPE = INTERFACE__CONFIG_TYPE;

	/**
	 * The feature id for the '<em><b>Subinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_INTERFACE__SUBINTERFACES = INTERFACE__SUBINTERFACES;

	/**
	 * The feature id for the '<em><b>Raw Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_INTERFACE__RAW_INTERFACE = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vlan Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.BridgeImpl <em>Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.BridgeImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getBridge()
	 * @generated
	 */
	int BRIDGE = 8;

	/**
	 * The feature id for the '<em><b>Ipconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__IPCONFIG = NETCONF_ELEMENT__IPCONFIG;

	/**
	 * The feature id for the '<em><b>Config Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__CONFIG_TYPE = NETCONF_ELEMENT__CONFIG_TYPE;

	/**
	 * The feature id for the '<em><b>Bridge Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__BRIDGE_PORTS = NETCONF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_FEATURE_COUNT = NETCONF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link linuxnetconf.impl.SubInterfaceImpl <em>Sub Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.impl.SubInterfaceImpl
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getSubInterface()
	 * @generated
	 */
	int SUB_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Ipconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_INTERFACE__IPCONFIG = NETCONF_ELEMENT__IPCONFIG;

	/**
	 * The feature id for the '<em><b>Config Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_INTERFACE__CONFIG_TYPE = NETCONF_ELEMENT__CONFIG_TYPE;

	/**
	 * The feature id for the '<em><b>Main Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_INTERFACE__MAIN_INTERFACE = NETCONF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_INTERFACE_FEATURE_COUNT = NETCONF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link linuxnetconf.IFConfigType <em>IF Config Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linuxnetconf.IFConfigType
	 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getIFConfigType()
	 * @generated
	 */
	int IF_CONFIG_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link linuxnetconf.CMDB <em>CMDB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMDB</em>'.
	 * @see linuxnetconf.CMDB
	 * @generated
	 */
	EClass getCMDB();

	/**
	 * Returns the meta object for the containment reference list '{@link linuxnetconf.CMDB#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see linuxnetconf.CMDB#getGroups()
	 * @see #getCMDB()
	 * @generated
	 */
	EReference getCMDB_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link linuxnetconf.CMDB#getComputers <em>Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computers</em>'.
	 * @see linuxnetconf.CMDB#getComputers()
	 * @see #getCMDB()
	 * @generated
	 */
	EReference getCMDB_Computers();

	/**
	 * Returns the meta object for class '{@link linuxnetconf.ServerGroup <em>Server Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Group</em>'.
	 * @see linuxnetconf.ServerGroup
	 * @generated
	 */
	EClass getServerGroup();

	/**
	 * Returns the meta object for the reference list '{@link linuxnetconf.ServerGroup#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Servers</em>'.
	 * @see linuxnetconf.ServerGroup#getServers()
	 * @see #getServerGroup()
	 * @generated
	 */
	EReference getServerGroup_Servers();

	/**
	 * Returns the meta object for class '{@link linuxnetconf.ServerComputer <em>Server Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Computer</em>'.
	 * @see linuxnetconf.ServerComputer
	 * @generated
	 */
	EClass getServerComputer();

	/**
	 * Returns the meta object for the reference '{@link linuxnetconf.ServerComputer#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see linuxnetconf.ServerComputer#getGroup()
	 * @see #getServerComputer()
	 * @generated
	 */
	EReference getServerComputer_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link linuxnetconf.ServerComputer#getConfitems <em>Confitems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Confitems</em>'.
	 * @see linuxnetconf.ServerComputer#getConfitems()
	 * @see #getServerComputer()
	 * @generated
	 */
	EReference getServerComputer_Confitems();

	/**
	 * Returns the meta object for class '{@link linuxnetconf.StaticIPConfig <em>Static IP Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static IP Config</em>'.
	 * @see linuxnetconf.StaticIPConfig
	 * @generated
	 */
	EClass getStaticIPConfig();

	/**
	 * Returns the meta object for the attribute '{@link linuxnetconf.StaticIPConfig#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Address</em>'.
	 * @see linuxnetconf.StaticIPConfig#getIpAddress()
	 * @see #getStaticIPConfig()
	 * @generated
	 */
	EAttribute getStaticIPConfig_IpAddress();

	/**
	 * Returns the meta object for the attribute '{@link linuxnetconf.StaticIPConfig#getNetmask <em>Netmask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Netmask</em>'.
	 * @see linuxnetconf.StaticIPConfig#getNetmask()
	 * @see #getStaticIPConfig()
	 * @generated
	 */
	EAttribute getStaticIPConfig_Netmask();

	/**
	 * Returns the meta object for the attribute '{@link linuxnetconf.StaticIPConfig#getNetworkAddress <em>Network Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Address</em>'.
	 * @see linuxnetconf.StaticIPConfig#getNetworkAddress()
	 * @see #getStaticIPConfig()
	 * @generated
	 */
	EAttribute getStaticIPConfig_NetworkAddress();

	/**
	 * Returns the meta object for the attribute '{@link linuxnetconf.StaticIPConfig#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway</em>'.
	 * @see linuxnetconf.StaticIPConfig#getGateway()
	 * @see #getStaticIPConfig()
	 * @generated
	 */
	EAttribute getStaticIPConfig_Gateway();

	/**
	 * Returns the meta object for the attribute '{@link linuxnetconf.StaticIPConfig#getBroadcast <em>Broadcast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Broadcast</em>'.
	 * @see linuxnetconf.StaticIPConfig#getBroadcast()
	 * @see #getStaticIPConfig()
	 * @generated
	 */
	EAttribute getStaticIPConfig_Broadcast();

	/**
	 * Returns the meta object for class '{@link linuxnetconf.NetconfElement <em>Netconf Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Netconf Element</em>'.
	 * @see linuxnetconf.NetconfElement
	 * @generated
	 */
	EClass getNetconfElement();

	/**
	 * Returns the meta object for the containment reference '{@link linuxnetconf.NetconfElement#getIpconfig <em>Ipconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ipconfig</em>'.
	 * @see linuxnetconf.NetconfElement#getIpconfig()
	 * @see #getNetconfElement()
	 * @generated
	 */
	EReference getNetconfElement_Ipconfig();

	/**
	 * Returns the meta object for the attribute '{@link linuxnetconf.NetconfElement#getConfigType <em>Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Type</em>'.
	 * @see linuxnetconf.NetconfElement#getConfigType()
	 * @see #getNetconfElement()
	 * @generated
	 */
	EAttribute getNetconfElement_ConfigType();

	/**
	 * Returns the meta object for class '{@link linuxnetconf.EthernetInterface <em>Ethernet Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ethernet Interface</em>'.
	 * @see linuxnetconf.EthernetInterface
	 * @generated
	 */
	EClass getEthernetInterface();

	/**
	 * Returns the meta object for the reference '{@link linuxnetconf.EthernetInterface#getBondMaster <em>Bond Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bond Master</em>'.
	 * @see linuxnetconf.EthernetInterface#getBondMaster()
	 * @see #getEthernetInterface()
	 * @generated
	 */
	EReference getEthernetInterface_BondMaster();

	/**
	 * Returns the meta object for class '{@link linuxnetconf.BondingInterface <em>Bonding Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bonding Interface</em>'.
	 * @see linuxnetconf.BondingInterface
	 * @generated
	 */
	EClass getBondingInterface();

	/**
	 * Returns the meta object for the reference list '{@link linuxnetconf.BondingInterface#getSlaves <em>Slaves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Slaves</em>'.
	 * @see linuxnetconf.BondingInterface#getSlaves()
	 * @see #getBondingInterface()
	 * @generated
	 */
	EReference getBondingInterface_Slaves();

	/**
	 * Returns the meta object for class '{@link linuxnetconf.VlanInterface <em>Vlan Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vlan Interface</em>'.
	 * @see linuxnetconf.VlanInterface
	 * @generated
	 */
	EClass getVlanInterface();

	/**
	 * Returns the meta object for the reference '{@link linuxnetconf.VlanInterface#getRawInterface <em>Raw Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Raw Interface</em>'.
	 * @see linuxnetconf.VlanInterface#getRawInterface()
	 * @see #getVlanInterface()
	 * @generated
	 */
	EReference getVlanInterface_RawInterface();

	/**
	 * Returns the meta object for class '{@link linuxnetconf.Bridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge</em>'.
	 * @see linuxnetconf.Bridge
	 * @generated
	 */
	EClass getBridge();

	/**
	 * Returns the meta object for the reference list '{@link linuxnetconf.Bridge#getBridgePorts <em>Bridge Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bridge Ports</em>'.
	 * @see linuxnetconf.Bridge#getBridgePorts()
	 * @see #getBridge()
	 * @generated
	 */
	EReference getBridge_BridgePorts();

	/**
	 * Returns the meta object for class '{@link linuxnetconf.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see linuxnetconf.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference list '{@link linuxnetconf.Interface#getSubinterfaces <em>Subinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subinterfaces</em>'.
	 * @see linuxnetconf.Interface#getSubinterfaces()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Subinterfaces();

	/**
	 * Returns the meta object for class '{@link linuxnetconf.SubInterface <em>Sub Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Interface</em>'.
	 * @see linuxnetconf.SubInterface
	 * @generated
	 */
	EClass getSubInterface();

	/**
	 * Returns the meta object for the reference '{@link linuxnetconf.SubInterface#getMainInterface <em>Main Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Interface</em>'.
	 * @see linuxnetconf.SubInterface#getMainInterface()
	 * @see #getSubInterface()
	 * @generated
	 */
	EReference getSubInterface_MainInterface();

	/**
	 * Returns the meta object for class '{@link linuxnetconf.VlanOwner <em>Vlan Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vlan Owner</em>'.
	 * @see linuxnetconf.VlanOwner
	 * @generated
	 */
	EClass getVlanOwner();

	/**
	 * Returns the meta object for the reference list '{@link linuxnetconf.VlanOwner#getVlans <em>Vlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vlans</em>'.
	 * @see linuxnetconf.VlanOwner#getVlans()
	 * @see #getVlanOwner()
	 * @generated
	 */
	EReference getVlanOwner_Vlans();

	/**
	 * Returns the meta object for enum '{@link linuxnetconf.IFConfigType <em>IF Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IF Config Type</em>'.
	 * @see linuxnetconf.IFConfigType
	 * @generated
	 */
	EEnum getIFConfigType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LinuxnetconfFactory getLinuxnetconfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.CMDBImpl <em>CMDB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.CMDBImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getCMDB()
		 * @generated
		 */
		EClass CMDB = eINSTANCE.getCMDB();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMDB__GROUPS = eINSTANCE.getCMDB_Groups();

		/**
		 * The meta object literal for the '<em><b>Computers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMDB__COMPUTERS = eINSTANCE.getCMDB_Computers();

		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.ServerGroupImpl <em>Server Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.ServerGroupImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getServerGroup()
		 * @generated
		 */
		EClass SERVER_GROUP = eINSTANCE.getServerGroup();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_GROUP__SERVERS = eINSTANCE.getServerGroup_Servers();

		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.ServerComputerImpl <em>Server Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.ServerComputerImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getServerComputer()
		 * @generated
		 */
		EClass SERVER_COMPUTER = eINSTANCE.getServerComputer();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_COMPUTER__GROUP = eINSTANCE.getServerComputer_Group();

		/**
		 * The meta object literal for the '<em><b>Confitems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_COMPUTER__CONFITEMS = eINSTANCE.getServerComputer_Confitems();

		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.StaticIPConfigImpl <em>Static IP Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.StaticIPConfigImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getStaticIPConfig()
		 * @generated
		 */
		EClass STATIC_IP_CONFIG = eINSTANCE.getStaticIPConfig();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_IP_CONFIG__IP_ADDRESS = eINSTANCE.getStaticIPConfig_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Netmask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_IP_CONFIG__NETMASK = eINSTANCE.getStaticIPConfig_Netmask();

		/**
		 * The meta object literal for the '<em><b>Network Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_IP_CONFIG__NETWORK_ADDRESS = eINSTANCE.getStaticIPConfig_NetworkAddress();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_IP_CONFIG__GATEWAY = eINSTANCE.getStaticIPConfig_Gateway();

		/**
		 * The meta object literal for the '<em><b>Broadcast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_IP_CONFIG__BROADCAST = eINSTANCE.getStaticIPConfig_Broadcast();

		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.NetconfElementImpl <em>Netconf Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.NetconfElementImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getNetconfElement()
		 * @generated
		 */
		EClass NETCONF_ELEMENT = eINSTANCE.getNetconfElement();

		/**
		 * The meta object literal for the '<em><b>Ipconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETCONF_ELEMENT__IPCONFIG = eINSTANCE.getNetconfElement_Ipconfig();

		/**
		 * The meta object literal for the '<em><b>Config Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETCONF_ELEMENT__CONFIG_TYPE = eINSTANCE.getNetconfElement_ConfigType();

		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.EthernetInterfaceImpl <em>Ethernet Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.EthernetInterfaceImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getEthernetInterface()
		 * @generated
		 */
		EClass ETHERNET_INTERFACE = eINSTANCE.getEthernetInterface();

		/**
		 * The meta object literal for the '<em><b>Bond Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETHERNET_INTERFACE__BOND_MASTER = eINSTANCE.getEthernetInterface_BondMaster();

		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.BondingInterfaceImpl <em>Bonding Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.BondingInterfaceImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getBondingInterface()
		 * @generated
		 */
		EClass BONDING_INTERFACE = eINSTANCE.getBondingInterface();

		/**
		 * The meta object literal for the '<em><b>Slaves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BONDING_INTERFACE__SLAVES = eINSTANCE.getBondingInterface_Slaves();

		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.VlanInterfaceImpl <em>Vlan Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.VlanInterfaceImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getVlanInterface()
		 * @generated
		 */
		EClass VLAN_INTERFACE = eINSTANCE.getVlanInterface();

		/**
		 * The meta object literal for the '<em><b>Raw Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VLAN_INTERFACE__RAW_INTERFACE = eINSTANCE.getVlanInterface_RawInterface();

		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.BridgeImpl <em>Bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.BridgeImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getBridge()
		 * @generated
		 */
		EClass BRIDGE = eINSTANCE.getBridge();

		/**
		 * The meta object literal for the '<em><b>Bridge Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE__BRIDGE_PORTS = eINSTANCE.getBridge_BridgePorts();

		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.InterfaceImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Subinterfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SUBINTERFACES = eINSTANCE.getInterface_Subinterfaces();

		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.SubInterfaceImpl <em>Sub Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.SubInterfaceImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getSubInterface()
		 * @generated
		 */
		EClass SUB_INTERFACE = eINSTANCE.getSubInterface();

		/**
		 * The meta object literal for the '<em><b>Main Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_INTERFACE__MAIN_INTERFACE = eINSTANCE.getSubInterface_MainInterface();

		/**
		 * The meta object literal for the '{@link linuxnetconf.impl.VlanOwnerImpl <em>Vlan Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.impl.VlanOwnerImpl
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getVlanOwner()
		 * @generated
		 */
		EClass VLAN_OWNER = eINSTANCE.getVlanOwner();

		/**
		 * The meta object literal for the '<em><b>Vlans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VLAN_OWNER__VLANS = eINSTANCE.getVlanOwner_Vlans();

		/**
		 * The meta object literal for the '{@link linuxnetconf.IFConfigType <em>IF Config Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linuxnetconf.IFConfigType
		 * @see linuxnetconf.impl.LinuxnetconfPackageImpl#getIFConfigType()
		 * @generated
		 */
		EEnum IF_CONFIG_TYPE = eINSTANCE.getIFConfigType();

	}

} //LinuxnetconfPackage
