package linuxnetconf.diagram.providers;

/**
 * @generated
 */
public class LinuxnetconfParserProvider extends org.eclipse.gmf.runtime.common.core.service.AbstractProvider implements org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider {
	
	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser ethernetInterfaceName_5001Parser;

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser getEthernetInterfaceName_5001Parser() {
		if (ethernetInterfaceName_5001Parser == null) {
			org.eclipse.emf.ecore.EAttribute[] features = new org.eclipse.emf.ecore.EAttribute[] {
				linuxnetconf.LinuxnetconfPackage.eINSTANCE.getNetconfElement_Name()
			};
				linuxnetconf.diagram.parsers.MessageFormatParser parser = new linuxnetconf.diagram.parsers.MessageFormatParser(features);
								ethernetInterfaceName_5001Parser = parser;
		}
		return ethernetInterfaceName_5001Parser;
	}

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser bondingInterfaceName_5002Parser;

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser getBondingInterfaceName_5002Parser() {
		if (bondingInterfaceName_5002Parser == null) {
			org.eclipse.emf.ecore.EAttribute[] features = new org.eclipse.emf.ecore.EAttribute[] {
				linuxnetconf.LinuxnetconfPackage.eINSTANCE.getNetconfElement_Name()
			};
				linuxnetconf.diagram.parsers.MessageFormatParser parser = new linuxnetconf.diagram.parsers.MessageFormatParser(features);
								bondingInterfaceName_5002Parser = parser;
		}
		return bondingInterfaceName_5002Parser;
	}

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser staticIPConfigIpAddress_5003Parser;

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser getStaticIPConfigIpAddress_5003Parser() {
		if (staticIPConfigIpAddress_5003Parser == null) {
			org.eclipse.emf.ecore.EAttribute[] features = new org.eclipse.emf.ecore.EAttribute[] {
				linuxnetconf.LinuxnetconfPackage.eINSTANCE.getStaticIPConfig_IpAddress()
			};
				linuxnetconf.diagram.parsers.MessageFormatParser parser = new linuxnetconf.diagram.parsers.MessageFormatParser(features);
								staticIPConfigIpAddress_5003Parser = parser;
		}
		return staticIPConfigIpAddress_5003Parser;
	}

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser vlanInterfaceName_5004Parser;

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser getVlanInterfaceName_5004Parser() {
		if (vlanInterfaceName_5004Parser == null) {
			org.eclipse.emf.ecore.EAttribute[] features = new org.eclipse.emf.ecore.EAttribute[] {
				linuxnetconf.LinuxnetconfPackage.eINSTANCE.getNetconfElement_Name()
			};
				linuxnetconf.diagram.parsers.MessageFormatParser parser = new linuxnetconf.diagram.parsers.MessageFormatParser(features);
								vlanInterfaceName_5004Parser = parser;
		}
		return vlanInterfaceName_5004Parser;
	}

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser bridgeName_5005Parser;

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser getBridgeName_5005Parser() {
		if (bridgeName_5005Parser == null) {
			org.eclipse.emf.ecore.EAttribute[] features = new org.eclipse.emf.ecore.EAttribute[] {
				linuxnetconf.LinuxnetconfPackage.eINSTANCE.getNetconfElement_Name()
			};
				linuxnetconf.diagram.parsers.MessageFormatParser parser = new linuxnetconf.diagram.parsers.MessageFormatParser(features);
								bridgeName_5005Parser = parser;
		}
		return bridgeName_5005Parser;
	}

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser subInterfaceName_5006Parser;

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser getSubInterfaceName_5006Parser() {
		if (subInterfaceName_5006Parser == null) {
			org.eclipse.emf.ecore.EAttribute[] features = new org.eclipse.emf.ecore.EAttribute[] {
				linuxnetconf.LinuxnetconfPackage.eINSTANCE.getNetconfElement_Name()
			};
				linuxnetconf.diagram.parsers.MessageFormatParser parser = new linuxnetconf.diagram.parsers.MessageFormatParser(features);
								subInterfaceName_5006Parser = parser;
		}
		return subInterfaceName_5006Parser;
	}

	
	

		/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.ui.services.parser.IParser getParser(int visualID) {
		switch (visualID) {
			case linuxnetconf.diagram.edit.parts.EthernetInterfaceNameEditPart.VISUAL_ID: return getEthernetInterfaceName_5001Parser();
	case linuxnetconf.diagram.edit.parts.BondingInterfaceNameEditPart.VISUAL_ID: return getBondingInterfaceName_5002Parser();
	case linuxnetconf.diagram.edit.parts.StaticIPConfigIpAddressEditPart.VISUAL_ID: return getStaticIPConfigIpAddress_5003Parser();
	case linuxnetconf.diagram.edit.parts.VlanInterfaceNameEditPart.VISUAL_ID: return getVlanInterfaceName_5004Parser();
	case linuxnetconf.diagram.edit.parts.BridgeNameEditPart.VISUAL_ID: return getBridgeName_5005Parser();
	case linuxnetconf.diagram.edit.parts.SubInterfaceNameEditPart.VISUAL_ID: return getSubInterfaceName_5006Parser();
						}
		return null;
	}
		/**
 * Utility method that consults ParserService
 * @generated
 */
	public static org.eclipse.gmf.runtime.common.ui.services.parser.IParser getParser(org.eclipse.gmf.runtime.emf.type.core.IElementType type, org.eclipse.emf.ecore.EObject object, String parserHint) {
		return org.eclipse.gmf.runtime.common.ui.services.parser.ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}
		/**
 * @generated
 */
	public org.eclipse.gmf.runtime.common.ui.services.parser.IParser getParser(
			org.eclipse.core.runtime.IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry.getVisualID(vid));
		}
		org.eclipse.gmf.runtime.notation.View view =
				(org.eclipse.gmf.runtime.notation.View) hint.getAdapter(org.eclipse.gmf.runtime.notation.View.class);
		if (view != null) {
			return getParser(linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

		/**
 * @generated
 */
	public boolean provides(org.eclipse.gmf.runtime.common.core.service.IOperation operation) {
		if (operation instanceof org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation) {
			org.eclipse.core.runtime.IAdaptable hint =
					((org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation) operation).getHint();
			if (linuxnetconf.diagram.providers.LinuxnetconfElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

		/**
 * @generated
 */
	private static class HintAdapter extends org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter {

		/**
 * @generated
 */
		private final org.eclipse.gmf.runtime.emf.type.core.IElementType elementType;

		/**
 * @generated
 */
		public HintAdapter(org.eclipse.gmf.runtime.emf.type.core.IElementType type,
				org.eclipse.emf.ecore.EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
 * @generated
 */
		public Object getAdapter(Class adapter) {
			if (org.eclipse.gmf.runtime.emf.type.core.IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

	}
