package linuxnetconf.diagram.edit.commands;

/**
 * @generated
 */
public class NetconfElementIpconfigReorientCommand extends org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {

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
	public NetconfElementIpconfigReorientCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest request) {
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
			if (false == referenceOwner instanceof linuxnetconf.NetconfElement) {
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
			if (!(oldEnd instanceof linuxnetconf.StaticIPConfig && newEnd instanceof linuxnetconf.NetconfElement)) {
		return false;
	}
	return linuxnetconf.diagram.edit.policies.LinuxnetconfBaseItemSemanticEditPolicy.getLinkConstraints().canExistNetconfElementIpconfig_4002(getNewSource(), getOldTarget());
	}

	/**
 * @generated
 */
	protected boolean canReorientTarget() {
			if (!(oldEnd instanceof linuxnetconf.StaticIPConfig && newEnd instanceof linuxnetconf.StaticIPConfig)) {
		return false;
	}
	return linuxnetconf.diagram.edit.policies.LinuxnetconfBaseItemSemanticEditPolicy.getLinkConstraints().canExistNetconfElementIpconfig_4002(getOldSource(), getNewTarget());
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
				getOldSource().setIpconfig(null);
	getNewSource().setIpconfig(getOldTarget());
	return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientTarget() throws org.eclipse.core.commands.ExecutionException {
				getOldSource().setIpconfig(getNewTarget());
	return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(referenceOwner);
	}
			
	/**
 * @generated
 */
	protected linuxnetconf.NetconfElement getOldSource() {
		return (linuxnetconf.NetconfElement) referenceOwner;
	}
	
	/**
 * @generated
 */
	protected linuxnetconf.NetconfElement getNewSource() {
		return (linuxnetconf.NetconfElement) newEnd;
	}
	
	/**
 * @generated
 */
	protected linuxnetconf.StaticIPConfig getOldTarget() {
		return (linuxnetconf.StaticIPConfig) oldEnd;
	}
	
	/**
 * @generated
 */
	protected linuxnetconf.StaticIPConfig getNewTarget() {
		return (linuxnetconf.StaticIPConfig) newEnd;
	}
}
