// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Site;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISiteAddCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteAddCollectionPage;
import com.microsoft.graph.requests.extensions.SiteAddCollectionResponse;
import com.microsoft.graph.models.extensions.SiteAddBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Add Collection Request.
 */
public class SiteAddCollectionRequest extends BaseCollectionRequest<SiteAddCollectionResponse, ISiteAddCollectionPage> implements ISiteAddCollectionRequest {


    protected final SiteAddBody body;


    /**
     * The request for this SiteAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteAddCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SiteAddCollectionResponse.class, ISiteAddCollectionPage.class);
        body = new SiteAddBody();
    }


    public void post(final ICallback<ISiteAddCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ISiteAddCollectionPage post() throws ClientException {
        final SiteAddCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public ISiteAddCollectionPage buildFromResponse(final SiteAddCollectionResponse response) {
        final ISiteAddCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SiteAddCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<Site>) null);
        } else {
            builder = null;
        }
        final ISiteAddCollectionPage page = new SiteAddCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISiteAddCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ISiteAddCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISiteAddCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ISiteAddCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISiteAddCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ISiteAddCollectionRequest)this;
    }

}
