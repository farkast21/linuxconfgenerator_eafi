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
 * A representation of the model object '<em><b>Server Computer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.ServerComputer#getGroup <em>Group</em>}</li>
 *   <li>{@link linuxnetconf.ServerComputer#getConfitems <em>Confitems</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getServerComputer()
 * @model
 * @generated
 */
public interface ServerComputer extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link linuxnetconf.ServerGroup#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(ServerGroup)
	 * @see linuxnetconf.LinuxnetconfPackage#getServerComputer_Group()
	 * @see linuxnetconf.ServerGroup#getServers
	 * @model opposite="servers"
	 * @generated
	 */
	ServerGroup getGroup();

	/**
	 * Sets the value of the '{@link linuxnetconf.ServerComputer#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ServerGroup value);

	/**
	 * Returns the value of the '<em><b>Confitems</b></em>' containment reference list.
	 * The list contents are of type {@link linuxnetconf.NetconfElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confitems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confitems</em>' containment reference list.
	 * @see linuxnetconf.LinuxnetconfPackage#getServerComputer_Confitems()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetconfElement> getConfitems();

} // ServerComputer
