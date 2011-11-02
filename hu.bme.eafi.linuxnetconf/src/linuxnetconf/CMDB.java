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
 * A representation of the model object '<em><b>CMDB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.CMDB#getGroups <em>Groups</em>}</li>
 *   <li>{@link linuxnetconf.CMDB#getComputers <em>Computers</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getCMDB()
 * @model
 * @generated
 */
public interface CMDB extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link linuxnetconf.ServerGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see linuxnetconf.LinuxnetconfPackage#getCMDB_Groups()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServerGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Computers</b></em>' containment reference list.
	 * The list contents are of type {@link linuxnetconf.ServerComputer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computers</em>' containment reference list.
	 * @see linuxnetconf.LinuxnetconfPackage#getCMDB_Computers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServerComputer> getComputers();

} // CMDB
