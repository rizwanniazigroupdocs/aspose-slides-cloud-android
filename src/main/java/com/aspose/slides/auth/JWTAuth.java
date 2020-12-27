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
import com.aspose.slides.Configuration;
import static com.google.common.base.Charsets.UTF_8;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Response;
import java.io.IOException;
import okio.BufferedSource;

public class JWTAuth extends Authentication {
    private final Configuration config;
    private final ApiClient apiClient;
    private Map<String, Object> grantCredentialsParams;

    public JWTAuth(Configuration config) {
        this.config = config;
        apiClient = new ApiClient(config.getBaseUrl(), new Authentication());
    }

    @Override
    public void updateHeaderParams(Map<String, String> headerParams) throws ApiException {
        if (config.getAppSid()!= null || config.getAuthToken() != null) {
            if (config.getAuthToken() == null) {
                requestToken();
            }
            headerParams.put("Authorization", "Bearer " + config.getAuthToken());
        }
    }

    @Override
    public void handleBadResponse(Response response) throws ApiException, IOException {
        if (isAuthError(response)) {
            requestToken();
            throw new NeedRepeatRequestException();
        }
    }
    
    private boolean isAuthError(Response response) throws ApiException, IOException {
        return response.code() == 401 ||  (response.code() == 500 && response.body().contentLength() == 0);
    }
    
    private synchronized void requestToken() throws ApiException {
        if (grantCredentialsParams == null) {
            grantCredentialsParams = new HashMap<String, Object>();
            grantCredentialsParams.put("grant_type", "client_credentials");
            grantCredentialsParams.put("client_id", config.getAppSid());
            grantCredentialsParams.put("client_secret", config.getAppKey());
        }
        Call call = apiClient.buildCall("/connect/token", "POST", null, null, null, grantCredentialsParams, null, null);
        try {
            ApiResponse<AuthResponse> response = apiClient.execute(call, new TypeToken<AuthResponse>(){}.getType());
            config.setAuthToken(response.getData().getAccessToken());
        } catch (ApiException ex) {
            throw new ApiException(401, ex.getMessage());
        }
    }
}
