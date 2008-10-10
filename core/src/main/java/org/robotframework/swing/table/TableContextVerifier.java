/*
 * Copyright 2008 Nokia Siemens Networks Oyj
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.robotframework.swing.table;

import javax.swing.JTable;

import org.robotframework.swing.context.ContextVerifier;

/**
 * @author Heikki Hulkko
 */
public class TableContextVerifier extends ContextVerifier {
    static final String ERROR_MESSAGE =
        "To use table keywords you must first select a table as context using the 'Select Table'-keyword.";

    public TableContextVerifier() {
        super(ERROR_MESSAGE);
    }

    @Override
    protected Class[] getExpectedClasses() {
        return new Class[] { JTable.class };
    }
}