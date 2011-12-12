package hu.bme.eafi.linuxnetconf.diagram.extra.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class TreeConfigEditor extends TextEditor {

	private ColorManager colorManager;

	public TreeConfigEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
