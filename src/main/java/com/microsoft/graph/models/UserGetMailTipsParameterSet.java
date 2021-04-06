// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.MailTipsType;
import com.microsoft.graph.models.MailTips;
import java.util.EnumSet;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Mail Tips Parameter Set.
 */
public class UserGetMailTipsParameterSet {
    /**
     * The email Addresses.
     * 
     */
    @SerializedName(value = "emailAddresses", alternate = {"EmailAddresses"})
    @Expose
	@Nullable
    public java.util.List<String> emailAddresses;

    /**
     * The mail Tips Options.
     * 
     */
    @SerializedName(value = "mailTipsOptions", alternate = {"MailTipsOptions"})
    @Expose
	@Nullable
    public EnumSet<MailTipsType> mailTipsOptions;


    /**
     * Instiaciates a new UserGetMailTipsParameterSet
     */
    public UserGetMailTipsParameterSet() {}
    /**
     * Instiaciates a new UserGetMailTipsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UserGetMailTipsParameterSet(@Nonnull final UserGetMailTipsParameterSetBuilder builder) {
        this.emailAddresses = builder.emailAddresses;
        this.mailTipsOptions = builder.mailTipsOptions;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UserGetMailTipsParameterSetBuilder newBuilder() {
        return new UserGetMailTipsParameterSetBuilder();
    }
    /**
     * Fluent builder for the UserGetMailTipsParameterSet
     */
    public static final class UserGetMailTipsParameterSetBuilder {
        /**
         * The emailAddresses parameter value
         */
        @Nullable
        protected java.util.List<String> emailAddresses;
        /**
         * Sets the EmailAddresses
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserGetMailTipsParameterSetBuilder withEmailAddresses(@Nullable final java.util.List<String> val) {
            this.emailAddresses = val;
            return this;
        }
        /**
         * The mailTipsOptions parameter value
         */
        @Nullable
        protected EnumSet<MailTipsType> mailTipsOptions;
        /**
         * Sets the MailTipsOptions
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserGetMailTipsParameterSetBuilder withMailTipsOptions(@Nullable final EnumSet<MailTipsType> val) {
            this.mailTipsOptions = val;
            return this;
        }
        /**
         * Instanciates a new UserGetMailTipsParameterSetBuilder
         */
        @Nullable
        protected UserGetMailTipsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UserGetMailTipsParameterSet build() {
            return new UserGetMailTipsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.emailAddresses != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("emailAddresses", emailAddresses));
        }
        if(this.mailTipsOptions != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("mailTipsOptions", mailTipsOptions));
        }
        return result;
    }
}
