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
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.Interface#getSubinterfaces <em>Subinterfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getInterface()
 * @model abstract="true"
 * @generated
 */
public interface Interface extends NetconfElement {
	/**
	 * Returns the value of the '<em><b>Subinterfaces</b></em>' reference list.
	 * The list contents are of type {@link linuxnetconf.SubInterface}.
	 * It is bidirectional and its opposite is '{@link linuxnetconf.SubInterface#getMainInterface <em>Main Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subinterfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subinterfaces</em>' reference list.
	 * @see linuxnetconf.LinuxnetconfPackage#getInterface_Subinterfaces()
	 * @see linuxnetconf.SubInterface#getMainInterface
	 * @model opposite="mainInterface"
	 * @generated
	 */
	EList<SubInterface> getSubinterfaces();

} // Interface
