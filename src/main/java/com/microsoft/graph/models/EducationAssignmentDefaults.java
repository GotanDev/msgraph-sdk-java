// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.EducationAddedStudentAction;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Defaults.
 */
public class EducationAssignmentDefaults extends Entity implements IJsonBackedObject {


    /**
     * The Added Student Action.
     * Class-level default behavior for handling students who are added after the assignment is published. Possible values are: none, assignIfOpen.
     */
    @SerializedName(value = "addedStudentAction", alternate = {"AddedStudentAction"})
    @Expose
	@Nullable
    public EducationAddedStudentAction addedStudentAction;

    /**
     * The Due Time.
     * Class-level default value for due time field. Default value is 23:59:00.
     */
    @SerializedName(value = "dueTime", alternate = {"DueTime"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.TimeOfDay dueTime;

    /**
     * The Notification Channel Url.
     * Default Teams channel to which notifications will be sent. Default value is null.
     */
    @SerializedName(value = "notificationChannelUrl", alternate = {"NotificationChannelUrl"})
    @Expose
	@Nullable
    public String notificationChannelUrl;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
