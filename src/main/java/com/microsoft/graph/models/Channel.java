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
import com.microsoft.graph.models.ChannelMembershipType;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.ConversationMember;
import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.models.TeamsTab;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ConversationMemberCollectionPage;
import com.microsoft.graph.requests.ChatMessageCollectionPage;
import com.microsoft.graph.requests.TeamsTabCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel.
 */
public class Channel extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * Read only. Timestamp at which the channel was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * Optional textual description for the channel.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Channel name as it will appear to the user in Microsoft Teams.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Email.
     * The email address for sending messages to the channel. Read-only.
     */
    @SerializedName(value = "email", alternate = {"Email"})
    @Expose
	@Nullable
    public String email;

    /**
     * The Is Favorite By Default.
     * Indicates whether the channel should automatically be marked 'favorite' for all members of the team. Can only be set programmatically with Create team. Default: false.
     */
    @SerializedName(value = "isFavoriteByDefault", alternate = {"IsFavoriteByDefault"})
    @Expose
	@Nullable
    public Boolean isFavoriteByDefault;

    /**
     * The Membership Type.
     * The type of the channel. Can be set during creation and cannot be changed. Default: standard.
     */
    @SerializedName(value = "membershipType", alternate = {"MembershipType"})
    @Expose
	@Nullable
    public ChannelMembershipType membershipType;

    /**
     * The Web Url.
     * A hyperlink that will go to the channel in Microsoft Teams. This is the URL that you get when you right-click a channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed. Read-only.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
	@Nullable
    public String webUrl;

    /**
     * The Files Folder.
     * Metadata for the location where the channel's files are stored.
     */
    @SerializedName(value = "filesFolder", alternate = {"FilesFolder"})
    @Expose
	@Nullable
    public DriveItem filesFolder;

    /**
     * The Members.
     * A collection of membership records associated with the channel.
     */
    @SerializedName(value = "members", alternate = {"Members"})
    @Expose
	@Nullable
    public ConversationMemberCollectionPage members;

    /**
     * The Messages.
     * A collection of all the messages in the channel. A navigation property. Nullable.
     */
    @SerializedName(value = "messages", alternate = {"Messages"})
    @Expose
	@Nullable
    public ChatMessageCollectionPage messages;

    /**
     * The Tabs.
     * A collection of all the tabs in the channel. A navigation property.
     */
    @SerializedName(value = "tabs", alternate = {"Tabs"})
    @Expose
	@Nullable
    public TeamsTabCollectionPage tabs;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members"), ConversationMemberCollectionPage.class);
        }

        if (json.has("messages")) {
            messages = serializer.deserializeObject(json.get("messages"), ChatMessageCollectionPage.class);
        }

        if (json.has("tabs")) {
            tabs = serializer.deserializeObject(json.get("tabs"), TeamsTabCollectionPage.class);
        }
    }
}
