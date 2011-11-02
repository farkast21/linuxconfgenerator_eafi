package linuxnetconf.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

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
import linuxnetconf.diagram.part.LinuxnetconfVisualIDRegistry;
import linuxnetconf.diagram.part.Messages;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class LinuxnetconfNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public LinuxnetconfNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<LinuxnetconfNavigatorItem> result = new ArrayList<LinuxnetconfNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof LinuxnetconfNavigatorGroup) {
			LinuxnetconfNavigatorGroup group = (LinuxnetconfNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof LinuxnetconfNavigatorItem) {
			LinuxnetconfNavigatorItem navigatorItem = (LinuxnetconfNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (LinuxnetconfVisualIDRegistry.getVisualID(view)) {

		case VlanOwnerVlansEditPart.VISUAL_ID: {
			LinkedList<LinuxnetconfAbstractNavigatorItem> result = new LinkedList<LinuxnetconfAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LinuxnetconfNavigatorGroup target = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_VlanOwnerVlans_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LinuxnetconfNavigatorGroup source = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_VlanOwnerVlans_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(VlanInterfaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(EthernetInterfaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BondingInterfaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BridgeEditPart.VISUAL_ID: {
			LinkedList<LinuxnetconfAbstractNavigatorItem> result = new LinkedList<LinuxnetconfAbstractNavigatorItem>();
			Node sv = (Node) view;
			LinuxnetconfNavigatorGroup outgoinglinks = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_Bridge_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BridgeBridgePortsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BondingInterfaceEditPart.VISUAL_ID: {
			LinkedList<LinuxnetconfAbstractNavigatorItem> result = new LinkedList<LinuxnetconfAbstractNavigatorItem>();
			Node sv = (Node) view;
			LinuxnetconfNavigatorGroup outgoinglinks = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_BondingInterface_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LinuxnetconfNavigatorGroup incominglinks = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_BondingInterface_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BondingInterfaceSlavesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BridgeBridgePortsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(VlanOwnerVlansEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(InterfaceSubinterfacesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SubInterfaceEditPart.VISUAL_ID: {
			LinkedList<LinuxnetconfAbstractNavigatorItem> result = new LinkedList<LinuxnetconfAbstractNavigatorItem>();
			Node sv = (Node) view;
			LinuxnetconfNavigatorGroup incominglinks = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_SubInterface_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(InterfaceSubinterfacesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case VlanInterfaceEditPart.VISUAL_ID: {
			LinkedList<LinuxnetconfAbstractNavigatorItem> result = new LinkedList<LinuxnetconfAbstractNavigatorItem>();
			Node sv = (Node) view;
			LinuxnetconfNavigatorGroup incominglinks = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_VlanInterface_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LinuxnetconfNavigatorGroup outgoinglinks = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_VlanInterface_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BridgeBridgePortsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(VlanOwnerVlansEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(InterfaceSubinterfacesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InterfaceSubinterfacesEditPart.VISUAL_ID: {
			LinkedList<LinuxnetconfAbstractNavigatorItem> result = new LinkedList<LinuxnetconfAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LinuxnetconfNavigatorGroup target = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_InterfaceSubinterfaces_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LinuxnetconfNavigatorGroup source = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_InterfaceSubinterfaces_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(SubInterfaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(EthernetInterfaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(VlanInterfaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BondingInterfaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BridgeBridgePortsEditPart.VISUAL_ID: {
			LinkedList<LinuxnetconfAbstractNavigatorItem> result = new LinkedList<LinuxnetconfAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LinuxnetconfNavigatorGroup target = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_BridgeBridgePorts_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LinuxnetconfNavigatorGroup source = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_BridgeBridgePorts_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(EthernetInterfaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(VlanInterfaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BondingInterfaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BridgeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BondingInterfaceSlavesEditPart.VISUAL_ID: {
			LinkedList<LinuxnetconfAbstractNavigatorItem> result = new LinkedList<LinuxnetconfAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LinuxnetconfNavigatorGroup target = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_BondingInterfaceSlaves_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LinuxnetconfNavigatorGroup source = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_BondingInterfaceSlaves_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(EthernetInterfaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BondingInterfaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EthernetInterfaceEditPart.VISUAL_ID: {
			LinkedList<LinuxnetconfAbstractNavigatorItem> result = new LinkedList<LinuxnetconfAbstractNavigatorItem>();
			Node sv = (Node) view;
			LinuxnetconfNavigatorGroup incominglinks = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_EthernetInterface_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LinuxnetconfNavigatorGroup outgoinglinks = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_EthernetInterface_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BondingInterfaceSlavesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BridgeBridgePortsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(VlanOwnerVlansEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(InterfaceSubinterfacesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ServerComputerEditPart.VISUAL_ID: {
			LinkedList<LinuxnetconfAbstractNavigatorItem> result = new LinkedList<LinuxnetconfAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			LinuxnetconfNavigatorGroup links = new LinuxnetconfNavigatorGroup(
					Messages.NavigatorGroupName_ServerComputer_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BridgeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(SubInterfaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(EthernetInterfaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(VlanInterfaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BondingInterfaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BondingInterfaceSlavesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(BridgeBridgePortsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(VlanOwnerVlansEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LinuxnetconfVisualIDRegistry
							.getType(InterfaceSubinterfacesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ServerComputerEditPart.MODEL_ID
				.equals(LinuxnetconfVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<LinuxnetconfNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<LinuxnetconfNavigatorItem> result = new ArrayList<LinuxnetconfNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new LinuxnetconfNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof LinuxnetconfAbstractNavigatorItem) {
			LinuxnetconfAbstractNavigatorItem abstractNavigatorItem = (LinuxnetconfAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
