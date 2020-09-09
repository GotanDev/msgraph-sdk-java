// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidLobApp;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Lob App Request.
 */
public class AndroidLobAppRequest extends BaseRequest implements IAndroidLobAppRequest {
	
    /**
     * The request for the AndroidLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidLobAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidLobApp.class);
    }

    /**
     * Gets the AndroidLobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidLobApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidLobApp from the service
     *
     * @return the AndroidLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidLobApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidLobApp> callback) {
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
     * Patches this AndroidLobApp with a source
     *
     * @param sourceAndroidLobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidLobApp sourceAndroidLobApp, final ICallback<AndroidLobApp> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidLobApp);
    }

    /**
     * Patches this AndroidLobApp with a source
     *
     * @param sourceAndroidLobApp the source object with updates
     * @return the updated AndroidLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidLobApp patch(final AndroidLobApp sourceAndroidLobApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidLobApp);
    }

    /**
     * Creates a AndroidLobApp with a new object
     *
     * @param newAndroidLobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidLobApp newAndroidLobApp, final ICallback<AndroidLobApp> callback) {
        send(HttpMethod.POST, callback, newAndroidLobApp);
    }

    /**
     * Creates a AndroidLobApp with a new object
     *
     * @param newAndroidLobApp the new object to create
     * @return the created AndroidLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidLobApp post(final AndroidLobApp newAndroidLobApp) throws ClientException {
        return send(HttpMethod.POST, newAndroidLobApp);
    }

    /**
     * Creates a AndroidLobApp with a new object
     *
     * @param newAndroidLobApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidLobApp newAndroidLobApp, final ICallback<AndroidLobApp> callback) {
        send(HttpMethod.PUT, callback, newAndroidLobApp);
    }

    /**
     * Creates a AndroidLobApp with a new object
     *
     * @param newAndroidLobApp the object to create/update
     * @return the created AndroidLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidLobApp put(final AndroidLobApp newAndroidLobApp) throws ClientException {
        return send(HttpMethod.PUT, newAndroidLobApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidLobAppRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidLobAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidLobAppRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidLobAppRequest)this;
     }

}

