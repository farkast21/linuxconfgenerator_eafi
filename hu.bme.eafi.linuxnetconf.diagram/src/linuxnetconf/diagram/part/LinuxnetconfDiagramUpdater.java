package linuxnetconf.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import linuxnetconf.BondingInterface;
import linuxnetconf.Bridge;
import linuxnetconf.EthernetInterface;
import linuxnetconf.Interface;
import linuxnetconf.LinuxnetconfPackage;
import linuxnetconf.NetconfElement;
import linuxnetconf.ServerComputer;
import linuxnetconf.SubInterface;
import linuxnetconf.VlanInterface;
import linuxnetconf.VlanOwner;
import linuxnetconf.diagram.edit.parts.BondingInterfaceEditPart;
import linuxnetconf.diagram.edit.parts.BondingInterfaceSlavesEditPart;
import linuxnetconf.diagram.edit.parts.BridgeBridgePortsEditPart;
import linuxnetconf.diagram.edit.parts.BridgeEditPart;
import linuxnetconf.diagram.edit.parts.EthernetInterfaceEditPart;
import linuxnetconf.diagram.edit.parts.InterfaceSubinterfacesEditPart;
import linuxnetconf.diagram.edit.parts.ServerComputerEditPart;
import linuxnetconf.diagram.edit.parts.SubInterfaceEditPart;
import linuxnetconf.diagram.edit.parts.VlanInterfaceEditPart;
import linuxnetconf.diagram.edit.parts.VlanOwnerVlansEditPart;
import linuxnetconf.diagram.providers.LinuxnetconfElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class LinuxnetconfDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<LinuxnetconfNodeDescriptor> getSemanticChildren(View view) {
		switch (LinuxnetconfVisualIDRegistry.getVisualID(view)) {
		case ServerComputerEditPart.VISUAL_ID:
			return getServerComputer_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfNodeDescriptor> getServerComputer_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ServerComputer modelElement = (ServerComputer) view.getElement();
		LinkedList<LinuxnetconfNodeDescriptor> result = new LinkedList<LinuxnetconfNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConfitems().iterator(); it
				.hasNext();) {
			NetconfElement childElement = (NetconfElement) it.next();
			int visualID = LinuxnetconfVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == BridgeEditPart.VISUAL_ID) {
				result.add(new LinuxnetconfNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == SubInterfaceEditPart.VISUAL_ID) {
				result.add(new LinuxnetconfNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == EthernetInterfaceEditPart.VISUAL_ID) {
				result.add(new LinuxnetconfNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == VlanInterfaceEditPart.VISUAL_ID) {
				result.add(new LinuxnetconfNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == BondingInterfaceEditPart.VISUAL_ID) {
				result.add(new LinuxnetconfNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getContainedLinks(View view) {
		switch (LinuxnetconfVisualIDRegistry.getVisualID(view)) {
		case ServerComputerEditPart.VISUAL_ID:
			return getServerComputer_1000ContainedLinks(view);
		case BridgeEditPart.VISUAL_ID:
			return getBridge_2001ContainedLinks(view);
		case SubInterfaceEditPart.VISUAL_ID:
			return getSubInterface_2002ContainedLinks(view);
		case EthernetInterfaceEditPart.VISUAL_ID:
			return getEthernetInterface_2003ContainedLinks(view);
		case VlanInterfaceEditPart.VISUAL_ID:
			return getVlanInterface_2004ContainedLinks(view);
		case BondingInterfaceEditPart.VISUAL_ID:
			return getBondingInterface_2005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getIncomingLinks(View view) {
		switch (LinuxnetconfVisualIDRegistry.getVisualID(view)) {
		case BridgeEditPart.VISUAL_ID:
			return getBridge_2001IncomingLinks(view);
		case SubInterfaceEditPart.VISUAL_ID:
			return getSubInterface_2002IncomingLinks(view);
		case EthernetInterfaceEditPart.VISUAL_ID:
			return getEthernetInterface_2003IncomingLinks(view);
		case VlanInterfaceEditPart.VISUAL_ID:
			return getVlanInterface_2004IncomingLinks(view);
		case BondingInterfaceEditPart.VISUAL_ID:
			return getBondingInterface_2005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getOutgoingLinks(View view) {
		switch (LinuxnetconfVisualIDRegistry.getVisualID(view)) {
		case BridgeEditPart.VISUAL_ID:
			return getBridge_2001OutgoingLinks(view);
		case SubInterfaceEditPart.VISUAL_ID:
			return getSubInterface_2002OutgoingLinks(view);
		case EthernetInterfaceEditPart.VISUAL_ID:
			return getEthernetInterface_2003OutgoingLinks(view);
		case VlanInterfaceEditPart.VISUAL_ID:
			return getVlanInterface_2004OutgoingLinks(view);
		case BondingInterfaceEditPart.VISUAL_ID:
			return getBondingInterface_2005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getServerComputer_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getBridge_2001ContainedLinks(
			View view) {
		Bridge modelElement = (Bridge) view.getElement();
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Bridge_BridgePorts_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getSubInterface_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getEthernetInterface_2003ContainedLinks(
			View view) {
		EthernetInterface modelElement = (EthernetInterface) view.getElement();
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_VlanOwner_Vlans_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Interface_Subinterfaces_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getVlanInterface_2004ContainedLinks(
			View view) {
		VlanInterface modelElement = (VlanInterface) view.getElement();
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Interface_Subinterfaces_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getBondingInterface_2005ContainedLinks(
			View view) {
		BondingInterface modelElement = (BondingInterface) view.getElement();
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BondingInterface_Slaves_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_VlanOwner_Vlans_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Interface_Subinterfaces_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getBridge_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getSubInterface_2002IncomingLinks(
			View view) {
		SubInterface modelElement = (SubInterface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Interface_Subinterfaces_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getEthernetInterface_2003IncomingLinks(
			View view) {
		EthernetInterface modelElement = (EthernetInterface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_BondingInterface_Slaves_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Bridge_BridgePorts_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getVlanInterface_2004IncomingLinks(
			View view) {
		VlanInterface modelElement = (VlanInterface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Bridge_BridgePorts_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_VlanOwner_Vlans_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getBondingInterface_2005IncomingLinks(
			View view) {
		BondingInterface modelElement = (BondingInterface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Bridge_BridgePorts_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getBridge_2001OutgoingLinks(
			View view) {
		Bridge modelElement = (Bridge) view.getElement();
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Bridge_BridgePorts_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getSubInterface_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getEthernetInterface_2003OutgoingLinks(
			View view) {
		EthernetInterface modelElement = (EthernetInterface) view.getElement();
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_VlanOwner_Vlans_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Interface_Subinterfaces_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getVlanInterface_2004OutgoingLinks(
			View view) {
		VlanInterface modelElement = (VlanInterface) view.getElement();
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Interface_Subinterfaces_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LinuxnetconfLinkDescriptor> getBondingInterface_2005OutgoingLinks(
			View view) {
		BondingInterface modelElement = (BondingInterface) view.getElement();
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BondingInterface_Slaves_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_VlanOwner_Vlans_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Interface_Subinterfaces_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LinuxnetconfLinkDescriptor> getIncomingFeatureModelFacetLinks_BondingInterface_Slaves_4001(
			EthernetInterface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == LinuxnetconfPackage.eINSTANCE
					.getBondingInterface_Slaves()) {
				result.add(new LinuxnetconfLinkDescriptor(setting.getEObject(),
						target,
						LinuxnetconfElementTypes.BondingInterfaceSlaves_4001,
						BondingInterfaceSlavesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LinuxnetconfLinkDescriptor> getIncomingFeatureModelFacetLinks_Bridge_BridgePorts_4002(
			Interface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == LinuxnetconfPackage.eINSTANCE
					.getBridge_BridgePorts()) {
				result.add(new LinuxnetconfLinkDescriptor(setting.getEObject(),
						target,
						LinuxnetconfElementTypes.BridgeBridgePorts_4002,
						BridgeBridgePortsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LinuxnetconfLinkDescriptor> getIncomingFeatureModelFacetLinks_VlanOwner_Vlans_4003(
			VlanInterface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == LinuxnetconfPackage.eINSTANCE
					.getVlanOwner_Vlans()) {
				result.add(new LinuxnetconfLinkDescriptor(setting.getEObject(),
						target, LinuxnetconfElementTypes.VlanOwnerVlans_4003,
						VlanOwnerVlansEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LinuxnetconfLinkDescriptor> getIncomingFeatureModelFacetLinks_Interface_Subinterfaces_4004(
			SubInterface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == LinuxnetconfPackage.eINSTANCE
					.getInterface_Subinterfaces()) {
				result.add(new LinuxnetconfLinkDescriptor(setting.getEObject(),
						target,
						LinuxnetconfElementTypes.InterfaceSubinterfaces_4004,
						InterfaceSubinterfacesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LinuxnetconfLinkDescriptor> getOutgoingFeatureModelFacetLinks_BondingInterface_Slaves_4001(
			BondingInterface source) {
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		for (Iterator<?> destinations = source.getSlaves().iterator(); destinations
				.hasNext();) {
			EthernetInterface destination = (EthernetInterface) destinations
					.next();
			result.add(new LinuxnetconfLinkDescriptor(source, destination,
					LinuxnetconfElementTypes.BondingInterfaceSlaves_4001,
					BondingInterfaceSlavesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LinuxnetconfLinkDescriptor> getOutgoingFeatureModelFacetLinks_Bridge_BridgePorts_4002(
			Bridge source) {
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		for (Iterator<?> destinations = source.getBridgePorts().iterator(); destinations
				.hasNext();) {
			Interface destination = (Interface) destinations.next();
			result.add(new LinuxnetconfLinkDescriptor(source, destination,
					LinuxnetconfElementTypes.BridgeBridgePorts_4002,
					BridgeBridgePortsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LinuxnetconfLinkDescriptor> getOutgoingFeatureModelFacetLinks_VlanOwner_Vlans_4003(
			VlanOwner source) {
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		for (Iterator<?> destinations = source.getVlans().iterator(); destinations
				.hasNext();) {
			VlanInterface destination = (VlanInterface) destinations.next();
			result.add(new LinuxnetconfLinkDescriptor(source, destination,
					LinuxnetconfElementTypes.VlanOwnerVlans_4003,
					VlanOwnerVlansEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LinuxnetconfLinkDescriptor> getOutgoingFeatureModelFacetLinks_Interface_Subinterfaces_4004(
			Interface source) {
		LinkedList<LinuxnetconfLinkDescriptor> result = new LinkedList<LinuxnetconfLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubinterfaces().iterator(); destinations
				.hasNext();) {
			SubInterface destination = (SubInterface) destinations.next();
			result.add(new LinuxnetconfLinkDescriptor(source, destination,
					LinuxnetconfElementTypes.InterfaceSubinterfaces_4004,
					InterfaceSubinterfacesEditPart.VISUAL_ID));
		}
		return result;
	}

}
