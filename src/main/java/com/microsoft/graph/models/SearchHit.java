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
 * The class for the Search Hit.
 */
public class SearchHit implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Content Source.
     * The name of the content source which the externalItem is part of .
     */
    @SerializedName(value = "contentSource", alternate = {"ContentSource"})
    @Expose
	@Nullable
    public String contentSource;

    /**
     * The Hit Id.
     * The internal identifier for the item.
     */
    @SerializedName(value = "hitId", alternate = {"HitId"})
    @Expose
	@Nullable
    public String hitId;

    /**
     * The Rank.
     * The rank or the order of the result.
     */
    @SerializedName(value = "rank", alternate = {"Rank"})
    @Expose
	@Nullable
    public Integer rank;

    /**
     * The Summary.
     * A summary of the result, if a summary is available.
     */
    @SerializedName(value = "summary", alternate = {"Summary"})
    @Expose
	@Nullable
    public String summary;

    /**
     * The Resource.
     * 
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
	@Nullable
    public Entity resource;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
