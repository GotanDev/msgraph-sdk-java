// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Conversation;
import com.microsoft.graph.requests.ConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.ConversationThreadRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Request Builder.
 */
public class ConversationRequestBuilder extends BaseRequestBuilder<Conversation> {

    /**
     * The request builder for the Conversation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConversationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ConversationRequest instance
     */
    @Nonnull
    public ConversationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ConversationRequest instance
     */
    @Nonnull
    public ConversationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ConversationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ConversationThread collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ConversationThreadCollectionRequestBuilder threads() {
        return new ConversationThreadCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("threads"), getClient(), null);
    }

    /**
     * Gets a request builder for the ConversationThread item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ConversationThreadRequestBuilder threads(@Nonnull final String id) {
        return new ConversationThreadRequestBuilder(getRequestUrlWithAdditionalSegment("threads") + "/" + id, getClient(), null);
    }
}
