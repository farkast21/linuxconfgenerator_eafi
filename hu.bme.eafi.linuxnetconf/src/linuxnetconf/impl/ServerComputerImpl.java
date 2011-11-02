/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.impl;

import java.util.Collection;

import linuxnetconf.LinuxnetconfPackage;
import linuxnetconf.NetconfElement;
import linuxnetconf.ServerComputer;
import linuxnetconf.ServerGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Computer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link linuxnetconf.impl.ServerComputerImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link linuxnetconf.impl.ServerComputerImpl#getConfitems <em>Confitems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerComputerImpl extends EObjectImpl implements ServerComputer {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected ServerGroup group;

	/**
	 * The cached value of the '{@link #getConfitems() <em>Confitems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfitems()
	 * @generated
	 * @ordered
	 */
	protected EList<NetconfElement> confitems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerComputerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinuxnetconfPackage.Literals.SERVER_COMPUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerGroup getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (ServerGroup)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinuxnetconfPackage.SERVER_COMPUTER__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerGroup basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(ServerGroup newGroup, NotificationChain msgs) {
		ServerGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.SERVER_COMPUTER__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(ServerGroup newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, LinuxnetconfPackage.SERVER_GROUP__SERVERS, ServerGroup.class, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, LinuxnetconfPackage.SERVER_GROUP__SERVERS, ServerGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinuxnetconfPackage.SERVER_COMPUTER__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetconfElement> getConfitems() {
		if (confitems == null) {
			confitems = new EObjectContainmentEList<NetconfElement>(NetconfElement.class, this, LinuxnetconfPackage.SERVER_COMPUTER__CONFITEMS);
		}
		return confitems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinuxnetconfPackage.SERVER_COMPUTER__GROUP:
				if (group != null)
					msgs = ((InternalEObject)group).eInverseRemove(this, LinuxnetconfPackage.SERVER_GROUP__SERVERS, ServerGroup.class, msgs);
				return basicSetGroup((ServerGroup)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinuxnetconfPackage.SERVER_COMPUTER__GROUP:
				return basicSetGroup(null, msgs);
			case LinuxnetconfPackage.SERVER_COMPUTER__CONFITEMS:
				return ((InternalEList<?>)getConfitems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinuxnetconfPackage.SERVER_COMPUTER__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case LinuxnetconfPackage.SERVER_COMPUTER__CONFITEMS:
				return getConfitems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LinuxnetconfPackage.SERVER_COMPUTER__GROUP:
				setGroup((ServerGroup)newValue);
				return;
			case LinuxnetconfPackage.SERVER_COMPUTER__CONFITEMS:
				getConfitems().clear();
				getConfitems().addAll((Collection<? extends NetconfElement>)newValue);
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
			case LinuxnetconfPackage.SERVER_COMPUTER__GROUP:
				setGroup((ServerGroup)null);
				return;
			case LinuxnetconfPackage.SERVER_COMPUTER__CONFITEMS:
				getConfitems().clear();
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
			case LinuxnetconfPackage.SERVER_COMPUTER__GROUP:
				return group != null;
			case LinuxnetconfPackage.SERVER_COMPUTER__CONFITEMS:
				return confitems != null && !confitems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServerComputerImpl
