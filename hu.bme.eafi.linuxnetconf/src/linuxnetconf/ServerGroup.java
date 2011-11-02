/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.ServerGroup#getServers <em>Servers</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getServerGroup()
 * @model
 * @generated
 */
public interface ServerGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Servers</b></em>' reference list.
	 * The list contents are of type {@link linuxnetconf.ServerComputer}.
	 * It is bidirectional and its opposite is '{@link linuxnetconf.ServerComputer#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' reference list.
	 * @see linuxnetconf.LinuxnetconfPackage#getServerGroup_Servers()
	 * @see linuxnetconf.ServerComputer#getGroup
	 * @model opposite="group"
	 * @generated
	 */
	EList<ServerComputer> getServers();

} // ServerGroup
