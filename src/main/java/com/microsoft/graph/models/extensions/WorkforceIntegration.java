// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WorkforceIntegrationEncryption;
import com.microsoft.graph.models.generated.WorkforceIntegrationSupportedEntities;
import com.microsoft.graph.models.extensions.ChangeTrackedEntity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workforce Integration.
 */
public class WorkforceIntegration extends ChangeTrackedEntity implements IJsonBackedObject {


    /**
     * The Api Version.
     * API version for the call back URL. Start with 1.
     */
    @SerializedName("apiVersion")
    @Expose
    public Integer apiVersion;

    /**
     * The Display Name.
     * Name of the workforce integration.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Encryption.
     * The workforce integration encryption resource.
     */
    @SerializedName("encryption")
    @Expose
    public WorkforceIntegrationEncryption encryption;

    /**
     * The Is Active.
     * Indicates whether this workforce integration is currently active and available.
     */
    @SerializedName("isActive")
    @Expose
    public Boolean isActive;

    /**
     * The Supported Entities.
     * The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on client changes on those entities added here. By default, no entities are supported for change notifications. Possible values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences
     */
    @SerializedName("supportedEntities")
    @Expose
    public EnumSet<WorkforceIntegrationSupportedEntities> supportedEntities;

    /**
     * The Url.
     * Workforce Integration URL for callbacks from the Shifts service.
     */
    @SerializedName("url")
    @Expose
    public String url;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
