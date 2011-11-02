package linuxnetconf.diagram.edit.policies;

import linuxnetconf.diagram.providers.LinuxnetconfElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class VlanOwnerVlansItemSemanticEditPolicy extends
		LinuxnetconfBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public VlanOwnerVlansItemSemanticEditPolicy() {
		super(LinuxnetconfElementTypes.VlanOwnerVlans_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
