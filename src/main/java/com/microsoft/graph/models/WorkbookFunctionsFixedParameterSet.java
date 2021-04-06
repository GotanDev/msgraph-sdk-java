// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Fixed Parameter Set.
 */
public class WorkbookFunctionsFixedParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The decimals.
     * 
     */
    @SerializedName(value = "decimals", alternate = {"Decimals"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement decimals;

    /**
     * The no Commas.
     * 
     */
    @SerializedName(value = "noCommas", alternate = {"NoCommas"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement noCommas;


    /**
     * Instiaciates a new WorkbookFunctionsFixedParameterSet
     */
    public WorkbookFunctionsFixedParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsFixedParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsFixedParameterSet(@Nonnull final WorkbookFunctionsFixedParameterSetBuilder builder) {
        this.number = builder.number;
        this.decimals = builder.decimals;
        this.noCommas = builder.noCommas;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsFixedParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsFixedParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsFixedParameterSet
     */
    public static final class WorkbookFunctionsFixedParameterSetBuilder {
        /**
         * The number parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFixedParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * The decimals parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement decimals;
        /**
         * Sets the Decimals
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFixedParameterSetBuilder withDecimals(@Nullable final com.google.gson.JsonElement val) {
            this.decimals = val;
            return this;
        }
        /**
         * The noCommas parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement noCommas;
        /**
         * Sets the NoCommas
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFixedParameterSetBuilder withNoCommas(@Nullable final com.google.gson.JsonElement val) {
            this.noCommas = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsFixedParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsFixedParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsFixedParameterSet build() {
            return new WorkbookFunctionsFixedParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        if(this.decimals != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("decimals", decimals));
        }
        if(this.noCommas != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("noCommas", noCommas));
        }
        return result;
    }
}
