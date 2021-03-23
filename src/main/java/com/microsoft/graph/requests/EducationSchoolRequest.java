// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationSchool;
import com.microsoft.graph.requests.AdministrativeUnitWithReferenceRequestBuilder;
import com.microsoft.graph.requests.EducationClassCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.EducationClassWithReferenceRequestBuilder;
import com.microsoft.graph.requests.EducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.EducationUserWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School Request.
 */
public class EducationSchoolRequest extends BaseRequest<EducationSchool> {
	
    /**
     * The request for the EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSchoolRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSchool.class);
    }

    /**
     * Gets the EducationSchool from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationSchool> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EducationSchool from the service
     *
     * @return the EducationSchool from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationSchool get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationSchool> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EducationSchool delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EducationSchool with a source
     *
     * @param sourceEducationSchool the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationSchool> patchAsync(@Nonnull final EducationSchool sourceEducationSchool) {
        return sendAsync(HttpMethod.PATCH, sourceEducationSchool);
    }

    /**
     * Patches this EducationSchool with a source
     *
     * @param sourceEducationSchool the source object with updates
     * @return the updated EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationSchool patch(@Nonnull final EducationSchool sourceEducationSchool) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationSchool> postAsync(@Nonnull final EducationSchool newEducationSchool) {
        return sendAsync(HttpMethod.POST, newEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the new object to create
     * @return the created EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationSchool post(@Nonnull final EducationSchool newEducationSchool) throws ClientException {
        return send(HttpMethod.POST, newEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationSchool> putAsync(@Nonnull final EducationSchool newEducationSchool) {
        return sendAsync(HttpMethod.PUT, newEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the object to create/update
     * @return the created EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationSchool put(@Nonnull final EducationSchool newEducationSchool) throws ClientException {
        return send(HttpMethod.PUT, newEducationSchool);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EducationSchoolRequest select(@Nonnull final String value) {
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
     public EducationSchoolRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
