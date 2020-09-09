// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudCommunications;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.microsoft.graph.models.extensions.ChatInfo;
import com.microsoft.graph.models.extensions.MeetingParticipants;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCollectionRequest;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCreateOrGetRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Online Meeting Collection Request Builder.
 */
public interface IOnlineMeetingCollectionRequestBuilder extends IRequestBuilder {

    IOnlineMeetingCollectionRequest buildRequest();

    IOnlineMeetingCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IOnlineMeetingRequestBuilder byId(final String id);

    IOnlineMeetingCreateOrGetRequestBuilder createOrGet(final ChatInfo chatInfo, final java.util.Calendar endDateTime, final String externalId, final MeetingParticipants participants, final java.util.Calendar startDateTime, final String subject);
}
