package linuxnetconf.diagram.edit.commands;

/**
 * @generated
 */
public class PhysicalInterfaceVlansCreateCommand extends org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {
	
	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject source;

	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject target;

	/**
 * @generated
 */
	public PhysicalInterfaceVlansCreateCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest request, org.eclipse.emf.ecore.EObject source, org.eclipse.emf.ecore.EObject target) {
		super(request.getLabel(), null, request);
			this.source = source;
	this.target = target;
	}
	
	/**
 * @generated
 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof linuxnetconf.PhysicalInterface) {
			return false;
		}
		if (target != null && false == target instanceof linuxnetconf.VlanInterface) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
			return linuxnetconf.diagram.edit.policies.LinuxnetconfBaseItemSemanticEditPolicy.getLinkConstraints().canCreatePhysicalInterfaceVlans_4003(getSource(), getTarget());
	}

	
	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
		if (!canExecute()) {
			throw new org.eclipse.core.commands.ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}
		
	if (getSource() != null && getTarget() != null) {
		getSource().getVlans().add(getTarget());	}
	return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult();

	}


	
	/**
 * @generated
 */
	protected void setElementToEdit(org.eclipse.emf.ecore.EObject element) {
		throw new UnsupportedOperationException();
	}
	
	/**
 * @generated
 */
	protected linuxnetconf.PhysicalInterface getSource() {
		return (linuxnetconf.PhysicalInterface) source;
	}

	/**
 * @generated
 */
	protected linuxnetconf.VlanInterface getTarget() {
		return (linuxnetconf.VlanInterface) target;
	}
	}
