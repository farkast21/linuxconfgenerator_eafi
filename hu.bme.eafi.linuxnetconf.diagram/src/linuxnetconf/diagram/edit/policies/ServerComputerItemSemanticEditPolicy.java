package linuxnetconf.diagram.edit.policies;

import linuxnetconf.diagram.edit.commands.BondingInterfaceCreateCommand;
import linuxnetconf.diagram.edit.commands.BridgeCreateCommand;
import linuxnetconf.diagram.edit.commands.EthernetInterfaceCreateCommand;
import linuxnetconf.diagram.edit.commands.SubInterfaceCreateCommand;
import linuxnetconf.diagram.edit.commands.VlanInterfaceCreateCommand;
import linuxnetconf.diagram.providers.LinuxnetconfElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ServerComputerItemSemanticEditPolicy extends
		LinuxnetconfBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServerComputerItemSemanticEditPolicy() {
		super(LinuxnetconfElementTypes.ServerComputer_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LinuxnetconfElementTypes.Bridge_2001 == req.getElementType()) {
			return getGEFWrapper(new BridgeCreateCommand(req));
		}
		if (LinuxnetconfElementTypes.SubInterface_2002 == req.getElementType()) {
			return getGEFWrapper(new SubInterfaceCreateCommand(req));
		}
		if (LinuxnetconfElementTypes.EthernetInterface_2003 == req
				.getElementType()) {
			return getGEFWrapper(new EthernetInterfaceCreateCommand(req));
		}
		if (LinuxnetconfElementTypes.VlanInterface_2004 == req.getElementType()) {
			return getGEFWrapper(new VlanInterfaceCreateCommand(req));
		}
		if (LinuxnetconfElementTypes.BondingInterface_2005 == req
				.getElementType()) {
			return getGEFWrapper(new BondingInterfaceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
