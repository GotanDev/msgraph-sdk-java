// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.AlertDetection;
import com.microsoft.graph.models.CloudAppSecurityState;
import com.microsoft.graph.models.AlertFeedback;
import com.microsoft.graph.models.FileSecurityState;
import com.microsoft.graph.models.AlertHistoryState;
import com.microsoft.graph.models.HostSecurityState;
import com.microsoft.graph.models.InvestigationSecurityState;
import com.microsoft.graph.models.MalwareState;
import com.microsoft.graph.models.MessageSecurityState;
import com.microsoft.graph.models.NetworkConnection;
import com.microsoft.graph.models.Process;
import com.microsoft.graph.models.RegistryKeyState;
import com.microsoft.graph.models.SecurityResource;
import com.microsoft.graph.models.AlertSeverity;
import com.microsoft.graph.models.AlertStatus;
import com.microsoft.graph.models.AlertTrigger;
import com.microsoft.graph.models.UriClickSecurityState;
import com.microsoft.graph.models.UserSecurityState;
import com.microsoft.graph.models.SecurityVendorInformation;
import com.microsoft.graph.models.VulnerabilityState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert.
 */
public class Alert extends Entity implements IJsonBackedObject {


    /**
     * The Activity Group Name.
     * Name or alias of the activity group (attacker) this alert is attributed to.
     */
    @SerializedName(value = "activityGroupName", alternate = {"ActivityGroupName"})
    @Expose
	@Nullable
    public String activityGroupName;

    /**
     * The Alert Detections.
     * 
     */
    @SerializedName(value = "alertDetections", alternate = {"AlertDetections"})
    @Expose
	@Nullable
    public java.util.List<AlertDetection> alertDetections;

    /**
     * The Assigned To.
     * Name of the analyst the alert is assigned to for triage, investigation, or remediation (supports update).
     */
    @SerializedName(value = "assignedTo", alternate = {"AssignedTo"})
    @Expose
	@Nullable
    public String assignedTo;

    /**
     * The Azure Subscription Id.
     * Azure subscription ID, present if this alert is related to an Azure resource.
     */
    @SerializedName(value = "azureSubscriptionId", alternate = {"AzureSubscriptionId"})
    @Expose
	@Nullable
    public String azureSubscriptionId;

    /**
     * The Azure Tenant Id.
     * Azure Active Directory tenant ID. Required.
     */
    @SerializedName(value = "azureTenantId", alternate = {"AzureTenantId"})
    @Expose
	@Nullable
    public String azureTenantId;

    /**
     * The Category.
     * Category of the alert (for example, credentialTheft, ransomware, etc.).
     */
    @SerializedName(value = "category", alternate = {"Category"})
    @Expose
	@Nullable
    public String category;

    /**
     * The Closed Date Time.
     * Time at which the alert was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z (supports update).
     */
    @SerializedName(value = "closedDateTime", alternate = {"ClosedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime closedDateTime;

    /**
     * The Cloud App States.
     * Security-related stateful information generated by the provider about the cloud application/s related to this alert.
     */
    @SerializedName(value = "cloudAppStates", alternate = {"CloudAppStates"})
    @Expose
	@Nullable
    public java.util.List<CloudAppSecurityState> cloudAppStates;

    /**
     * The Comments.
     * Customer-provided comments on alert (for customer alert management) (supports update).
     */
    @SerializedName(value = "comments", alternate = {"Comments"})
    @Expose
	@Nullable
    public java.util.List<String> comments;

    /**
     * The Confidence.
     * Confidence of the detection logic (percentage between 1-100).
     */
    @SerializedName(value = "confidence", alternate = {"Confidence"})
    @Expose
	@Nullable
    public Integer confidence;

    /**
     * The Created Date Time.
     * Time at which the alert was created by the alert provider. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Required.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * Alert description.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Detection Ids.
     * Set of alerts related to this alert entity (each alert is pushed to the SIEM as a separate record).
     */
    @SerializedName(value = "detectionIds", alternate = {"DetectionIds"})
    @Expose
	@Nullable
    public java.util.List<String> detectionIds;

    /**
     * The Event Date Time.
     * Time at which the event(s) that served as the trigger(s) to generate the alert occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Required.
     */
    @SerializedName(value = "eventDateTime", alternate = {"EventDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime eventDateTime;

    /**
     * The Feedback.
     * Analyst feedback on the alert. Possible values are: unknown, truePositive, falsePositive, benignPositive. (supports update)
     */
    @SerializedName(value = "feedback", alternate = {"Feedback"})
    @Expose
	@Nullable
    public AlertFeedback feedback;

    /**
     * The File States.
     * Security-related stateful information generated by the provider about the file(s) related to this alert.
     */
    @SerializedName(value = "fileStates", alternate = {"FileStates"})
    @Expose
	@Nullable
    public java.util.List<FileSecurityState> fileStates;

    /**
     * The History States.
     * A collection of alertHistoryStates comprising an audit log of all updates made to an alert.
     */
    @SerializedName(value = "historyStates", alternate = {"HistoryStates"})
    @Expose
	@Nullable
    public java.util.List<AlertHistoryState> historyStates;

    /**
     * The Host States.
     * Security-related stateful information generated by the provider about the host(s) related to this alert.
     */
    @SerializedName(value = "hostStates", alternate = {"HostStates"})
    @Expose
	@Nullable
    public java.util.List<HostSecurityState> hostStates;

    /**
     * The Incident Ids.
     * IDs of incidents related to current alert.
     */
    @SerializedName(value = "incidentIds", alternate = {"IncidentIds"})
    @Expose
	@Nullable
    public java.util.List<String> incidentIds;

    /**
     * The Investigation Security States.
     * 
     */
    @SerializedName(value = "investigationSecurityStates", alternate = {"InvestigationSecurityStates"})
    @Expose
	@Nullable
    public java.util.List<InvestigationSecurityState> investigationSecurityStates;

    /**
     * The Last Event Date Time.
     * 
     */
    @SerializedName(value = "lastEventDateTime", alternate = {"LastEventDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastEventDateTime;

    /**
     * The Last Modified Date Time.
     * Time at which the alert entity was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Malware States.
     * Threat Intelligence pertaining to malware related to this alert.
     */
    @SerializedName(value = "malwareStates", alternate = {"MalwareStates"})
    @Expose
	@Nullable
    public java.util.List<MalwareState> malwareStates;

    /**
     * The Message Security States.
     * 
     */
    @SerializedName(value = "messageSecurityStates", alternate = {"MessageSecurityStates"})
    @Expose
	@Nullable
    public java.util.List<MessageSecurityState> messageSecurityStates;

    /**
     * The Network Connections.
     * Security-related stateful information generated by the provider about the network connection(s) related to this alert.
     */
    @SerializedName(value = "networkConnections", alternate = {"NetworkConnections"})
    @Expose
	@Nullable
    public java.util.List<NetworkConnection> networkConnections;

    /**
     * The Processes.
     * Security-related stateful information generated by the provider about the process or processes related to this alert.
     */
    @SerializedName(value = "processes", alternate = {"Processes"})
    @Expose
	@Nullable
    public java.util.List<Process> processes;

    /**
     * The Recommended Actions.
     * Vendor/provider recommended action(s) to take as a result of the alert (for example, isolate machine, enforce2FA, reimage host).
     */
    @SerializedName(value = "recommendedActions", alternate = {"RecommendedActions"})
    @Expose
	@Nullable
    public java.util.List<String> recommendedActions;

    /**
     * The Registry Key States.
     * Security-related stateful information generated by the provider about the registry keys related to this alert.
     */
    @SerializedName(value = "registryKeyStates", alternate = {"RegistryKeyStates"})
    @Expose
	@Nullable
    public java.util.List<RegistryKeyState> registryKeyStates;

    /**
     * The Security Resources.
     * Resources related to current alert. For example, for some alerts this can have the Azure Resource value.
     */
    @SerializedName(value = "securityResources", alternate = {"SecurityResources"})
    @Expose
	@Nullable
    public java.util.List<SecurityResource> securityResources;

    /**
     * The Severity.
     * Alert severity - set by vendor/provider. Possible values are: unknown, informational, low, medium, high. Required.
     */
    @SerializedName(value = "severity", alternate = {"Severity"})
    @Expose
	@Nullable
    public AlertSeverity severity;

    /**
     * The Source Materials.
     * Hyperlinks (URIs) to the source material related to the alert, for example, provider's user interface for alerts or log search, etc.
     */
    @SerializedName(value = "sourceMaterials", alternate = {"SourceMaterials"})
    @Expose
	@Nullable
    public java.util.List<String> sourceMaterials;

    /**
     * The Status.
     * Alert lifecycle status (stage). Possible values are: unknown, newAlert, inProgress, resolved. (supports update). Required.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public AlertStatus status;

    /**
     * The Tags.
     * User-definable labels that can be applied to an alert and can serve as filter conditions (for example 'HVA', 'SAW', etc.) (supports update).
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
	@Nullable
    public java.util.List<String> tags;

    /**
     * The Title.
     * Alert title. Required.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;

    /**
     * The Triggers.
     * Security-related information about the specific properties that triggered the alert (properties appearing in the alert). Alerts might contain information about multiple users, hosts, files, ip addresses. This field indicates which properties triggered the alert generation.
     */
    @SerializedName(value = "triggers", alternate = {"Triggers"})
    @Expose
	@Nullable
    public java.util.List<AlertTrigger> triggers;

    /**
     * The Uri Click Security States.
     * 
     */
    @SerializedName(value = "uriClickSecurityStates", alternate = {"UriClickSecurityStates"})
    @Expose
	@Nullable
    public java.util.List<UriClickSecurityState> uriClickSecurityStates;

    /**
     * The User States.
     * Security-related stateful information generated by the provider about the user accounts related to this alert.
     */
    @SerializedName(value = "userStates", alternate = {"UserStates"})
    @Expose
	@Nullable
    public java.util.List<UserSecurityState> userStates;

    /**
     * The Vendor Information.
     * Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=Windows Defender ATP; subProvider=AppLocker). Required.
     */
    @SerializedName(value = "vendorInformation", alternate = {"VendorInformation"})
    @Expose
	@Nullable
    public SecurityVendorInformation vendorInformation;

    /**
     * The Vulnerability States.
     * Threat intelligence pertaining to one or more vulnerabilities related to this alert.
     */
    @SerializedName(value = "vulnerabilityStates", alternate = {"VulnerabilityStates"})
    @Expose
	@Nullable
    public java.util.List<VulnerabilityState> vulnerabilityStates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
