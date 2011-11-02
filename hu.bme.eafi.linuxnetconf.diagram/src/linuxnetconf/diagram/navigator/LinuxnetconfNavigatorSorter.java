package linuxnetconf.diagram.navigator;

import linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class LinuxnetconfNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof LinuxnetconfNavigatorItem) {
			LinuxnetconfNavigatorItem item = (LinuxnetconfNavigatorItem) element;
			return LinuxnetconfVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
