// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.models.extensions.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnCollectionResponse;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Column Collection Request.
 */
public class WorkbookTableColumnCollectionRequest extends BaseCollectionRequest<WorkbookTableColumnCollectionResponse, IWorkbookTableColumnCollectionPage> implements IWorkbookTableColumnCollectionRequest {

    /**
     * The request builder for this collection of WorkbookTableColumn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableColumnCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTableColumnCollectionResponse.class, IWorkbookTableColumnCollectionPage.class);
    }

    public void get(final ICallback<IWorkbookTableColumnCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWorkbookTableColumnCollectionPage get() throws ClientException {
        final WorkbookTableColumnCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookTableColumn newWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookTableColumnRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookTableColumn, callback);
    }

    public WorkbookTableColumn post(final WorkbookTableColumn newWorkbookTableColumn) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookTableColumnRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookTableColumn);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookTableColumnCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookTableColumnCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookTableColumnCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookTableColumnCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookTableColumnCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WorkbookTableColumnCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWorkbookTableColumnCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WorkbookTableColumnCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWorkbookTableColumnCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWorkbookTableColumnCollectionRequest)this;
    }
    public IWorkbookTableColumnCollectionPage buildFromResponse(final WorkbookTableColumnCollectionResponse response) {
        final IWorkbookTableColumnCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookTableColumnCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookTableColumnCollectionPage page = new WorkbookTableColumnCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
