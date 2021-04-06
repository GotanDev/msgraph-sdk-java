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
 * The class for the Workbook Functions Quotient Parameter Set.
 */
public class WorkbookFunctionsQuotientParameterSet {
    /**
     * The numerator.
     * 
     */
    @SerializedName(value = "numerator", alternate = {"Numerator"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement numerator;

    /**
     * The denominator.
     * 
     */
    @SerializedName(value = "denominator", alternate = {"Denominator"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement denominator;


    /**
     * Instiaciates a new WorkbookFunctionsQuotientParameterSet
     */
    public WorkbookFunctionsQuotientParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsQuotientParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsQuotientParameterSet(@Nonnull final WorkbookFunctionsQuotientParameterSetBuilder builder) {
        this.numerator = builder.numerator;
        this.denominator = builder.denominator;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsQuotientParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsQuotientParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsQuotientParameterSet
     */
    public static final class WorkbookFunctionsQuotientParameterSetBuilder {
        /**
         * The numerator parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement numerator;
        /**
         * Sets the Numerator
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsQuotientParameterSetBuilder withNumerator(@Nullable final com.google.gson.JsonElement val) {
            this.numerator = val;
            return this;
        }
        /**
         * The denominator parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement denominator;
        /**
         * Sets the Denominator
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsQuotientParameterSetBuilder withDenominator(@Nullable final com.google.gson.JsonElement val) {
            this.denominator = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsQuotientParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsQuotientParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsQuotientParameterSet build() {
            return new WorkbookFunctionsQuotientParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.numerator != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("numerator", numerator));
        }
        if(this.denominator != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("denominator", denominator));
        }
        return result;
    }
}
