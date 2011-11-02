package linuxnetconf.diagram.edit.commands;

/**
 * @generated
 */
public class StaticIPConfigCreateCommand extends org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {

		/**
 * @generated
 */
	public StaticIPConfigCreateCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

		/**
 * FIXME: replace with setElementToEdit()
 * @generated
 */
protected org.eclipse.emf.ecore.EObject getElementToEdit() {
	org.eclipse.emf.ecore.EObject container = ((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest()).getContainer();
	if (container instanceof org.eclipse.gmf.runtime.notation.View) {
		container = ((org.eclipse.gmf.runtime.notation.View) container).getElement();
	}
	return container;
}

		/**
 * @generated
 */
	public boolean canExecute() {
		return true;

	}

		/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
			linuxnetconf.StaticIPConfig newElement = linuxnetconf.LinuxnetconfFactory.eINSTANCE.createStaticIPConfig();

	linuxnetconf.ServerComputer owner = (linuxnetconf.ServerComputer) getElementToEdit();
	owner.getIpconfigs().add(newElement);


		
		doConfigure(newElement, monitor, info);

		((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest()).setNewElement(newElement);
		return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(newElement);
	}


		/**
 * @generated
 */
	protected void doConfigure(linuxnetconf.StaticIPConfig newElement, org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = ((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest()).getElementType();
		org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest configureRequest = new org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		org.eclipse.gmf.runtime.common.core.command.ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}
	
}
