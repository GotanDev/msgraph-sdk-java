// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnItemAtRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Table Column Item At Request.
 */
public interface IWorkbookTableColumnItemAtRequest {

    /**
     * Patches the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn the WorkbookTableColumn with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    void patch(WorkbookTableColumn srcWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback);

    /**
     * Patches the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn the WorkbookTableColumn with which to PATCH
     * @return the WorkbookTableColumn
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookTableColumn patch(WorkbookTableColumn srcWorkbookTableColumn) throws ClientException;

    /**
     * Puts the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn the WorkbookTableColumn to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WorkbookTableColumn srcWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback);

    /**
     * Puts the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn the WorkbookTableColumn to PUT
     * @return the WorkbookTableColumn
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     WorkbookTableColumn put(WorkbookTableColumn srcWorkbookTableColumn) throws ClientException;
    /**
     * Gets the WorkbookTableColumn
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookTableColumn> callback);

    /**
     * Gets the WorkbookTableColumn
     *
     * @return the WorkbookTableColumn
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookTableColumn get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookTableColumnItemAtRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookTableColumnItemAtRequest expand(final String value);

}
