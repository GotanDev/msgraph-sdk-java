// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSGeneralDeviceConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSGeneral Device Configuration Request.
 */
public interface IMacOSGeneralDeviceConfigurationRequest extends IHttpRequest {

    /**
     * Gets the MacOSGeneralDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MacOSGeneralDeviceConfiguration> callback);

    /**
     * Gets the MacOSGeneralDeviceConfiguration from the service
     *
     * @return the MacOSGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSGeneralDeviceConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MacOSGeneralDeviceConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MacOSGeneralDeviceConfiguration with a source
     *
     * @param sourceMacOSGeneralDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MacOSGeneralDeviceConfiguration sourceMacOSGeneralDeviceConfiguration, final ICallback<MacOSGeneralDeviceConfiguration> callback);

    /**
     * Patches this MacOSGeneralDeviceConfiguration with a source
     *
     * @param sourceMacOSGeneralDeviceConfiguration the source object with updates
     * @return the updated MacOSGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSGeneralDeviceConfiguration patch(final MacOSGeneralDeviceConfiguration sourceMacOSGeneralDeviceConfiguration) throws ClientException;

    /**
     * Posts a MacOSGeneralDeviceConfiguration with a new object
     *
     * @param newMacOSGeneralDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MacOSGeneralDeviceConfiguration newMacOSGeneralDeviceConfiguration, final ICallback<MacOSGeneralDeviceConfiguration> callback);

    /**
     * Posts a MacOSGeneralDeviceConfiguration with a new object
     *
     * @param newMacOSGeneralDeviceConfiguration the new object to create
     * @return the created MacOSGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSGeneralDeviceConfiguration post(final MacOSGeneralDeviceConfiguration newMacOSGeneralDeviceConfiguration) throws ClientException;

    /**
     * Posts a MacOSGeneralDeviceConfiguration with a new object
     *
     * @param newMacOSGeneralDeviceConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MacOSGeneralDeviceConfiguration newMacOSGeneralDeviceConfiguration, final ICallback<MacOSGeneralDeviceConfiguration> callback);

    /**
     * Posts a MacOSGeneralDeviceConfiguration with a new object
     *
     * @param newMacOSGeneralDeviceConfiguration the object to create/update
     * @return the created MacOSGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSGeneralDeviceConfiguration put(final MacOSGeneralDeviceConfiguration newMacOSGeneralDeviceConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSGeneralDeviceConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSGeneralDeviceConfigurationRequest expand(final String value);

}

