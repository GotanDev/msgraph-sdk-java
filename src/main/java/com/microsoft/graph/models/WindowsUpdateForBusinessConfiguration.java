// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AutomaticUpdateMode;
import com.microsoft.graph.models.WindowsUpdateType;
import com.microsoft.graph.models.WindowsDeliveryOptimizationMode;
import com.microsoft.graph.models.WindowsUpdateInstallScheduleType;
import com.microsoft.graph.models.PrereleaseFeatures;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update For Business Configuration.
 */
public class WindowsUpdateForBusinessConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Automatic Update Mode.
     * Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime, autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl.
     */
    @SerializedName(value = "automaticUpdateMode", alternate = {"AutomaticUpdateMode"})
    @Expose
	@Nullable
    public AutomaticUpdateMode automaticUpdateMode;

    /**
     * The Business Ready Updates Only.
     * Determines which branch devices will receive their updates from. Possible values are: userDefined, all, businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
     */
    @SerializedName(value = "businessReadyUpdatesOnly", alternate = {"BusinessReadyUpdatesOnly"})
    @Expose
	@Nullable
    public WindowsUpdateType businessReadyUpdatesOnly;

    /**
     * The Delivery Optimization Mode.
     * Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
     */
    @SerializedName(value = "deliveryOptimizationMode", alternate = {"DeliveryOptimizationMode"})
    @Expose
	@Nullable
    public WindowsDeliveryOptimizationMode deliveryOptimizationMode;

    /**
     * The Drivers Excluded.
     * Exclude Windows update Drivers
     */
    @SerializedName(value = "driversExcluded", alternate = {"DriversExcluded"})
    @Expose
	@Nullable
    public Boolean driversExcluded;

    /**
     * The Feature Updates Deferral Period In Days.
     * Defer Feature Updates by these many days
     */
    @SerializedName(value = "featureUpdatesDeferralPeriodInDays", alternate = {"FeatureUpdatesDeferralPeriodInDays"})
    @Expose
	@Nullable
    public Integer featureUpdatesDeferralPeriodInDays;

    /**
     * The Feature Updates Paused.
     * Pause Feature Updates
     */
    @SerializedName(value = "featureUpdatesPaused", alternate = {"FeatureUpdatesPaused"})
    @Expose
	@Nullable
    public Boolean featureUpdatesPaused;

    /**
     * The Feature Updates Pause Expiry Date Time.
     * Feature Updates Pause Expiry datetime
     */
    @SerializedName(value = "featureUpdatesPauseExpiryDateTime", alternate = {"FeatureUpdatesPauseExpiryDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime featureUpdatesPauseExpiryDateTime;

    /**
     * The Installation Schedule.
     * Installation schedule
     */
    @SerializedName(value = "installationSchedule", alternate = {"InstallationSchedule"})
    @Expose
	@Nullable
    public WindowsUpdateInstallScheduleType installationSchedule;

    /**
     * The Microsoft Update Service Allowed.
     * Allow Microsoft Update Service
     */
    @SerializedName(value = "microsoftUpdateServiceAllowed", alternate = {"MicrosoftUpdateServiceAllowed"})
    @Expose
	@Nullable
    public Boolean microsoftUpdateServiceAllowed;

    /**
     * The Prerelease Features.
     * The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
     */
    @SerializedName(value = "prereleaseFeatures", alternate = {"PrereleaseFeatures"})
    @Expose
	@Nullable
    public PrereleaseFeatures prereleaseFeatures;

    /**
     * The Quality Updates Deferral Period In Days.
     * Defer Quality Updates by these many days
     */
    @SerializedName(value = "qualityUpdatesDeferralPeriodInDays", alternate = {"QualityUpdatesDeferralPeriodInDays"})
    @Expose
	@Nullable
    public Integer qualityUpdatesDeferralPeriodInDays;

    /**
     * The Quality Updates Paused.
     * Pause Quality Updates
     */
    @SerializedName(value = "qualityUpdatesPaused", alternate = {"QualityUpdatesPaused"})
    @Expose
	@Nullable
    public Boolean qualityUpdatesPaused;

    /**
     * The Quality Updates Pause Expiry Date Time.
     * Quality Updates Pause Expiry datetime
     */
    @SerializedName(value = "qualityUpdatesPauseExpiryDateTime", alternate = {"QualityUpdatesPauseExpiryDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime qualityUpdatesPauseExpiryDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
