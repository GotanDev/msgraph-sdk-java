// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.RolePermission;
import com.microsoft.graph.requests.TermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.TermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.IosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.IosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.SoftwareUpdateStatusSummaryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.ComplianceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.OnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.DeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.MobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.MobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.ApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.DetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.DetectedAppRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceOverviewWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.NotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.NotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.ResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.ResourceOperationRequestBuilder;
import com.microsoft.graph.requests.DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.RoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.RoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.RemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.RemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.TelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.TelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Request.
 */
public class DeviceManagementRequest extends BaseRequest<DeviceManagement> {
	
    /**
     * The request for the DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagement.class);
    }

    /**
     * Gets the DeviceManagement from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagement from the service
     *
     * @return the DeviceManagement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagement delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagement with a source
     *
     * @param sourceDeviceManagement the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> patchAsync(@Nonnull final DeviceManagement sourceDeviceManagement) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagement);
    }

    /**
     * Patches this DeviceManagement with a source
     *
     * @param sourceDeviceManagement the source object with updates
     * @return the updated DeviceManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement patch(@Nonnull final DeviceManagement sourceDeviceManagement) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> postAsync(@Nonnull final DeviceManagement newDeviceManagement) {
        return sendAsync(HttpMethod.POST, newDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the new object to create
     * @return the created DeviceManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement post(@Nonnull final DeviceManagement newDeviceManagement) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagement> putAsync(@Nonnull final DeviceManagement newDeviceManagement) {
        return sendAsync(HttpMethod.PUT, newDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the object to create/update
     * @return the created DeviceManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement put(@Nonnull final DeviceManagement newDeviceManagement) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagement);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementRequest select(@Nonnull final String value) {
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
     public DeviceManagementRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

