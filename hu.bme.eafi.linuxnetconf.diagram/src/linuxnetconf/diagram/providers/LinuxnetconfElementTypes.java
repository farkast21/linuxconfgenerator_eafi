package linuxnetconf.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import linuxnetconf.LinuxnetconfPackage;
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
import linuxnetconf.diagram.part.LinuxnetconfDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class LinuxnetconfElementTypes {

	/**
	 * @generated
	 */
	private LinuxnetconfElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ServerComputer_1000 = getElementType("hu.bme.eafi.linuxnetconf.diagram.ServerComputer_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Bridge_2001 = getElementType("hu.bme.eafi.linuxnetconf.diagram.Bridge_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SubInterface_2002 = getElementType("hu.bme.eafi.linuxnetconf.diagram.SubInterface_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EthernetInterface_2003 = getElementType("hu.bme.eafi.linuxnetconf.diagram.EthernetInterface_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VlanInterface_2004 = getElementType("hu.bme.eafi.linuxnetconf.diagram.VlanInterface_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BondingInterface_2005 = getElementType("hu.bme.eafi.linuxnetconf.diagram.BondingInterface_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BondingInterfaceSlaves_4001 = getElementType("hu.bme.eafi.linuxnetconf.diagram.BondingInterfaceSlaves_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BridgeBridgePorts_4002 = getElementType("hu.bme.eafi.linuxnetconf.diagram.BridgeBridgePorts_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VlanOwnerVlans_4003 = getElementType("hu.bme.eafi.linuxnetconf.diagram.VlanOwnerVlans_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InterfaceSubinterfaces_4004 = getElementType("hu.bme.eafi.linuxnetconf.diagram.InterfaceSubinterfaces_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return LinuxnetconfDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ServerComputer_1000,
					LinuxnetconfPackage.eINSTANCE.getServerComputer());

			elements.put(Bridge_2001, LinuxnetconfPackage.eINSTANCE.getBridge());

			elements.put(SubInterface_2002,
					LinuxnetconfPackage.eINSTANCE.getSubInterface());

			elements.put(EthernetInterface_2003,
					LinuxnetconfPackage.eINSTANCE.getEthernetInterface());

			elements.put(VlanInterface_2004,
					LinuxnetconfPackage.eINSTANCE.getVlanInterface());

			elements.put(BondingInterface_2005,
					LinuxnetconfPackage.eINSTANCE.getBondingInterface());

			elements.put(BondingInterfaceSlaves_4001,
					LinuxnetconfPackage.eINSTANCE.getBondingInterface_Slaves());

			elements.put(BridgeBridgePorts_4002,
					LinuxnetconfPackage.eINSTANCE.getBridge_BridgePorts());

			elements.put(VlanOwnerVlans_4003,
					LinuxnetconfPackage.eINSTANCE.getVlanOwner_Vlans());

			elements.put(InterfaceSubinterfaces_4004,
					LinuxnetconfPackage.eINSTANCE.getInterface_Subinterfaces());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ServerComputer_1000);
			KNOWN_ELEMENT_TYPES.add(Bridge_2001);
			KNOWN_ELEMENT_TYPES.add(SubInterface_2002);
			KNOWN_ELEMENT_TYPES.add(EthernetInterface_2003);
			KNOWN_ELEMENT_TYPES.add(VlanInterface_2004);
			KNOWN_ELEMENT_TYPES.add(BondingInterface_2005);
			KNOWN_ELEMENT_TYPES.add(BondingInterfaceSlaves_4001);
			KNOWN_ELEMENT_TYPES.add(BridgeBridgePorts_4002);
			KNOWN_ELEMENT_TYPES.add(VlanOwnerVlans_4003);
			KNOWN_ELEMENT_TYPES.add(InterfaceSubinterfaces_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ServerComputerEditPart.VISUAL_ID:
			return ServerComputer_1000;
		case BridgeEditPart.VISUAL_ID:
			return Bridge_2001;
		case SubInterfaceEditPart.VISUAL_ID:
			return SubInterface_2002;
		case EthernetInterfaceEditPart.VISUAL_ID:
			return EthernetInterface_2003;
		case VlanInterfaceEditPart.VISUAL_ID:
			return VlanInterface_2004;
		case BondingInterfaceEditPart.VISUAL_ID:
			return BondingInterface_2005;
		case BondingInterfaceSlavesEditPart.VISUAL_ID:
			return BondingInterfaceSlaves_4001;
		case BridgeBridgePortsEditPart.VISUAL_ID:
			return BridgeBridgePorts_4002;
		case VlanOwnerVlansEditPart.VISUAL_ID:
			return VlanOwnerVlans_4003;
		case InterfaceSubinterfacesEditPart.VISUAL_ID:
			return InterfaceSubinterfaces_4004;
		}
		return null;
	}

}
