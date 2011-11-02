/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import linuxnetconf.LinuxnetconfPackage;
import linuxnetconf.StaticIPConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static IP Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link linuxnetconf.impl.StaticIPConfigImpl#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link linuxnetconf.impl.StaticIPConfigImpl#getNetmask <em>Netmask</em>}</li>
 *   <li>{@link linuxnetconf.impl.StaticIPConfigImpl#getNetworkAddress <em>Network Address</em>}</li>
 *   <li>{@link linuxnetconf.impl.StaticIPConfigImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link linuxnetconf.impl.StaticIPConfigImpl#getBroadcast <em>Broadcast</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticIPConfigImpl extends EObjectImpl implements StaticIPConfig {
	/**
	 * The default value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String ipAddress = IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetmask() <em>Netmask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetmask()
	 * @generated
	 * @ordered
	 */
	protected static final String NETMASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetmask() <em>Netmask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetmask()
	 * @generated
	 * @ordered
	 */
	protected String netmask = NETMASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkAddress() <em>Network Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkAddress() <em>Network Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAddress()
	 * @generated
	 * @ordered
	 */
	protected String networkAddress = NETWORK_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected String gateway = GATEWAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBroadcast() <em>Broadcast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroadcast()
	 * @generated
	 * @ordered
	 */
	protected static final String BROADCAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBroadcast() <em>Broadcast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroadcast()
	 * @generated
	 * @ordered
	 */
	protected String broadcast = BROADCAST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticIPConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxnetconfPackage.Literals.STATIC_IP_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpAddress(String newIpAddress) {
		String oldIpAddress = ipAddress;
		ipAddress = newIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.STATIC_IP_CONFIG__IP_ADDRESS, oldIpAddress, ipAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetmask() {
		return netmask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetmask(String newNetmask) {
		String oldNetmask = netmask;
		netmask = newNetmask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.STATIC_IP_CONFIG__NETMASK, oldNetmask, netmask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkAddress() {
		return networkAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkAddress(String newNetworkAddress) {
		String oldNetworkAddress = networkAddress;
		networkAddress = newNetworkAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.STATIC_IP_CONFIG__NETWORK_ADDRESS, oldNetworkAddress, networkAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateway(String newGateway) {
		String oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.STATIC_IP_CONFIG__GATEWAY, oldGateway, gateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBroadcast() {
		return broadcast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBroadcast(String newBroadcast) {
		String oldBroadcast = broadcast;
		broadcast = newBroadcast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.STATIC_IP_CONFIG__BROADCAST, oldBroadcast, broadcast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinuxnetconfPackage.STATIC_IP_CONFIG__IP_ADDRESS:
				return getIpAddress();
			case LinuxnetconfPackage.STATIC_IP_CONFIG__NETMASK:
				return getNetmask();
			case LinuxnetconfPackage.STATIC_IP_CONFIG__NETWORK_ADDRESS:
				return getNetworkAddress();
			case LinuxnetconfPackage.STATIC_IP_CONFIG__GATEWAY:
				return getGateway();
			case LinuxnetconfPackage.STATIC_IP_CONFIG__BROADCAST:
				return getBroadcast();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LinuxnetconfPackage.STATIC_IP_CONFIG__IP_ADDRESS:
				setIpAddress((String)newValue);
				return;
			case LinuxnetconfPackage.STATIC_IP_CONFIG__NETMASK:
				setNetmask((String)newValue);
				return;
			case LinuxnetconfPackage.STATIC_IP_CONFIG__NETWORK_ADDRESS:
				setNetworkAddress((String)newValue);
				return;
			case LinuxnetconfPackage.STATIC_IP_CONFIG__GATEWAY:
				setGateway((String)newValue);
				return;
			case LinuxnetconfPackage.STATIC_IP_CONFIG__BROADCAST:
				setBroadcast((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LinuxnetconfPackage.STATIC_IP_CONFIG__IP_ADDRESS:
				setIpAddress(IP_ADDRESS_EDEFAULT);
				return;
			case LinuxnetconfPackage.STATIC_IP_CONFIG__NETMASK:
				setNetmask(NETMASK_EDEFAULT);
				return;
			case LinuxnetconfPackage.STATIC_IP_CONFIG__NETWORK_ADDRESS:
				setNetworkAddress(NETWORK_ADDRESS_EDEFAULT);
				return;
			case LinuxnetconfPackage.STATIC_IP_CONFIG__GATEWAY:
				setGateway(GATEWAY_EDEFAULT);
				return;
			case LinuxnetconfPackage.STATIC_IP_CONFIG__BROADCAST:
				setBroadcast(BROADCAST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LinuxnetconfPackage.STATIC_IP_CONFIG__IP_ADDRESS:
				return IP_ADDRESS_EDEFAULT == null ? ipAddress != null : !IP_ADDRESS_EDEFAULT.equals(ipAddress);
			case LinuxnetconfPackage.STATIC_IP_CONFIG__NETMASK:
				return NETMASK_EDEFAULT == null ? netmask != null : !NETMASK_EDEFAULT.equals(netmask);
			case LinuxnetconfPackage.STATIC_IP_CONFIG__NETWORK_ADDRESS:
				return NETWORK_ADDRESS_EDEFAULT == null ? networkAddress != null : !NETWORK_ADDRESS_EDEFAULT.equals(networkAddress);
			case LinuxnetconfPackage.STATIC_IP_CONFIG__GATEWAY:
				return GATEWAY_EDEFAULT == null ? gateway != null : !GATEWAY_EDEFAULT.equals(gateway);
			case LinuxnetconfPackage.STATIC_IP_CONFIG__BROADCAST:
				return BROADCAST_EDEFAULT == null ? broadcast != null : !BROADCAST_EDEFAULT.equals(broadcast);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ipAddress: ");
		result.append(ipAddress);
		result.append(", netmask: ");
		result.append(netmask);
		result.append(", networkAddress: ");
		result.append(networkAddress);
		result.append(", gateway: ");
		result.append(gateway);
		result.append(", broadcast: ");
		result.append(broadcast);
		result.append(')');
		return result.toString();
	}

} //StaticIPConfigImpl
