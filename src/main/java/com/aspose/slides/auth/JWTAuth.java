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

package com.aspose.slides.auth;

import java.util.Map;
import java.util.HashMap;

import com.aspose.slides.ApiClient;
import com.aspose.slides.ApiException;
import com.aspose.slides.ApiResponse;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Response;

public class JWTAuth extends Authentication {
    private final String appSid;
    private final String appKey;
    private final ApiClient apiClient;
    private String accessToken;
    private Map<String, Object> grantCredentialsParams;

    public JWTAuth(String baseUrl, String appSid, String appKey) {
        this.appSid = appSid;
        this.appKey = appKey;
        apiClient = new ApiClient(baseUrl, new Authentication());
    }

    @Override
    public void updateHeaderParams(Map<String, String> headerParams) throws ApiException {
        if (accessToken == null) {
            requestToken();
        }
        headerParams.put("Authorization", "Bearer " + accessToken);
    }

    @Override
    public void handleBadResponse(Response response) throws ApiException {
        if (response.code() == 401) {
            requestToken();
            throw new NeedRepeatRequestException();
        }
    }
    
    private synchronized void requestToken() throws ApiException {
        if (grantCredentialsParams == null) {
            grantCredentialsParams = new HashMap<String, Object>();
            grantCredentialsParams.put("grant_type", "client_credentials");
            grantCredentialsParams.put("client_id", appSid);
            grantCredentialsParams.put("client_secret", appKey);
        }
        Call call = apiClient.buildCall("/connect/token", "POST", null, null, null, grantCredentialsParams, null, null);
        ApiResponse<AuthResponse> response = apiClient.execute(call, new TypeToken<AuthResponse>(){}.getType());
        accessToken = response.getData().getAccessToken();
    }
}
