/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.aspose.slides;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

public class Configuration {
    @SerializedName("BaseUrl")
    private String baseUrl = "https://api.aspose.cloud";

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String value) {
        baseUrl = value;
    }

    @SerializedName("Version")
    private String version = "v3.0";

    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        version = value;
    }

    public String getUrl() {
        return getBaseUrl() + "/" + getVersion();
    }

    @SerializedName("AppSid")
    private String appSid;

    public String getAppSid() {
        return appSid;
    }

    public void setAppSid(String value) {
        appSid = value;
    }

    @SerializedName("AppKey")
    private String appKey;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String value) {
        appKey = value;
    }

    private String authToken;

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String value) {
        authToken = value;
    }
    
    @SerializedName("Debug")
    private Boolean debug = false;

    public Boolean getDebug() {
        return debug;
    }

    public void setDebug(Boolean value) {
        debug = value;
    }
    
    private int timeout = 0;

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int value) {
        timeout = value;
    }
    
    private Map<String, String> customHeaders = new HashMap<String, String>();

    public Map<String, String> getCustomHeaders() {
        return customHeaders;
    }

    public Configuration() {
    }
    
    public Configuration(String appSid, String appKey) {
        this.appSid = appSid;
        this.appKey = appKey;
    }
}
