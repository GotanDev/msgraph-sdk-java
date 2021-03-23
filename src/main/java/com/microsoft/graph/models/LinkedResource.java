// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Linked Resource.
 */
public class LinkedResource extends Entity implements IJsonBackedObject {


    /**
     * The Application Name.
     * Field indicating the app name of the source that is sending the linkedResource.
     */
    @SerializedName(value = "applicationName", alternate = {"ApplicationName"})
    @Expose
	@Nullable
    public String applicationName;

    /**
     * The Display Name.
     * Field indicating the title of the linkedResource.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The External Id.
     * Id of the object that is associated with this task on the third-party/partner system.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;

    /**
     * The Web Url.
     * Deep link to the linkedResource.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
	@Nullable
    public String webUrl;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}