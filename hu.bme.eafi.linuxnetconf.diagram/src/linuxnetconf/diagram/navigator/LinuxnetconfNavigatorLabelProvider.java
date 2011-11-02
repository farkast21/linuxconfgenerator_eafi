package linuxnetconf.diagram.navigator;

import linuxnetconf.BondingInterface;
import linuxnetconf.Bridge;
import linuxnetconf.EthernetInterface;
import linuxnetconf.SubInterface;
import linuxnetconf.VlanInterface;
import linuxnetconf.diagram.edit.parts.BondingInterfaceEditPart;
import linuxnetconf.diagram.edit.parts.BondingInterfaceSlavesEditPart;
import linuxnetconf.diagram.edit.parts.BridgeBridgePortsEditPart;
import linuxnetconf.diagram.edit.parts.BridgeEditPart;
import linuxnetconf.diagram.edit.parts.EthernetInterfaceEditPart;
import linuxnetconf.diagram.edit.parts.InterfaceSubinterfacesEditPart;
import linuxnetconf.diagram.edit.parts.ServerComputerEditPart;
import linuxnetconf.diagram.edit.parts.SubInterfaceEditPart;
import linuxnetconf.diagram.edit.parts.VlanInterfaceEditPart;
import linuxnetconf.diagram.edit.parts.VlanOwnerVlansEditPart;
import linuxnetconf.diagram.part.LinuxnetconfDiagramEditorPlugin;
import linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry;
import linuxnetconf.diagram.providers.LinuxnetconfElementTypes;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class LinuxnetconfNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		LinuxnetconfDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		LinuxnetconfDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof LinuxnetconfNavigatorItem
				&& !isOwnView(((LinuxnetconfNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof LinuxnetconfNavigatorGroup) {
			LinuxnetconfNavigatorGroup group = (LinuxnetconfNavigatorGroup) element;
			return LinuxnetconfDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof LinuxnetconfNavigatorItem) {
			LinuxnetconfNavigatorItem navigatorItem = (LinuxnetconfNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (LinuxnetconfVisualIDRegistry.getVisualID(view)) {
		case VlanInterfaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://linuxnetconf/1.0?VlanInterface", LinuxnetconfElementTypes.VlanInterface_2004); //$NON-NLS-1$
		case SubInterfaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://linuxnetconf/1.0?SubInterface", LinuxnetconfElementTypes.SubInterface_2002); //$NON-NLS-1$
		case BondingInterfaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://linuxnetconf/1.0?BondingInterface", LinuxnetconfElementTypes.BondingInterface_2005); //$NON-NLS-1$
		case EthernetInterfaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://linuxnetconf/1.0?EthernetInterface", LinuxnetconfElementTypes.EthernetInterface_2003); //$NON-NLS-1$
		case InterfaceSubinterfacesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://linuxnetconf/1.0?Interface?subinterfaces", LinuxnetconfElementTypes.InterfaceSubinterfaces_4004); //$NON-NLS-1$
		case ServerComputerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://linuxnetconf/1.0?ServerComputer", LinuxnetconfElementTypes.ServerComputer_1000); //$NON-NLS-1$
		case BridgeBridgePortsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://linuxnetconf/1.0?Bridge?bridgePorts", LinuxnetconfElementTypes.BridgeBridgePorts_4002); //$NON-NLS-1$
		case VlanOwnerVlansEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://linuxnetconf/1.0?VlanOwner?vlans", LinuxnetconfElementTypes.VlanOwnerVlans_4003); //$NON-NLS-1$
		case BondingInterfaceSlavesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://linuxnetconf/1.0?BondingInterface?slaves", LinuxnetconfElementTypes.BondingInterfaceSlaves_4001); //$NON-NLS-1$
		case BridgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://linuxnetconf/1.0?Bridge", LinuxnetconfElementTypes.Bridge_2001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = LinuxnetconfDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& LinuxnetconfElementTypes.isKnownElementType(elementType)) {
			image = LinuxnetconfElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof LinuxnetconfNavigatorGroup) {
			LinuxnetconfNavigatorGroup group = (LinuxnetconfNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof LinuxnetconfNavigatorItem) {
			LinuxnetconfNavigatorItem navigatorItem = (LinuxnetconfNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (LinuxnetconfVisualIDRegistry.getVisualID(view)) {
		case VlanInterfaceEditPart.VISUAL_ID:
			return getVlanInterface_2004Text(view);
		case SubInterfaceEditPart.VISUAL_ID:
			return getSubInterface_2002Text(view);
		case BondingInterfaceEditPart.VISUAL_ID:
			return getBondingInterface_2005Text(view);
		case EthernetInterfaceEditPart.VISUAL_ID:
			return getEthernetInterface_2003Text(view);
		case InterfaceSubinterfacesEditPart.VISUAL_ID:
			return getInterfaceSubinterfaces_4004Text(view);
		case ServerComputerEditPart.VISUAL_ID:
			return getServerComputer_1000Text(view);
		case BridgeBridgePortsEditPart.VISUAL_ID:
			return getBridgeBridgePorts_4002Text(view);
		case VlanOwnerVlansEditPart.VISUAL_ID:
			return getVlanOwnerVlans_4003Text(view);
		case BondingInterfaceSlavesEditPart.VISUAL_ID:
			return getBondingInterfaceSlaves_4001Text(view);
		case BridgeEditPart.VISUAL_ID:
			return getBridge_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getVlanInterface_2004Text(View view) {
		VlanInterface domainModelElement = (VlanInterface) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getConfigType());
		} else {
			LinuxnetconfDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSubInterface_2002Text(View view) {
		SubInterface domainModelElement = (SubInterface) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getConfigType());
		} else {
			LinuxnetconfDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBondingInterface_2005Text(View view) {
		BondingInterface domainModelElement = (BondingInterface) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getConfigType());
		} else {
			LinuxnetconfDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEthernetInterface_2003Text(View view) {
		EthernetInterface domainModelElement = (EthernetInterface) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getConfigType());
		} else {
			LinuxnetconfDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInterfaceSubinterfaces_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getServerComputer_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBridgeBridgePorts_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getVlanOwnerVlans_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBondingInterfaceSlaves_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBridge_2001Text(View view) {
		Bridge domainModelElement = (Bridge) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getConfigType());
		} else {
			LinuxnetconfDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ServerComputerEditPart.MODEL_ID
				.equals(LinuxnetconfVisualIDRegistry.getModelID(view));
	}

}
