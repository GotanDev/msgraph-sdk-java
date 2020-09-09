// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChangeTrackedEntity;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Change Tracked Entity Request.
 */
public class ChangeTrackedEntityRequest extends BaseRequest implements IChangeTrackedEntityRequest {
	
    /**
     * The request for the ChangeTrackedEntity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ChangeTrackedEntityRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends ChangeTrackedEntity> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ChangeTrackedEntity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChangeTrackedEntityRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChangeTrackedEntity.class);
    }

    /**
     * Gets the ChangeTrackedEntity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ChangeTrackedEntity> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ChangeTrackedEntity from the service
     *
     * @return the ChangeTrackedEntity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChangeTrackedEntity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ChangeTrackedEntity> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ChangeTrackedEntity with a source
     *
     * @param sourceChangeTrackedEntity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ChangeTrackedEntity sourceChangeTrackedEntity, final ICallback<ChangeTrackedEntity> callback) {
        send(HttpMethod.PATCH, callback, sourceChangeTrackedEntity);
    }

    /**
     * Patches this ChangeTrackedEntity with a source
     *
     * @param sourceChangeTrackedEntity the source object with updates
     * @return the updated ChangeTrackedEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChangeTrackedEntity patch(final ChangeTrackedEntity sourceChangeTrackedEntity) throws ClientException {
        return send(HttpMethod.PATCH, sourceChangeTrackedEntity);
    }

    /**
     * Creates a ChangeTrackedEntity with a new object
     *
     * @param newChangeTrackedEntity the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ChangeTrackedEntity newChangeTrackedEntity, final ICallback<ChangeTrackedEntity> callback) {
        send(HttpMethod.POST, callback, newChangeTrackedEntity);
    }

    /**
     * Creates a ChangeTrackedEntity with a new object
     *
     * @param newChangeTrackedEntity the new object to create
     * @return the created ChangeTrackedEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChangeTrackedEntity post(final ChangeTrackedEntity newChangeTrackedEntity) throws ClientException {
        return send(HttpMethod.POST, newChangeTrackedEntity);
    }

    /**
     * Creates a ChangeTrackedEntity with a new object
     *
     * @param newChangeTrackedEntity the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ChangeTrackedEntity newChangeTrackedEntity, final ICallback<ChangeTrackedEntity> callback) {
        send(HttpMethod.PUT, callback, newChangeTrackedEntity);
    }

    /**
     * Creates a ChangeTrackedEntity with a new object
     *
     * @param newChangeTrackedEntity the object to create/update
     * @return the created ChangeTrackedEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChangeTrackedEntity put(final ChangeTrackedEntity newChangeTrackedEntity) throws ClientException {
        return send(HttpMethod.PUT, newChangeTrackedEntity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IChangeTrackedEntityRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ChangeTrackedEntityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IChangeTrackedEntityRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ChangeTrackedEntityRequest)this;
     }

}

