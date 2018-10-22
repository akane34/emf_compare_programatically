package co.edu.uniandes;


import com.google.common.base.Predicate;
/*******************************************************************************
 * Copyright (c) 2013, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.MatchResource;
import org.eclipse.emf.compare.ResourceAttachmentChange;
import org.eclipse.emf.compare.rcp.ui.internal.structuremergeviewer.groups.impl.BasicDifferenceGroupImpl;
import org.eclipse.emf.compare.rcp.ui.internal.structuremergeviewer.groups.impl.ByResourceGroupProvider;
import org.eclipse.emf.compare.rcp.ui.structuremergeviewer.groups.AbstractDifferenceGroupProvider;
import org.eclipse.emf.compare.rcp.ui.structuremergeviewer.groups.IDifferenceGroup;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.GCData;
import org.eclipse.swt.graphics.Image;

/**
 * This implementation of a
 * {@link org.eclipse.emf.compare.rcp.ui.structuremergeviewer.groups.IDifferenceGroupProvider} will be used to
 * group the differences by their Resource.
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikael Barbero</a>
 * @since 4.0
 */
public class ByResourceGroupAkane extends ByResourceGroupProvider {

	protected Image image;
	/**
	 * Specialized {@link BasicDifferenceGroupImpl} for Resources.
	 * 
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikael Barbero</a>
	 */
	public static class ResourceGroup extends BasicDifferenceGroupImpl2 {
		private Set<Match> roots;

		/**
		 * {@inheritDoc}.
		 * 
		 * @see org.eclipse.emf.compare.rcp.ui.internal.structuremergeviewer.groups.impl.BasicDifferenceGroupImpl#BasicDifferenceGroupImpl(org.eclipse.emf.compare.Comparison)
		 */
		public ResourceGroup(Comparison comparison, String name, Image image, ECrossReferenceAdapter crossReferenceAdapter) {			
			super(comparison, Predicates.<Diff> alwaysTrue(), name, image, crossReferenceAdapter);			
		}

		@Override
		public void buildSubTree() {
			// Prepare our "roots" list
			roots = new LinkedHashSet<Match>();
			for (Match match : getComparison().getMatches()) {
				recursiveFindRoots(match);
			}
			super.buildSubTree();
		}

		private void recursiveFindRoots(Match match) {
			if (hasRootSide(match)) {
				roots.add(match);
			}
			for (Match subMatch : match.getSubmatches()) {
				recursiveFindRoots(subMatch);
			}
		}

		/**
		 * Checks if the given match has a side which is the root of its resource.
		 * 
		 * @param match
		 *            The match.
		 * @return <code>true</code> if this match has a "root" side (even if its the root of a fragment),
		 *         <code>false</code> otherwise.
		 */
		private boolean hasRootSide(Match match) {
			boolean hasRoot = match.getLeft() instanceof InternalEObject
					&& ((InternalEObject)match.getLeft()).eDirectResource() != null;
			hasRoot = hasRoot || match.getRight() instanceof InternalEObject
					&& ((InternalEObject)match.getRight()).eDirectResource() != null;
			hasRoot = hasRoot || match.getOrigin() instanceof InternalEObject
					&& ((InternalEObject)match.getOrigin()).eDirectResource() != null;
			return hasRoot;
		}		

		/**
		 * Check if the resource of the given object as the same uri as the given uri.
		 * 
		 * @param eObject
		 *            the given object.
		 * @param uri
		 *            the given uri.
		 * @return true if the resource of the given object as the same uri as the given uri, false otherwise.
		 */
		private boolean isUnderResourceWithURI(EObject eObject, String uri) {
			if (eObject != null && uri != null) {
				final Resource resource = eObject.eResource();
				return resource != null && uri.equals(resource.getURI().toString());
			}
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.rcp.ui.internal.structuremergeviewer.groups.impl.AbstractBuildingDifferenceGroupProvider#buildGroups(org.eclipse.emf.compare.Comparison)
	 */
	@Override
	protected Collection<? extends IDifferenceGroup> buildGroups(Comparison comparison2) {
		Device device = new Device() {
			
			@Override
			public long internal_new_GC(GCData data) {
				// TODO Auto-generated method stub
				return 1;
			}
			
			@Override
			public void internal_dispose_GC(long hDC, GCData data) {
				// TODO Auto-generated method stub
				
			}
		};
		image = new Image(device, "D:\\Java Projects\\emf_compare_programatically\\icons\\full\\toolb16\\group.gif");
		
		ResourceGroup group = new ResourceGroup(comparison2, "", image, getCrossReferenceAdapter());
		group.buildSubTree();
		return ImmutableList.of(group);
	}
}

