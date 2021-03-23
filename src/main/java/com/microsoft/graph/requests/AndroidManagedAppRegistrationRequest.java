// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidManagedAppRegistration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed App Registration Request.
 */
public class AndroidManagedAppRegistrationRequest extends BaseRequest<AndroidManagedAppRegistration> {
	
    /**
     * The request for the AndroidManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedAppRegistrationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidManagedAppRegistration.class);
    }

    /**
     * Gets the AndroidManagedAppRegistration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedAppRegistration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidManagedAppRegistration from the service
     *
     * @return the AndroidManagedAppRegistration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedAppRegistration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedAppRegistration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidManagedAppRegistration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidManagedAppRegistration with a source
     *
     * @param sourceAndroidManagedAppRegistration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedAppRegistration> patchAsync(@Nonnull final AndroidManagedAppRegistration sourceAndroidManagedAppRegistration) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidManagedAppRegistration);
    }

    /**
     * Patches this AndroidManagedAppRegistration with a source
     *
     * @param sourceAndroidManagedAppRegistration the source object with updates
     * @return the updated AndroidManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedAppRegistration patch(@Nonnull final AndroidManagedAppRegistration sourceAndroidManagedAppRegistration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidManagedAppRegistration);
    }

    /**
     * Creates a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedAppRegistration> postAsync(@Nonnull final AndroidManagedAppRegistration newAndroidManagedAppRegistration) {
        return sendAsync(HttpMethod.POST, newAndroidManagedAppRegistration);
    }

    /**
     * Creates a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the new object to create
     * @return the created AndroidManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedAppRegistration post(@Nonnull final AndroidManagedAppRegistration newAndroidManagedAppRegistration) throws ClientException {
        return send(HttpMethod.POST, newAndroidManagedAppRegistration);
    }

    /**
     * Creates a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedAppRegistration> putAsync(@Nonnull final AndroidManagedAppRegistration newAndroidManagedAppRegistration) {
        return sendAsync(HttpMethod.PUT, newAndroidManagedAppRegistration);
    }

    /**
     * Creates a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the object to create/update
     * @return the created AndroidManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedAppRegistration put(@Nonnull final AndroidManagedAppRegistration newAndroidManagedAppRegistration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidManagedAppRegistration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidManagedAppRegistrationRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public AndroidManagedAppRegistrationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
