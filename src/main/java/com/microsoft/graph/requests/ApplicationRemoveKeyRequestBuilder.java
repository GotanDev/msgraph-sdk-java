// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ApplicationRemoveKeyRequest;
import com.microsoft.graph.models.Application;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ApplicationRemoveKeyParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Remove Key Request Builder.
 */
public class ApplicationRemoveKeyRequestBuilder extends BaseActionRequestBuilder<Application> {

    /**
     * The request builder for this ApplicationRemoveKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationRemoveKeyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ApplicationRemoveKeyParameterSet body;
    /**
     * The request builder for this ApplicationRemoveKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ApplicationRemoveKeyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ApplicationRemoveKeyParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ApplicationRemoveKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the ApplicationRemoveKeyRequest instance
     */
    @Nonnull
    public ApplicationRemoveKeyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ApplicationRemoveKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ApplicationRemoveKeyRequest instance
     */
    @Nonnull
    public ApplicationRemoveKeyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ApplicationRemoveKeyRequest request = new ApplicationRemoveKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}