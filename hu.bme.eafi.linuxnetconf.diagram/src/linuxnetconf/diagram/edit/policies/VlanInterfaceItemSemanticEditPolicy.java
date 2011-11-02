package linuxnetconf.diagram.edit.policies;

import java.util.Iterator;

import linuxnetconf.diagram.edit.commands.BridgeBridgePortsCreateCommand;
import linuxnetconf.diagram.edit.commands.BridgeBridgePortsReorientCommand;
import linuxnetconf.diagram.edit.commands.InterfaceSubinterfacesCreateCommand;
import linuxnetconf.diagram.edit.commands.InterfaceSubinterfacesReorientCommand;
import linuxnetconf.diagram.edit.commands.VlanOwnerVlansCreateCommand;
import linuxnetconf.diagram.edit.commands.VlanOwnerVlansReorientCommand;
import linuxnetconf.diagram.edit.parts.BridgeBridgePortsEditPart;
import linuxnetconf.diagram.edit.parts.InterfaceSubinterfacesEditPart;
import linuxnetconf.diagram.edit.parts.VlanOwnerVlansEditPart;
import linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry;
import linuxnetconf.diagram.providers.LinuxnetconfElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class VlanInterfaceItemSemanticEditPolicy extends
		LinuxnetconfBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public VlanInterfaceItemSemanticEditPolicy() {
		super(LinuxnetconfElementTypes.VlanInterface_2004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (LinuxnetconfVisualIDRegistry.getVisualID(incomingLink) == BridgeBridgePortsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LinuxnetconfVisualIDRegistry.getVisualID(incomingLink) == VlanOwnerVlansEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (LinuxnetconfVisualIDRegistry.getVisualID(outgoingLink) == InterfaceSubinterfacesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (LinuxnetconfElementTypes.BridgeBridgePorts_4002 == req
				.getElementType()) {
			return null;
		}
		if (LinuxnetconfElementTypes.VlanOwnerVlans_4003 == req
				.getElementType()) {
			return null;
		}
		if (LinuxnetconfElementTypes.InterfaceSubinterfaces_4004 == req
				.getElementType()) {
			return getGEFWrapper(new InterfaceSubinterfacesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (LinuxnetconfElementTypes.BridgeBridgePorts_4002 == req
				.getElementType()) {
			return getGEFWrapper(new BridgeBridgePortsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (LinuxnetconfElementTypes.VlanOwnerVlans_4003 == req
				.getElementType()) {
			return getGEFWrapper(new VlanOwnerVlansCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (LinuxnetconfElementTypes.InterfaceSubinterfaces_4004 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case BridgeBridgePortsEditPart.VISUAL_ID:
			return getGEFWrapper(new BridgeBridgePortsReorientCommand(req));
		case VlanOwnerVlansEditPart.VISUAL_ID:
			return getGEFWrapper(new VlanOwnerVlansReorientCommand(req));
		case InterfaceSubinterfacesEditPart.VISUAL_ID:
			return getGEFWrapper(new InterfaceSubinterfacesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
