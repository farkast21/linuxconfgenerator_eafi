/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vlan Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.VlanInterface#getRawInterface <em>Raw Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getVlanInterface()
 * @model
 * @generated
 */
public interface VlanInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Raw Interface</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link linuxnetconf.VlanOwner#getVlans <em>Vlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Interface</em>' reference.
	 * @see #setRawInterface(VlanOwner)
	 * @see linuxnetconf.LinuxnetconfPackage#getVlanInterface_RawInterface()
	 * @see linuxnetconf.VlanOwner#getVlans
	 * @model opposite="vlans" required="true"
	 * @generated
	 */
	VlanOwner getRawInterface();

	/**
	 * Sets the value of the '{@link linuxnetconf.VlanInterface#getRawInterface <em>Raw Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Interface</em>' reference.
	 * @see #getRawInterface()
	 * @generated
	 */
	void setRawInterface(VlanOwner value);

} // VlanInterface
