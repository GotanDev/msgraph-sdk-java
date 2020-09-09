// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teleconference Device Media Quality.
 */
public class TeleconferenceDeviceMediaQuality implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Average Inbound Jitter.
     * The average inbound stream network jitter.
     */
    @SerializedName("averageInboundJitter")
    @Expose
    public javax.xml.datatype.Duration averageInboundJitter;

    /**
     * The Average Inbound Packet Loss Rate In Percentage.
     * The average inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     */
    @SerializedName("averageInboundPacketLossRateInPercentage")
    @Expose
    public Double averageInboundPacketLossRateInPercentage;

    /**
     * The Average Inbound Round Trip Delay.
     * The average inbound stream network round trip delay.
     */
    @SerializedName("averageInboundRoundTripDelay")
    @Expose
    public javax.xml.datatype.Duration averageInboundRoundTripDelay;

    /**
     * The Average Outbound Jitter.
     * The average outbound stream network jitter.
     */
    @SerializedName("averageOutboundJitter")
    @Expose
    public javax.xml.datatype.Duration averageOutboundJitter;

    /**
     * The Average Outbound Packet Loss Rate In Percentage.
     * The average outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     */
    @SerializedName("averageOutboundPacketLossRateInPercentage")
    @Expose
    public Double averageOutboundPacketLossRateInPercentage;

    /**
     * The Average Outbound Round Trip Delay.
     * The average outbound stream network round trip delay.
     */
    @SerializedName("averageOutboundRoundTripDelay")
    @Expose
    public javax.xml.datatype.Duration averageOutboundRoundTripDelay;

    /**
     * The Channel Index.
     * The channel index of media. Indexing begins with 1.  If a media session contains 3 video modalities, channel indexes will be 1, 2, and 3.
     */
    @SerializedName("channelIndex")
    @Expose
    public Integer channelIndex;

    /**
     * The Inbound Packets.
     * The total number of the inbound packets.
     */
    @SerializedName("inboundPackets")
    @Expose
    public Long inboundPackets;

    /**
     * The Local IPAddress.
     * the local IP address for the media session.
     */
    @SerializedName("localIPAddress")
    @Expose
    public String localIPAddress;

    /**
     * The Local Port.
     * The local media port.
     */
    @SerializedName("localPort")
    @Expose
    public Integer localPort;

    /**
     * The Maximum Inbound Jitter.
     * The maximum inbound stream network jitter.
     */
    @SerializedName("maximumInboundJitter")
    @Expose
    public javax.xml.datatype.Duration maximumInboundJitter;

    /**
     * The Maximum Inbound Packet Loss Rate In Percentage.
     * The maximum inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     */
    @SerializedName("maximumInboundPacketLossRateInPercentage")
    @Expose
    public Double maximumInboundPacketLossRateInPercentage;

    /**
     * The Maximum Inbound Round Trip Delay.
     * The maximum inbound stream network round trip delay.
     */
    @SerializedName("maximumInboundRoundTripDelay")
    @Expose
    public javax.xml.datatype.Duration maximumInboundRoundTripDelay;

    /**
     * The Maximum Outbound Jitter.
     * The maximum outbound stream network jitter.
     */
    @SerializedName("maximumOutboundJitter")
    @Expose
    public javax.xml.datatype.Duration maximumOutboundJitter;

    /**
     * The Maximum Outbound Packet Loss Rate In Percentage.
     * The maximum outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     */
    @SerializedName("maximumOutboundPacketLossRateInPercentage")
    @Expose
    public Double maximumOutboundPacketLossRateInPercentage;

    /**
     * The Maximum Outbound Round Trip Delay.
     * The maximum outbound stream network round trip delay.
     */
    @SerializedName("maximumOutboundRoundTripDelay")
    @Expose
    public javax.xml.datatype.Duration maximumOutboundRoundTripDelay;

    /**
     * The Media Duration.
     * The total modality duration. If the media enabled and disabled multiple times, MediaDuration will the summation of all of the durations.
     */
    @SerializedName("mediaDuration")
    @Expose
    public javax.xml.datatype.Duration mediaDuration;

    /**
     * The Network Link Speed In Bytes.
     * The network link speed in bytes
     */
    @SerializedName("networkLinkSpeedInBytes")
    @Expose
    public Long networkLinkSpeedInBytes;

    /**
     * The Outbound Packets.
     * The total number of the outbound packets.
     */
    @SerializedName("outboundPackets")
    @Expose
    public Long outboundPackets;

    /**
     * The Remote IPAddress.
     * The remote IP address for the media session.
     */
    @SerializedName("remoteIPAddress")
    @Expose
    public String remoteIPAddress;

    /**
     * The Remote Port.
     * The remote media port.
     */
    @SerializedName("remotePort")
    @Expose
    public Integer remotePort;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
