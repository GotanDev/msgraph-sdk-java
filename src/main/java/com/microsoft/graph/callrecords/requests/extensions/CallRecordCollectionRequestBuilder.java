// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudCommunications;
import com.microsoft.graph.callrecords.models.extensions.CallRecord;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.callrecords.requests.extensions.ICallRecordCollectionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.ICallRecordRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.ICallRecordCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Collection Request Builder.
 */
public class CallRecordCollectionRequestBuilder extends BaseRequestBuilder implements ICallRecordCollectionRequestBuilder {

    /**
     * The request builder for this collection of CloudCommunications
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRecordCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ICallRecordCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ICallRecordCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new CallRecordCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ICallRecordRequestBuilder byId(final String id) {
        return new CallRecordRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
