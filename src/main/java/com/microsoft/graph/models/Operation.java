// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.OperationStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Operation.
 */
public class Operation extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The start time of the operation.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Last Action Date Time.
     * The time of the last action of the operation.
     */
    @SerializedName(value = "lastActionDateTime", alternate = {"LastActionDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastActionDateTime;

    /**
     * The Status.
     * The current status of the operation: notStarted, running, completed, failed
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public OperationStatus status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
