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
 * A representation of the model object '<em><b>Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.Bridge#getBridgePorts <em>Bridge Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getBridge()
 * @model
 * @generated
 */
public interface Bridge extends NetconfElement {
	/**
	 * Returns the value of the '<em><b>Bridge Ports</b></em>' reference list.
	 * The list contents are of type {@link linuxnetconf.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bridge Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridge Ports</em>' reference list.
	 * @see linuxnetconf.LinuxnetconfPackage#getBridge_BridgePorts()
	 * @model required="true"
	 * @generated
	 */
	EList<Interface> getBridgePorts();

} // Bridge
