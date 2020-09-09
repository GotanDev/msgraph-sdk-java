// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.models.extensions.EducationClass;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEducationClassCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.EducationClassCollectionResponse;
import com.microsoft.graph.models.extensions.EducationClass;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Collection With References Page.
 */
public class EducationClassCollectionWithReferencesPage extends BaseCollectionPage<EducationClass, IEducationClassCollectionWithReferencesRequestBuilder> implements IEducationClassCollectionWithReferencesPage {

    /**
     * A collection page for EducationClass
     *
     * @param response the serialized EducationClassCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationClassCollectionWithReferencesPage(final EducationClassCollectionResponse response, final IEducationClassCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder);
    }
}
