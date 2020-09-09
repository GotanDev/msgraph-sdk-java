// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DefaultManagedAppProtection;
import com.microsoft.graph.requests.extensions.IManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Default Managed App Protection Request Builder.
 */
public interface IDefaultManagedAppProtectionRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDefaultManagedAppProtectionRequest instance
     */
    IDefaultManagedAppProtectionRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDefaultManagedAppProtectionRequest instance
     */
    IDefaultManagedAppProtectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IManagedMobileAppCollectionRequestBuilder apps();

    IManagedMobileAppRequestBuilder apps(final String id);

    /**
     * Gets the request builder for ManagedAppPolicyDeploymentSummary
     *
     * @return the IManagedAppPolicyDeploymentSummaryRequestBuilder instance
     */
    IManagedAppPolicyDeploymentSummaryRequestBuilder deploymentSummary();

}