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
 * The class for the Workbook Functions Im Cosh Parameter Set.
 */
public class WorkbookFunctionsImCoshParameterSet {
    /**
     * The inumber.
     * 
     */
    @SerializedName(value = "inumber", alternate = {"Inumber"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement inumber;


    /**
     * Instiaciates a new WorkbookFunctionsImCoshParameterSet
     */
    public WorkbookFunctionsImCoshParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsImCoshParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsImCoshParameterSet(@Nonnull final WorkbookFunctionsImCoshParameterSetBuilder builder) {
        this.inumber = builder.inumber;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsImCoshParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsImCoshParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsImCoshParameterSet
     */
    public static final class WorkbookFunctionsImCoshParameterSetBuilder {
        /**
         * The inumber parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement inumber;
        /**
         * Sets the Inumber
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsImCoshParameterSetBuilder withInumber(@Nullable final com.google.gson.JsonElement val) {
            this.inumber = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsImCoshParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsImCoshParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsImCoshParameterSet build() {
            return new WorkbookFunctionsImCoshParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.inumber != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("inumber", inumber));
        }
        return result;
    }
}
