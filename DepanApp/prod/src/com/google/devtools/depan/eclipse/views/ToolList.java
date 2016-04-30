/*
 * Copyright 2007 The Depan Project Authors
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

package com.google.devtools.depan.eclipse.views;

import com.google.devtools.depan.eclipse.views.tools.CollapseTool;
import com.google.devtools.depan.eclipse.views.tools.EdgeEditorTool;
import com.google.devtools.depan.eclipse.views.tools.InformationsTool;
import com.google.devtools.depan.eclipse.views.tools.NodeEditorTool;
import com.google.devtools.depan.eclipse.views.tools.RelationPropertyTool;
import com.google.devtools.depan.eclipse.views.tools.RelationVisibleTool;
import com.google.devtools.depan.eclipse.views.tools.ScaleTool;
import com.google.devtools.depan.eclipse.views.tools.SelectionEditorTool;
import com.google.devtools.depan.eclipse.views.tools.SubLayoutTool;
import com.google.devtools.depan.remap_doc.ui.editors.RefactorTool;

/**
 * @author ycoppel@google.com (Yohann Coppel)
 */
public final class ToolList {

  private ToolList() { }

  public static Tool[] tools = new Tool[] {
    new ScaleTool(),
    new CollapseTool(),
    new RelationVisibleTool(),
    new RelationPropertyTool(),
    new NodeEditorTool(),
    new EdgeEditorTool(),
    new SelectionEditorTool(),
    new SubLayoutTool(),
    new RefactorTool(),
    new InformationsTool()
  };
}
