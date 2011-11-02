package linuxnetconf.diagram.part;

import linuxnetconf.LinuxnetconfPackage;
import linuxnetconf.ServerComputer;
import linuxnetconf.diagram.edit.parts.BondingInterfaceEditPart;
import linuxnetconf.diagram.edit.parts.BridgeEditPart;
import linuxnetconf.diagram.edit.parts.EthernetInterfaceEditPart;
import linuxnetconf.diagram.edit.parts.ServerComputerEditPart;
import linuxnetconf.diagram.edit.parts.SubInterfaceEditPart;
import linuxnetconf.diagram.edit.parts.VlanInterfaceEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class LinuxnetconfVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "hu.bme.eafi.linuxnetconf.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ServerComputerEditPart.MODEL_ID.equals(view.getType())) {
				return ServerComputerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				LinuxnetconfDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (LinuxnetconfPackage.eINSTANCE.getServerComputer().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ServerComputer) domainElement)) {
			return ServerComputerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry
				.getModelID(containerView);
		if (!ServerComputerEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ServerComputerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ServerComputerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ServerComputerEditPart.VISUAL_ID:
			if (LinuxnetconfPackage.eINSTANCE.getBridge().isSuperTypeOf(
					domainElement.eClass())) {
				return BridgeEditPart.VISUAL_ID;
			}
			if (LinuxnetconfPackage.eINSTANCE.getSubInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return SubInterfaceEditPart.VISUAL_ID;
			}
			if (LinuxnetconfPackage.eINSTANCE.getEthernetInterface()
					.isSuperTypeOf(domainElement.eClass())) {
				return EthernetInterfaceEditPart.VISUAL_ID;
			}
			if (LinuxnetconfPackage.eINSTANCE.getVlanInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return VlanInterfaceEditPart.VISUAL_ID;
			}
			if (LinuxnetconfPackage.eINSTANCE.getBondingInterface()
					.isSuperTypeOf(domainElement.eClass())) {
				return BondingInterfaceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry
				.getModelID(containerView);
		if (!ServerComputerEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ServerComputerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ServerComputerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ServerComputerEditPart.VISUAL_ID:
			if (BridgeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EthernetInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VlanInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BondingInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ServerComputer element) {
		return true;
	}

}
