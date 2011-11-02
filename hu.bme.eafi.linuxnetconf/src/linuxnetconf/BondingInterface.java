/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bonding Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.BondingInterface#getSlaves <em>Slaves</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getBondingInterface()
 * @model
 * @generated
 */
public interface BondingInterface extends VlanOwner {
	/**
	 * Returns the value of the '<em><b>Slaves</b></em>' reference list.
	 * The list contents are of type {@link linuxnetconf.EthernetInterface}.
	 * It is bidirectional and its opposite is '{@link linuxnetconf.EthernetInterface#getBondMaster <em>Bond Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slaves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slaves</em>' reference list.
	 * @see linuxnetconf.LinuxnetconfPackage#getBondingInterface_Slaves()
	 * @see linuxnetconf.EthernetInterface#getBondMaster
	 * @model opposite="bondMaster" required="true"
	 * @generated
	 */
	EList<EthernetInterface> getSlaves();

} // BondingInterface
