package linuxnetconf.diagram.edit.parts;

/**
 * @generated
 */
public class NetconfElementIpconfigEditPart extends org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart 	implements org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart {

			/**
 * @generated
 */
	public static final int VISUAL_ID = 4002;
	
		/**
 * @generated
 */
	public NetconfElementIpconfigEditPart(org.eclipse.gmf.runtime.notation.View view) {
		super(view);
	}
	
		/**
 * @generated
 */
	protected void createDefaultEditPolicies() {
			super.createDefaultEditPolicies();
			installEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.SEMANTIC_ROLE, new linuxnetconf.diagram.edit.policies.NetconfElementIpconfigItemSemanticEditPolicy());
				}

	

	

	

	
	
		/**
 * Creates figure for this edit part.
 * 
 * Body of this method does not depend on settings in generation model
 * so you may safely remove <i>generated</i> tag and modify it.
 * 
 * @generated
 */
	
	protected org.eclipse.draw2d.Connection createConnectionFigure() {
		return new BondingInterfaceIpconfigFigure();
	}

	/**
 * @generated
 */
	public BondingInterfaceIpconfigFigure getPrimaryShape() {
		return (BondingInterfaceIpconfigFigure) getFigure();
	}

	
/**
 * @generated
 */
public class BondingInterfaceIpconfigFigure extends org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx {




	/**
	 * @generated
	 */
	public BondingInterfaceIpconfigFigure() {
		
		setTargetDecoration(createTargetDecoration());
	}

	/**
	 * @generated
	 */
	private org.eclipse.draw2d.RotatableDecoration createTargetDecoration() {
		org.eclipse.draw2d.PolylineDecoration df = new org.eclipse.draw2d.PolylineDecoration();
		return df;
	}




}


	
	}
