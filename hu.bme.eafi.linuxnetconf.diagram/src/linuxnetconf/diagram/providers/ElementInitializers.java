package linuxnetconf.diagram.providers;

import linuxnetconf.diagram.part.LinuxnetconfDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = LinuxnetconfDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			LinuxnetconfDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
