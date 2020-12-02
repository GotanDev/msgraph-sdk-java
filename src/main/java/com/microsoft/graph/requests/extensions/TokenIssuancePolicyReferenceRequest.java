// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Reference Request.
 */
public class TokenIssuancePolicyReferenceRequest extends BaseReferenceRequest<TokenIssuancePolicy> {

    /**
     * The request for the TokenIssuancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenIssuancePolicyReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenIssuancePolicy.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public TokenIssuancePolicyReferenceRequest select(@Nonnull final String value) {
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
    public TokenIssuancePolicyReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the TokenIssuancePolicy
     *
     * @param srcTokenIssuancePolicy the TokenIssuancePolicy reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final TokenIssuancePolicy srcTokenIssuancePolicy, @Nonnull final ICallback<? super TokenIssuancePolicy> callback) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/policies/tokenIssuancePolicies/" + srcTokenIssuancePolicy.id));
        send(HttpMethod.PUT, callback, payload);
    }

    /**
     * Puts the TokenIssuancePolicy
     *
     * @param srcTokenIssuancePolicy the TokenIssuancePolicy reference to PUT
     * @return the TokenIssuancePolicy
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public TokenIssuancePolicy put(@Nonnull final TokenIssuancePolicy srcTokenIssuancePolicy) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/policies/tokenIssuancePolicies/" + srcTokenIssuancePolicy.id));
        return send(HttpMethod.PUT, payload);
    }
}
