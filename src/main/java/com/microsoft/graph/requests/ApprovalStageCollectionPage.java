// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ApprovalStage;
import com.microsoft.graph.requests.ApprovalStageCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ApprovalStageCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Stage Collection Page.
 */
public class ApprovalStageCollectionPage extends BaseCollectionPage<ApprovalStage, ApprovalStageCollectionRequestBuilder> {

    /**
     * A collection page for ApprovalStage
     *
     * @param response the serialized ApprovalStageCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ApprovalStageCollectionPage(@Nonnull final ApprovalStageCollectionResponse response, @Nonnull final ApprovalStageCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ApprovalStage
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ApprovalStageCollectionPage(@Nonnull final java.util.List<ApprovalStage> pageContents, @Nullable final ApprovalStageCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
