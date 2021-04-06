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
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Template.
 */
public class ApplicationTemplate extends Entity implements IJsonBackedObject {


    /**
     * The Categories.
     * The list of categories for the application. Supported values can be: Collaboration, Business Management, Consumer,Content management, CRM, Data services, Developer services, E-commerce, Education, ERP, Finance, Health, Human resources, IT infrastructure, Mail, Management, Marketing, Media, Productivity, Project management, Telecommunications, Tools, Travel, and Web design &amp; hosting.
     */
    @SerializedName(value = "categories", alternate = {"Categories"})
    @Expose
	@Nullable
    public java.util.List<String> categories;

    /**
     * The Description.
     * A description of the application.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The name of the application.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Home Page Url.
     * The home page URL of the application.
     */
    @SerializedName(value = "homePageUrl", alternate = {"HomePageUrl"})
    @Expose
	@Nullable
    public String homePageUrl;

    /**
     * The Logo Url.
     * The URL to get the logo for this application.
     */
    @SerializedName(value = "logoUrl", alternate = {"LogoUrl"})
    @Expose
	@Nullable
    public String logoUrl;

    /**
     * The Publisher.
     * The name of the publisher for this application.
     */
    @SerializedName(value = "publisher", alternate = {"Publisher"})
    @Expose
	@Nullable
    public String publisher;

    /**
     * The Supported Provisioning Types.
     * The list of provisioning modes supported by this application. The only valid value is sync.
     */
    @SerializedName(value = "supportedProvisioningTypes", alternate = {"SupportedProvisioningTypes"})
    @Expose
	@Nullable
    public java.util.List<String> supportedProvisioningTypes;

    /**
     * The Supported Single Sign On Modes.
     * The list of single sign-on modes supported by this application. The supported values are oidc, password, saml, and notSupported.
     */
    @SerializedName(value = "supportedSingleSignOnModes", alternate = {"SupportedSingleSignOnModes"})
    @Expose
	@Nullable
    public java.util.List<String> supportedSingleSignOnModes;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
