// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Lifecycle Policy Request.
 */
public class GroupLifecyclePolicyRequest extends BaseRequest implements IGroupLifecyclePolicyRequest {
	
    /**
     * The request for the GroupLifecyclePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupLifecyclePolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupLifecyclePolicy.class);
    }

    /**
     * Gets the GroupLifecyclePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupLifecyclePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupLifecyclePolicy from the service
     *
     * @return the GroupLifecyclePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupLifecyclePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupLifecyclePolicy> callback) {
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
     * Patches this GroupLifecyclePolicy with a source
     *
     * @param sourceGroupLifecyclePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupLifecyclePolicy sourceGroupLifecyclePolicy, final ICallback<GroupLifecyclePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupLifecyclePolicy);
    }

    /**
     * Patches this GroupLifecyclePolicy with a source
     *
     * @param sourceGroupLifecyclePolicy the source object with updates
     * @return the updated GroupLifecyclePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupLifecyclePolicy patch(final GroupLifecyclePolicy sourceGroupLifecyclePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupLifecyclePolicy);
    }

    /**
     * Creates a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupLifecyclePolicy newGroupLifecyclePolicy, final ICallback<GroupLifecyclePolicy> callback) {
        send(HttpMethod.POST, callback, newGroupLifecyclePolicy);
    }

    /**
     * Creates a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the new object to create
     * @return the created GroupLifecyclePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupLifecyclePolicy post(final GroupLifecyclePolicy newGroupLifecyclePolicy) throws ClientException {
        return send(HttpMethod.POST, newGroupLifecyclePolicy);
    }

    /**
     * Creates a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GroupLifecyclePolicy newGroupLifecyclePolicy, final ICallback<GroupLifecyclePolicy> callback) {
        send(HttpMethod.PUT, callback, newGroupLifecyclePolicy);
    }

    /**
     * Creates a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the object to create/update
     * @return the created GroupLifecyclePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupLifecyclePolicy put(final GroupLifecyclePolicy newGroupLifecyclePolicy) throws ClientException {
        return send(HttpMethod.PUT, newGroupLifecyclePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupLifecyclePolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupLifecyclePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupLifecyclePolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupLifecyclePolicyRequest)this;
     }

}

