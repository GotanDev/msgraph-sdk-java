// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintUsageByUser;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Usage By User Request.
 */
public interface IPrintUsageByUserRequest extends IHttpRequest {

    /**
     * Gets the PrintUsageByUser from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PrintUsageByUser> callback);

    /**
     * Gets the PrintUsageByUser from the service
     *
     * @return the PrintUsageByUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageByUser get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PrintUsageByUser> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrintUsageByUser with a source
     *
     * @param sourcePrintUsageByUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrintUsageByUser sourcePrintUsageByUser, final ICallback<? super PrintUsageByUser> callback);

    /**
     * Patches this PrintUsageByUser with a source
     *
     * @param sourcePrintUsageByUser the source object with updates
     * @return the updated PrintUsageByUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageByUser patch(final PrintUsageByUser sourcePrintUsageByUser) throws ClientException;

    /**
     * Posts a PrintUsageByUser with a new object
     *
     * @param newPrintUsageByUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrintUsageByUser newPrintUsageByUser, final ICallback<? super PrintUsageByUser> callback);

    /**
     * Posts a PrintUsageByUser with a new object
     *
     * @param newPrintUsageByUser the new object to create
     * @return the created PrintUsageByUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageByUser post(final PrintUsageByUser newPrintUsageByUser) throws ClientException;

    /**
     * Posts a PrintUsageByUser with a new object
     *
     * @param newPrintUsageByUser the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PrintUsageByUser newPrintUsageByUser, final ICallback<? super PrintUsageByUser> callback);

    /**
     * Posts a PrintUsageByUser with a new object
     *
     * @param newPrintUsageByUser the object to create/update
     * @return the created PrintUsageByUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageByUser put(final PrintUsageByUser newPrintUsageByUser) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintUsageByUserRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintUsageByUserRequest expand(final String value);

}
