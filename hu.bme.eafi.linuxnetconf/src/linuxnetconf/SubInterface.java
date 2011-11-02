/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.SubInterface#getMainInterface <em>Main Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getSubInterface()
 * @model
 * @generated
 */
public interface SubInterface extends NetconfElement {
	/**
	 * Returns the value of the '<em><b>Main Interface</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link linuxnetconf.Interface#getSubinterfaces <em>Subinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Interface</em>' reference.
	 * @see #setMainInterface(Interface)
	 * @see linuxnetconf.LinuxnetconfPackage#getSubInterface_MainInterface()
	 * @see linuxnetconf.Interface#getSubinterfaces
	 * @model opposite="subinterfaces" required="true"
	 * @generated
	 */
	Interface getMainInterface();

	/**
	 * Sets the value of the '{@link linuxnetconf.SubInterface#getMainInterface <em>Main Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Interface</em>' reference.
	 * @see #getMainInterface()
	 * @generated
	 */
	void setMainInterface(Interface value);

} // SubInterface
