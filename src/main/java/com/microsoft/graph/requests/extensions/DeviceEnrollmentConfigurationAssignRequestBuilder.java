// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationAssignRequest;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationAssignRequest;
import com.microsoft.graph.models.extensions.EnrollmentConfigurationAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Assign Request Builder.
 */
public class DeviceEnrollmentConfigurationAssignRequestBuilder extends BaseActionRequestBuilder implements IDeviceEnrollmentConfigurationAssignRequestBuilder {

    /**
     * The request builder for this DeviceEnrollmentConfigurationAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param enrollmentConfigurationAssignments the enrollmentConfigurationAssignments
     */
    public DeviceEnrollmentConfigurationAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<EnrollmentConfigurationAssignment> enrollmentConfigurationAssignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("enrollmentConfigurationAssignments", enrollmentConfigurationAssignments);
    }

    /**
     * Creates the IDeviceEnrollmentConfigurationAssignRequest
     *
     * @return the IDeviceEnrollmentConfigurationAssignRequest instance
     */
    public IDeviceEnrollmentConfigurationAssignRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDeviceEnrollmentConfigurationAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDeviceEnrollmentConfigurationAssignRequest instance
     */
    public IDeviceEnrollmentConfigurationAssignRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceEnrollmentConfigurationAssignRequest request = new DeviceEnrollmentConfigurationAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("enrollmentConfigurationAssignments")) {
            request.body.enrollmentConfigurationAssignments = getParameter("enrollmentConfigurationAssignments");
        }

        return request;
    }
}
