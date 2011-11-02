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
 * A representation of the model object '<em><b>Vlan Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.VlanOwner#getVlans <em>Vlans</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getVlanOwner()
 * @model abstract="true"
 * @generated
 */
public interface VlanOwner extends Interface {
	/**
	 * Returns the value of the '<em><b>Vlans</b></em>' reference list.
	 * The list contents are of type {@link linuxnetconf.VlanInterface}.
	 * It is bidirectional and its opposite is '{@link linuxnetconf.VlanInterface#getRawInterface <em>Raw Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vlans</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlans</em>' reference list.
	 * @see linuxnetconf.LinuxnetconfPackage#getVlanOwner_Vlans()
	 * @see linuxnetconf.VlanInterface#getRawInterface
	 * @model opposite="rawInterface"
	 * @generated
	 */
	EList<VlanInterface> getVlans();

} // VlanOwner
