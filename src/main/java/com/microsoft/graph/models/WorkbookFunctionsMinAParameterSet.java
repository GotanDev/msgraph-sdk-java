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
 * The class for the Workbook Functions Min AParameter Set.
 */
public class WorkbookFunctionsMinAParameterSet {
    /**
     * The values.
     * 
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement values;


    /**
     * Instiaciates a new WorkbookFunctionsMinAParameterSet
     */
    public WorkbookFunctionsMinAParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsMinAParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsMinAParameterSet(@Nonnull final WorkbookFunctionsMinAParameterSetBuilder builder) {
        this.values = builder.values;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsMinAParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsMinAParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsMinAParameterSet
     */
    public static final class WorkbookFunctionsMinAParameterSetBuilder {
        /**
         * The values parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement values;
        /**
         * Sets the Values
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMinAParameterSetBuilder withValues(@Nullable final com.google.gson.JsonElement val) {
            this.values = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsMinAParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsMinAParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsMinAParameterSet build() {
            return new WorkbookFunctionsMinAParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.values != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("values", values));
        }
        return result;
    }
}
