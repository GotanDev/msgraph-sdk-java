// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookChartLegend;
import com.microsoft.graph.requests.WorkbookChartLegendFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Legend Request.
 */
public class WorkbookChartLegendRequest extends BaseRequest<WorkbookChartLegend> {
	
    /**
     * The request for the WorkbookChartLegend
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartLegendRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartLegend.class);
    }

    /**
     * Gets the WorkbookChartLegend from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartLegend> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookChartLegend from the service
     *
     * @return the WorkbookChartLegend from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartLegend get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartLegend> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookChartLegend delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartLegend with a source
     *
     * @param sourceWorkbookChartLegend the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartLegend> patchAsync(@Nonnull final WorkbookChartLegend sourceWorkbookChartLegend) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookChartLegend);
    }

    /**
     * Patches this WorkbookChartLegend with a source
     *
     * @param sourceWorkbookChartLegend the source object with updates
     * @return the updated WorkbookChartLegend
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartLegend patch(@Nonnull final WorkbookChartLegend sourceWorkbookChartLegend) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartLegend);
    }

    /**
     * Creates a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartLegend> postAsync(@Nonnull final WorkbookChartLegend newWorkbookChartLegend) {
        return sendAsync(HttpMethod.POST, newWorkbookChartLegend);
    }

    /**
     * Creates a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the new object to create
     * @return the created WorkbookChartLegend
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartLegend post(@Nonnull final WorkbookChartLegend newWorkbookChartLegend) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartLegend);
    }

    /**
     * Creates a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartLegend> putAsync(@Nonnull final WorkbookChartLegend newWorkbookChartLegend) {
        return sendAsync(HttpMethod.PUT, newWorkbookChartLegend);
    }

    /**
     * Creates a WorkbookChartLegend with a new object
     *
     * @param newWorkbookChartLegend the object to create/update
     * @return the created WorkbookChartLegend
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartLegend put(@Nonnull final WorkbookChartLegend newWorkbookChartLegend) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartLegend);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartLegendRequest select(@Nonnull final String value) {
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
     public WorkbookChartLegendRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

