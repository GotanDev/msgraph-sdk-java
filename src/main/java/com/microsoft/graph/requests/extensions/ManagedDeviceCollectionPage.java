// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Collection Page.
 */
public class ManagedDeviceCollectionPage extends BaseCollectionPage<ManagedDevice, IManagedDeviceCollectionRequestBuilder> implements IManagedDeviceCollectionPage {

    /**
     * A collection page for ManagedDevice
     *
     * @param response the serialized ManagedDeviceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedDeviceCollectionPage(final ManagedDeviceCollectionResponse response, final IManagedDeviceCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
