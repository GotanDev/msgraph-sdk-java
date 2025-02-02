// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.IdentityUserFlowAttributeAssignmentGetOrderRequest;
import com.microsoft.graph.models.IdentityUserFlowAttributeAssignment;
import com.microsoft.graph.models.AssignmentOrder;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Attribute Assignment Get Order Request Builder.
 */
public class IdentityUserFlowAttributeAssignmentGetOrderRequestBuilder extends BaseFunctionRequestBuilder<AssignmentOrder> {

    /**
     * The request builder for this IdentityUserFlowAttributeAssignmentGetOrder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityUserFlowAttributeAssignmentGetOrderRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IdentityUserFlowAttributeAssignmentGetOrderRequest
     *
     * @param requestOptions the options for the request
     * @return the IdentityUserFlowAttributeAssignmentGetOrderRequest instance
     */
    @Nonnull
    public IdentityUserFlowAttributeAssignmentGetOrderRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IdentityUserFlowAttributeAssignmentGetOrderRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IdentityUserFlowAttributeAssignmentGetOrderRequest instance
     */
    @Nonnull
    public IdentityUserFlowAttributeAssignmentGetOrderRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final IdentityUserFlowAttributeAssignmentGetOrderRequest request = new IdentityUserFlowAttributeAssignmentGetOrderRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
