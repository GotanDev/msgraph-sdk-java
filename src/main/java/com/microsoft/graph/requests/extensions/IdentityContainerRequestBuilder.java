// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIdentityContainerRequest;
import com.microsoft.graph.requests.extensions.IdentityContainerRequest;
import com.microsoft.graph.requests.extensions.IConditionalAccessRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessRootRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Container Request Builder.
 */
public class IdentityContainerRequestBuilder extends BaseRequestBuilder implements IIdentityContainerRequestBuilder {

    /**
     * The request builder for the IdentityContainer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityContainerRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IIdentityContainerRequest instance
     */
    public IIdentityContainerRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIdentityContainerRequest instance
     */
    public IIdentityContainerRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new IdentityContainerRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for ConditionalAccessRoot
     *
     * @return the IConditionalAccessRootRequestBuilder instance
     */
    public IConditionalAccessRootRequestBuilder conditionalAccess() {
        return new ConditionalAccessRootRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccess"), getClient(), null);
    }
}
