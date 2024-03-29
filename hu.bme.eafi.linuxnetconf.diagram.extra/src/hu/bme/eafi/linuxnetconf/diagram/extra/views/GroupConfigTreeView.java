package hu.bme.eafi.linuxnetconf.diagram.extra.views;

import java.util.Set;

import linuxnetconf.CMDB;
import linuxnetconf.LinuxnetconfFactory;
import linuxnetconf.LinuxnetconfPackage;
import linuxnetconf.ServerComputer;
import linuxnetconf.ServerGroup;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IMapChangeListener;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.map.MapChangeEvent;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.databinding.viewers.TreeStructureAdvisor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class GroupConfigTreeView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "hu.bme.eafi.linuxnetconf.diagram.extra.views.GroupConfigTreeView";

	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;
	
	private CMDB cmdb;

	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	private static class TreeFactoryImpl 
	  implements IObservableFactory
	{
	  private IEMFListProperty multi = EMFProperties.multiList(
	    LinuxnetconfPackage.Literals.SERVER_GROUP__SERVERS);
	  
	    //ProjectPackage.Literals.PROJECT__SUBPROJECTS,
	    //ProjectPackage.Literals.PROJECT__COMMITTERS);

	  public IObservable createObservable(final Object target)
	  {
	    if (target instanceof IObservableList)
	    {
	      return (IObservable)target;
	    }
	    else if (target instanceof ServerGroup)
	    {
	      return multi.observe(target);
	    }

	    return null;
	  }
	}

	private static class TreeStructureAdvisorImpl 
	  extends TreeStructureAdvisor
	{
	  @Override
	  public Object getParent(Object element)
	  {
	    if (element instanceof ServerComputer)
	    {
	      return ((ServerComputer)element).getGroup();
	    }

	    return null;
	  }

	  @Override
	  public Boolean hasChildren(Object element)
	  {
	    if (element instanceof ServerGroup 
	      && (
	        ((ServerGroup)element).getServers().size() > 0 
	      )
	    )
	    {
	      return Boolean.TRUE;
	    }
	    return super.hasChildren(element);
	  }
	}
	
	private class TreeLabelProviderImpl extends StyledCellLabelProvider {
		private IMapChangeListener mapChangeListener = new IMapChangeListener() {
			public void handleMapChange(MapChangeEvent event) {
				Set<?> affectedElements = event.diff.getChangedKeys();
				if (!affectedElements.isEmpty()) {
					LabelProviderChangedEvent newEvent = new LabelProviderChangedEvent(
							TreeLabelProviderImpl.this, affectedElements.toArray());
					fireLabelProviderChanged(newEvent);
				}
			}
		};

		public TreeLabelProviderImpl(IObservableMap... attributeMaps) {
			for (int i = 0; i < attributeMaps.length; i++) {
				attributeMaps[i].addMapChangeListener(mapChangeListener);
			}
		}

		@Override
		public String getToolTipText(Object element) {
			return "#dummy#";
		}

		@Override
		public void update(ViewerCell cell) {
			if (cell.getElement() instanceof ServerGroup) {
				ServerGroup sg = (ServerGroup) cell.getElement();

				StyledString styledString = new StyledString(
						sg.getName() != null ? sg.getName() : "*noname*",
						null);
				String decoration = " (" + sg.getServers().size()
						+ " Servers)";
				styledString.append(decoration, StyledString.COUNTER_STYLER);
				cell.setText(styledString.getString());
//				cell.setImage(projectImage);
				cell.setStyleRanges(styledString.getStyleRanges());
			} else if (cell.getElement() instanceof ServerComputer) {
				ServerComputer sc = ((ServerComputer) cell.getElement());
				String value = "*noname*";
				if (sc != null) {
					value = sc.getName() ;
				}
				StyledString styledString = new StyledString(value, null);
				cell.setText(styledString.getString());
				cell.setForeground(cell.getControl().getDisplay()
						.getSystemColor(SWT.COLOR_DARK_GRAY));
//				cell.setImage(committerImage);
				cell.setStyleRanges(styledString.getStyleRanges());
			}
		}
	}
	
	
	
//	class TreeObject implements IAdaptable {
//		private String name;
//		private TreeParent parent;
//		
//		public TreeObject(String name) {
//			this.name = name;
//		}
//		public String getName() {
//			return name;
//		}
//		public void setParent(TreeParent parent) {
//			this.parent = parent;
//		}
//		public TreeParent getParent() {
//			return parent;
//		}
//		public String toString() {
//			return getName();
//		}
//		public Object getAdapter(Class key) {
//			return null;
//		}
//	}
//	
//	class TreeParent extends TreeObject {
//		private ArrayList children;
//		public TreeParent(String name) {
//			super(name);
//			children = new ArrayList();
//		}
//		public void addChild(TreeObject child) {
//			children.add(child);
//			child.setParent(this);
//		}
//		public void removeChild(TreeObject child) {
//			children.remove(child);
//			child.setParent(null);
//		}
//		public TreeObject [] getChildren() {
//			return (TreeObject [])children.toArray(new TreeObject[children.size()]);
//		}
//		public boolean hasChildren() {
//			return children.size()>0;
//		}
//	}

//	class ViewContentProvider implements IStructuredContentProvider, 
//										   ITreeContentProvider {
//		private TreeParent invisibleRoot;
//
//		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
//		}
//		public void dispose() {
//		}
//		public Object[] getElements(Object parent) {
//			if (parent.equals(getViewSite())) {
//				if (invisibleRoot==null) initialize();
//				return getChildren(invisibleRoot);
//			}
//			return getChildren(parent);
//		}
//		public Object getParent(Object child) {
//			if (child instanceof TreeObject) {
//				return ((TreeObject)child).getParent();
//			}
//			return null;
//		}
//		public Object [] getChildren(Object parent) {
//			if (parent instanceof TreeParent) {
//				return ((TreeParent)parent).getChildren();
//			}
//			return new Object[0];
//		}
//		public boolean hasChildren(Object parent) {
//			if (parent instanceof TreeParent)
//				return ((TreeParent)parent).hasChildren();
//			return false;
//		}
///*
// * We will set up a dummy model to initialize tree heararchy.
// * In a real code, you will connect to a real model and
// * expose its hierarchy.
// */
//		private void initialize() {
//			TreeObject to1 = new TreeObject("Leaf 1");
//			TreeObject to2 = new TreeObject("Leaf 2");
//			TreeObject to3 = new TreeObject("Leaf 3");
//			TreeParent p1 = new TreeParent("Parent 1");
//			p1.addChild(to1);
//			p1.addChild(to2);
//			p1.addChild(to3);
//			
//			TreeObject to4 = new TreeObject("Leaf 4");
//			TreeParent p2 = new TreeParent("Parent 2");
//			p2.addChild(to4);
//			
//			TreeParent root = new TreeParent("Root");
//			root.addChild(p1);
//			root.addChild(p2);
//			
//			invisibleRoot = new TreeParent("");
//			invisibleRoot.addChild(root);
//		}
//	}
//	class ViewLabelProvider extends CellLabelProvider {
//
//		public String getText(Object obj) {
//			return obj.toString();
//		}
//		public Image getImage(Object obj) {
//			String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
//			if (obj instanceof TreeParent)
//			   imageKey = ISharedImages.IMG_OBJ_FOLDER;
//			return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
//		}
//		@Override
//		public void update(ViewerCell cell) {
//			// TODO Auto-generated method stub
//			
//		}
//	};
//	
	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public GroupConfigTreeView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
			
		
		  ObservableListTreeContentProvider cp =
		    new ObservableListTreeContentProvider(
		      new TreeFactoryImpl(),
		      new TreeStructureAdvisorImpl()
		  );
		
		  viewer.setContentProvider(cp);

		drillDownAdapter = new DrillDownAdapter(viewer);
//		viewer.setContentProvider(new ViewContentProvider());
//		viewer.setLabelProvider(new ViewLabelProvider());
		
		IObservableSet set = cp.getKnownElements();
		  IObservableMap[] map = new IObservableMap [3];

		  map[0] = EMFProperties.value(
		    LinuxnetconfPackage.Literals.SERVER_GROUP__NAME
		  ).observeDetail(set);

		  map[1] = EMFProperties.value(
				  LinuxnetconfPackage.Literals.SERVER_GROUP__SERVERS
		  ).observeDetail(set);

		  map[2] = EMFProperties.value(
		     
		    	LinuxnetconfPackage.Literals.SERVER_COMPUTER__NAME
		      ).observeDetail(set);
//
//		  map[3] = EMFProperties.value(
//		      FeaturePath.fromList(
//		        ProjectPackage.Literals.COMMITTER_SHIP__PERSON, 
//		        ProjectPackage.Literals.PERSON__LASTNAME)
//		      ).observeDetail(set);

		  viewer.setLabelProvider(new TreeLabelProviderImpl(map));
		
		
		
		
		viewer.setSorter(new NameSorter());
		
		
//		viewer.setInput(getViewSite());
		IEMFListProperty serverGroups = EMFProperties.list(
				  LinuxnetconfPackage.Literals.CMDB__GROUPS
				);
		cmdb  = LinuxnetconfFactory.eINSTANCE.createCMDB();
		ServerGroup sgg = LinuxnetconfFactory.eINSTANCE.createServerGroup();
		sgg.setName("sg1");
		cmdb.getGroups().add(sgg);
		ServerComputer scc = LinuxnetconfFactory.eINSTANCE.createServerComputer();
		scc.setName("sc1");
		sgg.getServers().add(scc);
		viewer.setInput(serverGroups.observe(cmdb));
		
		
		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "hu.bme.eafi.linuxnetconf.diagram.extra.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				GroupConfigTreeView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Sample View",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}