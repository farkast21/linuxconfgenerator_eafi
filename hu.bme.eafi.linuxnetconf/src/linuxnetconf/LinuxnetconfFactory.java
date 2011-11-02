/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see linuxnetconf.LinuxnetconfPackage
 * @generated
 */
public interface LinuxnetconfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinuxnetconfFactory eINSTANCE = linuxnetconf.impl.LinuxnetconfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CMDB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMDB</em>'.
	 * @generated
	 */
	CMDB createCMDB();

	/**
	 * Returns a new object of class '<em>Server Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Group</em>'.
	 * @generated
	 */
	ServerGroup createServerGroup();

	/**
	 * Returns a new object of class '<em>Server Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Computer</em>'.
	 * @generated
	 */
	ServerComputer createServerComputer();

	/**
	 * Returns a new object of class '<em>Static IP Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static IP Config</em>'.
	 * @generated
	 */
	StaticIPConfig createStaticIPConfig();

	/**
	 * Returns a new object of class '<em>Ethernet Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ethernet Interface</em>'.
	 * @generated
	 */
	EthernetInterface createEthernetInterface();

	/**
	 * Returns a new object of class '<em>Bonding Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bonding Interface</em>'.
	 * @generated
	 */
	BondingInterface createBondingInterface();

	/**
	 * Returns a new object of class '<em>Vlan Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vlan Interface</em>'.
	 * @generated
	 */
	VlanInterface createVlanInterface();

	/**
	 * Returns a new object of class '<em>Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bridge</em>'.
	 * @generated
	 */
	Bridge createBridge();

	/**
	 * Returns a new object of class '<em>Sub Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Interface</em>'.
	 * @generated
	 */
	SubInterface createSubInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LinuxnetconfPackage getLinuxnetconfPackage();

} //LinuxnetconfFactory
