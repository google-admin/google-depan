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

package com.google.devtools.depan.resource_doc.eclipse.ui.persistence;

import org.eclipse.swt.widgets.Shell;

/**
 * Based on Eclipse's {@code SaveAsDialog}.
 *
 * @author <a href="leeca@pnambic.com">Lee Carver</a>
 */
public class SaveResourceDialog extends AbstractResourceDialog {

  private static final String SAVE_RESOURCE_TITLE = "Save resource";

  private static final String SAVE_RESOURCE_MSG =
      "Save resource to another location.";

  /**
   * @param parentShell
   */
  public SaveResourceDialog(Shell parentShell) {
    super(parentShell);
  }

  @Override
  protected void decorateShell(Shell shell) {
    shell.setText(SAVE_RESOURCE_TITLE);
}

  @Override
  protected void decorateDialog() {
    setTitle(SAVE_RESOURCE_TITLE);
    setMessage(SAVE_RESOURCE_MSG);
  }
}
