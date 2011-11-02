/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package linuxnetconf.util;

import linuxnetconf.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see linuxnetconf.LinuxnetconfPackage
 * @generated
 */
public class LinuxnetconfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LinuxnetconfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinuxnetconfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LinuxnetconfPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinuxnetconfSwitch<Adapter> modelSwitch =
		new LinuxnetconfSwitch<Adapter>() {
			@Override
			public Adapter caseCMDB(CMDB object) {
				return createCMDBAdapter();
			}
			@Override
			public Adapter caseServerGroup(ServerGroup object) {
				return createServerGroupAdapter();
			}
			@Override
			public Adapter caseServerComputer(ServerComputer object) {
				return createServerComputerAdapter();
			}
			@Override
			public Adapter caseStaticIPConfig(StaticIPConfig object) {
				return createStaticIPConfigAdapter();
			}
			@Override
			public Adapter caseNetconfElement(NetconfElement object) {
				return createNetconfElementAdapter();
			}
			@Override
			public Adapter caseEthernetInterface(EthernetInterface object) {
				return createEthernetInterfaceAdapter();
			}
			@Override
			public Adapter caseBondingInterface(BondingInterface object) {
				return createBondingInterfaceAdapter();
			}
			@Override
			public Adapter caseVlanInterface(VlanInterface object) {
				return createVlanInterfaceAdapter();
			}
			@Override
			public Adapter caseBridge(Bridge object) {
				return createBridgeAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseSubInterface(SubInterface object) {
				return createSubInterfaceAdapter();
			}
			@Override
			public Adapter caseVlanOwner(VlanOwner object) {
				return createVlanOwnerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.CMDB <em>CMDB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.CMDB
	 * @generated
	 */
	public Adapter createCMDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.ServerGroup <em>Server Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.ServerGroup
	 * @generated
	 */
	public Adapter createServerGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.ServerComputer <em>Server Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.ServerComputer
	 * @generated
	 */
	public Adapter createServerComputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.StaticIPConfig <em>Static IP Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.StaticIPConfig
	 * @generated
	 */
	public Adapter createStaticIPConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.NetconfElement <em>Netconf Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.NetconfElement
	 * @generated
	 */
	public Adapter createNetconfElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.EthernetInterface <em>Ethernet Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.EthernetInterface
	 * @generated
	 */
	public Adapter createEthernetInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.BondingInterface <em>Bonding Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.BondingInterface
	 * @generated
	 */
	public Adapter createBondingInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.VlanInterface <em>Vlan Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.VlanInterface
	 * @generated
	 */
	public Adapter createVlanInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.Bridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.Bridge
	 * @generated
	 */
	public Adapter createBridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.SubInterface <em>Sub Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.SubInterface
	 * @generated
	 */
	public Adapter createSubInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linuxnetconf.VlanOwner <em>Vlan Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linuxnetconf.VlanOwner
	 * @generated
	 */
	public Adapter createVlanOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LinuxnetconfAdapterFactory
