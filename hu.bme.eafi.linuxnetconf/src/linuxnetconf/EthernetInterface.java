/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ethernet Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.EthernetInterface#getBondMaster <em>Bond Master</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getEthernetInterface()
 * @model
 * @generated
 */
public interface EthernetInterface extends VlanOwner {
	/**
	 * Returns the value of the '<em><b>Bond Master</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link linuxnetconf.BondingInterface#getSlaves <em>Slaves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bond Master</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bond Master</em>' reference.
	 * @see #setBondMaster(BondingInterface)
	 * @see linuxnetconf.LinuxnetconfPackage#getEthernetInterface_BondMaster()
	 * @see linuxnetconf.BondingInterface#getSlaves
	 * @model opposite="slaves"
	 * @generated
	 */
	BondingInterface getBondMaster();

	/**
	 * Sets the value of the '{@link linuxnetconf.EthernetInterface#getBondMaster <em>Bond Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bond Master</em>' reference.
	 * @see #getBondMaster()
	 * @generated
	 */
	void setBondMaster(BondingInterface value);

} // EthernetInterface
