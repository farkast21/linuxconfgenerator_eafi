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
 * A representation of the model object '<em><b>Static IP Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link linuxnetconf.StaticIPConfig#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link linuxnetconf.StaticIPConfig#getNetmask <em>Netmask</em>}</li>
 *   <li>{@link linuxnetconf.StaticIPConfig#getNetworkAddress <em>Network Address</em>}</li>
 *   <li>{@link linuxnetconf.StaticIPConfig#getGateway <em>Gateway</em>}</li>
 *   <li>{@link linuxnetconf.StaticIPConfig#getBroadcast <em>Broadcast</em>}</li>
 * </ul>
 * </p>
 *
 * @see linuxnetconf.LinuxnetconfPackage#getStaticIPConfig()
 * @model
 * @generated
 */
public interface StaticIPConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Address</em>' attribute.
	 * @see #setIpAddress(String)
	 * @see linuxnetconf.LinuxnetconfPackage#getStaticIPConfig_IpAddress()
	 * @model
	 * @generated
	 */
	String getIpAddress();

	/**
	 * Sets the value of the '{@link linuxnetconf.StaticIPConfig#getIpAddress <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' attribute.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Netmask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Netmask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Netmask</em>' attribute.
	 * @see #setNetmask(String)
	 * @see linuxnetconf.LinuxnetconfPackage#getStaticIPConfig_Netmask()
	 * @model
	 * @generated
	 */
	String getNetmask();

	/**
	 * Sets the value of the '{@link linuxnetconf.StaticIPConfig#getNetmask <em>Netmask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Netmask</em>' attribute.
	 * @see #getNetmask()
	 * @generated
	 */
	void setNetmask(String value);

	/**
	 * Returns the value of the '<em><b>Network Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Address</em>' attribute.
	 * @see #setNetworkAddress(String)
	 * @see linuxnetconf.LinuxnetconfPackage#getStaticIPConfig_NetworkAddress()
	 * @model
	 * @generated
	 */
	String getNetworkAddress();

	/**
	 * Sets the value of the '{@link linuxnetconf.StaticIPConfig#getNetworkAddress <em>Network Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Address</em>' attribute.
	 * @see #getNetworkAddress()
	 * @generated
	 */
	void setNetworkAddress(String value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' attribute.
	 * @see #setGateway(String)
	 * @see linuxnetconf.LinuxnetconfPackage#getStaticIPConfig_Gateway()
	 * @model
	 * @generated
	 */
	String getGateway();

	/**
	 * Sets the value of the '{@link linuxnetconf.StaticIPConfig#getGateway <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' attribute.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(String value);

	/**
	 * Returns the value of the '<em><b>Broadcast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broadcast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broadcast</em>' attribute.
	 * @see #setBroadcast(String)
	 * @see linuxnetconf.LinuxnetconfPackage#getStaticIPConfig_Broadcast()
	 * @model
	 * @generated
	 */
	String getBroadcast();

	/**
	 * Sets the value of the '{@link linuxnetconf.StaticIPConfig#getBroadcast <em>Broadcast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broadcast</em>' attribute.
	 * @see #getBroadcast()
	 * @generated
	 */
	void setBroadcast(String value);

} // StaticIPConfig
