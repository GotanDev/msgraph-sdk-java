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
 * The class for the Workbook Functions Replace Parameter Set.
 */
public class WorkbookFunctionsReplaceParameterSet {
    /**
     * The old Text.
     * 
     */
    @SerializedName(value = "oldText", alternate = {"OldText"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement oldText;

    /**
     * The start Num.
     * 
     */
    @SerializedName(value = "startNum", alternate = {"StartNum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement startNum;

    /**
     * The num Chars.
     * 
     */
    @SerializedName(value = "numChars", alternate = {"NumChars"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement numChars;

    /**
     * The new Text.
     * 
     */
    @SerializedName(value = "newText", alternate = {"NewText"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement newText;


    /**
     * Instiaciates a new WorkbookFunctionsReplaceParameterSet
     */
    public WorkbookFunctionsReplaceParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsReplaceParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsReplaceParameterSet(@Nonnull final WorkbookFunctionsReplaceParameterSetBuilder builder) {
        this.oldText = builder.oldText;
        this.startNum = builder.startNum;
        this.numChars = builder.numChars;
        this.newText = builder.newText;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsReplaceParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsReplaceParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsReplaceParameterSet
     */
    public static final class WorkbookFunctionsReplaceParameterSetBuilder {
        /**
         * The oldText parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement oldText;
        /**
         * Sets the OldText
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsReplaceParameterSetBuilder withOldText(@Nullable final com.google.gson.JsonElement val) {
            this.oldText = val;
            return this;
        }
        /**
         * The startNum parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement startNum;
        /**
         * Sets the StartNum
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsReplaceParameterSetBuilder withStartNum(@Nullable final com.google.gson.JsonElement val) {
            this.startNum = val;
            return this;
        }
        /**
         * The numChars parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement numChars;
        /**
         * Sets the NumChars
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsReplaceParameterSetBuilder withNumChars(@Nullable final com.google.gson.JsonElement val) {
            this.numChars = val;
            return this;
        }
        /**
         * The newText parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement newText;
        /**
         * Sets the NewText
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsReplaceParameterSetBuilder withNewText(@Nullable final com.google.gson.JsonElement val) {
            this.newText = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsReplaceParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsReplaceParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsReplaceParameterSet build() {
            return new WorkbookFunctionsReplaceParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.oldText != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("oldText", oldText));
        }
        if(this.startNum != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startNum", startNum));
        }
        if(this.numChars != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("numChars", numChars));
        }
        if(this.newText != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("newText", newText));
        }
        return result;
    }
}
