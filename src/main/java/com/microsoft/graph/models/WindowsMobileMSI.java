// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MobileLobApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Mobile MSI.
 */
public class WindowsMobileMSI extends MobileLobApp implements IJsonBackedObject {


    /**
     * The Command Line.
     * The command line.
     */
    @SerializedName(value = "commandLine", alternate = {"CommandLine"})
    @Expose
	@Nullable
    public String commandLine;

    /**
     * The Ignore Version Detection.
     * A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
     */
    @SerializedName(value = "ignoreVersionDetection", alternate = {"IgnoreVersionDetection"})
    @Expose
	@Nullable
    public Boolean ignoreVersionDetection;

    /**
     * The Product Code.
     * The product code.
     */
    @SerializedName(value = "productCode", alternate = {"ProductCode"})
    @Expose
	@Nullable
    public String productCode;

    /**
     * The Product Version.
     * The product version of Windows Mobile MSI Line of Business (LoB) app.
     */
    @SerializedName(value = "productVersion", alternate = {"ProductVersion"})
    @Expose
	@Nullable
    public String productVersion;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
