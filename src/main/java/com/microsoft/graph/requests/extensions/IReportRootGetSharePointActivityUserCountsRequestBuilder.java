// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Share Point Activity User Counts Request Builder.
 */
public interface IReportRootGetSharePointActivityUserCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSharePointActivityUserCountsRequest
     *
     * @return the IReportRootGetSharePointActivityUserCountsRequest instance
     */
    IReportRootGetSharePointActivityUserCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetSharePointActivityUserCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSharePointActivityUserCountsRequest instance
     */
    IReportRootGetSharePointActivityUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
