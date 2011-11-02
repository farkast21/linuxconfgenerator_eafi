/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Netconf Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.NetconfElement#getIpconfig <em>Ipconfig</em>}</li>
 *   <li>{@link linuxnetconf.NetconfElement#getConfigType <em>Config Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getNetconfElement()
 * @model abstract="true"
 * @generated
 */
public interface NetconfElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Ipconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ipconfig</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipconfig</em>' containment reference.
	 * @see #setIpconfig(StaticIPConfig)
	 * @see linuxnetconf.LinuxnetconfPackage#getNetconfElement_Ipconfig()
	 * @model containment="true"
	 * @generated
	 */
	StaticIPConfig getIpconfig();

	/**
	 * Sets the value of the '{@link linuxnetconf.NetconfElement#getIpconfig <em>Ipconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipconfig</em>' containment reference.
	 * @see #getIpconfig()
	 * @generated
	 */
	void setIpconfig(StaticIPConfig value);

	/**
	 * Returns the value of the '<em><b>Config Type</b></em>' attribute.
	 * The literals are from the enumeration {@link linuxnetconf.IFConfigType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Type</em>' attribute.
	 * @see linuxnetconf.IFConfigType
	 * @see #setConfigType(IFConfigType)
	 * @see linuxnetconf.LinuxnetconfPackage#getNetconfElement_ConfigType()
	 * @model
	 * @generated
	 */
	IFConfigType getConfigType();

	/**
	 * Sets the value of the '{@link linuxnetconf.NetconfElement#getConfigType <em>Config Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Type</em>' attribute.
	 * @see linuxnetconf.IFConfigType
	 * @see #getConfigType()
	 * @generated
	 */
	void setConfigType(IFConfigType value);

} // NetconfElement
