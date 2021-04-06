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
import com.microsoft.graph.models.ManagedEBook;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp EBook.
 */
public class IosVppEBook extends ManagedEBook implements IJsonBackedObject {


    /**
     * The Apple Id.
     * The Apple ID associated with Vpp token.
     */
    @SerializedName(value = "appleId", alternate = {"AppleId"})
    @Expose
	@Nullable
    public String appleId;

    /**
     * The Genres.
     * Genres.
     */
    @SerializedName(value = "genres", alternate = {"Genres"})
    @Expose
	@Nullable
    public java.util.List<String> genres;

    /**
     * The Language.
     * Language.
     */
    @SerializedName(value = "language", alternate = {"Language"})
    @Expose
	@Nullable
    public String language;

    /**
     * The Seller.
     * Seller.
     */
    @SerializedName(value = "seller", alternate = {"Seller"})
    @Expose
	@Nullable
    public String seller;

    /**
     * The Total License Count.
     * Total license count.
     */
    @SerializedName(value = "totalLicenseCount", alternate = {"TotalLicenseCount"})
    @Expose
	@Nullable
    public Integer totalLicenseCount;

    /**
     * The Used License Count.
     * Used license count.
     */
    @SerializedName(value = "usedLicenseCount", alternate = {"UsedLicenseCount"})
    @Expose
	@Nullable
    public Integer usedLicenseCount;

    /**
     * The Vpp Organization Name.
     * The Vpp token's organization name.
     */
    @SerializedName(value = "vppOrganizationName", alternate = {"VppOrganizationName"})
    @Expose
	@Nullable
    public String vppOrganizationName;

    /**
     * The Vpp Token Id.
     * The Vpp token ID.
     */
    @SerializedName(value = "vppTokenId", alternate = {"VppTokenId"})
    @Expose
	@Nullable
    public java.util.UUID vppTokenId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
