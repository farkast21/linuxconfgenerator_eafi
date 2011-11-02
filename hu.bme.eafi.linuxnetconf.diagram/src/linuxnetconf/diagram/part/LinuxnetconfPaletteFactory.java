package linuxnetconf.diagram.part;

import java.util.Collections;
import java.util.List;

import linuxnetconf.diagram.providers.LinuxnetconfElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class LinuxnetconfPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createLinuxnetconf1Group());
	}

	/**
	 * Creates "linuxnetconf" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinuxnetconf1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Linuxnetconf1Group_title);
		paletteContainer.setId("createLinuxnetconf1Group"); //$NON-NLS-1$
		paletteContainer.add(createStaticIPConfig1CreationTool());
		paletteContainer.add(createEthernetInterface2CreationTool());
		paletteContainer.add(createInterfaceSubinterfaces3CreationTool());
		paletteContainer.add(createVlanOwnerVlans4CreationTool());
		paletteContainer.add(createEthernetInterfaceBondMaster5CreationTool());
		paletteContainer.add(createBondingInterface6CreationTool());
		paletteContainer.add(createInterfaceSubinterfaces27CreationTool());
		paletteContainer.add(createVlanOwnerVlans28CreationTool());
		paletteContainer.add(createBondingInterfaceSlaves9CreationTool());
		paletteContainer.add(createVlanInterface10CreationTool());
		paletteContainer.add(createInterfaceSubinterfaces311CreationTool());
		paletteContainer.add(createBridge12CreationTool());
		paletteContainer.add(createBridgeBridgePorts13CreationTool());
		paletteContainer.add(createSubInterface14CreationTool());
		paletteContainer.add(createSubInterfaceMainInterface15CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStaticIPConfig1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StaticIPConfig1CreationTool_title,
				Messages.StaticIPConfig1CreationTool_desc,
				Collections.singletonList(LinuxnetconfElementTypes.Bridge_2001));
		entry.setId("createStaticIPConfig1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LinuxnetconfElementTypes
				.getImageDescriptor(LinuxnetconfElementTypes.Bridge_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEthernetInterface2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EthernetInterface2CreationTool_title,
				Messages.EthernetInterface2CreationTool_desc,
				Collections
						.singletonList(LinuxnetconfElementTypes.SubInterface_2002));
		entry.setId("createEthernetInterface2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LinuxnetconfElementTypes
				.getImageDescriptor(LinuxnetconfElementTypes.SubInterface_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterfaceSubinterfaces3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InterfaceSubinterfaces3CreationTool_title,
				Messages.InterfaceSubinterfaces3CreationTool_desc,
				Collections
						.singletonList(LinuxnetconfElementTypes.EthernetInterface_2003));
		entry.setId("createInterfaceSubinterfaces3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LinuxnetconfElementTypes
				.getImageDescriptor(LinuxnetconfElementTypes.EthernetInterface_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVlanOwnerVlans4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.VlanOwnerVlans4CreationTool_title,
				Messages.VlanOwnerVlans4CreationTool_desc,
				Collections
						.singletonList(LinuxnetconfElementTypes.VlanInterface_2004));
		entry.setId("createVlanOwnerVlans4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LinuxnetconfElementTypes
				.getImageDescriptor(LinuxnetconfElementTypes.VlanInterface_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEthernetInterfaceBondMaster5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EthernetInterfaceBondMaster5CreationTool_title,
				Messages.EthernetInterfaceBondMaster5CreationTool_desc,
				Collections
						.singletonList(LinuxnetconfElementTypes.BondingInterface_2005));
		entry.setId("createEthernetInterfaceBondMaster5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LinuxnetconfElementTypes
				.getImageDescriptor(LinuxnetconfElementTypes.BondingInterface_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBondingInterface6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.BondingInterface6CreationTool_title,
				Messages.BondingInterface6CreationTool_desc, null, null) {
		};
		entry.setId("createBondingInterface6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterfaceSubinterfaces27CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.InterfaceSubinterfaces27CreationTool_title,
				Messages.InterfaceSubinterfaces27CreationTool_desc, null, null) {
		};
		entry.setId("createInterfaceSubinterfaces27CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVlanOwnerVlans28CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.VlanOwnerVlans28CreationTool_title,
				Messages.VlanOwnerVlans28CreationTool_desc,
				Collections
						.singletonList(LinuxnetconfElementTypes.BondingInterfaceSlaves_4001));
		entry.setId("createVlanOwnerVlans28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LinuxnetconfElementTypes
				.getImageDescriptor(LinuxnetconfElementTypes.BondingInterfaceSlaves_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBondingInterfaceSlaves9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.BondingInterfaceSlaves9CreationTool_title,
				Messages.BondingInterfaceSlaves9CreationTool_desc,
				Collections
						.singletonList(LinuxnetconfElementTypes.BridgeBridgePorts_4002));
		entry.setId("createBondingInterfaceSlaves9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LinuxnetconfElementTypes
				.getImageDescriptor(LinuxnetconfElementTypes.BridgeBridgePorts_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVlanInterface10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.VlanInterface10CreationTool_title,
				Messages.VlanInterface10CreationTool_desc, null, null) {
		};
		entry.setId("createVlanInterface10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterfaceSubinterfaces311CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InterfaceSubinterfaces311CreationTool_title,
				Messages.InterfaceSubinterfaces311CreationTool_desc,
				Collections
						.singletonList(LinuxnetconfElementTypes.VlanOwnerVlans_4003));
		entry.setId("createInterfaceSubinterfaces311CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LinuxnetconfElementTypes
				.getImageDescriptor(LinuxnetconfElementTypes.VlanOwnerVlans_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBridge12CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Bridge12CreationTool_title,
				Messages.Bridge12CreationTool_desc,
				Collections
						.singletonList(LinuxnetconfElementTypes.InterfaceSubinterfaces_4004));
		entry.setId("createBridge12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LinuxnetconfElementTypes
				.getImageDescriptor(LinuxnetconfElementTypes.InterfaceSubinterfaces_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBridgeBridgePorts13CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.BridgeBridgePorts13CreationTool_title,
				Messages.BridgeBridgePorts13CreationTool_desc, null, null) {
		};
		entry.setId("createBridgeBridgePorts13CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubInterface14CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SubInterface14CreationTool_title,
				Messages.SubInterface14CreationTool_desc, null, null) {
		};
		entry.setId("createSubInterface14CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubInterfaceMainInterface15CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SubInterfaceMainInterface15CreationTool_title,
				Messages.SubInterfaceMainInterface15CreationTool_desc, null,
				null) {
		};
		entry.setId("createSubInterfaceMainInterface15CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
