	package linuxnetconf.diagram.edit.policies;

/**
 * @generated
 */
public class StaticIPConfigItemSemanticEditPolicy extends linuxnetconf.diagram.edit.policies.LinuxnetconfBaseItemSemanticEditPolicy {

		/**
 * @generated
 */
	public StaticIPConfigItemSemanticEditPolicy() {
				super(linuxnetconf.diagram.providers.LinuxnetconfElementTypes.StaticIPConfig_2003);
	}

	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDestroyElementCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest req) {
	org.eclipse.gmf.runtime.notation.View view = (org.eclipse.gmf.runtime.notation.View) getHost().getModel();
	org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand cmd = new org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand(getEditingDomain(), null);
	cmd.setTransactionNestingEnabled(false);
		for (java.util.Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
		org.eclipse.gmf.runtime.notation.Edge incomingLink = (org.eclipse.gmf.runtime.notation.Edge) it.next();
		if (linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry.getVisualID(incomingLink) == linuxnetconf.diagram.edit.parts.NetconfElementIpconfigEditPart.VISUAL_ID) {
			org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest r = new org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
			cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand(r));
			cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
			continue;
		}
	}
	org.eclipse.emf.ecore.EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
	if (annotation == null) {
		// there are indirectly referenced children, need extra commands: false
		addDestroyShortcutsCommand(cmd, view);
		// delete host element
		cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand(req));
	} else {
		cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), view));
	}
	return getGEFWrapper(cmd.reduce());
}
					
/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getCreateRelationshipCommand(
		org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest req) {
	org.eclipse.gef.commands.Command command = req.getTarget() == null ?
			getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
	return command != null ? command : super.getCreateRelationshipCommand(req);
}

/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getStartCreateRelationshipCommand(
		org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest req) {
	if (linuxnetconf.diagram.providers.LinuxnetconfElementTypes.NetconfElementIpconfig_4002 == req.getElementType()) {
		return null;
	}
	return null;
}

/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getCompleteCreateRelationshipCommand(
		org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest req) {
	if (linuxnetconf.diagram.providers.LinuxnetconfElementTypes.NetconfElementIpconfig_4002 == req.getElementType()) {
		return getGEFWrapper(new linuxnetconf.diagram.edit.commands.NetconfElementIpconfigCreateCommand(req,
					req.getSource(), req.getTarget()
			));
	}
	return null;
}
					
/**
 * Returns command to reorient EReference based link. New link target or source
 * should be the domain model element associated with this node.
 * 
 * @generated
 */
protected org.eclipse.gef.commands.Command getReorientReferenceRelationshipCommand(
		org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest req) {
	switch (getVisualID(req)) {
	case linuxnetconf.diagram.edit.parts.NetconfElementIpconfigEditPart.VISUAL_ID:
	return getGEFWrapper(new linuxnetconf.diagram.edit.commands.NetconfElementIpconfigReorientCommand(req));
	}
	return super.getReorientReferenceRelationshipCommand(req);
}
	
	}
