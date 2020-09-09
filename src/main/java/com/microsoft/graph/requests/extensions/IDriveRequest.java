// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Drive;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Drive Request.
 */
public interface IDriveRequest extends IHttpRequest {

    /**
     * Gets the Drive from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Drive> callback);

    /**
     * Gets the Drive from the service
     *
     * @return the Drive from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Drive get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Drive> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Drive with a source
     *
     * @param sourceDrive the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Drive sourceDrive, final ICallback<Drive> callback);

    /**
     * Patches this Drive with a source
     *
     * @param sourceDrive the source object with updates
     * @return the updated Drive
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Drive patch(final Drive sourceDrive) throws ClientException;

    /**
     * Posts a Drive with a new object
     *
     * @param newDrive the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Drive newDrive, final ICallback<Drive> callback);

    /**
     * Posts a Drive with a new object
     *
     * @param newDrive the new object to create
     * @return the created Drive
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Drive post(final Drive newDrive) throws ClientException;

    /**
     * Posts a Drive with a new object
     *
     * @param newDrive the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Drive newDrive, final ICallback<Drive> callback);

    /**
     * Posts a Drive with a new object
     *
     * @param newDrive the object to create/update
     * @return the created Drive
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Drive put(final Drive newDrive) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDriveRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDriveRequest expand(final String value);

}

