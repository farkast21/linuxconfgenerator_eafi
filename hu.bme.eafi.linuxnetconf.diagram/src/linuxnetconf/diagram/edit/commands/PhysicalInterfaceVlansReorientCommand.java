package linuxnetconf.diagram.edit.commands;

/**
 * @generated
 */
public class PhysicalInterfaceVlansReorientCommand extends org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {

	/**
 * @generated
 */
	private final int reorientDirection;

	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject referenceOwner;

	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject oldEnd;

	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject newEnd;

	/**
 * @generated
 */
	public PhysicalInterfaceVlansReorientCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}
	
	/**
 * @generated
 */
	public boolean canExecute() {
			if (false == referenceOwner instanceof linuxnetconf.PhysicalInterface) {
		return false;
	}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
 * @generated
 */
	protected boolean canReorientSource() {
			if (!(oldEnd instanceof linuxnetconf.VlanInterface && newEnd instanceof linuxnetconf.PhysicalInterface)) {
		return false;
	}
	return linuxnetconf.diagram.edit.policies.LinuxnetconfBaseItemSemanticEditPolicy.getLinkConstraints().canExistPhysicalInterfaceVlans_4003(getNewSource(), getOldTarget());
	}

	/**
 * @generated
 */
	protected boolean canReorientTarget() {
			if (!(oldEnd instanceof linuxnetconf.VlanInterface && newEnd instanceof linuxnetconf.VlanInterface)) {
		return false;
	}
	return linuxnetconf.diagram.edit.policies.LinuxnetconfBaseItemSemanticEditPolicy.getLinkConstraints().canExistPhysicalInterfaceVlans_4003(getOldSource(), getNewTarget());
	}
	
	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(
			org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info)
			throws org.eclipse.core.commands.ExecutionException {
		if (!canExecute()) {
			throw new org.eclipse.core.commands.ExecutionException("Invalid arguments in reorient link command");  //$NON-NLS-1$
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientSource() throws org.eclipse.core.commands.ExecutionException {
				getOldSource().getVlans().remove(getOldTarget());
	getNewSource().getVlans().add(getOldTarget());
	return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientTarget() throws org.eclipse.core.commands.ExecutionException {
				getOldSource().getVlans().remove(getOldTarget());
	getOldSource().getVlans().add(getNewTarget());
	return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(referenceOwner);
	}
			
	/**
 * @generated
 */
	protected linuxnetconf.PhysicalInterface getOldSource() {
		return (linuxnetconf.PhysicalInterface) referenceOwner;
	}
	
	/**
 * @generated
 */
	protected linuxnetconf.PhysicalInterface getNewSource() {
		return (linuxnetconf.PhysicalInterface) newEnd;
	}
	
	/**
 * @generated
 */
	protected linuxnetconf.VlanInterface getOldTarget() {
		return (linuxnetconf.VlanInterface) oldEnd;
	}
	
	/**
 * @generated
 */
	protected linuxnetconf.VlanInterface getNewTarget() {
		return (linuxnetconf.VlanInterface) newEnd;
	}
}
