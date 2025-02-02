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
import com.microsoft.graph.models.AdministrativeUnit;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AdministrativeUnitCollectionPage;
import com.microsoft.graph.requests.DirectoryObjectCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory.
 */
public class Directory extends Entity implements IJsonBackedObject {


    /**
     * The Administrative Units.
     * 
     */
    @SerializedName(value = "administrativeUnits", alternate = {"AdministrativeUnits"})
    @Expose
	@Nullable
    public AdministrativeUnitCollectionPage administrativeUnits;

    /**
     * The Deleted Items.
     * Recently deleted items. Read-only. Nullable.
     */
    @SerializedName(value = "deletedItems", alternate = {"DeletedItems"})
    @Expose
	@Nullable
    public DirectoryObjectCollectionPage deletedItems;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("administrativeUnits")) {
            administrativeUnits = serializer.deserializeObject(json.get("administrativeUnits"), AdministrativeUnitCollectionPage.class);
        }

        if (json.has("deletedItems")) {
            deletedItems = serializer.deserializeObject(json.get("deletedItems"), DirectoryObjectCollectionPage.class);
        }
    }
}
