package linuxnetconf.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import linuxnetconf.diagram.edit.policies.BondingInterfaceItemSemanticEditPolicy;
import linuxnetconf.diagram.providers.LinuxnetconfElementTypes;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class BondingInterfaceEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public BondingInterfaceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BondingInterfaceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new BondingInterfaceFigure();
	}

	/**
	 * @generated
	 */
	public BondingInterfaceFigure getPrimaryShape() {
		return (BondingInterfaceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LinuxnetconfElementTypes.BondingInterfaceSlaves_4001);
		types.add(LinuxnetconfElementTypes.VlanOwnerVlans_4003);
		types.add(LinuxnetconfElementTypes.InterfaceSubinterfaces_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EthernetInterfaceEditPart) {
			types.add(LinuxnetconfElementTypes.BondingInterfaceSlaves_4001);
		}
		if (targetEditPart instanceof VlanInterfaceEditPart) {
			types.add(LinuxnetconfElementTypes.VlanOwnerVlans_4003);
		}
		if (targetEditPart instanceof SubInterfaceEditPart) {
			types.add(LinuxnetconfElementTypes.InterfaceSubinterfaces_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == LinuxnetconfElementTypes.BondingInterfaceSlaves_4001) {
			types.add(LinuxnetconfElementTypes.EthernetInterface_2003);
		} else if (relationshipType == LinuxnetconfElementTypes.VlanOwnerVlans_4003) {
			types.add(LinuxnetconfElementTypes.VlanInterface_2004);
		} else if (relationshipType == LinuxnetconfElementTypes.InterfaceSubinterfaces_4004) {
			types.add(LinuxnetconfElementTypes.SubInterface_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(LinuxnetconfElementTypes.BridgeBridgePorts_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == LinuxnetconfElementTypes.BridgeBridgePorts_4002) {
			types.add(LinuxnetconfElementTypes.Bridge_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class BondingInterfaceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureBondingInterfaceConfigTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBondingInterfaceConfigTypeFigure;

		/**
		 * @generated
		 */
		public BondingInterfaceFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureBondingInterfaceConfigTypeFigure = new WrappingLabel();
			fFigureBondingInterfaceConfigTypeFigure.setText("<...>");

			this.add(fFigureBondingInterfaceConfigTypeFigure);

			fFigureBondingInterfaceConfigTypeFigure = new WrappingLabel();
			fFigureBondingInterfaceConfigTypeFigure.setText("<...>");

			this.add(fFigureBondingInterfaceConfigTypeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBondingInterfaceConfigTypeFigure() {
			return fFigureBondingInterfaceConfigTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBondingInterfaceConfigTypeFigure() {
			return fFigureBondingInterfaceConfigTypeFigure;
		}

	}

}
