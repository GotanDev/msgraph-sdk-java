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
 * The class for the Workbook Functions Permutationa Parameter Set.
 */
public class WorkbookFunctionsPermutationaParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The number Chosen.
     * 
     */
    @SerializedName(value = "numberChosen", alternate = {"NumberChosen"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement numberChosen;


    /**
     * Instiaciates a new WorkbookFunctionsPermutationaParameterSet
     */
    public WorkbookFunctionsPermutationaParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsPermutationaParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsPermutationaParameterSet(@Nonnull final WorkbookFunctionsPermutationaParameterSetBuilder builder) {
        this.number = builder.number;
        this.numberChosen = builder.numberChosen;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsPermutationaParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsPermutationaParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsPermutationaParameterSet
     */
    public static final class WorkbookFunctionsPermutationaParameterSetBuilder {
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
        public WorkbookFunctionsPermutationaParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * The numberChosen parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement numberChosen;
        /**
         * Sets the NumberChosen
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPermutationaParameterSetBuilder withNumberChosen(@Nullable final com.google.gson.JsonElement val) {
            this.numberChosen = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsPermutationaParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsPermutationaParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsPermutationaParameterSet build() {
            return new WorkbookFunctionsPermutationaParameterSet(this);
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
        if(this.numberChosen != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("numberChosen", numberChosen));
        }
        return result;
    }
}
