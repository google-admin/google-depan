/*
 * Copyright 2016 The Depan Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.devtools.depan.eclipse.trees;

import com.google.devtools.depan.eclipse.ui.nodes.trees.GraphData;
import com.google.devtools.depan.eclipse.ui.nodes.trees.HierarchyRoot;
import com.google.devtools.depan.eclipse.ui.nodes.trees.SolitaryRoot;
import com.google.devtools.depan.eclipse.ui.nodes.trees.TreeDescr;
import com.google.devtools.depan.eclipse.ui.nodes.trees.ViewerRoot;
import com.google.devtools.depan.eclipse.ui.nodes.viewers.NodeViewerProvider;
import com.google.devtools.depan.edges.trees.TreeModel;
import com.google.devtools.depan.model.GraphNode;

import com.google.common.collect.Lists;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ViewerSorter;

import java.util.List;
import java.util.Set;

/**
 * Basic {@link NodeViewerProvider} for routine graph elements.
 * 
 * @author <a href="leeca@pnambic.com">Lee Carver</a>
 */
public class CollapseNodeViewProvider implements NodeViewerProvider {

  @Override
  public ViewerSorter getViewSorter() {
    return new NodeTreeSorter();
  }

  @Override
  public void addMultiActions(IMenuManager manager) {
    manager.add(new Action("collapse", IAction.AS_PUSH_BUTTON) {
    });
  }

  @Override
  public void addItemActions(IMenuManager manager, Object menuElement) {
    manager.add(new Action("push up", IAction.AS_PUSH_BUTTON) {
    });
    manager.add(new Action("push down", IAction.AS_PUSH_BUTTON) {
    });
    manager.add(new Action("uncollapse", IAction.AS_PUSH_BUTTON) {
    });
  }


  @SuppressWarnings({ "rawtypes", "unchecked" })
  public ViewerRoot buildViewerRoots() {
    List<Object> result = Lists.newArrayList();
    Set<GraphNode> solitaries = graph.getNodesSet();
    // TODO: Restore via extensible mechanism
    // if (null != treeModel) {
    //   result.add(CollapseTreeRoot.build(
    //       treeModel, provider, COLLAPSE_NODES));
    //   solitaries.removeAll(treeModel.computeNodes());
    // }
    for (TreeDescr tree : trees) {
      result.add(new HierarchyRoot(tree));
      solitaries.removeAll(tree.computeNodes());
    }
  }
}
