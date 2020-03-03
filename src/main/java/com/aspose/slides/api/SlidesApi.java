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

package com.aspose.slides.api;

import com.aspose.slides.ApiCallback;
import com.aspose.slides.ApiClient;
import com.aspose.slides.ApiException;
import com.aspose.slides.ApiResponse;
import com.aspose.slides.Configuration;
import com.aspose.slides.FileInfo;
import com.aspose.slides.Pair;
import com.aspose.slides.ProgressRequestBody;
import com.aspose.slides.ProgressResponseBody;
import com.aspose.slides.auth.NeedRepeatRequestException;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.aspose.slides.model.ApiInfo;
import com.aspose.slides.model.ColorScheme;
import com.aspose.slides.model.DiscUsage;
import com.aspose.slides.model.Document;
import com.aspose.slides.model.DocumentProperties;
import com.aspose.slides.model.DocumentProperty;
import com.aspose.slides.model.DocumentReplaceResult;
import com.aspose.slides.model.Effect;
import com.aspose.slides.model.ExportOptions;
import java.io.File;
import com.aspose.slides.model.FileVersions;
import com.aspose.slides.model.FilesList;
import com.aspose.slides.model.FilesUploadResult;
import com.aspose.slides.model.FontScheme;
import com.aspose.slides.model.FormatScheme;
import com.aspose.slides.model.IShapeExportOptions;
import com.aspose.slides.model.Images;
import com.aspose.slides.model.InteractiveSequence;
import com.aspose.slides.model.LayoutSlide;
import com.aspose.slides.model.LayoutSlides;
import com.aspose.slides.model.MasterSlide;
import com.aspose.slides.model.MasterSlides;
import com.aspose.slides.model.NotesSlide;
import com.aspose.slides.model.ObjectExist;
import com.aspose.slides.model.OrderedMergeRequest;
import com.aspose.slides.model.Paragraph;
import com.aspose.slides.model.Paragraphs;
import com.aspose.slides.model.Pipeline;
import com.aspose.slides.model.Placeholder;
import com.aspose.slides.model.Placeholders;
import com.aspose.slides.model.Portion;
import com.aspose.slides.model.Portions;
import com.aspose.slides.model.PresentationsMergeRequest;
import com.aspose.slides.model.ShapeBase;
import com.aspose.slides.model.Shapes;
import com.aspose.slides.model.Slide;
import com.aspose.slides.model.SlideAnimation;
import com.aspose.slides.model.SlideBackground;
import com.aspose.slides.model.SlideComments;
import com.aspose.slides.model.SlideReplaceResult;
import com.aspose.slides.model.Slides;
import com.aspose.slides.model.SplitDocumentResult;
import com.aspose.slides.model.StorageExist;
import com.aspose.slides.model.TextItems;
import com.aspose.slides.model.Theme;
import com.aspose.slides.model.request.CopyFileRequest;
import com.aspose.slides.model.request.CopyFolderRequest;
import com.aspose.slides.model.request.CreateFolderRequest;
import com.aspose.slides.model.request.DeleteFileRequest;
import com.aspose.slides.model.request.DeleteFolderRequest;
import com.aspose.slides.model.request.DeleteNotesSlideRequest;
import com.aspose.slides.model.request.DeleteNotesSlideParagraphRequest;
import com.aspose.slides.model.request.DeleteNotesSlideParagraphsRequest;
import com.aspose.slides.model.request.DeleteNotesSlidePortionRequest;
import com.aspose.slides.model.request.DeleteNotesSlidePortionsRequest;
import com.aspose.slides.model.request.DeleteNotesSlideShapeRequest;
import com.aspose.slides.model.request.DeleteNotesSlideShapesRequest;
import com.aspose.slides.model.request.DeleteParagraphRequest;
import com.aspose.slides.model.request.DeleteParagraphsRequest;
import com.aspose.slides.model.request.DeletePortionRequest;
import com.aspose.slides.model.request.DeletePortionsRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationEffectRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationInteractiveSequenceRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationInteractiveSequenceEffectRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationInteractiveSequencesRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationMainSequenceRequest;
import com.aspose.slides.model.request.DeleteSlideByIndexRequest;
import com.aspose.slides.model.request.DeleteSlideShapeRequest;
import com.aspose.slides.model.request.DeleteSlideShapesRequest;
import com.aspose.slides.model.request.DeleteSlidesCleanSlidesListRequest;
import com.aspose.slides.model.request.DeleteSlidesDocumentPropertiesRequest;
import com.aspose.slides.model.request.DeleteSlidesDocumentPropertyRequest;
import com.aspose.slides.model.request.DeleteSlidesSlideBackgroundRequest;
import com.aspose.slides.model.request.DownloadFileRequest;
import com.aspose.slides.model.request.GetDiscUsageRequest;
import com.aspose.slides.model.request.GetFileVersionsRequest;
import com.aspose.slides.model.request.GetFilesListRequest;
import com.aspose.slides.model.request.GetLayoutSlideRequest;
import com.aspose.slides.model.request.GetLayoutSlidesListRequest;
import com.aspose.slides.model.request.GetMasterSlideRequest;
import com.aspose.slides.model.request.GetMasterSlidesListRequest;
import com.aspose.slides.model.request.GetNotesSlideRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeParagraphRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeParagraphsRequest;
import com.aspose.slides.model.request.GetNotesSlideShapePortionRequest;
import com.aspose.slides.model.request.GetNotesSlideShapePortionsRequest;
import com.aspose.slides.model.request.GetNotesSlideShapesRequest;
import com.aspose.slides.model.request.GetNotesSlideWithFormatRequest;
import com.aspose.slides.model.request.GetParagraphPortionRequest;
import com.aspose.slides.model.request.GetParagraphPortionsRequest;
import com.aspose.slides.model.request.GetSlideAnimationRequest;
import com.aspose.slides.model.request.GetSlideShapeRequest;
import com.aspose.slides.model.request.GetSlideShapeParagraphRequest;
import com.aspose.slides.model.request.GetSlideShapeParagraphsRequest;
import com.aspose.slides.model.request.GetSlideShapesRequest;
import com.aspose.slides.model.request.GetSlidesApiInfoRequest;
import com.aspose.slides.model.request.GetSlidesDocumentRequest;
import com.aspose.slides.model.request.GetSlidesDocumentPropertiesRequest;
import com.aspose.slides.model.request.GetSlidesDocumentPropertyRequest;
import com.aspose.slides.model.request.GetSlidesImageWithDefaultFormatRequest;
import com.aspose.slides.model.request.GetSlidesImageWithFormatRequest;
import com.aspose.slides.model.request.GetSlidesImagesRequest;
import com.aspose.slides.model.request.GetSlidesPlaceholderRequest;
import com.aspose.slides.model.request.GetSlidesPlaceholdersRequest;
import com.aspose.slides.model.request.GetSlidesPresentationTextItemsRequest;
import com.aspose.slides.model.request.GetSlidesSlideRequest;
import com.aspose.slides.model.request.GetSlidesSlideBackgroundRequest;
import com.aspose.slides.model.request.GetSlidesSlideCommentsRequest;
import com.aspose.slides.model.request.GetSlidesSlideImagesRequest;
import com.aspose.slides.model.request.GetSlidesSlideTextItemsRequest;
import com.aspose.slides.model.request.GetSlidesSlidesListRequest;
import com.aspose.slides.model.request.GetSlidesThemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeColorSchemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeFontSchemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeFormatSchemeRequest;
import com.aspose.slides.model.request.MoveFileRequest;
import com.aspose.slides.model.request.MoveFolderRequest;
import com.aspose.slides.model.request.ObjectExistsRequest;
import com.aspose.slides.model.request.PostAddNewParagraphRequest;
import com.aspose.slides.model.request.PostAddNewPortionRequest;
import com.aspose.slides.model.request.PostAddNewShapeRequest;
import com.aspose.slides.model.request.PostAddNotesSlideRequest;
import com.aspose.slides.model.request.PostCopyLayoutSlideFromSourcePresentationRequest;
import com.aspose.slides.model.request.PostCopyMasterSlideFromSourcePresentationRequest;
import com.aspose.slides.model.request.PostNotesSlideAddNewParagraphRequest;
import com.aspose.slides.model.request.PostNotesSlideAddNewPortionRequest;
import com.aspose.slides.model.request.PostNotesSlideAddNewShapeRequest;
import com.aspose.slides.model.request.PostNotesSlideShapeSaveAsRequest;
import com.aspose.slides.model.request.PostPresentationMergeRequest;
import com.aspose.slides.model.request.PostShapeSaveAsRequest;
import com.aspose.slides.model.request.PostSlideAnimationEffectRequest;
import com.aspose.slides.model.request.PostSlideAnimationInteractiveSequenceRequest;
import com.aspose.slides.model.request.PostSlideAnimationInteractiveSequenceEffectRequest;
import com.aspose.slides.model.request.PostSlideSaveAsRequest;
import com.aspose.slides.model.request.PostSlidesAddRequest;
import com.aspose.slides.model.request.PostSlidesConvertRequest;
import com.aspose.slides.model.request.PostSlidesCopyRequest;
import com.aspose.slides.model.request.PostSlidesDocumentRequest;
import com.aspose.slides.model.request.PostSlidesDocumentFromHtmlRequest;
import com.aspose.slides.model.request.PostSlidesDocumentFromSourceRequest;
import com.aspose.slides.model.request.PostSlidesDocumentFromTemplateRequest;
import com.aspose.slides.model.request.PostSlidesPipelineRequest;
import com.aspose.slides.model.request.PostSlidesPresentationReplaceTextRequest;
import com.aspose.slides.model.request.PostSlidesReorderRequest;
import com.aspose.slides.model.request.PostSlidesReorderManyRequest;
import com.aspose.slides.model.request.PostSlidesSaveAsRequest;
import com.aspose.slides.model.request.PostSlidesSetDocumentPropertiesRequest;
import com.aspose.slides.model.request.PostSlidesSlideReplaceTextRequest;
import com.aspose.slides.model.request.PostSlidesSplitRequest;
import com.aspose.slides.model.request.PutLayoutSlideRequest;
import com.aspose.slides.model.request.PutNotesSlideShapeSaveAsRequest;
import com.aspose.slides.model.request.PutPresentationMergeRequest;
import com.aspose.slides.model.request.PutSetParagraphPortionPropertiesRequest;
import com.aspose.slides.model.request.PutSetParagraphPropertiesRequest;
import com.aspose.slides.model.request.PutShapeSaveAsRequest;
import com.aspose.slides.model.request.PutSlideAnimationRequest;
import com.aspose.slides.model.request.PutSlideAnimationEffectRequest;
import com.aspose.slides.model.request.PutSlideAnimationInteractiveSequenceEffectRequest;
import com.aspose.slides.model.request.PutSlideSaveAsRequest;
import com.aspose.slides.model.request.PutSlideShapeInfoRequest;
import com.aspose.slides.model.request.PutSlidesConvertRequest;
import com.aspose.slides.model.request.PutSlidesDocumentFromHtmlRequest;
import com.aspose.slides.model.request.PutSlidesSaveAsRequest;
import com.aspose.slides.model.request.PutSlidesSetDocumentPropertyRequest;
import com.aspose.slides.model.request.PutSlidesSlideRequest;
import com.aspose.slides.model.request.PutSlidesSlideBackgroundRequest;
import com.aspose.slides.model.request.PutSlidesSlideBackgroundColorRequest;
import com.aspose.slides.model.request.PutSlidesSlideSizeRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideShapeRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideShapeParagraphRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideShapePortionRequest;
import com.aspose.slides.model.request.StorageExistsRequest;
import com.aspose.slides.model.request.UploadFileRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlidesApi {
    public SlidesApi(Configuration configuration) {
        apiClient = new ApiClient(configuration);
    }

    public SlidesApi(String appSid, String appKey) {
        this(new Configuration(appSid, appKey));
    }

    /**
     * Build call for copyFile
     * @param request Request for copyFile. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call copyFileCall(CopyFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'srcPath' is set
        if (request.getSrcPath() == null) {
            throw new ApiException("Missing the required parameter 'srcPath' when calling copyFile(Async)");
        }
        
        // verify the required parameter 'destPath' is set
        if (request.getDestPath() == null) {
            throw new ApiException("Missing the required parameter 'destPath' when calling copyFile(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/file/copy/{srcPath}"
            .replaceAll("\\{" + "srcPath" + "\\}", apiClient.objectToString(request.getSrcPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "destPath", request.getDestPath());
        apiClient.addQueryParameter(queryParams, "srcStorageName", request.getSrcStorageName());
        apiClient.addQueryParameter(queryParams, "destStorageName", request.getDestStorageName());
        apiClient.addQueryParameter(queryParams, "versionId", request.getVersionId());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Copy file
     * 
     * @param request Request for copyFile. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void copyFile(CopyFileRequest request) throws ApiException {
        try {
            copyFileWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            copyFileWithHttpInfo(request);
        }
    }

    /**
     * Copy file
     * 
     * @param request Request for copyFile. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> copyFileWithHttpInfo(CopyFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = copyFileCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Copy file (asynchronously)
     * 
     * @param request Request for copyFile. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call copyFileAsync(CopyFileRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = copyFileCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for copyFolder
     * @param request Request for copyFolder. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call copyFolderCall(CopyFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'srcPath' is set
        if (request.getSrcPath() == null) {
            throw new ApiException("Missing the required parameter 'srcPath' when calling copyFolder(Async)");
        }
        
        // verify the required parameter 'destPath' is set
        if (request.getDestPath() == null) {
            throw new ApiException("Missing the required parameter 'destPath' when calling copyFolder(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/folder/copy/{srcPath}"
            .replaceAll("\\{" + "srcPath" + "\\}", apiClient.objectToString(request.getSrcPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "destPath", request.getDestPath());
        apiClient.addQueryParameter(queryParams, "srcStorageName", request.getSrcStorageName());
        apiClient.addQueryParameter(queryParams, "destStorageName", request.getDestStorageName());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Copy folder
     * 
     * @param request Request for copyFolder. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void copyFolder(CopyFolderRequest request) throws ApiException {
        try {
            copyFolderWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            copyFolderWithHttpInfo(request);
        }
    }

    /**
     * Copy folder
     * 
     * @param request Request for copyFolder. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> copyFolderWithHttpInfo(CopyFolderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = copyFolderCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Copy folder (asynchronously)
     * 
     * @param request Request for copyFolder. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call copyFolderAsync(CopyFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = copyFolderCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for createFolder
     * @param request Request for createFolder. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createFolderCall(CreateFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/folder/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storageName", request.getStorageName());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Create the folder
     * 
     * @param request Request for createFolder. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void createFolder(CreateFolderRequest request) throws ApiException {
        try {
            createFolderWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            createFolderWithHttpInfo(request);
        }
    }

    /**
     * Create the folder
     * 
     * @param request Request for createFolder. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createFolderWithHttpInfo(CreateFolderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = createFolderCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create the folder (asynchronously)
     * 
     * @param request Request for createFolder. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFolderAsync(CreateFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createFolderCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteFile
     * @param request Request for deleteFile. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFileCall(DeleteFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/file/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storageName", request.getStorageName());
        apiClient.addQueryParameter(queryParams, "versionId", request.getVersionId());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Delete file
     * 
     * @param request Request for deleteFile. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFile(DeleteFileRequest request) throws ApiException {
        try {
            deleteFileWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            deleteFileWithHttpInfo(request);
        }
    }

    /**
     * Delete file
     * 
     * @param request Request for deleteFile. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFileWithHttpInfo(DeleteFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteFileCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete file (asynchronously)
     * 
     * @param request Request for deleteFile. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFileAsync(DeleteFileRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteFileCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteFolder
     * @param request Request for deleteFolder. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFolderCall(DeleteFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/folder/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storageName", request.getStorageName());
        apiClient.addQueryParameter(queryParams, "recursive", request.getRecursive());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Delete folder
     * 
     * @param request Request for deleteFolder. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFolder(DeleteFolderRequest request) throws ApiException {
        try {
            deleteFolderWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            deleteFolderWithHttpInfo(request);
        }
    }

    /**
     * Delete folder
     * 
     * @param request Request for deleteFolder. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFolderWithHttpInfo(DeleteFolderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteFolderCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete folder (asynchronously)
     * 
     * @param request Request for deleteFolder. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFolderAsync(DeleteFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteFolderCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlide
     * @param request Request for deleteNotesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideCall(DeleteNotesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlide(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove notes slide.
     * 
     * @param request Request for deleteNotesSlide. (required)
     * @return Slide
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Slide deleteNotesSlide(DeleteNotesSlideRequest request) throws ApiException {
        try {
            ApiResponse<Slide> resp = deleteNotesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Slide> resp = deleteNotesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove notes slide.
     * 
     * @param request Request for deleteNotesSlide. (required)
     * @return ApiResponse&lt;Slide&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Slide> deleteNotesSlideWithHttpInfo(DeleteNotesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlideCall(request, null, null);
        Type returnType = new TypeToken<Slide>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove notes slide. (asynchronously)
     * 
     * @param request Request for deleteNotesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideAsync(DeleteNotesSlideRequest request, final ApiCallback<Slide> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Slide>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlideParagraph
     * @param request Request for deleteNotesSlideParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideParagraphCall(DeleteNotesSlideParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlideParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlideParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteNotesSlideParagraph(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deleteNotesSlideParagraph(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a paragraph.
     * 
     * @param request Request for deleteNotesSlideParagraph. (required)
     * @return Paragraphs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraphs deleteNotesSlideParagraph(DeleteNotesSlideParagraphRequest request) throws ApiException {
        try {
            ApiResponse<Paragraphs> resp = deleteNotesSlideParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraphs> resp = deleteNotesSlideParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a paragraph.
     * 
     * @param request Request for deleteNotesSlideParagraph. (required)
     * @return ApiResponse&lt;Paragraphs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraphs> deleteNotesSlideParagraphWithHttpInfo(DeleteNotesSlideParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlideParagraphCall(request, null, null);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a paragraph. (asynchronously)
     * 
     * @param request Request for deleteNotesSlideParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideParagraphAsync(DeleteNotesSlideParagraphRequest request, final ApiCallback<Paragraphs> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlideParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlideParagraphs
     * @param request Request for deleteNotesSlideParagraphs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideParagraphsCall(DeleteNotesSlideParagraphsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlideParagraphs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlideParagraphs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteNotesSlideParagraphs(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "paragraphs", request.getParagraphs());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a range of paragraphs.
     * 
     * @param request Request for deleteNotesSlideParagraphs. (required)
     * @return Paragraphs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraphs deleteNotesSlideParagraphs(DeleteNotesSlideParagraphsRequest request) throws ApiException {
        try {
            ApiResponse<Paragraphs> resp = deleteNotesSlideParagraphsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraphs> resp = deleteNotesSlideParagraphsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a range of paragraphs.
     * 
     * @param request Request for deleteNotesSlideParagraphs. (required)
     * @return ApiResponse&lt;Paragraphs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraphs> deleteNotesSlideParagraphsWithHttpInfo(DeleteNotesSlideParagraphsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlideParagraphsCall(request, null, null);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a range of paragraphs. (asynchronously)
     * 
     * @param request Request for deleteNotesSlideParagraphs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideParagraphsAsync(DeleteNotesSlideParagraphsRequest request, final ApiCallback<Paragraphs> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlideParagraphsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlidePortion
     * @param request Request for deleteNotesSlidePortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlidePortionCall(DeleteNotesSlidePortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlidePortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlidePortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteNotesSlidePortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deleteNotesSlidePortion(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling deleteNotesSlidePortion(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex())).replaceAll("\\{" + "portionIndex" + "\\}", apiClient.objectToString(request.getPortionIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a portion.
     * 
     * @param request Request for deleteNotesSlidePortion. (required)
     * @return Portions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portions deleteNotesSlidePortion(DeleteNotesSlidePortionRequest request) throws ApiException {
        try {
            ApiResponse<Portions> resp = deleteNotesSlidePortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portions> resp = deleteNotesSlidePortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a portion.
     * 
     * @param request Request for deleteNotesSlidePortion. (required)
     * @return ApiResponse&lt;Portions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portions> deleteNotesSlidePortionWithHttpInfo(DeleteNotesSlidePortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlidePortionCall(request, null, null);
        Type returnType = new TypeToken<Portions>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a portion. (asynchronously)
     * 
     * @param request Request for deleteNotesSlidePortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlidePortionAsync(DeleteNotesSlidePortionRequest request, final ApiCallback<Portions> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlidePortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portions>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlidePortions
     * @param request Request for deleteNotesSlidePortions. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlidePortionsCall(DeleteNotesSlidePortionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlidePortions(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlidePortions(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteNotesSlidePortions(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deleteNotesSlidePortions(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "portions", request.getPortions());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a range of portions.
     * 
     * @param request Request for deleteNotesSlidePortions. (required)
     * @return Portions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portions deleteNotesSlidePortions(DeleteNotesSlidePortionsRequest request) throws ApiException {
        try {
            ApiResponse<Portions> resp = deleteNotesSlidePortionsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portions> resp = deleteNotesSlidePortionsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a range of portions.
     * 
     * @param request Request for deleteNotesSlidePortions. (required)
     * @return ApiResponse&lt;Portions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portions> deleteNotesSlidePortionsWithHttpInfo(DeleteNotesSlidePortionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlidePortionsCall(request, null, null);
        Type returnType = new TypeToken<Portions>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a range of portions. (asynchronously)
     * 
     * @param request Request for deleteNotesSlidePortions. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlidePortionsAsync(DeleteNotesSlidePortionsRequest request, final ApiCallback<Portions> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlidePortionsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portions>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlideShape
     * @param request Request for deleteNotesSlideShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideShapeCall(DeleteNotesSlideShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteNotesSlideShape(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a shape.
     * 
     * @param request Request for deleteNotesSlideShape. (required)
     * @return Shapes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Shapes deleteNotesSlideShape(DeleteNotesSlideShapeRequest request) throws ApiException {
        try {
            ApiResponse<Shapes> resp = deleteNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Shapes> resp = deleteNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a shape.
     * 
     * @param request Request for deleteNotesSlideShape. (required)
     * @return ApiResponse&lt;Shapes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Shapes> deleteNotesSlideShapeWithHttpInfo(DeleteNotesSlideShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlideShapeCall(request, null, null);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a shape. (asynchronously)
     * 
     * @param request Request for deleteNotesSlideShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideShapeAsync(DeleteNotesSlideShapeRequest request, final ApiCallback<Shapes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlideShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlideShapes
     * @param request Request for deleteNotesSlideShapes. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideShapesCall(DeleteNotesSlideShapesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlideShapes(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlideShapes(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "shapes", request.getShapes());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a range of shapes.
     * 
     * @param request Request for deleteNotesSlideShapes. (required)
     * @return Shapes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Shapes deleteNotesSlideShapes(DeleteNotesSlideShapesRequest request) throws ApiException {
        try {
            ApiResponse<Shapes> resp = deleteNotesSlideShapesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Shapes> resp = deleteNotesSlideShapesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a range of shapes.
     * 
     * @param request Request for deleteNotesSlideShapes. (required)
     * @return ApiResponse&lt;Shapes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Shapes> deleteNotesSlideShapesWithHttpInfo(DeleteNotesSlideShapesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlideShapesCall(request, null, null);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a range of shapes. (asynchronously)
     * 
     * @param request Request for deleteNotesSlideShapes. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideShapesAsync(DeleteNotesSlideShapesRequest request, final ApiCallback<Shapes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlideShapesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteParagraph
     * @param request Request for deleteParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphCall(DeleteParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteParagraph(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deleteParagraph(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a paragraph.
     * 
     * @param request Request for deleteParagraph. (required)
     * @return Paragraphs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraphs deleteParagraph(DeleteParagraphRequest request) throws ApiException {
        try {
            ApiResponse<Paragraphs> resp = deleteParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraphs> resp = deleteParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a paragraph.
     * 
     * @param request Request for deleteParagraph. (required)
     * @return ApiResponse&lt;Paragraphs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraphs> deleteParagraphWithHttpInfo(DeleteParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteParagraphCall(request, null, null);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a paragraph. (asynchronously)
     * 
     * @param request Request for deleteParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphAsync(DeleteParagraphRequest request, final ApiCallback<Paragraphs> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteParagraphs
     * @param request Request for deleteParagraphs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphsCall(DeleteParagraphsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteParagraphs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteParagraphs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteParagraphs(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "paragraphs", request.getParagraphs());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a range of paragraphs.
     * 
     * @param request Request for deleteParagraphs. (required)
     * @return Paragraphs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraphs deleteParagraphs(DeleteParagraphsRequest request) throws ApiException {
        try {
            ApiResponse<Paragraphs> resp = deleteParagraphsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraphs> resp = deleteParagraphsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a range of paragraphs.
     * 
     * @param request Request for deleteParagraphs. (required)
     * @return ApiResponse&lt;Paragraphs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraphs> deleteParagraphsWithHttpInfo(DeleteParagraphsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteParagraphsCall(request, null, null);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a range of paragraphs. (asynchronously)
     * 
     * @param request Request for deleteParagraphs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphsAsync(DeleteParagraphsRequest request, final ApiCallback<Paragraphs> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteParagraphsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deletePortion
     * @param request Request for deletePortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePortionCall(DeletePortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deletePortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deletePortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deletePortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deletePortion(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling deletePortion(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex())).replaceAll("\\{" + "portionIndex" + "\\}", apiClient.objectToString(request.getPortionIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a portion.
     * 
     * @param request Request for deletePortion. (required)
     * @return Portions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portions deletePortion(DeletePortionRequest request) throws ApiException {
        try {
            ApiResponse<Portions> resp = deletePortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portions> resp = deletePortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a portion.
     * 
     * @param request Request for deletePortion. (required)
     * @return ApiResponse&lt;Portions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portions> deletePortionWithHttpInfo(DeletePortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deletePortionCall(request, null, null);
        Type returnType = new TypeToken<Portions>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a portion. (asynchronously)
     * 
     * @param request Request for deletePortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePortionAsync(DeletePortionRequest request, final ApiCallback<Portions> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deletePortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portions>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deletePortions
     * @param request Request for deletePortions. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePortionsCall(DeletePortionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deletePortions(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deletePortions(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deletePortions(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deletePortions(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "portions", request.getPortions());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a range of portions.
     * 
     * @param request Request for deletePortions. (required)
     * @return Portions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portions deletePortions(DeletePortionsRequest request) throws ApiException {
        try {
            ApiResponse<Portions> resp = deletePortionsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portions> resp = deletePortionsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a range of portions.
     * 
     * @param request Request for deletePortions. (required)
     * @return ApiResponse&lt;Portions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portions> deletePortionsWithHttpInfo(DeletePortionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deletePortionsCall(request, null, null);
        Type returnType = new TypeToken<Portions>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a range of portions. (asynchronously)
     * 
     * @param request Request for deletePortions. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePortionsAsync(DeletePortionsRequest request, final ApiCallback<Portions> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deletePortionsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portions>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlideAnimation
     * @param request Request for deleteSlideAnimation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationCall(DeleteSlideAnimationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideAnimation(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideAnimation(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove animation from a slide.
     * 
     * @param request Request for deleteSlideAnimation. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation deleteSlideAnimation(DeleteSlideAnimationRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove animation from a slide.
     * 
     * @param request Request for deleteSlideAnimation. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> deleteSlideAnimationWithHttpInfo(DeleteSlideAnimationRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideAnimationCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove animation from a slide. (asynchronously)
     * 
     * @param request Request for deleteSlideAnimation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationAsync(DeleteSlideAnimationRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlideAnimationCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlideAnimationEffect
     * @param request Request for deleteSlideAnimationEffect. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationEffectCall(DeleteSlideAnimationEffectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideAnimationEffect(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideAnimationEffect(Async)");
        }
        
        // verify the required parameter 'effectIndex' is set
        if (request.getEffectIndex() == null) {
            throw new ApiException("Missing the required parameter 'effectIndex' when calling deleteSlideAnimationEffect(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation/mainSequence/{effectIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "effectIndex" + "\\}", apiClient.objectToString(request.getEffectIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove an effect from slide animation.
     * 
     * @param request Request for deleteSlideAnimationEffect. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation deleteSlideAnimationEffect(DeleteSlideAnimationEffectRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationEffectWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationEffectWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove an effect from slide animation.
     * 
     * @param request Request for deleteSlideAnimationEffect. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> deleteSlideAnimationEffectWithHttpInfo(DeleteSlideAnimationEffectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideAnimationEffectCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove an effect from slide animation. (asynchronously)
     * 
     * @param request Request for deleteSlideAnimationEffect. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationEffectAsync(DeleteSlideAnimationEffectRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlideAnimationEffectCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlideAnimationInteractiveSequence
     * @param request Request for deleteSlideAnimationInteractiveSequence. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationInteractiveSequenceCall(DeleteSlideAnimationInteractiveSequenceRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideAnimationInteractiveSequence(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideAnimationInteractiveSequence(Async)");
        }
        
        // verify the required parameter 'sequenceIndex' is set
        if (request.getSequenceIndex() == null) {
            throw new ApiException("Missing the required parameter 'sequenceIndex' when calling deleteSlideAnimationInteractiveSequence(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation/interactiveSequences/{sequenceIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "sequenceIndex" + "\\}", apiClient.objectToString(request.getSequenceIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove an interactive sequence from slide animation.
     * 
     * @param request Request for deleteSlideAnimationInteractiveSequence. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation deleteSlideAnimationInteractiveSequence(DeleteSlideAnimationInteractiveSequenceRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationInteractiveSequenceWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationInteractiveSequenceWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove an interactive sequence from slide animation.
     * 
     * @param request Request for deleteSlideAnimationInteractiveSequence. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> deleteSlideAnimationInteractiveSequenceWithHttpInfo(DeleteSlideAnimationInteractiveSequenceRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideAnimationInteractiveSequenceCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove an interactive sequence from slide animation. (asynchronously)
     * 
     * @param request Request for deleteSlideAnimationInteractiveSequence. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationInteractiveSequenceAsync(DeleteSlideAnimationInteractiveSequenceRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlideAnimationInteractiveSequenceCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlideAnimationInteractiveSequenceEffect
     * @param request Request for deleteSlideAnimationInteractiveSequenceEffect. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationInteractiveSequenceEffectCall(DeleteSlideAnimationInteractiveSequenceEffectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideAnimationInteractiveSequenceEffect(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideAnimationInteractiveSequenceEffect(Async)");
        }
        
        // verify the required parameter 'sequenceIndex' is set
        if (request.getSequenceIndex() == null) {
            throw new ApiException("Missing the required parameter 'sequenceIndex' when calling deleteSlideAnimationInteractiveSequenceEffect(Async)");
        }
        
        // verify the required parameter 'effectIndex' is set
        if (request.getEffectIndex() == null) {
            throw new ApiException("Missing the required parameter 'effectIndex' when calling deleteSlideAnimationInteractiveSequenceEffect(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation/interactiveSequences/{sequenceIndex}/{effectIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "sequenceIndex" + "\\}", apiClient.objectToString(request.getSequenceIndex())).replaceAll("\\{" + "effectIndex" + "\\}", apiClient.objectToString(request.getEffectIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove an effect from slide animation interactive sequence.
     * 
     * @param request Request for deleteSlideAnimationInteractiveSequenceEffect. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation deleteSlideAnimationInteractiveSequenceEffect(DeleteSlideAnimationInteractiveSequenceEffectRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationInteractiveSequenceEffectWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationInteractiveSequenceEffectWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove an effect from slide animation interactive sequence.
     * 
     * @param request Request for deleteSlideAnimationInteractiveSequenceEffect. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> deleteSlideAnimationInteractiveSequenceEffectWithHttpInfo(DeleteSlideAnimationInteractiveSequenceEffectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideAnimationInteractiveSequenceEffectCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove an effect from slide animation interactive sequence. (asynchronously)
     * 
     * @param request Request for deleteSlideAnimationInteractiveSequenceEffect. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationInteractiveSequenceEffectAsync(DeleteSlideAnimationInteractiveSequenceEffectRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlideAnimationInteractiveSequenceEffectCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlideAnimationInteractiveSequences
     * @param request Request for deleteSlideAnimationInteractiveSequences. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationInteractiveSequencesCall(DeleteSlideAnimationInteractiveSequencesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideAnimationInteractiveSequences(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideAnimationInteractiveSequences(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation/interactiveSequences"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Clear all interactive sequences from slide animation.
     * 
     * @param request Request for deleteSlideAnimationInteractiveSequences. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation deleteSlideAnimationInteractiveSequences(DeleteSlideAnimationInteractiveSequencesRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationInteractiveSequencesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationInteractiveSequencesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Clear all interactive sequences from slide animation.
     * 
     * @param request Request for deleteSlideAnimationInteractiveSequences. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> deleteSlideAnimationInteractiveSequencesWithHttpInfo(DeleteSlideAnimationInteractiveSequencesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideAnimationInteractiveSequencesCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Clear all interactive sequences from slide animation. (asynchronously)
     * 
     * @param request Request for deleteSlideAnimationInteractiveSequences. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationInteractiveSequencesAsync(DeleteSlideAnimationInteractiveSequencesRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlideAnimationInteractiveSequencesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlideAnimationMainSequence
     * @param request Request for deleteSlideAnimationMainSequence. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationMainSequenceCall(DeleteSlideAnimationMainSequenceRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideAnimationMainSequence(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideAnimationMainSequence(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation/mainSequence"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Clear main sequence in slide animation.
     * 
     * @param request Request for deleteSlideAnimationMainSequence. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation deleteSlideAnimationMainSequence(DeleteSlideAnimationMainSequenceRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationMainSequenceWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = deleteSlideAnimationMainSequenceWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Clear main sequence in slide animation.
     * 
     * @param request Request for deleteSlideAnimationMainSequence. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> deleteSlideAnimationMainSequenceWithHttpInfo(DeleteSlideAnimationMainSequenceRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideAnimationMainSequenceCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Clear main sequence in slide animation. (asynchronously)
     * 
     * @param request Request for deleteSlideAnimationMainSequence. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideAnimationMainSequenceAsync(DeleteSlideAnimationMainSequenceRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlideAnimationMainSequenceCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlideByIndex
     * @param request Request for deleteSlideByIndex. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideByIndexCall(DeleteSlideByIndexRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideByIndex(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideByIndex(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Delete a presentation slide by index.
     * 
     * @param request Request for deleteSlideByIndex. (required)
     * @return Slides
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Slides deleteSlideByIndex(DeleteSlideByIndexRequest request) throws ApiException {
        try {
            ApiResponse<Slides> resp = deleteSlideByIndexWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Slides> resp = deleteSlideByIndexWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Delete a presentation slide by index.
     * 
     * @param request Request for deleteSlideByIndex. (required)
     * @return ApiResponse&lt;Slides&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Slides> deleteSlideByIndexWithHttpInfo(DeleteSlideByIndexRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideByIndexCall(request, null, null);
        Type returnType = new TypeToken<Slides>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Delete a presentation slide by index. (asynchronously)
     * 
     * @param request Request for deleteSlideByIndex. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideByIndexAsync(DeleteSlideByIndexRequest request, final ApiCallback<Slides> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlideByIndexCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Slides>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlideShape
     * @param request Request for deleteSlideShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideShapeCall(DeleteSlideShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideShape(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteSlideShape(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a shape.
     * 
     * @param request Request for deleteSlideShape. (required)
     * @return Shapes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Shapes deleteSlideShape(DeleteSlideShapeRequest request) throws ApiException {
        try {
            ApiResponse<Shapes> resp = deleteSlideShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Shapes> resp = deleteSlideShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a shape.
     * 
     * @param request Request for deleteSlideShape. (required)
     * @return ApiResponse&lt;Shapes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Shapes> deleteSlideShapeWithHttpInfo(DeleteSlideShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideShapeCall(request, null, null);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a shape. (asynchronously)
     * 
     * @param request Request for deleteSlideShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideShapeAsync(DeleteSlideShapeRequest request, final ApiCallback<Shapes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlideShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlideShapes
     * @param request Request for deleteSlideShapes. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideShapesCall(DeleteSlideShapesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideShapes(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideShapes(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "shapes", request.getShapes());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove a range of shapes.
     * 
     * @param request Request for deleteSlideShapes. (required)
     * @return Shapes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Shapes deleteSlideShapes(DeleteSlideShapesRequest request) throws ApiException {
        try {
            ApiResponse<Shapes> resp = deleteSlideShapesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Shapes> resp = deleteSlideShapesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove a range of shapes.
     * 
     * @param request Request for deleteSlideShapes. (required)
     * @return ApiResponse&lt;Shapes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Shapes> deleteSlideShapesWithHttpInfo(DeleteSlideShapesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideShapesCall(request, null, null);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove a range of shapes. (asynchronously)
     * 
     * @param request Request for deleteSlideShapes. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideShapesAsync(DeleteSlideShapesRequest request, final ApiCallback<Shapes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlideShapesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlidesCleanSlidesList
     * @param request Request for deleteSlidesCleanSlidesList. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesCleanSlidesListCall(DeleteSlidesCleanSlidesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlidesCleanSlidesList(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "slides", request.getSlides());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Delete presentation slides.
     * 
     * @param request Request for deleteSlidesCleanSlidesList. (required)
     * @return Slides
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Slides deleteSlidesCleanSlidesList(DeleteSlidesCleanSlidesListRequest request) throws ApiException {
        try {
            ApiResponse<Slides> resp = deleteSlidesCleanSlidesListWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Slides> resp = deleteSlidesCleanSlidesListWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Delete presentation slides.
     * 
     * @param request Request for deleteSlidesCleanSlidesList. (required)
     * @return ApiResponse&lt;Slides&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Slides> deleteSlidesCleanSlidesListWithHttpInfo(DeleteSlidesCleanSlidesListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlidesCleanSlidesListCall(request, null, null);
        Type returnType = new TypeToken<Slides>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Delete presentation slides. (asynchronously)
     * 
     * @param request Request for deleteSlidesCleanSlidesList. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesCleanSlidesListAsync(DeleteSlidesCleanSlidesListRequest request, final ApiCallback<Slides> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlidesCleanSlidesListCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Slides>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlidesDocumentProperties
     * @param request Request for deleteSlidesDocumentProperties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesDocumentPropertiesCall(DeleteSlidesDocumentPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlidesDocumentProperties(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/documentproperties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Clean document properties.
     * 
     * @param request Request for deleteSlidesDocumentProperties. (required)
     * @return DocumentProperties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentProperties deleteSlidesDocumentProperties(DeleteSlidesDocumentPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<DocumentProperties> resp = deleteSlidesDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentProperties> resp = deleteSlidesDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Clean document properties.
     * 
     * @param request Request for deleteSlidesDocumentProperties. (required)
     * @return ApiResponse&lt;DocumentProperties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentProperties> deleteSlidesDocumentPropertiesWithHttpInfo(DeleteSlidesDocumentPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlidesDocumentPropertiesCall(request, null, null);
        Type returnType = new TypeToken<DocumentProperties>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Clean document properties. (asynchronously)
     * 
     * @param request Request for deleteSlidesDocumentProperties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesDocumentPropertiesAsync(DeleteSlidesDocumentPropertiesRequest request, final ApiCallback<DocumentProperties> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlidesDocumentPropertiesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentProperties>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlidesDocumentProperty
     * @param request Request for deleteSlidesDocumentProperty. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesDocumentPropertyCall(DeleteSlidesDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlidesDocumentProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (request.getPropertyName() == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling deleteSlidesDocumentProperty(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "propertyName" + "\\}", apiClient.objectToString(request.getPropertyName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Delete document property.
     * 
     * @param request Request for deleteSlidesDocumentProperty. (required)
     * @return DocumentProperties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentProperties deleteSlidesDocumentProperty(DeleteSlidesDocumentPropertyRequest request) throws ApiException {
        try {
            ApiResponse<DocumentProperties> resp = deleteSlidesDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentProperties> resp = deleteSlidesDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Delete document property.
     * 
     * @param request Request for deleteSlidesDocumentProperty. (required)
     * @return ApiResponse&lt;DocumentProperties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentProperties> deleteSlidesDocumentPropertyWithHttpInfo(DeleteSlidesDocumentPropertyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlidesDocumentPropertyCall(request, null, null);
        Type returnType = new TypeToken<DocumentProperties>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Delete document property. (asynchronously)
     * 
     * @param request Request for deleteSlidesDocumentProperty. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesDocumentPropertyAsync(DeleteSlidesDocumentPropertyRequest request, final ApiCallback<DocumentProperties> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlidesDocumentPropertyCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentProperties>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlidesSlideBackground
     * @param request Request for deleteSlidesSlideBackground. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesSlideBackgroundCall(DeleteSlidesSlideBackgroundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlidesSlideBackground(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlidesSlideBackground(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/background"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove background from a slide.
     * 
     * @param request Request for deleteSlidesSlideBackground. (required)
     * @return SlideBackground
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideBackground deleteSlidesSlideBackground(DeleteSlidesSlideBackgroundRequest request) throws ApiException {
        try {
            ApiResponse<SlideBackground> resp = deleteSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideBackground> resp = deleteSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove background from a slide.
     * 
     * @param request Request for deleteSlidesSlideBackground. (required)
     * @return ApiResponse&lt;SlideBackground&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideBackground> deleteSlidesSlideBackgroundWithHttpInfo(DeleteSlidesSlideBackgroundRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlidesSlideBackgroundCall(request, null, null);
        Type returnType = new TypeToken<SlideBackground>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Remove background from a slide. (asynchronously)
     * 
     * @param request Request for deleteSlidesSlideBackground. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesSlideBackgroundAsync(DeleteSlidesSlideBackgroundRequest request, final ApiCallback<SlideBackground> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlidesSlideBackgroundCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideBackground>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for downloadFile
     * @param request Request for downloadFile. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call downloadFileCall(DownloadFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/file/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storageName", request.getStorageName());
        apiClient.addQueryParameter(queryParams, "versionId", request.getVersionId());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Download file
     * 
     * @param request Request for downloadFile. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File downloadFile(DownloadFileRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = downloadFileWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = downloadFileWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Download file
     * 
     * @param request Request for downloadFile. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> downloadFileWithHttpInfo(DownloadFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = downloadFileCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Download file (asynchronously)
     * 
     * @param request Request for downloadFile. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call downloadFileAsync(DownloadFileRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = downloadFileCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getDiscUsage
     * @param request Request for getDiscUsage. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDiscUsageCall(GetDiscUsageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/disc"
            ;

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storageName", request.getStorageName());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Get disc usage
     * 
     * @param request Request for getDiscUsage. (required)
     * @return DiscUsage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DiscUsage getDiscUsage(GetDiscUsageRequest request) throws ApiException {
        try {
            ApiResponse<DiscUsage> resp = getDiscUsageWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DiscUsage> resp = getDiscUsageWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Get disc usage
     * 
     * @param request Request for getDiscUsage. (required)
     * @return ApiResponse&lt;DiscUsage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DiscUsage> getDiscUsageWithHttpInfo(GetDiscUsageRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getDiscUsageCall(request, null, null);
        Type returnType = new TypeToken<DiscUsage>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get disc usage (asynchronously)
     * 
     * @param request Request for getDiscUsage. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDiscUsageAsync(GetDiscUsageRequest request, final ApiCallback<DiscUsage> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDiscUsageCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DiscUsage>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getFileVersions
     * @param request Request for getFileVersions. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFileVersionsCall(GetFileVersionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/version/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storageName", request.getStorageName());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Get file versions
     * 
     * @param request Request for getFileVersions. (required)
     * @return FileVersions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileVersions getFileVersions(GetFileVersionsRequest request) throws ApiException {
        try {
            ApiResponse<FileVersions> resp = getFileVersionsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<FileVersions> resp = getFileVersionsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Get file versions
     * 
     * @param request Request for getFileVersions. (required)
     * @return ApiResponse&lt;FileVersions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileVersions> getFileVersionsWithHttpInfo(GetFileVersionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getFileVersionsCall(request, null, null);
        Type returnType = new TypeToken<FileVersions>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get file versions (asynchronously)
     * 
     * @param request Request for getFileVersions. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFileVersionsAsync(GetFileVersionsRequest request, final ApiCallback<FileVersions> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFileVersionsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<FileVersions>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getFilesList
     * @param request Request for getFilesList. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFilesListCall(GetFilesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/folder/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storageName", request.getStorageName());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Get all files and folders within a folder
     * 
     * @param request Request for getFilesList. (required)
     * @return FilesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesList getFilesList(GetFilesListRequest request) throws ApiException {
        try {
            ApiResponse<FilesList> resp = getFilesListWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<FilesList> resp = getFilesListWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Get all files and folders within a folder
     * 
     * @param request Request for getFilesList. (required)
     * @return ApiResponse&lt;FilesList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesList> getFilesListWithHttpInfo(GetFilesListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getFilesListCall(request, null, null);
        Type returnType = new TypeToken<FilesList>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get all files and folders within a folder (asynchronously)
     * 
     * @param request Request for getFilesList. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFilesListAsync(GetFilesListRequest request, final ApiCallback<FilesList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFilesListCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<FilesList>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getLayoutSlide
     * @param request Request for getLayoutSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLayoutSlideCall(GetLayoutSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getLayoutSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getLayoutSlide(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/layoutSlides/{slideIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation layoutSlide info.
     * 
     * @param request Request for getLayoutSlide. (required)
     * @return LayoutSlide
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LayoutSlide getLayoutSlide(GetLayoutSlideRequest request) throws ApiException {
        try {
            ApiResponse<LayoutSlide> resp = getLayoutSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<LayoutSlide> resp = getLayoutSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation layoutSlide info.
     * 
     * @param request Request for getLayoutSlide. (required)
     * @return ApiResponse&lt;LayoutSlide&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LayoutSlide> getLayoutSlideWithHttpInfo(GetLayoutSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getLayoutSlideCall(request, null, null);
        Type returnType = new TypeToken<LayoutSlide>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read presentation layoutSlide info. (asynchronously)
     * 
     * @param request Request for getLayoutSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLayoutSlideAsync(GetLayoutSlideRequest request, final ApiCallback<LayoutSlide> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLayoutSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<LayoutSlide>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getLayoutSlidesList
     * @param request Request for getLayoutSlidesList. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLayoutSlidesListCall(GetLayoutSlidesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getLayoutSlidesList(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/layoutSlides"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation layoutSlides info.
     * 
     * @param request Request for getLayoutSlidesList. (required)
     * @return LayoutSlides
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LayoutSlides getLayoutSlidesList(GetLayoutSlidesListRequest request) throws ApiException {
        try {
            ApiResponse<LayoutSlides> resp = getLayoutSlidesListWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<LayoutSlides> resp = getLayoutSlidesListWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation layoutSlides info.
     * 
     * @param request Request for getLayoutSlidesList. (required)
     * @return ApiResponse&lt;LayoutSlides&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LayoutSlides> getLayoutSlidesListWithHttpInfo(GetLayoutSlidesListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getLayoutSlidesListCall(request, null, null);
        Type returnType = new TypeToken<LayoutSlides>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read presentation layoutSlides info. (asynchronously)
     * 
     * @param request Request for getLayoutSlidesList. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLayoutSlidesListAsync(GetLayoutSlidesListRequest request, final ApiCallback<LayoutSlides> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLayoutSlidesListCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<LayoutSlides>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getMasterSlide
     * @param request Request for getMasterSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMasterSlideCall(GetMasterSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getMasterSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getMasterSlide(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/masterSlides/{slideIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation masterSlide info.
     * 
     * @param request Request for getMasterSlide. (required)
     * @return MasterSlide
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MasterSlide getMasterSlide(GetMasterSlideRequest request) throws ApiException {
        try {
            ApiResponse<MasterSlide> resp = getMasterSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<MasterSlide> resp = getMasterSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation masterSlide info.
     * 
     * @param request Request for getMasterSlide. (required)
     * @return ApiResponse&lt;MasterSlide&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MasterSlide> getMasterSlideWithHttpInfo(GetMasterSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getMasterSlideCall(request, null, null);
        Type returnType = new TypeToken<MasterSlide>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read presentation masterSlide info. (asynchronously)
     * 
     * @param request Request for getMasterSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMasterSlideAsync(GetMasterSlideRequest request, final ApiCallback<MasterSlide> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMasterSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<MasterSlide>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getMasterSlidesList
     * @param request Request for getMasterSlidesList. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMasterSlidesListCall(GetMasterSlidesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getMasterSlidesList(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/masterSlides"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation masterSlides info.
     * 
     * @param request Request for getMasterSlidesList. (required)
     * @return MasterSlides
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MasterSlides getMasterSlidesList(GetMasterSlidesListRequest request) throws ApiException {
        try {
            ApiResponse<MasterSlides> resp = getMasterSlidesListWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<MasterSlides> resp = getMasterSlidesListWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation masterSlides info.
     * 
     * @param request Request for getMasterSlidesList. (required)
     * @return ApiResponse&lt;MasterSlides&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MasterSlides> getMasterSlidesListWithHttpInfo(GetMasterSlidesListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getMasterSlidesListCall(request, null, null);
        Type returnType = new TypeToken<MasterSlides>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read presentation masterSlides info. (asynchronously)
     * 
     * @param request Request for getMasterSlidesList. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMasterSlidesListAsync(GetMasterSlidesListRequest request, final ApiCallback<MasterSlides> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMasterSlidesListCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<MasterSlides>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlide
     * @param request Request for getNotesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideCall(GetNotesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlide(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read notes slide info.
     * 
     * @param request Request for getNotesSlide. (required)
     * @return NotesSlide
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NotesSlide getNotesSlide(GetNotesSlideRequest request) throws ApiException {
        try {
            ApiResponse<NotesSlide> resp = getNotesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<NotesSlide> resp = getNotesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read notes slide info.
     * 
     * @param request Request for getNotesSlide. (required)
     * @return ApiResponse&lt;NotesSlide&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NotesSlide> getNotesSlideWithHttpInfo(GetNotesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideCall(request, null, null);
        Type returnType = new TypeToken<NotesSlide>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read notes slide info. (asynchronously)
     * 
     * @param request Request for getNotesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideAsync(GetNotesSlideRequest request, final ApiCallback<NotesSlide> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<NotesSlide>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShape
     * @param request Request for getNotesSlideShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeCall(GetNotesSlideShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getNotesSlideShape(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide shape info.
     * 
     * @param request Request for getNotesSlideShape. (required)
     * @return ShapeBase
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeBase getNotesSlideShape(GetNotesSlideShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeBase> resp = getNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeBase> resp = getNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shape info.
     * 
     * @param request Request for getNotesSlideShape. (required)
     * @return ApiResponse&lt;ShapeBase&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeBase> getNotesSlideShapeWithHttpInfo(GetNotesSlideShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide shape info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeAsync(GetNotesSlideShapeRequest request, final ApiCallback<ShapeBase> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShapeParagraph
     * @param request Request for getNotesSlideShapeParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeParagraphCall(GetNotesSlideShapeParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getNotesSlideShapeParagraph(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read shape paragraph info.
     * 
     * @param request Request for getNotesSlideShapeParagraph. (required)
     * @return Paragraph
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraph getNotesSlideShapeParagraph(GetNotesSlideShapeParagraphRequest request) throws ApiException {
        try {
            ApiResponse<Paragraph> resp = getNotesSlideShapeParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraph> resp = getNotesSlideShapeParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read shape paragraph info.
     * 
     * @param request Request for getNotesSlideShapeParagraph. (required)
     * @return ApiResponse&lt;Paragraph&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraph> getNotesSlideShapeParagraphWithHttpInfo(GetNotesSlideShapeParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapeParagraphCall(request, null, null);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read shape paragraph info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShapeParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeParagraphAsync(GetNotesSlideShapeParagraphRequest request, final ApiCallback<Paragraph> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapeParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShapeParagraphs
     * @param request Request for getNotesSlideShapeParagraphs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeParagraphsCall(GetNotesSlideShapeParagraphsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShapeParagraphs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShapeParagraphs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getNotesSlideShapeParagraphs(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read shape paragraphs info.
     * 
     * @param request Request for getNotesSlideShapeParagraphs. (required)
     * @return Paragraphs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraphs getNotesSlideShapeParagraphs(GetNotesSlideShapeParagraphsRequest request) throws ApiException {
        try {
            ApiResponse<Paragraphs> resp = getNotesSlideShapeParagraphsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraphs> resp = getNotesSlideShapeParagraphsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read shape paragraphs info.
     * 
     * @param request Request for getNotesSlideShapeParagraphs. (required)
     * @return ApiResponse&lt;Paragraphs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraphs> getNotesSlideShapeParagraphsWithHttpInfo(GetNotesSlideShapeParagraphsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapeParagraphsCall(request, null, null);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read shape paragraphs info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShapeParagraphs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeParagraphsAsync(GetNotesSlideShapeParagraphsRequest request, final ApiCallback<Paragraphs> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapeParagraphsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShapePortion
     * @param request Request for getNotesSlideShapePortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapePortionCall(GetNotesSlideShapePortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling getNotesSlideShapePortion(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex())).replaceAll("\\{" + "portionIndex" + "\\}", apiClient.objectToString(request.getPortionIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read paragraph portion info.
     * 
     * @param request Request for getNotesSlideShapePortion. (required)
     * @return Portion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portion getNotesSlideShapePortion(GetNotesSlideShapePortionRequest request) throws ApiException {
        try {
            ApiResponse<Portion> resp = getNotesSlideShapePortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portion> resp = getNotesSlideShapePortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read paragraph portion info.
     * 
     * @param request Request for getNotesSlideShapePortion. (required)
     * @return ApiResponse&lt;Portion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portion> getNotesSlideShapePortionWithHttpInfo(GetNotesSlideShapePortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapePortionCall(request, null, null);
        Type returnType = new TypeToken<Portion>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read paragraph portion info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShapePortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapePortionAsync(GetNotesSlideShapePortionRequest request, final ApiCallback<Portion> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapePortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portion>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShapePortions
     * @param request Request for getNotesSlideShapePortions. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapePortionsCall(GetNotesSlideShapePortionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShapePortions(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShapePortions(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getNotesSlideShapePortions(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getNotesSlideShapePortions(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read paragraph portions info.
     * 
     * @param request Request for getNotesSlideShapePortions. (required)
     * @return Portions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portions getNotesSlideShapePortions(GetNotesSlideShapePortionsRequest request) throws ApiException {
        try {
            ApiResponse<Portions> resp = getNotesSlideShapePortionsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portions> resp = getNotesSlideShapePortionsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read paragraph portions info.
     * 
     * @param request Request for getNotesSlideShapePortions. (required)
     * @return ApiResponse&lt;Portions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portions> getNotesSlideShapePortionsWithHttpInfo(GetNotesSlideShapePortionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapePortionsCall(request, null, null);
        Type returnType = new TypeToken<Portions>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read paragraph portions info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShapePortions. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapePortionsAsync(GetNotesSlideShapePortionsRequest request, final ApiCallback<Portions> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapePortionsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portions>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShapes
     * @param request Request for getNotesSlideShapes. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapesCall(GetNotesSlideShapesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShapes(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShapes(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide shapes info.
     * 
     * @param request Request for getNotesSlideShapes. (required)
     * @return Shapes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Shapes getNotesSlideShapes(GetNotesSlideShapesRequest request) throws ApiException {
        try {
            ApiResponse<Shapes> resp = getNotesSlideShapesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Shapes> resp = getNotesSlideShapesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes info.
     * 
     * @param request Request for getNotesSlideShapes. (required)
     * @return ApiResponse&lt;Shapes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Shapes> getNotesSlideShapesWithHttpInfo(GetNotesSlideShapesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapesCall(request, null, null);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide shapes info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShapes. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapesAsync(GetNotesSlideShapesRequest request, final ApiCallback<Shapes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideWithFormat
     * @param request Request for getNotesSlideWithFormat. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideWithFormatCall(GetNotesSlideWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideWithFormat(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideWithFormat(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getNotesSlideWithFormat(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "width", request.getWidth());
        apiClient.addQueryParameter(queryParams, "height", request.getHeight());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Convert notes slide to the specified image format.
     * 
     * @param request Request for getNotesSlideWithFormat. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getNotesSlideWithFormat(GetNotesSlideWithFormatRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getNotesSlideWithFormatWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = getNotesSlideWithFormatWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Convert notes slide to the specified image format.
     * 
     * @param request Request for getNotesSlideWithFormat. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getNotesSlideWithFormatWithHttpInfo(GetNotesSlideWithFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideWithFormatCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Convert notes slide to the specified image format. (asynchronously)
     * 
     * @param request Request for getNotesSlideWithFormat. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideWithFormatAsync(GetNotesSlideWithFormatRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideWithFormatCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getParagraphPortion
     * @param request Request for getParagraphPortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getParagraphPortionCall(GetParagraphPortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getParagraphPortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getParagraphPortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getParagraphPortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getParagraphPortion(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling getParagraphPortion(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex())).replaceAll("\\{" + "portionIndex" + "\\}", apiClient.objectToString(request.getPortionIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read paragraph portion info.
     * 
     * @param request Request for getParagraphPortion. (required)
     * @return Portion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portion getParagraphPortion(GetParagraphPortionRequest request) throws ApiException {
        try {
            ApiResponse<Portion> resp = getParagraphPortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portion> resp = getParagraphPortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read paragraph portion info.
     * 
     * @param request Request for getParagraphPortion. (required)
     * @return ApiResponse&lt;Portion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portion> getParagraphPortionWithHttpInfo(GetParagraphPortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getParagraphPortionCall(request, null, null);
        Type returnType = new TypeToken<Portion>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read paragraph portion info. (asynchronously)
     * 
     * @param request Request for getParagraphPortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getParagraphPortionAsync(GetParagraphPortionRequest request, final ApiCallback<Portion> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getParagraphPortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portion>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getParagraphPortions
     * @param request Request for getParagraphPortions. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getParagraphPortionsCall(GetParagraphPortionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getParagraphPortions(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getParagraphPortions(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getParagraphPortions(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getParagraphPortions(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read paragraph portions info.
     * 
     * @param request Request for getParagraphPortions. (required)
     * @return Portions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portions getParagraphPortions(GetParagraphPortionsRequest request) throws ApiException {
        try {
            ApiResponse<Portions> resp = getParagraphPortionsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portions> resp = getParagraphPortionsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read paragraph portions info.
     * 
     * @param request Request for getParagraphPortions. (required)
     * @return ApiResponse&lt;Portions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portions> getParagraphPortionsWithHttpInfo(GetParagraphPortionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getParagraphPortionsCall(request, null, null);
        Type returnType = new TypeToken<Portions>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read paragraph portions info. (asynchronously)
     * 
     * @param request Request for getParagraphPortions. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getParagraphPortionsAsync(GetParagraphPortionsRequest request, final ApiCallback<Portions> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getParagraphPortionsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portions>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlideAnimation
     * @param request Request for getSlideAnimation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlideAnimationCall(GetSlideAnimationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlideAnimation(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlideAnimation(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getSlideAnimation(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "shapeIndex", request.getShapeIndex());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide animation effects.
     * 
     * @param request Request for getSlideAnimation. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation getSlideAnimation(GetSlideAnimationRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = getSlideAnimationWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = getSlideAnimationWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide animation effects.
     * 
     * @param request Request for getSlideAnimation. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> getSlideAnimationWithHttpInfo(GetSlideAnimationRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlideAnimationCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide animation effects. (asynchronously)
     * 
     * @param request Request for getSlideAnimation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlideAnimationAsync(GetSlideAnimationRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlideAnimationCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlideShape
     * @param request Request for getSlideShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlideShapeCall(GetSlideShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlideShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlideShape(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getSlideShape(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide shape info.
     * 
     * @param request Request for getSlideShape. (required)
     * @return ShapeBase
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeBase getSlideShape(GetSlideShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeBase> resp = getSlideShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeBase> resp = getSlideShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shape info.
     * 
     * @param request Request for getSlideShape. (required)
     * @return ApiResponse&lt;ShapeBase&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeBase> getSlideShapeWithHttpInfo(GetSlideShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlideShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide shape info. (asynchronously)
     * 
     * @param request Request for getSlideShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlideShapeAsync(GetSlideShapeRequest request, final ApiCallback<ShapeBase> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlideShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlideShapeParagraph
     * @param request Request for getSlideShapeParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlideShapeParagraphCall(GetSlideShapeParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getSlideShapeParagraph(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read shape paragraph info.
     * 
     * @param request Request for getSlideShapeParagraph. (required)
     * @return Paragraph
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraph getSlideShapeParagraph(GetSlideShapeParagraphRequest request) throws ApiException {
        try {
            ApiResponse<Paragraph> resp = getSlideShapeParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraph> resp = getSlideShapeParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read shape paragraph info.
     * 
     * @param request Request for getSlideShapeParagraph. (required)
     * @return ApiResponse&lt;Paragraph&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraph> getSlideShapeParagraphWithHttpInfo(GetSlideShapeParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlideShapeParagraphCall(request, null, null);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read shape paragraph info. (asynchronously)
     * 
     * @param request Request for getSlideShapeParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlideShapeParagraphAsync(GetSlideShapeParagraphRequest request, final ApiCallback<Paragraph> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlideShapeParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlideShapeParagraphs
     * @param request Request for getSlideShapeParagraphs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlideShapeParagraphsCall(GetSlideShapeParagraphsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlideShapeParagraphs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlideShapeParagraphs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getSlideShapeParagraphs(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read shape paragraphs info.
     * 
     * @param request Request for getSlideShapeParagraphs. (required)
     * @return Paragraphs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraphs getSlideShapeParagraphs(GetSlideShapeParagraphsRequest request) throws ApiException {
        try {
            ApiResponse<Paragraphs> resp = getSlideShapeParagraphsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraphs> resp = getSlideShapeParagraphsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read shape paragraphs info.
     * 
     * @param request Request for getSlideShapeParagraphs. (required)
     * @return ApiResponse&lt;Paragraphs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraphs> getSlideShapeParagraphsWithHttpInfo(GetSlideShapeParagraphsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlideShapeParagraphsCall(request, null, null);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read shape paragraphs info. (asynchronously)
     * 
     * @param request Request for getSlideShapeParagraphs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlideShapeParagraphsAsync(GetSlideShapeParagraphsRequest request, final ApiCallback<Paragraphs> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlideShapeParagraphsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraphs>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlideShapes
     * @param request Request for getSlideShapes. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlideShapesCall(GetSlideShapesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlideShapes(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlideShapes(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide shapes info.
     * 
     * @param request Request for getSlideShapes. (required)
     * @return Shapes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Shapes getSlideShapes(GetSlideShapesRequest request) throws ApiException {
        try {
            ApiResponse<Shapes> resp = getSlideShapesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Shapes> resp = getSlideShapesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes info.
     * 
     * @param request Request for getSlideShapes. (required)
     * @return ApiResponse&lt;Shapes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Shapes> getSlideShapesWithHttpInfo(GetSlideShapesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlideShapesCall(request, null, null);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide shapes info. (asynchronously)
     * 
     * @param request Request for getSlideShapes. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlideShapesAsync(GetSlideShapesRequest request, final ApiCallback<Shapes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlideShapesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Shapes>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesApiInfo
     * @param request Request for getSlidesApiInfo. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesApiInfoCall(GetSlidesApiInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/info"
            ;

        List<Pair> queryParams = new ArrayList<Pair>();

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Get API info.
     * 
     * @param request Request for getSlidesApiInfo. (required)
     * @return ApiInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiInfo getSlidesApiInfo(GetSlidesApiInfoRequest request) throws ApiException {
        try {
            ApiResponse<ApiInfo> resp = getSlidesApiInfoWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ApiInfo> resp = getSlidesApiInfoWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Get API info.
     * 
     * @param request Request for getSlidesApiInfo. (required)
     * @return ApiResponse&lt;ApiInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiInfo> getSlidesApiInfoWithHttpInfo(GetSlidesApiInfoRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesApiInfoCall(request, null, null);
        Type returnType = new TypeToken<ApiInfo>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get API info. (asynchronously)
     * 
     * @param request Request for getSlidesApiInfo. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesApiInfoAsync(GetSlidesApiInfoRequest request, final ApiCallback<ApiInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesApiInfoCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ApiInfo>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesDocument
     * @param request Request for getSlidesDocument. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentCall(GetSlidesDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesDocument(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation info.
     * 
     * @param request Request for getSlidesDocument. (required)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Document getSlidesDocument(GetSlidesDocumentRequest request) throws ApiException {
        try {
            ApiResponse<Document> resp = getSlidesDocumentWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Document> resp = getSlidesDocumentWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation info.
     * 
     * @param request Request for getSlidesDocument. (required)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Document> getSlidesDocumentWithHttpInfo(GetSlidesDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesDocumentCall(request, null, null);
        Type returnType = new TypeToken<Document>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read presentation info. (asynchronously)
     * 
     * @param request Request for getSlidesDocument. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentAsync(GetSlidesDocumentRequest request, final ApiCallback<Document> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesDocumentCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Document>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesDocumentProperties
     * @param request Request for getSlidesDocumentProperties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentPropertiesCall(GetSlidesDocumentPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesDocumentProperties(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/documentproperties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation document properties.
     * 
     * @param request Request for getSlidesDocumentProperties. (required)
     * @return DocumentProperties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentProperties getSlidesDocumentProperties(GetSlidesDocumentPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<DocumentProperties> resp = getSlidesDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentProperties> resp = getSlidesDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation document properties.
     * 
     * @param request Request for getSlidesDocumentProperties. (required)
     * @return ApiResponse&lt;DocumentProperties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentProperties> getSlidesDocumentPropertiesWithHttpInfo(GetSlidesDocumentPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesDocumentPropertiesCall(request, null, null);
        Type returnType = new TypeToken<DocumentProperties>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read presentation document properties. (asynchronously)
     * 
     * @param request Request for getSlidesDocumentProperties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentPropertiesAsync(GetSlidesDocumentPropertiesRequest request, final ApiCallback<DocumentProperties> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesDocumentPropertiesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentProperties>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesDocumentProperty
     * @param request Request for getSlidesDocumentProperty. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentPropertyCall(GetSlidesDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesDocumentProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (request.getPropertyName() == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling getSlidesDocumentProperty(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "propertyName" + "\\}", apiClient.objectToString(request.getPropertyName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation document property.
     * 
     * @param request Request for getSlidesDocumentProperty. (required)
     * @return DocumentProperty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentProperty getSlidesDocumentProperty(GetSlidesDocumentPropertyRequest request) throws ApiException {
        try {
            ApiResponse<DocumentProperty> resp = getSlidesDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentProperty> resp = getSlidesDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation document property.
     * 
     * @param request Request for getSlidesDocumentProperty. (required)
     * @return ApiResponse&lt;DocumentProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentProperty> getSlidesDocumentPropertyWithHttpInfo(GetSlidesDocumentPropertyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesDocumentPropertyCall(request, null, null);
        Type returnType = new TypeToken<DocumentProperty>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read presentation document property. (asynchronously)
     * 
     * @param request Request for getSlidesDocumentProperty. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentPropertyAsync(GetSlidesDocumentPropertyRequest request, final ApiCallback<DocumentProperty> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesDocumentPropertyCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentProperty>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesImageWithDefaultFormat
     * @param request Request for getSlidesImageWithDefaultFormat. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesImageWithDefaultFormatCall(GetSlidesImageWithDefaultFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesImageWithDefaultFormat(Async)");
        }
        
        // verify the required parameter 'index' is set
        if (request.getIndex() == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getSlidesImageWithDefaultFormat(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/images/{index}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "index" + "\\}", apiClient.objectToString(request.getIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Get image binary data.
     * 
     * @param request Request for getSlidesImageWithDefaultFormat. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getSlidesImageWithDefaultFormat(GetSlidesImageWithDefaultFormatRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getSlidesImageWithDefaultFormatWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = getSlidesImageWithDefaultFormatWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Get image binary data.
     * 
     * @param request Request for getSlidesImageWithDefaultFormat. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getSlidesImageWithDefaultFormatWithHttpInfo(GetSlidesImageWithDefaultFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesImageWithDefaultFormatCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get image binary data. (asynchronously)
     * 
     * @param request Request for getSlidesImageWithDefaultFormat. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesImageWithDefaultFormatAsync(GetSlidesImageWithDefaultFormatRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesImageWithDefaultFormatCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesImageWithFormat
     * @param request Request for getSlidesImageWithFormat. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesImageWithFormatCall(GetSlidesImageWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesImageWithFormat(Async)");
        }
        
        // verify the required parameter 'index' is set
        if (request.getIndex() == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getSlidesImageWithFormat(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getSlidesImageWithFormat(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/images/{index}/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "index" + "\\}", apiClient.objectToString(request.getIndex())).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Get image in specified format.
     * 
     * @param request Request for getSlidesImageWithFormat. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getSlidesImageWithFormat(GetSlidesImageWithFormatRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getSlidesImageWithFormatWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = getSlidesImageWithFormatWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Get image in specified format.
     * 
     * @param request Request for getSlidesImageWithFormat. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getSlidesImageWithFormatWithHttpInfo(GetSlidesImageWithFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesImageWithFormatCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get image in specified format. (asynchronously)
     * 
     * @param request Request for getSlidesImageWithFormat. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesImageWithFormatAsync(GetSlidesImageWithFormatRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesImageWithFormatCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesImages
     * @param request Request for getSlidesImages. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesImagesCall(GetSlidesImagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesImages(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/images"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation images info.
     * 
     * @param request Request for getSlidesImages. (required)
     * @return Images
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Images getSlidesImages(GetSlidesImagesRequest request) throws ApiException {
        try {
            ApiResponse<Images> resp = getSlidesImagesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Images> resp = getSlidesImagesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation images info.
     * 
     * @param request Request for getSlidesImages. (required)
     * @return ApiResponse&lt;Images&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Images> getSlidesImagesWithHttpInfo(GetSlidesImagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesImagesCall(request, null, null);
        Type returnType = new TypeToken<Images>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read presentation images info. (asynchronously)
     * 
     * @param request Request for getSlidesImages. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesImagesAsync(GetSlidesImagesRequest request, final ApiCallback<Images> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesImagesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Images>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesPlaceholder
     * @param request Request for getSlidesPlaceholder. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesPlaceholderCall(GetSlidesPlaceholderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesPlaceholder(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesPlaceholder(Async)");
        }
        
        // verify the required parameter 'placeholderIndex' is set
        if (request.getPlaceholderIndex() == null) {
            throw new ApiException("Missing the required parameter 'placeholderIndex' when calling getSlidesPlaceholder(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/placeholders/{placeholderIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "placeholderIndex" + "\\}", apiClient.objectToString(request.getPlaceholderIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide placeholder info.
     * 
     * @param request Request for getSlidesPlaceholder. (required)
     * @return Placeholder
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Placeholder getSlidesPlaceholder(GetSlidesPlaceholderRequest request) throws ApiException {
        try {
            ApiResponse<Placeholder> resp = getSlidesPlaceholderWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Placeholder> resp = getSlidesPlaceholderWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide placeholder info.
     * 
     * @param request Request for getSlidesPlaceholder. (required)
     * @return ApiResponse&lt;Placeholder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Placeholder> getSlidesPlaceholderWithHttpInfo(GetSlidesPlaceholderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesPlaceholderCall(request, null, null);
        Type returnType = new TypeToken<Placeholder>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide placeholder info. (asynchronously)
     * 
     * @param request Request for getSlidesPlaceholder. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesPlaceholderAsync(GetSlidesPlaceholderRequest request, final ApiCallback<Placeholder> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesPlaceholderCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Placeholder>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesPlaceholders
     * @param request Request for getSlidesPlaceholders. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesPlaceholdersCall(GetSlidesPlaceholdersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesPlaceholders(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesPlaceholders(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/placeholders"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide placeholders info.
     * 
     * @param request Request for getSlidesPlaceholders. (required)
     * @return Placeholders
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Placeholders getSlidesPlaceholders(GetSlidesPlaceholdersRequest request) throws ApiException {
        try {
            ApiResponse<Placeholders> resp = getSlidesPlaceholdersWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Placeholders> resp = getSlidesPlaceholdersWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide placeholders info.
     * 
     * @param request Request for getSlidesPlaceholders. (required)
     * @return ApiResponse&lt;Placeholders&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Placeholders> getSlidesPlaceholdersWithHttpInfo(GetSlidesPlaceholdersRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesPlaceholdersCall(request, null, null);
        Type returnType = new TypeToken<Placeholders>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide placeholders info. (asynchronously)
     * 
     * @param request Request for getSlidesPlaceholders. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesPlaceholdersAsync(GetSlidesPlaceholdersRequest request, final ApiCallback<Placeholders> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesPlaceholdersCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Placeholders>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesPresentationTextItems
     * @param request Request for getSlidesPresentationTextItems. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesPresentationTextItemsCall(GetSlidesPresentationTextItemsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesPresentationTextItems(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/textItems"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "withEmpty", request.getWithEmpty());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Extract presentation text items.
     * 
     * @param request Request for getSlidesPresentationTextItems. (required)
     * @return TextItems
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TextItems getSlidesPresentationTextItems(GetSlidesPresentationTextItemsRequest request) throws ApiException {
        try {
            ApiResponse<TextItems> resp = getSlidesPresentationTextItemsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<TextItems> resp = getSlidesPresentationTextItemsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Extract presentation text items.
     * 
     * @param request Request for getSlidesPresentationTextItems. (required)
     * @return ApiResponse&lt;TextItems&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TextItems> getSlidesPresentationTextItemsWithHttpInfo(GetSlidesPresentationTextItemsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesPresentationTextItemsCall(request, null, null);
        Type returnType = new TypeToken<TextItems>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Extract presentation text items. (asynchronously)
     * 
     * @param request Request for getSlidesPresentationTextItems. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesPresentationTextItemsAsync(GetSlidesPresentationTextItemsRequest request, final ApiCallback<TextItems> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesPresentationTextItemsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<TextItems>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlide
     * @param request Request for getSlidesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideCall(GetSlidesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesSlide(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation slide info.
     * 
     * @param request Request for getSlidesSlide. (required)
     * @return Slide
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Slide getSlidesSlide(GetSlidesSlideRequest request) throws ApiException {
        try {
            ApiResponse<Slide> resp = getSlidesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Slide> resp = getSlidesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation slide info.
     * 
     * @param request Request for getSlidesSlide. (required)
     * @return ApiResponse&lt;Slide&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Slide> getSlidesSlideWithHttpInfo(GetSlidesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlideCall(request, null, null);
        Type returnType = new TypeToken<Slide>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read presentation slide info. (asynchronously)
     * 
     * @param request Request for getSlidesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideAsync(GetSlidesSlideRequest request, final ApiCallback<Slide> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Slide>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlideBackground
     * @param request Request for getSlidesSlideBackground. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideBackgroundCall(GetSlidesSlideBackgroundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlideBackground(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesSlideBackground(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/background"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide background info.
     * 
     * @param request Request for getSlidesSlideBackground. (required)
     * @return SlideBackground
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideBackground getSlidesSlideBackground(GetSlidesSlideBackgroundRequest request) throws ApiException {
        try {
            ApiResponse<SlideBackground> resp = getSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideBackground> resp = getSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide background info.
     * 
     * @param request Request for getSlidesSlideBackground. (required)
     * @return ApiResponse&lt;SlideBackground&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideBackground> getSlidesSlideBackgroundWithHttpInfo(GetSlidesSlideBackgroundRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlideBackgroundCall(request, null, null);
        Type returnType = new TypeToken<SlideBackground>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide background info. (asynchronously)
     * 
     * @param request Request for getSlidesSlideBackground. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideBackgroundAsync(GetSlidesSlideBackgroundRequest request, final ApiCallback<SlideBackground> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesSlideBackgroundCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideBackground>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlideComments
     * @param request Request for getSlidesSlideComments. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideCommentsCall(GetSlidesSlideCommentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlideComments(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesSlideComments(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/comments"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation slide comments.
     * 
     * @param request Request for getSlidesSlideComments. (required)
     * @return SlideComments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideComments getSlidesSlideComments(GetSlidesSlideCommentsRequest request) throws ApiException {
        try {
            ApiResponse<SlideComments> resp = getSlidesSlideCommentsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideComments> resp = getSlidesSlideCommentsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation slide comments.
     * 
     * @param request Request for getSlidesSlideComments. (required)
     * @return ApiResponse&lt;SlideComments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideComments> getSlidesSlideCommentsWithHttpInfo(GetSlidesSlideCommentsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlideCommentsCall(request, null, null);
        Type returnType = new TypeToken<SlideComments>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read presentation slide comments. (asynchronously)
     * 
     * @param request Request for getSlidesSlideComments. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideCommentsAsync(GetSlidesSlideCommentsRequest request, final ApiCallback<SlideComments> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesSlideCommentsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideComments>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlideImages
     * @param request Request for getSlidesSlideImages. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideImagesCall(GetSlidesSlideImagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlideImages(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesSlideImages(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/images"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide images info.
     * 
     * @param request Request for getSlidesSlideImages. (required)
     * @return Images
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Images getSlidesSlideImages(GetSlidesSlideImagesRequest request) throws ApiException {
        try {
            ApiResponse<Images> resp = getSlidesSlideImagesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Images> resp = getSlidesSlideImagesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide images info.
     * 
     * @param request Request for getSlidesSlideImages. (required)
     * @return ApiResponse&lt;Images&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Images> getSlidesSlideImagesWithHttpInfo(GetSlidesSlideImagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlideImagesCall(request, null, null);
        Type returnType = new TypeToken<Images>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide images info. (asynchronously)
     * 
     * @param request Request for getSlidesSlideImages. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideImagesAsync(GetSlidesSlideImagesRequest request, final ApiCallback<Images> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesSlideImagesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Images>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlideTextItems
     * @param request Request for getSlidesSlideTextItems. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideTextItemsCall(GetSlidesSlideTextItemsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlideTextItems(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesSlideTextItems(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/textItems"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "withEmpty", request.getWithEmpty());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Extract slide text items.
     * 
     * @param request Request for getSlidesSlideTextItems. (required)
     * @return TextItems
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TextItems getSlidesSlideTextItems(GetSlidesSlideTextItemsRequest request) throws ApiException {
        try {
            ApiResponse<TextItems> resp = getSlidesSlideTextItemsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<TextItems> resp = getSlidesSlideTextItemsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Extract slide text items.
     * 
     * @param request Request for getSlidesSlideTextItems. (required)
     * @return ApiResponse&lt;TextItems&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TextItems> getSlidesSlideTextItemsWithHttpInfo(GetSlidesSlideTextItemsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlideTextItemsCall(request, null, null);
        Type returnType = new TypeToken<TextItems>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Extract slide text items. (asynchronously)
     * 
     * @param request Request for getSlidesSlideTextItems. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideTextItemsAsync(GetSlidesSlideTextItemsRequest request, final ApiCallback<TextItems> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesSlideTextItemsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<TextItems>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlidesList
     * @param request Request for getSlidesSlidesList. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlidesListCall(GetSlidesSlidesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlidesList(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation slides info.
     * 
     * @param request Request for getSlidesSlidesList. (required)
     * @return Slides
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Slides getSlidesSlidesList(GetSlidesSlidesListRequest request) throws ApiException {
        try {
            ApiResponse<Slides> resp = getSlidesSlidesListWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Slides> resp = getSlidesSlidesListWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation slides info.
     * 
     * @param request Request for getSlidesSlidesList. (required)
     * @return ApiResponse&lt;Slides&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Slides> getSlidesSlidesListWithHttpInfo(GetSlidesSlidesListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlidesListCall(request, null, null);
        Type returnType = new TypeToken<Slides>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read presentation slides info. (asynchronously)
     * 
     * @param request Request for getSlidesSlidesList. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlidesListAsync(GetSlidesSlidesListRequest request, final ApiCallback<Slides> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesSlidesListCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Slides>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesTheme
     * @param request Request for getSlidesTheme. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeCall(GetSlidesThemeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesTheme(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesTheme(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/theme"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide theme info.
     * 
     * @param request Request for getSlidesTheme. (required)
     * @return Theme
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Theme getSlidesTheme(GetSlidesThemeRequest request) throws ApiException {
        try {
            ApiResponse<Theme> resp = getSlidesThemeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Theme> resp = getSlidesThemeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide theme info.
     * 
     * @param request Request for getSlidesTheme. (required)
     * @return ApiResponse&lt;Theme&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Theme> getSlidesThemeWithHttpInfo(GetSlidesThemeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesThemeCall(request, null, null);
        Type returnType = new TypeToken<Theme>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide theme info. (asynchronously)
     * 
     * @param request Request for getSlidesTheme. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeAsync(GetSlidesThemeRequest request, final ApiCallback<Theme> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesThemeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Theme>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesThemeColorScheme
     * @param request Request for getSlidesThemeColorScheme. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeColorSchemeCall(GetSlidesThemeColorSchemeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesThemeColorScheme(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesThemeColorScheme(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/theme/colorScheme"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide theme color scheme info.
     * 
     * @param request Request for getSlidesThemeColorScheme. (required)
     * @return ColorScheme
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ColorScheme getSlidesThemeColorScheme(GetSlidesThemeColorSchemeRequest request) throws ApiException {
        try {
            ApiResponse<ColorScheme> resp = getSlidesThemeColorSchemeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ColorScheme> resp = getSlidesThemeColorSchemeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide theme color scheme info.
     * 
     * @param request Request for getSlidesThemeColorScheme. (required)
     * @return ApiResponse&lt;ColorScheme&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ColorScheme> getSlidesThemeColorSchemeWithHttpInfo(GetSlidesThemeColorSchemeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesThemeColorSchemeCall(request, null, null);
        Type returnType = new TypeToken<ColorScheme>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide theme color scheme info. (asynchronously)
     * 
     * @param request Request for getSlidesThemeColorScheme. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeColorSchemeAsync(GetSlidesThemeColorSchemeRequest request, final ApiCallback<ColorScheme> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesThemeColorSchemeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ColorScheme>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesThemeFontScheme
     * @param request Request for getSlidesThemeFontScheme. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeFontSchemeCall(GetSlidesThemeFontSchemeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesThemeFontScheme(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesThemeFontScheme(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/theme/fontScheme"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide theme font scheme info.
     * 
     * @param request Request for getSlidesThemeFontScheme. (required)
     * @return FontScheme
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FontScheme getSlidesThemeFontScheme(GetSlidesThemeFontSchemeRequest request) throws ApiException {
        try {
            ApiResponse<FontScheme> resp = getSlidesThemeFontSchemeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<FontScheme> resp = getSlidesThemeFontSchemeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide theme font scheme info.
     * 
     * @param request Request for getSlidesThemeFontScheme. (required)
     * @return ApiResponse&lt;FontScheme&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FontScheme> getSlidesThemeFontSchemeWithHttpInfo(GetSlidesThemeFontSchemeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesThemeFontSchemeCall(request, null, null);
        Type returnType = new TypeToken<FontScheme>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide theme font scheme info. (asynchronously)
     * 
     * @param request Request for getSlidesThemeFontScheme. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeFontSchemeAsync(GetSlidesThemeFontSchemeRequest request, final ApiCallback<FontScheme> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesThemeFontSchemeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<FontScheme>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesThemeFormatScheme
     * @param request Request for getSlidesThemeFormatScheme. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeFormatSchemeCall(GetSlidesThemeFormatSchemeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesThemeFormatScheme(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesThemeFormatScheme(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/theme/formatScheme"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide theme format scheme info.
     * 
     * @param request Request for getSlidesThemeFormatScheme. (required)
     * @return FormatScheme
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FormatScheme getSlidesThemeFormatScheme(GetSlidesThemeFormatSchemeRequest request) throws ApiException {
        try {
            ApiResponse<FormatScheme> resp = getSlidesThemeFormatSchemeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<FormatScheme> resp = getSlidesThemeFormatSchemeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide theme format scheme info.
     * 
     * @param request Request for getSlidesThemeFormatScheme. (required)
     * @return ApiResponse&lt;FormatScheme&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FormatScheme> getSlidesThemeFormatSchemeWithHttpInfo(GetSlidesThemeFormatSchemeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesThemeFormatSchemeCall(request, null, null);
        Type returnType = new TypeToken<FormatScheme>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Read slide theme format scheme info. (asynchronously)
     * 
     * @param request Request for getSlidesThemeFormatScheme. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeFormatSchemeAsync(GetSlidesThemeFormatSchemeRequest request, final ApiCallback<FormatScheme> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesThemeFormatSchemeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<FormatScheme>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for moveFile
     * @param request Request for moveFile. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call moveFileCall(MoveFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'srcPath' is set
        if (request.getSrcPath() == null) {
            throw new ApiException("Missing the required parameter 'srcPath' when calling moveFile(Async)");
        }
        
        // verify the required parameter 'destPath' is set
        if (request.getDestPath() == null) {
            throw new ApiException("Missing the required parameter 'destPath' when calling moveFile(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/file/move/{srcPath}"
            .replaceAll("\\{" + "srcPath" + "\\}", apiClient.objectToString(request.getSrcPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "destPath", request.getDestPath());
        apiClient.addQueryParameter(queryParams, "srcStorageName", request.getSrcStorageName());
        apiClient.addQueryParameter(queryParams, "destStorageName", request.getDestStorageName());
        apiClient.addQueryParameter(queryParams, "versionId", request.getVersionId());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Move file
     * 
     * @param request Request for moveFile. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void moveFile(MoveFileRequest request) throws ApiException {
        try {
            moveFileWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            moveFileWithHttpInfo(request);
        }
    }

    /**
     * Move file
     * 
     * @param request Request for moveFile. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> moveFileWithHttpInfo(MoveFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = moveFileCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Move file (asynchronously)
     * 
     * @param request Request for moveFile. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call moveFileAsync(MoveFileRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = moveFileCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for moveFolder
     * @param request Request for moveFolder. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call moveFolderCall(MoveFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'srcPath' is set
        if (request.getSrcPath() == null) {
            throw new ApiException("Missing the required parameter 'srcPath' when calling moveFolder(Async)");
        }
        
        // verify the required parameter 'destPath' is set
        if (request.getDestPath() == null) {
            throw new ApiException("Missing the required parameter 'destPath' when calling moveFolder(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/folder/move/{srcPath}"
            .replaceAll("\\{" + "srcPath" + "\\}", apiClient.objectToString(request.getSrcPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "destPath", request.getDestPath());
        apiClient.addQueryParameter(queryParams, "srcStorageName", request.getSrcStorageName());
        apiClient.addQueryParameter(queryParams, "destStorageName", request.getDestStorageName());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Move folder
     * 
     * @param request Request for moveFolder. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void moveFolder(MoveFolderRequest request) throws ApiException {
        try {
            moveFolderWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            moveFolderWithHttpInfo(request);
        }
    }

    /**
     * Move folder
     * 
     * @param request Request for moveFolder. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> moveFolderWithHttpInfo(MoveFolderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = moveFolderCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Move folder (asynchronously)
     * 
     * @param request Request for moveFolder. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call moveFolderAsync(MoveFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = moveFolderCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for objectExists
     * @param request Request for objectExists. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call objectExistsCall(ObjectExistsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/exist/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storageName", request.getStorageName());
        apiClient.addQueryParameter(queryParams, "versionId", request.getVersionId());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Check if file or folder exists
     * 
     * @param request Request for objectExists. (required)
     * @return ObjectExist
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ObjectExist objectExists(ObjectExistsRequest request) throws ApiException {
        try {
            ApiResponse<ObjectExist> resp = objectExistsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ObjectExist> resp = objectExistsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Check if file or folder exists
     * 
     * @param request Request for objectExists. (required)
     * @return ApiResponse&lt;ObjectExist&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ObjectExist> objectExistsWithHttpInfo(ObjectExistsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = objectExistsCall(request, null, null);
        Type returnType = new TypeToken<ObjectExist>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Check if file or folder exists (asynchronously)
     * 
     * @param request Request for objectExists. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call objectExistsAsync(ObjectExistsRequest request, final ApiCallback<ObjectExist> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = objectExistsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ObjectExist>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postAddNewParagraph
     * @param request Request for postAddNewParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAddNewParagraphCall(PostAddNewParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postAddNewParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postAddNewParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postAddNewParagraph(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "position", request.getPosition());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Creates new paragraph.
     * 
     * @param request Request for postAddNewParagraph. (required)
     * @return Paragraph
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraph postAddNewParagraph(PostAddNewParagraphRequest request) throws ApiException {
        try {
            ApiResponse<Paragraph> resp = postAddNewParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraph> resp = postAddNewParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Creates new paragraph.
     * 
     * @param request Request for postAddNewParagraph. (required)
     * @return ApiResponse&lt;Paragraph&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraph> postAddNewParagraphWithHttpInfo(PostAddNewParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postAddNewParagraphCall(request, null, null);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Creates new paragraph. (asynchronously)
     * 
     * @param request Request for postAddNewParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAddNewParagraphAsync(PostAddNewParagraphRequest request, final ApiCallback<Paragraph> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postAddNewParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postAddNewPortion
     * @param request Request for postAddNewPortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAddNewPortionCall(PostAddNewPortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postAddNewPortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postAddNewPortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postAddNewPortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling postAddNewPortion(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "position", request.getPosition());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Creates new portion.
     * 
     * @param request Request for postAddNewPortion. (required)
     * @return Portion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portion postAddNewPortion(PostAddNewPortionRequest request) throws ApiException {
        try {
            ApiResponse<Portion> resp = postAddNewPortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portion> resp = postAddNewPortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Creates new portion.
     * 
     * @param request Request for postAddNewPortion. (required)
     * @return ApiResponse&lt;Portion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portion> postAddNewPortionWithHttpInfo(PostAddNewPortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postAddNewPortionCall(request, null, null);
        Type returnType = new TypeToken<Portion>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Creates new portion. (asynchronously)
     * 
     * @param request Request for postAddNewPortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAddNewPortionAsync(PostAddNewPortionRequest request, final ApiCallback<Portion> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postAddNewPortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portion>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postAddNewShape
     * @param request Request for postAddNewShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAddNewShapeCall(PostAddNewShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postAddNewShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postAddNewShape(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "shapeToClone", request.getShapeToClone());
        apiClient.addQueryParameter(queryParams, "position", request.getPosition());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Create new shape.
     * 
     * @param request Request for postAddNewShape. (required)
     * @return ShapeBase
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeBase postAddNewShape(PostAddNewShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeBase> resp = postAddNewShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeBase> resp = postAddNewShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Create new shape.
     * 
     * @param request Request for postAddNewShape. (required)
     * @return ApiResponse&lt;ShapeBase&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeBase> postAddNewShapeWithHttpInfo(PostAddNewShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postAddNewShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Create new shape. (asynchronously)
     * 
     * @param request Request for postAddNewShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAddNewShapeAsync(PostAddNewShapeRequest request, final ApiCallback<ShapeBase> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postAddNewShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postAddNotesSlide
     * @param request Request for postAddNotesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAddNotesSlideCall(PostAddNotesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postAddNotesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postAddNotesSlide(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Add new notes slide.
     * 
     * @param request Request for postAddNotesSlide. (required)
     * @return NotesSlide
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NotesSlide postAddNotesSlide(PostAddNotesSlideRequest request) throws ApiException {
        try {
            ApiResponse<NotesSlide> resp = postAddNotesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<NotesSlide> resp = postAddNotesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Add new notes slide.
     * 
     * @param request Request for postAddNotesSlide. (required)
     * @return ApiResponse&lt;NotesSlide&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NotesSlide> postAddNotesSlideWithHttpInfo(PostAddNotesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postAddNotesSlideCall(request, null, null);
        Type returnType = new TypeToken<NotesSlide>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Add new notes slide. (asynchronously)
     * 
     * @param request Request for postAddNotesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAddNotesSlideAsync(PostAddNotesSlideRequest request, final ApiCallback<NotesSlide> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postAddNotesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<NotesSlide>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postCopyLayoutSlideFromSourcePresentation
     * @param request Request for postCopyLayoutSlideFromSourcePresentation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postCopyLayoutSlideFromSourcePresentationCall(PostCopyLayoutSlideFromSourcePresentationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postCopyLayoutSlideFromSourcePresentation(Async)");
        }
        
        // verify the required parameter 'cloneFrom' is set
        if (request.getCloneFrom() == null) {
            throw new ApiException("Missing the required parameter 'cloneFrom' when calling postCopyLayoutSlideFromSourcePresentation(Async)");
        }
        
        // verify the required parameter 'cloneFromPosition' is set
        if (request.getCloneFromPosition() == null) {
            throw new ApiException("Missing the required parameter 'cloneFromPosition' when calling postCopyLayoutSlideFromSourcePresentation(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/layoutSlides"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "cloneFrom", request.getCloneFrom());
        apiClient.addQueryParameter(queryParams, "cloneFromPosition", request.getCloneFromPosition());
        apiClient.addQueryParameter(queryParams, "cloneFromPassword", request.getCloneFromPassword());
        apiClient.addQueryParameter(queryParams, "cloneFromStorage", request.getCloneFromStorage());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Copy layoutSlide from source presentation.
     * 
     * @param request Request for postCopyLayoutSlideFromSourcePresentation. (required)
     * @return LayoutSlide
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LayoutSlide postCopyLayoutSlideFromSourcePresentation(PostCopyLayoutSlideFromSourcePresentationRequest request) throws ApiException {
        try {
            ApiResponse<LayoutSlide> resp = postCopyLayoutSlideFromSourcePresentationWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<LayoutSlide> resp = postCopyLayoutSlideFromSourcePresentationWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Copy layoutSlide from source presentation.
     * 
     * @param request Request for postCopyLayoutSlideFromSourcePresentation. (required)
     * @return ApiResponse&lt;LayoutSlide&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LayoutSlide> postCopyLayoutSlideFromSourcePresentationWithHttpInfo(PostCopyLayoutSlideFromSourcePresentationRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postCopyLayoutSlideFromSourcePresentationCall(request, null, null);
        Type returnType = new TypeToken<LayoutSlide>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Copy layoutSlide from source presentation. (asynchronously)
     * 
     * @param request Request for postCopyLayoutSlideFromSourcePresentation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCopyLayoutSlideFromSourcePresentationAsync(PostCopyLayoutSlideFromSourcePresentationRequest request, final ApiCallback<LayoutSlide> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postCopyLayoutSlideFromSourcePresentationCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<LayoutSlide>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postCopyMasterSlideFromSourcePresentation
     * @param request Request for postCopyMasterSlideFromSourcePresentation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postCopyMasterSlideFromSourcePresentationCall(PostCopyMasterSlideFromSourcePresentationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postCopyMasterSlideFromSourcePresentation(Async)");
        }
        
        // verify the required parameter 'cloneFrom' is set
        if (request.getCloneFrom() == null) {
            throw new ApiException("Missing the required parameter 'cloneFrom' when calling postCopyMasterSlideFromSourcePresentation(Async)");
        }
        
        // verify the required parameter 'cloneFromPosition' is set
        if (request.getCloneFromPosition() == null) {
            throw new ApiException("Missing the required parameter 'cloneFromPosition' when calling postCopyMasterSlideFromSourcePresentation(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/masterSlides"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "cloneFrom", request.getCloneFrom());
        apiClient.addQueryParameter(queryParams, "cloneFromPosition", request.getCloneFromPosition());
        apiClient.addQueryParameter(queryParams, "cloneFromPassword", request.getCloneFromPassword());
        apiClient.addQueryParameter(queryParams, "cloneFromStorage", request.getCloneFromStorage());
        apiClient.addQueryParameter(queryParams, "applyToAll", request.getApplyToAll());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Copy masterSlide from source presentation.
     * 
     * @param request Request for postCopyMasterSlideFromSourcePresentation. (required)
     * @return MasterSlide
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MasterSlide postCopyMasterSlideFromSourcePresentation(PostCopyMasterSlideFromSourcePresentationRequest request) throws ApiException {
        try {
            ApiResponse<MasterSlide> resp = postCopyMasterSlideFromSourcePresentationWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<MasterSlide> resp = postCopyMasterSlideFromSourcePresentationWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Copy masterSlide from source presentation.
     * 
     * @param request Request for postCopyMasterSlideFromSourcePresentation. (required)
     * @return ApiResponse&lt;MasterSlide&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MasterSlide> postCopyMasterSlideFromSourcePresentationWithHttpInfo(PostCopyMasterSlideFromSourcePresentationRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postCopyMasterSlideFromSourcePresentationCall(request, null, null);
        Type returnType = new TypeToken<MasterSlide>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Copy masterSlide from source presentation. (asynchronously)
     * 
     * @param request Request for postCopyMasterSlideFromSourcePresentation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCopyMasterSlideFromSourcePresentationAsync(PostCopyMasterSlideFromSourcePresentationRequest request, final ApiCallback<MasterSlide> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postCopyMasterSlideFromSourcePresentationCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<MasterSlide>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postNotesSlideAddNewParagraph
     * @param request Request for postNotesSlideAddNewParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewParagraphCall(PostNotesSlideAddNewParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postNotesSlideAddNewParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postNotesSlideAddNewParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postNotesSlideAddNewParagraph(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "position", request.getPosition());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Creates new paragraph.
     * 
     * @param request Request for postNotesSlideAddNewParagraph. (required)
     * @return Paragraph
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraph postNotesSlideAddNewParagraph(PostNotesSlideAddNewParagraphRequest request) throws ApiException {
        try {
            ApiResponse<Paragraph> resp = postNotesSlideAddNewParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraph> resp = postNotesSlideAddNewParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Creates new paragraph.
     * 
     * @param request Request for postNotesSlideAddNewParagraph. (required)
     * @return ApiResponse&lt;Paragraph&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraph> postNotesSlideAddNewParagraphWithHttpInfo(PostNotesSlideAddNewParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postNotesSlideAddNewParagraphCall(request, null, null);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Creates new paragraph. (asynchronously)
     * 
     * @param request Request for postNotesSlideAddNewParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewParagraphAsync(PostNotesSlideAddNewParagraphRequest request, final ApiCallback<Paragraph> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postNotesSlideAddNewParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postNotesSlideAddNewPortion
     * @param request Request for postNotesSlideAddNewPortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewPortionCall(PostNotesSlideAddNewPortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postNotesSlideAddNewPortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postNotesSlideAddNewPortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postNotesSlideAddNewPortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling postNotesSlideAddNewPortion(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "position", request.getPosition());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Creates new portion.
     * 
     * @param request Request for postNotesSlideAddNewPortion. (required)
     * @return Portion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portion postNotesSlideAddNewPortion(PostNotesSlideAddNewPortionRequest request) throws ApiException {
        try {
            ApiResponse<Portion> resp = postNotesSlideAddNewPortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portion> resp = postNotesSlideAddNewPortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Creates new portion.
     * 
     * @param request Request for postNotesSlideAddNewPortion. (required)
     * @return ApiResponse&lt;Portion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portion> postNotesSlideAddNewPortionWithHttpInfo(PostNotesSlideAddNewPortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postNotesSlideAddNewPortionCall(request, null, null);
        Type returnType = new TypeToken<Portion>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Creates new portion. (asynchronously)
     * 
     * @param request Request for postNotesSlideAddNewPortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewPortionAsync(PostNotesSlideAddNewPortionRequest request, final ApiCallback<Portion> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postNotesSlideAddNewPortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portion>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postNotesSlideAddNewShape
     * @param request Request for postNotesSlideAddNewShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewShapeCall(PostNotesSlideAddNewShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postNotesSlideAddNewShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postNotesSlideAddNewShape(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "shapeToClone", request.getShapeToClone());
        apiClient.addQueryParameter(queryParams, "position", request.getPosition());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Create new shape.
     * 
     * @param request Request for postNotesSlideAddNewShape. (required)
     * @return ShapeBase
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeBase postNotesSlideAddNewShape(PostNotesSlideAddNewShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeBase> resp = postNotesSlideAddNewShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeBase> resp = postNotesSlideAddNewShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Create new shape.
     * 
     * @param request Request for postNotesSlideAddNewShape. (required)
     * @return ApiResponse&lt;ShapeBase&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeBase> postNotesSlideAddNewShapeWithHttpInfo(PostNotesSlideAddNewShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postNotesSlideAddNewShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Create new shape. (asynchronously)
     * 
     * @param request Request for postNotesSlideAddNewShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewShapeAsync(PostNotesSlideAddNewShapeRequest request, final ApiCallback<ShapeBase> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postNotesSlideAddNewShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postNotesSlideShapeSaveAs
     * @param request Request for postNotesSlideShapeSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideShapeSaveAsCall(PostNotesSlideShapeSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postNotesSlideShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postNotesSlideShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postNotesSlideShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling postNotesSlideShapeSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "scaleX", request.getScaleX());
        apiClient.addQueryParameter(queryParams, "scaleY", request.getScaleY());
        apiClient.addQueryParameter(queryParams, "bounds", request.getBounds());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for postNotesSlideShapeSaveAs. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postNotesSlideShapeSaveAs(PostNotesSlideShapeSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postNotesSlideShapeSaveAsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = postNotesSlideShapeSaveAsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for postNotesSlideShapeSaveAs. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> postNotesSlideShapeSaveAsWithHttpInfo(PostNotesSlideShapeSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postNotesSlideShapeSaveAsCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Render shape to specified picture format. (asynchronously)
     * 
     * @param request Request for postNotesSlideShapeSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideShapeSaveAsAsync(PostNotesSlideShapeSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postNotesSlideShapeSaveAsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postPresentationMerge
     * @param request Request for postPresentationMerge. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPresentationMergeCall(PostPresentationMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postPresentationMerge(Async)");
        }
        
        Object postBody = request.getRequest();

        // create path and map variables
        String path = "/slides/{name}/merge"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Merge the presentation with other presentations specified in the request parameter.
     * 
     * @param request Request for postPresentationMerge. (required)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Document postPresentationMerge(PostPresentationMergeRequest request) throws ApiException {
        try {
            ApiResponse<Document> resp = postPresentationMergeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Document> resp = postPresentationMergeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Merge the presentation with other presentations specified in the request parameter.
     * 
     * @param request Request for postPresentationMerge. (required)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Document> postPresentationMergeWithHttpInfo(PostPresentationMergeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postPresentationMergeCall(request, null, null);
        Type returnType = new TypeToken<Document>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Merge the presentation with other presentations specified in the request parameter. (asynchronously)
     * 
     * @param request Request for postPresentationMerge. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPresentationMergeAsync(PostPresentationMergeRequest request, final ApiCallback<Document> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postPresentationMergeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Document>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postShapeSaveAs
     * @param request Request for postShapeSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postShapeSaveAsCall(PostShapeSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling postShapeSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "scaleX", request.getScaleX());
        apiClient.addQueryParameter(queryParams, "scaleY", request.getScaleY());
        apiClient.addQueryParameter(queryParams, "bounds", request.getBounds());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for postShapeSaveAs. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postShapeSaveAs(PostShapeSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postShapeSaveAsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = postShapeSaveAsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for postShapeSaveAs. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> postShapeSaveAsWithHttpInfo(PostShapeSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postShapeSaveAsCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Render shape to specified picture format. (asynchronously)
     * 
     * @param request Request for postShapeSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postShapeSaveAsAsync(PostShapeSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postShapeSaveAsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlideAnimationEffect
     * @param request Request for postSlideAnimationEffect. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlideAnimationEffectCall(PostSlideAnimationEffectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlideAnimationEffect(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postSlideAnimationEffect(Async)");
        }
        
        Object postBody = request.getEffect();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation/mainSequence"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Add an effect to slide animation.
     * 
     * @param request Request for postSlideAnimationEffect. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation postSlideAnimationEffect(PostSlideAnimationEffectRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = postSlideAnimationEffectWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = postSlideAnimationEffectWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Add an effect to slide animation.
     * 
     * @param request Request for postSlideAnimationEffect. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> postSlideAnimationEffectWithHttpInfo(PostSlideAnimationEffectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlideAnimationEffectCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Add an effect to slide animation. (asynchronously)
     * 
     * @param request Request for postSlideAnimationEffect. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlideAnimationEffectAsync(PostSlideAnimationEffectRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlideAnimationEffectCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlideAnimationInteractiveSequence
     * @param request Request for postSlideAnimationInteractiveSequence. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlideAnimationInteractiveSequenceCall(PostSlideAnimationInteractiveSequenceRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlideAnimationInteractiveSequence(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postSlideAnimationInteractiveSequence(Async)");
        }
        
        Object postBody = request.getSequence();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation/interactiveSequences"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Set slide animation.
     * 
     * @param request Request for postSlideAnimationInteractiveSequence. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation postSlideAnimationInteractiveSequence(PostSlideAnimationInteractiveSequenceRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = postSlideAnimationInteractiveSequenceWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = postSlideAnimationInteractiveSequenceWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Set slide animation.
     * 
     * @param request Request for postSlideAnimationInteractiveSequence. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> postSlideAnimationInteractiveSequenceWithHttpInfo(PostSlideAnimationInteractiveSequenceRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlideAnimationInteractiveSequenceCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Set slide animation. (asynchronously)
     * 
     * @param request Request for postSlideAnimationInteractiveSequence. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlideAnimationInteractiveSequenceAsync(PostSlideAnimationInteractiveSequenceRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlideAnimationInteractiveSequenceCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlideAnimationInteractiveSequenceEffect
     * @param request Request for postSlideAnimationInteractiveSequenceEffect. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlideAnimationInteractiveSequenceEffectCall(PostSlideAnimationInteractiveSequenceEffectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlideAnimationInteractiveSequenceEffect(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postSlideAnimationInteractiveSequenceEffect(Async)");
        }
        
        // verify the required parameter 'sequenceIndex' is set
        if (request.getSequenceIndex() == null) {
            throw new ApiException("Missing the required parameter 'sequenceIndex' when calling postSlideAnimationInteractiveSequenceEffect(Async)");
        }
        
        Object postBody = request.getEffect();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation/interactiveSequences/{sequenceIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "sequenceIndex" + "\\}", apiClient.objectToString(request.getSequenceIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Add an animation effect to a slide interactive sequence.
     * 
     * @param request Request for postSlideAnimationInteractiveSequenceEffect. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation postSlideAnimationInteractiveSequenceEffect(PostSlideAnimationInteractiveSequenceEffectRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = postSlideAnimationInteractiveSequenceEffectWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = postSlideAnimationInteractiveSequenceEffectWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Add an animation effect to a slide interactive sequence.
     * 
     * @param request Request for postSlideAnimationInteractiveSequenceEffect. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> postSlideAnimationInteractiveSequenceEffectWithHttpInfo(PostSlideAnimationInteractiveSequenceEffectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlideAnimationInteractiveSequenceEffectCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Add an animation effect to a slide interactive sequence. (asynchronously)
     * 
     * @param request Request for postSlideAnimationInteractiveSequenceEffect. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlideAnimationInteractiveSequenceEffectAsync(PostSlideAnimationInteractiveSequenceEffectRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlideAnimationInteractiveSequenceEffectCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlideSaveAs
     * @param request Request for postSlideSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlideSaveAsCall(PostSlideSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlideSaveAs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postSlideSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling postSlideSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "width", request.getWidth());
        apiClient.addQueryParameter(queryParams, "height", request.getHeight());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Save a slide to a specified format.
     * 
     * @param request Request for postSlideSaveAs. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postSlideSaveAs(PostSlideSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postSlideSaveAsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = postSlideSaveAsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Save a slide to a specified format.
     * 
     * @param request Request for postSlideSaveAs. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> postSlideSaveAsWithHttpInfo(PostSlideSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlideSaveAsCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Save a slide to a specified format. (asynchronously)
     * 
     * @param request Request for postSlideSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlideSaveAsAsync(PostSlideSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlideSaveAsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesAdd
     * @param request Request for postSlidesAdd. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesAddCall(PostSlidesAddRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesAdd(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "position", request.getPosition());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "layoutAlias", request.getLayoutAlias());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Create a slide.
     * 
     * @param request Request for postSlidesAdd. (required)
     * @return Slides
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Slides postSlidesAdd(PostSlidesAddRequest request) throws ApiException {
        try {
            ApiResponse<Slides> resp = postSlidesAddWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Slides> resp = postSlidesAddWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Create a slide.
     * 
     * @param request Request for postSlidesAdd. (required)
     * @return ApiResponse&lt;Slides&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Slides> postSlidesAddWithHttpInfo(PostSlidesAddRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesAddCall(request, null, null);
        Type returnType = new TypeToken<Slides>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Create a slide. (asynchronously)
     * 
     * @param request Request for postSlidesAdd. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesAddAsync(PostSlidesAddRequest request, final ApiCallback<Slides> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesAddCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Slides>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesConvert
     * @param request Request for postSlidesConvert. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesConvertCall(PostSlidesConvertRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling postSlidesConvert(Async)");
        }
        
        Object postBody = request.getDocument();

        // create path and map variables
        String path = "/slides/convert/{format}"
            .replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/octet-stream", "multipart/form-data"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Convert presentation from request content to format specified.
     * 
     * @param request Request for postSlidesConvert. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postSlidesConvert(PostSlidesConvertRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postSlidesConvertWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = postSlidesConvertWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Convert presentation from request content to format specified.
     * 
     * @param request Request for postSlidesConvert. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> postSlidesConvertWithHttpInfo(PostSlidesConvertRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesConvertCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Convert presentation from request content to format specified. (asynchronously)
     * 
     * @param request Request for postSlidesConvert. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesConvertAsync(PostSlidesConvertRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesConvertCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesCopy
     * @param request Request for postSlidesCopy. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesCopyCall(PostSlidesCopyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesCopy(Async)");
        }
        
        // verify the required parameter 'slideToCopy' is set
        if (request.getSlideToCopy() == null) {
            throw new ApiException("Missing the required parameter 'slideToCopy' when calling postSlidesCopy(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/copy"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "slideToCopy", request.getSlideToCopy());
        apiClient.addQueryParameter(queryParams, "position", request.getPosition());
        apiClient.addQueryParameter(queryParams, "source", request.getSource());
        apiClient.addQueryParameter(queryParams, "sourcePassword", request.getSourcePassword());
        apiClient.addQueryParameter(queryParams, "sourceStorage", request.getSourceStorage());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Copy a slide from the current or another presentation.
     * 
     * @param request Request for postSlidesCopy. (required)
     * @return Slides
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Slides postSlidesCopy(PostSlidesCopyRequest request) throws ApiException {
        try {
            ApiResponse<Slides> resp = postSlidesCopyWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Slides> resp = postSlidesCopyWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Copy a slide from the current or another presentation.
     * 
     * @param request Request for postSlidesCopy. (required)
     * @return ApiResponse&lt;Slides&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Slides> postSlidesCopyWithHttpInfo(PostSlidesCopyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesCopyCall(request, null, null);
        Type returnType = new TypeToken<Slides>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Copy a slide from the current or another presentation. (asynchronously)
     * 
     * @param request Request for postSlidesCopy. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesCopyAsync(PostSlidesCopyRequest request, final ApiCallback<Slides> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesCopyCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Slides>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesDocument
     * @param request Request for postSlidesDocument. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesDocumentCall(PostSlidesDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesDocument(Async)");
        }
        
        Object postBody = request.getData();

        // create path and map variables
        String path = "/slides/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "inputPassword", request.getInputPassword());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/octet-stream", "multipart/form-data"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Create a presentation.
     * 
     * @param request Request for postSlidesDocument. (required)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Document postSlidesDocument(PostSlidesDocumentRequest request) throws ApiException {
        try {
            ApiResponse<Document> resp = postSlidesDocumentWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Document> resp = postSlidesDocumentWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Create a presentation.
     * 
     * @param request Request for postSlidesDocument. (required)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Document> postSlidesDocumentWithHttpInfo(PostSlidesDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesDocumentCall(request, null, null);
        Type returnType = new TypeToken<Document>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Create a presentation. (asynchronously)
     * 
     * @param request Request for postSlidesDocument. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesDocumentAsync(PostSlidesDocumentRequest request, final ApiCallback<Document> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesDocumentCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Document>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesDocumentFromHtml
     * @param request Request for postSlidesDocumentFromHtml. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesDocumentFromHtmlCall(PostSlidesDocumentFromHtmlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesDocumentFromHtml(Async)");
        }
        
        Object postBody = request.getHtml();

        // create path and map variables
        String path = "/slides/{name}/fromHtml"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Create presentation document from html.
     * 
     * @param request Request for postSlidesDocumentFromHtml. (required)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Document postSlidesDocumentFromHtml(PostSlidesDocumentFromHtmlRequest request) throws ApiException {
        try {
            ApiResponse<Document> resp = postSlidesDocumentFromHtmlWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Document> resp = postSlidesDocumentFromHtmlWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Create presentation document from html.
     * 
     * @param request Request for postSlidesDocumentFromHtml. (required)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Document> postSlidesDocumentFromHtmlWithHttpInfo(PostSlidesDocumentFromHtmlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesDocumentFromHtmlCall(request, null, null);
        Type returnType = new TypeToken<Document>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Create presentation document from html. (asynchronously)
     * 
     * @param request Request for postSlidesDocumentFromHtml. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesDocumentFromHtmlAsync(PostSlidesDocumentFromHtmlRequest request, final ApiCallback<Document> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesDocumentFromHtmlCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Document>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesDocumentFromSource
     * @param request Request for postSlidesDocumentFromSource. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesDocumentFromSourceCall(PostSlidesDocumentFromSourceRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesDocumentFromSource(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/fromSource"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "sourcePath", request.getSourcePath());
        apiClient.addQueryParameter(queryParams, "sourcePassword", request.getSourcePassword());
        apiClient.addQueryParameter(queryParams, "sourceStorage", request.getSourceStorage());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Create a presentation from an existing source.
     * 
     * @param request Request for postSlidesDocumentFromSource. (required)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Document postSlidesDocumentFromSource(PostSlidesDocumentFromSourceRequest request) throws ApiException {
        try {
            ApiResponse<Document> resp = postSlidesDocumentFromSourceWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Document> resp = postSlidesDocumentFromSourceWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Create a presentation from an existing source.
     * 
     * @param request Request for postSlidesDocumentFromSource. (required)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Document> postSlidesDocumentFromSourceWithHttpInfo(PostSlidesDocumentFromSourceRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesDocumentFromSourceCall(request, null, null);
        Type returnType = new TypeToken<Document>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Create a presentation from an existing source. (asynchronously)
     * 
     * @param request Request for postSlidesDocumentFromSource. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesDocumentFromSourceAsync(PostSlidesDocumentFromSourceRequest request, final ApiCallback<Document> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesDocumentFromSourceCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Document>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesDocumentFromTemplate
     * @param request Request for postSlidesDocumentFromTemplate. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesDocumentFromTemplateCall(PostSlidesDocumentFromTemplateRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesDocumentFromTemplate(Async)");
        }
        
        // verify the required parameter 'templatePath' is set
        if (request.getTemplatePath() == null) {
            throw new ApiException("Missing the required parameter 'templatePath' when calling postSlidesDocumentFromTemplate(Async)");
        }
        
        Object postBody = request.getData();

        // create path and map variables
        String path = "/slides/{name}/fromTemplate"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "templatePath", request.getTemplatePath());
        apiClient.addQueryParameter(queryParams, "templatePassword", request.getTemplatePassword());
        apiClient.addQueryParameter(queryParams, "templateStorage", request.getTemplateStorage());
        apiClient.addQueryParameter(queryParams, "isImageDataEmbedded", request.getIsImageDataEmbedded());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Create a presentation.
     * 
     * @param request Request for postSlidesDocumentFromTemplate. (required)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Document postSlidesDocumentFromTemplate(PostSlidesDocumentFromTemplateRequest request) throws ApiException {
        try {
            ApiResponse<Document> resp = postSlidesDocumentFromTemplateWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Document> resp = postSlidesDocumentFromTemplateWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Create a presentation.
     * 
     * @param request Request for postSlidesDocumentFromTemplate. (required)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Document> postSlidesDocumentFromTemplateWithHttpInfo(PostSlidesDocumentFromTemplateRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesDocumentFromTemplateCall(request, null, null);
        Type returnType = new TypeToken<Document>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Create a presentation. (asynchronously)
     * 
     * @param request Request for postSlidesDocumentFromTemplate. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesDocumentFromTemplateAsync(PostSlidesDocumentFromTemplateRequest request, final ApiCallback<Document> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesDocumentFromTemplateCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Document>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesPipeline
     * @param request Request for postSlidesPipeline. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesPipelineCall(PostSlidesPipelineRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = request.getPipeline();

        // create path and map variables
        String path = "/slides/pipeline"
            ;

        List<Pair> queryParams = new ArrayList<Pair>();

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "multipart/form-data"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        List<FileInfo> files = new ArrayList<FileInfo>();
        if (request.getFiles() != null) {
            files.addAll(request.getFiles());
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, files, progressRequestListener);
    }

    /**
     * Performs slides pipeline.
     * 
     * @param request Request for postSlidesPipeline. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postSlidesPipeline(PostSlidesPipelineRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postSlidesPipelineWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = postSlidesPipelineWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Performs slides pipeline.
     * 
     * @param request Request for postSlidesPipeline. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> postSlidesPipelineWithHttpInfo(PostSlidesPipelineRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesPipelineCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Performs slides pipeline. (asynchronously)
     * 
     * @param request Request for postSlidesPipeline. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesPipelineAsync(PostSlidesPipelineRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesPipelineCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesPresentationReplaceText
     * @param request Request for postSlidesPresentationReplaceText. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesPresentationReplaceTextCall(PostSlidesPresentationReplaceTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesPresentationReplaceText(Async)");
        }
        
        // verify the required parameter 'oldValue' is set
        if (request.getOldValue() == null) {
            throw new ApiException("Missing the required parameter 'oldValue' when calling postSlidesPresentationReplaceText(Async)");
        }
        
        // verify the required parameter 'newValue' is set
        if (request.getNewValue() == null) {
            throw new ApiException("Missing the required parameter 'newValue' when calling postSlidesPresentationReplaceText(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/replaceText"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "oldValue", request.getOldValue());
        apiClient.addQueryParameter(queryParams, "newValue", request.getNewValue());
        apiClient.addQueryParameter(queryParams, "ignoreCase", request.getIgnoreCase());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Replace text with a new value.
     * 
     * @param request Request for postSlidesPresentationReplaceText. (required)
     * @return DocumentReplaceResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentReplaceResult postSlidesPresentationReplaceText(PostSlidesPresentationReplaceTextRequest request) throws ApiException {
        try {
            ApiResponse<DocumentReplaceResult> resp = postSlidesPresentationReplaceTextWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentReplaceResult> resp = postSlidesPresentationReplaceTextWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Replace text with a new value.
     * 
     * @param request Request for postSlidesPresentationReplaceText. (required)
     * @return ApiResponse&lt;DocumentReplaceResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentReplaceResult> postSlidesPresentationReplaceTextWithHttpInfo(PostSlidesPresentationReplaceTextRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesPresentationReplaceTextCall(request, null, null);
        Type returnType = new TypeToken<DocumentReplaceResult>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Replace text with a new value. (asynchronously)
     * 
     * @param request Request for postSlidesPresentationReplaceText. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesPresentationReplaceTextAsync(PostSlidesPresentationReplaceTextRequest request, final ApiCallback<DocumentReplaceResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesPresentationReplaceTextCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentReplaceResult>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesReorder
     * @param request Request for postSlidesReorder. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesReorderCall(PostSlidesReorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesReorder(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postSlidesReorder(Async)");
        }
        
        // verify the required parameter 'newPosition' is set
        if (request.getNewPosition() == null) {
            throw new ApiException("Missing the required parameter 'newPosition' when calling postSlidesReorder(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/move"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "newPosition", request.getNewPosition());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Reorder presentation slide position.
     * 
     * @param request Request for postSlidesReorder. (required)
     * @return Slides
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Slides postSlidesReorder(PostSlidesReorderRequest request) throws ApiException {
        try {
            ApiResponse<Slides> resp = postSlidesReorderWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Slides> resp = postSlidesReorderWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Reorder presentation slide position.
     * 
     * @param request Request for postSlidesReorder. (required)
     * @return ApiResponse&lt;Slides&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Slides> postSlidesReorderWithHttpInfo(PostSlidesReorderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesReorderCall(request, null, null);
        Type returnType = new TypeToken<Slides>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Reorder presentation slide position. (asynchronously)
     * 
     * @param request Request for postSlidesReorder. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesReorderAsync(PostSlidesReorderRequest request, final ApiCallback<Slides> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesReorderCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Slides>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesReorderMany
     * @param request Request for postSlidesReorderMany. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesReorderManyCall(PostSlidesReorderManyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesReorderMany(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/reorder"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "oldPositions", request.getOldPositions());
        apiClient.addQueryParameter(queryParams, "newPositions", request.getNewPositions());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Reorder presentation slides positions.
     * 
     * @param request Request for postSlidesReorderMany. (required)
     * @return Slides
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Slides postSlidesReorderMany(PostSlidesReorderManyRequest request) throws ApiException {
        try {
            ApiResponse<Slides> resp = postSlidesReorderManyWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Slides> resp = postSlidesReorderManyWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Reorder presentation slides positions.
     * 
     * @param request Request for postSlidesReorderMany. (required)
     * @return ApiResponse&lt;Slides&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Slides> postSlidesReorderManyWithHttpInfo(PostSlidesReorderManyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesReorderManyCall(request, null, null);
        Type returnType = new TypeToken<Slides>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Reorder presentation slides positions. (asynchronously)
     * 
     * @param request Request for postSlidesReorderMany. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesReorderManyAsync(PostSlidesReorderManyRequest request, final ApiCallback<Slides> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesReorderManyCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Slides>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesSaveAs
     * @param request Request for postSlidesSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesSaveAsCall(PostSlidesSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling postSlidesSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Save a presentation to a specified format.
     * 
     * @param request Request for postSlidesSaveAs. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postSlidesSaveAs(PostSlidesSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postSlidesSaveAsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = postSlidesSaveAsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Save a presentation to a specified format.
     * 
     * @param request Request for postSlidesSaveAs. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> postSlidesSaveAsWithHttpInfo(PostSlidesSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesSaveAsCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Save a presentation to a specified format. (asynchronously)
     * 
     * @param request Request for postSlidesSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesSaveAsAsync(PostSlidesSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesSaveAsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesSetDocumentProperties
     * @param request Request for postSlidesSetDocumentProperties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesSetDocumentPropertiesCall(PostSlidesSetDocumentPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesSetDocumentProperties(Async)");
        }
        
        Object postBody = request.getProperties();

        // create path and map variables
        String path = "/slides/{name}/documentproperties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Set document properties.
     * 
     * @param request Request for postSlidesSetDocumentProperties. (required)
     * @return DocumentProperties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentProperties postSlidesSetDocumentProperties(PostSlidesSetDocumentPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<DocumentProperties> resp = postSlidesSetDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentProperties> resp = postSlidesSetDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Set document properties.
     * 
     * @param request Request for postSlidesSetDocumentProperties. (required)
     * @return ApiResponse&lt;DocumentProperties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentProperties> postSlidesSetDocumentPropertiesWithHttpInfo(PostSlidesSetDocumentPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesSetDocumentPropertiesCall(request, null, null);
        Type returnType = new TypeToken<DocumentProperties>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Set document properties. (asynchronously)
     * 
     * @param request Request for postSlidesSetDocumentProperties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesSetDocumentPropertiesAsync(PostSlidesSetDocumentPropertiesRequest request, final ApiCallback<DocumentProperties> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesSetDocumentPropertiesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentProperties>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesSlideReplaceText
     * @param request Request for postSlidesSlideReplaceText. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesSlideReplaceTextCall(PostSlidesSlideReplaceTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesSlideReplaceText(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postSlidesSlideReplaceText(Async)");
        }
        
        // verify the required parameter 'oldValue' is set
        if (request.getOldValue() == null) {
            throw new ApiException("Missing the required parameter 'oldValue' when calling postSlidesSlideReplaceText(Async)");
        }
        
        // verify the required parameter 'newValue' is set
        if (request.getNewValue() == null) {
            throw new ApiException("Missing the required parameter 'newValue' when calling postSlidesSlideReplaceText(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/replaceText"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "oldValue", request.getOldValue());
        apiClient.addQueryParameter(queryParams, "newValue", request.getNewValue());
        apiClient.addQueryParameter(queryParams, "ignoreCase", request.getIgnoreCase());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Replace text with a new value.
     * 
     * @param request Request for postSlidesSlideReplaceText. (required)
     * @return SlideReplaceResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideReplaceResult postSlidesSlideReplaceText(PostSlidesSlideReplaceTextRequest request) throws ApiException {
        try {
            ApiResponse<SlideReplaceResult> resp = postSlidesSlideReplaceTextWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideReplaceResult> resp = postSlidesSlideReplaceTextWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Replace text with a new value.
     * 
     * @param request Request for postSlidesSlideReplaceText. (required)
     * @return ApiResponse&lt;SlideReplaceResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideReplaceResult> postSlidesSlideReplaceTextWithHttpInfo(PostSlidesSlideReplaceTextRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesSlideReplaceTextCall(request, null, null);
        Type returnType = new TypeToken<SlideReplaceResult>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Replace text with a new value. (asynchronously)
     * 
     * @param request Request for postSlidesSlideReplaceText. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesSlideReplaceTextAsync(PostSlidesSlideReplaceTextRequest request, final ApiCallback<SlideReplaceResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesSlideReplaceTextCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideReplaceResult>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesSplit
     * @param request Request for postSlidesSplit. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesSplitCall(PostSlidesSplitRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesSplit(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/split"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "format", request.getFormat());
        apiClient.addQueryParameter(queryParams, "width", request.getWidth());
        apiClient.addQueryParameter(queryParams, "height", request.getHeight());
        apiClient.addQueryParameter(queryParams, "to", request.getTo());
        apiClient.addQueryParameter(queryParams, "from", request.getFrom());
        apiClient.addQueryParameter(queryParams, "destFolder", request.getDestFolder());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Splitting presentations. Create one image per slide.
     * 
     * @param request Request for postSlidesSplit. (required)
     * @return SplitDocumentResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SplitDocumentResult postSlidesSplit(PostSlidesSplitRequest request) throws ApiException {
        try {
            ApiResponse<SplitDocumentResult> resp = postSlidesSplitWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SplitDocumentResult> resp = postSlidesSplitWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Splitting presentations. Create one image per slide.
     * 
     * @param request Request for postSlidesSplit. (required)
     * @return ApiResponse&lt;SplitDocumentResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SplitDocumentResult> postSlidesSplitWithHttpInfo(PostSlidesSplitRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesSplitCall(request, null, null);
        Type returnType = new TypeToken<SplitDocumentResult>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Splitting presentations. Create one image per slide. (asynchronously)
     * 
     * @param request Request for postSlidesSplit. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesSplitAsync(PostSlidesSplitRequest request, final ApiCallback<SplitDocumentResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesSplitCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SplitDocumentResult>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putLayoutSlide
     * @param request Request for putLayoutSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putLayoutSlideCall(PutLayoutSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putLayoutSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putLayoutSlide(Async)");
        }
        
        Object postBody = request.getSlideDto();

        // create path and map variables
        String path = "/slides/{name}/layoutSlides/{slideIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Update a layoutSlide.
     * 
     * @param request Request for putLayoutSlide. (required)
     * @return LayoutSlide
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LayoutSlide putLayoutSlide(PutLayoutSlideRequest request) throws ApiException {
        try {
            ApiResponse<LayoutSlide> resp = putLayoutSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<LayoutSlide> resp = putLayoutSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update a layoutSlide.
     * 
     * @param request Request for putLayoutSlide. (required)
     * @return ApiResponse&lt;LayoutSlide&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LayoutSlide> putLayoutSlideWithHttpInfo(PutLayoutSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putLayoutSlideCall(request, null, null);
        Type returnType = new TypeToken<LayoutSlide>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Update a layoutSlide. (asynchronously)
     * 
     * @param request Request for putLayoutSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putLayoutSlideAsync(PutLayoutSlideRequest request, final ApiCallback<LayoutSlide> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putLayoutSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<LayoutSlide>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putNotesSlideShapeSaveAs
     * @param request Request for putNotesSlideShapeSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putNotesSlideShapeSaveAsCall(PutNotesSlideShapeSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putNotesSlideShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putNotesSlideShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putNotesSlideShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling putNotesSlideShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (request.getOutPath() == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putNotesSlideShapeSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "outPath", request.getOutPath());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "scaleX", request.getScaleX());
        apiClient.addQueryParameter(queryParams, "scaleY", request.getScaleY());
        apiClient.addQueryParameter(queryParams, "bounds", request.getBounds());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for putNotesSlideShapeSaveAs. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putNotesSlideShapeSaveAs(PutNotesSlideShapeSaveAsRequest request) throws ApiException {
        try {
            putNotesSlideShapeSaveAsWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            putNotesSlideShapeSaveAsWithHttpInfo(request);
        }
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for putNotesSlideShapeSaveAs. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putNotesSlideShapeSaveAsWithHttpInfo(PutNotesSlideShapeSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putNotesSlideShapeSaveAsCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Render shape to specified picture format. (asynchronously)
     * 
     * @param request Request for putNotesSlideShapeSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putNotesSlideShapeSaveAsAsync(PutNotesSlideShapeSaveAsRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putNotesSlideShapeSaveAsCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for putPresentationMerge
     * @param request Request for putPresentationMerge. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPresentationMergeCall(PutPresentationMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPresentationMerge(Async)");
        }
        
        Object postBody = request.getRequest();

        // create path and map variables
        String path = "/slides/{name}/merge"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     * 
     * @param request Request for putPresentationMerge. (required)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Document putPresentationMerge(PutPresentationMergeRequest request) throws ApiException {
        try {
            ApiResponse<Document> resp = putPresentationMergeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Document> resp = putPresentationMergeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     * 
     * @param request Request for putPresentationMerge. (required)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Document> putPresentationMergeWithHttpInfo(PutPresentationMergeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putPresentationMergeCall(request, null, null);
        Type returnType = new TypeToken<Document>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter. (asynchronously)
     * 
     * @param request Request for putPresentationMerge. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPresentationMergeAsync(PutPresentationMergeRequest request, final ApiCallback<Document> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPresentationMergeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Document>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSetParagraphPortionProperties
     * @param request Request for putSetParagraphPortionProperties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSetParagraphPortionPropertiesCall(PutSetParagraphPortionPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSetParagraphPortionProperties(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSetParagraphPortionProperties(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putSetParagraphPortionProperties(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling putSetParagraphPortionProperties(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling putSetParagraphPortionProperties(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex())).replaceAll("\\{" + "portionIndex" + "\\}", apiClient.objectToString(request.getPortionIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Update portion properties.
     * 
     * @param request Request for putSetParagraphPortionProperties. (required)
     * @return Portion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portion putSetParagraphPortionProperties(PutSetParagraphPortionPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<Portion> resp = putSetParagraphPortionPropertiesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portion> resp = putSetParagraphPortionPropertiesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update portion properties.
     * 
     * @param request Request for putSetParagraphPortionProperties. (required)
     * @return ApiResponse&lt;Portion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portion> putSetParagraphPortionPropertiesWithHttpInfo(PutSetParagraphPortionPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSetParagraphPortionPropertiesCall(request, null, null);
        Type returnType = new TypeToken<Portion>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Update portion properties. (asynchronously)
     * 
     * @param request Request for putSetParagraphPortionProperties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSetParagraphPortionPropertiesAsync(PutSetParagraphPortionPropertiesRequest request, final ApiCallback<Portion> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSetParagraphPortionPropertiesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portion>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSetParagraphProperties
     * @param request Request for putSetParagraphProperties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSetParagraphPropertiesCall(PutSetParagraphPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSetParagraphProperties(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSetParagraphProperties(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putSetParagraphProperties(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling putSetParagraphProperties(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Update paragraph properties.
     * 
     * @param request Request for putSetParagraphProperties. (required)
     * @return Paragraph
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraph putSetParagraphProperties(PutSetParagraphPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<Paragraph> resp = putSetParagraphPropertiesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraph> resp = putSetParagraphPropertiesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update paragraph properties.
     * 
     * @param request Request for putSetParagraphProperties. (required)
     * @return ApiResponse&lt;Paragraph&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraph> putSetParagraphPropertiesWithHttpInfo(PutSetParagraphPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSetParagraphPropertiesCall(request, null, null);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Update paragraph properties. (asynchronously)
     * 
     * @param request Request for putSetParagraphProperties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSetParagraphPropertiesAsync(PutSetParagraphPropertiesRequest request, final ApiCallback<Paragraph> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSetParagraphPropertiesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putShapeSaveAs
     * @param request Request for putShapeSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putShapeSaveAsCall(PutShapeSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling putShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (request.getOutPath() == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putShapeSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "outPath", request.getOutPath());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "scaleX", request.getScaleX());
        apiClient.addQueryParameter(queryParams, "scaleY", request.getScaleY());
        apiClient.addQueryParameter(queryParams, "bounds", request.getBounds());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for putShapeSaveAs. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putShapeSaveAs(PutShapeSaveAsRequest request) throws ApiException {
        try {
            putShapeSaveAsWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            putShapeSaveAsWithHttpInfo(request);
        }
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for putShapeSaveAs. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putShapeSaveAsWithHttpInfo(PutShapeSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putShapeSaveAsCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Render shape to specified picture format. (asynchronously)
     * 
     * @param request Request for putShapeSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putShapeSaveAsAsync(PutShapeSaveAsRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putShapeSaveAsCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for putSlideAnimation
     * @param request Request for putSlideAnimation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlideAnimationCall(PutSlideAnimationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlideAnimation(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSlideAnimation(Async)");
        }
        
        Object postBody = request.getAnimation();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Set slide animation.
     * 
     * @param request Request for putSlideAnimation. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation putSlideAnimation(PutSlideAnimationRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = putSlideAnimationWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = putSlideAnimationWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Set slide animation.
     * 
     * @param request Request for putSlideAnimation. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> putSlideAnimationWithHttpInfo(PutSlideAnimationRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlideAnimationCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Set slide animation. (asynchronously)
     * 
     * @param request Request for putSlideAnimation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlideAnimationAsync(PutSlideAnimationRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlideAnimationCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlideAnimationEffect
     * @param request Request for putSlideAnimationEffect. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlideAnimationEffectCall(PutSlideAnimationEffectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlideAnimationEffect(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSlideAnimationEffect(Async)");
        }
        
        // verify the required parameter 'effectIndex' is set
        if (request.getEffectIndex() == null) {
            throw new ApiException("Missing the required parameter 'effectIndex' when calling putSlideAnimationEffect(Async)");
        }
        
        Object postBody = request.getEffect();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation/mainSequence/{effectIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "effectIndex" + "\\}", apiClient.objectToString(request.getEffectIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Modify an animation effect for a slide.
     * 
     * @param request Request for putSlideAnimationEffect. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation putSlideAnimationEffect(PutSlideAnimationEffectRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = putSlideAnimationEffectWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = putSlideAnimationEffectWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Modify an animation effect for a slide.
     * 
     * @param request Request for putSlideAnimationEffect. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> putSlideAnimationEffectWithHttpInfo(PutSlideAnimationEffectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlideAnimationEffectCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Modify an animation effect for a slide. (asynchronously)
     * 
     * @param request Request for putSlideAnimationEffect. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlideAnimationEffectAsync(PutSlideAnimationEffectRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlideAnimationEffectCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlideAnimationInteractiveSequenceEffect
     * @param request Request for putSlideAnimationInteractiveSequenceEffect. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlideAnimationInteractiveSequenceEffectCall(PutSlideAnimationInteractiveSequenceEffectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlideAnimationInteractiveSequenceEffect(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSlideAnimationInteractiveSequenceEffect(Async)");
        }
        
        // verify the required parameter 'sequenceIndex' is set
        if (request.getSequenceIndex() == null) {
            throw new ApiException("Missing the required parameter 'sequenceIndex' when calling putSlideAnimationInteractiveSequenceEffect(Async)");
        }
        
        // verify the required parameter 'effectIndex' is set
        if (request.getEffectIndex() == null) {
            throw new ApiException("Missing the required parameter 'effectIndex' when calling putSlideAnimationInteractiveSequenceEffect(Async)");
        }
        
        Object postBody = request.getEffect();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/animation/interactiveSequences/{sequenceIndex}/{effectIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "sequenceIndex" + "\\}", apiClient.objectToString(request.getSequenceIndex())).replaceAll("\\{" + "effectIndex" + "\\}", apiClient.objectToString(request.getEffectIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Modify an animation effect for a slide interactive sequence.
     * 
     * @param request Request for putSlideAnimationInteractiveSequenceEffect. (required)
     * @return SlideAnimation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideAnimation putSlideAnimationInteractiveSequenceEffect(PutSlideAnimationInteractiveSequenceEffectRequest request) throws ApiException {
        try {
            ApiResponse<SlideAnimation> resp = putSlideAnimationInteractiveSequenceEffectWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideAnimation> resp = putSlideAnimationInteractiveSequenceEffectWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Modify an animation effect for a slide interactive sequence.
     * 
     * @param request Request for putSlideAnimationInteractiveSequenceEffect. (required)
     * @return ApiResponse&lt;SlideAnimation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideAnimation> putSlideAnimationInteractiveSequenceEffectWithHttpInfo(PutSlideAnimationInteractiveSequenceEffectRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlideAnimationInteractiveSequenceEffectCall(request, null, null);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Modify an animation effect for a slide interactive sequence. (asynchronously)
     * 
     * @param request Request for putSlideAnimationInteractiveSequenceEffect. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlideAnimationInteractiveSequenceEffectAsync(PutSlideAnimationInteractiveSequenceEffectRequest request, final ApiCallback<SlideAnimation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlideAnimationInteractiveSequenceEffectCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideAnimation>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlideSaveAs
     * @param request Request for putSlideSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlideSaveAsCall(PutSlideSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlideSaveAs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSlideSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling putSlideSaveAs(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (request.getOutPath() == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putSlideSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "outPath", request.getOutPath());
        apiClient.addQueryParameter(queryParams, "width", request.getWidth());
        apiClient.addQueryParameter(queryParams, "height", request.getHeight());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Save a slide to a specified format.
     * 
     * @param request Request for putSlideSaveAs. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putSlideSaveAs(PutSlideSaveAsRequest request) throws ApiException {
        try {
            putSlideSaveAsWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            putSlideSaveAsWithHttpInfo(request);
        }
    }

    /**
     * Save a slide to a specified format.
     * 
     * @param request Request for putSlideSaveAs. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putSlideSaveAsWithHttpInfo(PutSlideSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlideSaveAsCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Save a slide to a specified format. (asynchronously)
     * 
     * @param request Request for putSlideSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlideSaveAsAsync(PutSlideSaveAsRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlideSaveAsCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for putSlideShapeInfo
     * @param request Request for putSlideShapeInfo. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlideShapeInfoCall(PutSlideShapeInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlideShapeInfo(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSlideShapeInfo(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putSlideShapeInfo(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Update shape properties.
     * 
     * @param request Request for putSlideShapeInfo. (required)
     * @return ShapeBase
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeBase putSlideShapeInfo(PutSlideShapeInfoRequest request) throws ApiException {
        try {
            ApiResponse<ShapeBase> resp = putSlideShapeInfoWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeBase> resp = putSlideShapeInfoWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update shape properties.
     * 
     * @param request Request for putSlideShapeInfo. (required)
     * @return ApiResponse&lt;ShapeBase&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeBase> putSlideShapeInfoWithHttpInfo(PutSlideShapeInfoRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlideShapeInfoCall(request, null, null);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Update shape properties. (asynchronously)
     * 
     * @param request Request for putSlideShapeInfo. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlideShapeInfoAsync(PutSlideShapeInfoRequest request, final ApiCallback<ShapeBase> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlideShapeInfoCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesConvert
     * @param request Request for putSlidesConvert. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesConvertCall(PutSlidesConvertRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling putSlidesConvert(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (request.getOutPath() == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putSlidesConvert(Async)");
        }
        
        Object postBody = request.getDocument();

        // create path and map variables
        String path = "/slides/convert/{format}"
            .replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "outPath", request.getOutPath());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/octet-stream", "multipart/form-data"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Convert presentation from request content to format specified.
     * 
     * @param request Request for putSlidesConvert. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putSlidesConvert(PutSlidesConvertRequest request) throws ApiException {
        try {
            putSlidesConvertWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            putSlidesConvertWithHttpInfo(request);
        }
    }

    /**
     * Convert presentation from request content to format specified.
     * 
     * @param request Request for putSlidesConvert. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putSlidesConvertWithHttpInfo(PutSlidesConvertRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesConvertCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Convert presentation from request content to format specified. (asynchronously)
     * 
     * @param request Request for putSlidesConvert. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesConvertAsync(PutSlidesConvertRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlidesConvertCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for putSlidesDocumentFromHtml
     * @param request Request for putSlidesDocumentFromHtml. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesDocumentFromHtmlCall(PutSlidesDocumentFromHtmlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesDocumentFromHtml(Async)");
        }
        
        Object postBody = request.getHtml();

        // create path and map variables
        String path = "/slides/{name}/fromHtml"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Update presentation document from html.
     * 
     * @param request Request for putSlidesDocumentFromHtml. (required)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Document putSlidesDocumentFromHtml(PutSlidesDocumentFromHtmlRequest request) throws ApiException {
        try {
            ApiResponse<Document> resp = putSlidesDocumentFromHtmlWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Document> resp = putSlidesDocumentFromHtmlWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update presentation document from html.
     * 
     * @param request Request for putSlidesDocumentFromHtml. (required)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Document> putSlidesDocumentFromHtmlWithHttpInfo(PutSlidesDocumentFromHtmlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesDocumentFromHtmlCall(request, null, null);
        Type returnType = new TypeToken<Document>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Update presentation document from html. (asynchronously)
     * 
     * @param request Request for putSlidesDocumentFromHtml. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesDocumentFromHtmlAsync(PutSlidesDocumentFromHtmlRequest request, final ApiCallback<Document> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlidesDocumentFromHtmlCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Document>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesSaveAs
     * @param request Request for putSlidesSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesSaveAsCall(PutSlidesSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesSaveAs(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (request.getOutPath() == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putSlidesSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling putSlidesSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/{format}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "format" + "\\}", apiClient.objectToString(request.getFormat()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "outPath", request.getOutPath());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Save a presentation to a specified format.
     * 
     * @param request Request for putSlidesSaveAs. (required)
     
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putSlidesSaveAs(PutSlidesSaveAsRequest request) throws ApiException {
        try {
            putSlidesSaveAsWithHttpInfo(request);
        } catch (NeedRepeatRequestException e) {
            putSlidesSaveAsWithHttpInfo(request);
        }
    }

    /**
     * Save a presentation to a specified format.
     * 
     * @param request Request for putSlidesSaveAs. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putSlidesSaveAsWithHttpInfo(PutSlidesSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesSaveAsCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Save a presentation to a specified format. (asynchronously)
     * 
     * @param request Request for putSlidesSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesSaveAsAsync(PutSlidesSaveAsRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlidesSaveAsCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for putSlidesSetDocumentProperty
     * @param request Request for putSlidesSetDocumentProperty. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesSetDocumentPropertyCall(PutSlidesSetDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesSetDocumentProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (request.getPropertyName() == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling putSlidesSetDocumentProperty(Async)");
        }
        
        Object postBody = request.getProperty();

        // create path and map variables
        String path = "/slides/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "propertyName" + "\\}", apiClient.objectToString(request.getPropertyName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Set document property.
     * 
     * @param request Request for putSlidesSetDocumentProperty. (required)
     * @return DocumentProperty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentProperty putSlidesSetDocumentProperty(PutSlidesSetDocumentPropertyRequest request) throws ApiException {
        try {
            ApiResponse<DocumentProperty> resp = putSlidesSetDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentProperty> resp = putSlidesSetDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Set document property.
     * 
     * @param request Request for putSlidesSetDocumentProperty. (required)
     * @return ApiResponse&lt;DocumentProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentProperty> putSlidesSetDocumentPropertyWithHttpInfo(PutSlidesSetDocumentPropertyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesSetDocumentPropertyCall(request, null, null);
        Type returnType = new TypeToken<DocumentProperty>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Set document property. (asynchronously)
     * 
     * @param request Request for putSlidesSetDocumentProperty. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesSetDocumentPropertyAsync(PutSlidesSetDocumentPropertyRequest request, final ApiCallback<DocumentProperty> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlidesSetDocumentPropertyCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentProperty>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesSlide
     * @param request Request for putSlidesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideCall(PutSlidesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSlidesSlide(Async)");
        }
        
        Object postBody = request.getSlideDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Update a slide.
     * 
     * @param request Request for putSlidesSlide. (required)
     * @return Slide
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Slide putSlidesSlide(PutSlidesSlideRequest request) throws ApiException {
        try {
            ApiResponse<Slide> resp = putSlidesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Slide> resp = putSlidesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update a slide.
     * 
     * @param request Request for putSlidesSlide. (required)
     * @return ApiResponse&lt;Slide&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Slide> putSlidesSlideWithHttpInfo(PutSlidesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesSlideCall(request, null, null);
        Type returnType = new TypeToken<Slide>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Update a slide. (asynchronously)
     * 
     * @param request Request for putSlidesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideAsync(PutSlidesSlideRequest request, final ApiCallback<Slide> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlidesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Slide>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesSlideBackground
     * @param request Request for putSlidesSlideBackground. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideBackgroundCall(PutSlidesSlideBackgroundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesSlideBackground(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSlidesSlideBackground(Async)");
        }
        
        Object postBody = request.getBackground();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/background"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Set background for a slide.
     * 
     * @param request Request for putSlidesSlideBackground. (required)
     * @return SlideBackground
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideBackground putSlidesSlideBackground(PutSlidesSlideBackgroundRequest request) throws ApiException {
        try {
            ApiResponse<SlideBackground> resp = putSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideBackground> resp = putSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Set background for a slide.
     * 
     * @param request Request for putSlidesSlideBackground. (required)
     * @return ApiResponse&lt;SlideBackground&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideBackground> putSlidesSlideBackgroundWithHttpInfo(PutSlidesSlideBackgroundRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesSlideBackgroundCall(request, null, null);
        Type returnType = new TypeToken<SlideBackground>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Set background for a slide. (asynchronously)
     * 
     * @param request Request for putSlidesSlideBackground. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideBackgroundAsync(PutSlidesSlideBackgroundRequest request, final ApiCallback<SlideBackground> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlidesSlideBackgroundCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideBackground>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesSlideBackgroundColor
     * @param request Request for putSlidesSlideBackgroundColor. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideBackgroundColorCall(PutSlidesSlideBackgroundColorRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesSlideBackgroundColor(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSlidesSlideBackgroundColor(Async)");
        }
        
        // verify the required parameter 'color' is set
        if (request.getColor() == null) {
            throw new ApiException("Missing the required parameter 'color' when calling putSlidesSlideBackgroundColor(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/backgroundColor"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "color", request.getColor());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Set background color for a slide.
     * 
     * @param request Request for putSlidesSlideBackgroundColor. (required)
     * @return SlideBackground
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideBackground putSlidesSlideBackgroundColor(PutSlidesSlideBackgroundColorRequest request) throws ApiException {
        try {
            ApiResponse<SlideBackground> resp = putSlidesSlideBackgroundColorWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideBackground> resp = putSlidesSlideBackgroundColorWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Set background color for a slide.
     * 
     * @param request Request for putSlidesSlideBackgroundColor. (required)
     * @return ApiResponse&lt;SlideBackground&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideBackground> putSlidesSlideBackgroundColorWithHttpInfo(PutSlidesSlideBackgroundColorRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesSlideBackgroundColorCall(request, null, null);
        Type returnType = new TypeToken<SlideBackground>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Set background color for a slide. (asynchronously)
     * 
     * @param request Request for putSlidesSlideBackgroundColor. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideBackgroundColorAsync(PutSlidesSlideBackgroundColorRequest request, final ApiCallback<SlideBackground> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlidesSlideBackgroundColorCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideBackground>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesSlideSize
     * @param request Request for putSlidesSlideSize. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideSizeCall(PutSlidesSlideSizeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesSlideSize(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slideSize"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "width", request.getWidth());
        apiClient.addQueryParameter(queryParams, "height", request.getHeight());
        apiClient.addQueryParameter(queryParams, "sizeType", request.getSizeType());
        apiClient.addQueryParameter(queryParams, "scaleType", request.getScaleType());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Set slide size for a presentation.
     * 
     * @param request Request for putSlidesSlideSize. (required)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Document putSlidesSlideSize(PutSlidesSlideSizeRequest request) throws ApiException {
        try {
            ApiResponse<Document> resp = putSlidesSlideSizeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Document> resp = putSlidesSlideSizeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Set slide size for a presentation.
     * 
     * @param request Request for putSlidesSlideSize. (required)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Document> putSlidesSlideSizeWithHttpInfo(PutSlidesSlideSizeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesSlideSizeCall(request, null, null);
        Type returnType = new TypeToken<Document>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Set slide size for a presentation. (asynchronously)
     * 
     * @param request Request for putSlidesSlideSize. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideSizeAsync(PutSlidesSlideSizeRequest request, final ApiCallback<Document> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlidesSlideSizeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Document>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putUpdateNotesSlide
     * @param request Request for putUpdateNotesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideCall(PutUpdateNotesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putUpdateNotesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putUpdateNotesSlide(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Update notes slide properties.
     * 
     * @param request Request for putUpdateNotesSlide. (required)
     * @return NotesSlide
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NotesSlide putUpdateNotesSlide(PutUpdateNotesSlideRequest request) throws ApiException {
        try {
            ApiResponse<NotesSlide> resp = putUpdateNotesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<NotesSlide> resp = putUpdateNotesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update notes slide properties.
     * 
     * @param request Request for putUpdateNotesSlide. (required)
     * @return ApiResponse&lt;NotesSlide&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NotesSlide> putUpdateNotesSlideWithHttpInfo(PutUpdateNotesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putUpdateNotesSlideCall(request, null, null);
        Type returnType = new TypeToken<NotesSlide>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Update notes slide properties. (asynchronously)
     * 
     * @param request Request for putUpdateNotesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideAsync(PutUpdateNotesSlideRequest request, final ApiCallback<NotesSlide> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putUpdateNotesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<NotesSlide>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putUpdateNotesSlideShape
     * @param request Request for putUpdateNotesSlideShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapeCall(PutUpdateNotesSlideShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putUpdateNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putUpdateNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putUpdateNotesSlideShape(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Update shape properties.
     * 
     * @param request Request for putUpdateNotesSlideShape. (required)
     * @return ShapeBase
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeBase putUpdateNotesSlideShape(PutUpdateNotesSlideShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeBase> resp = putUpdateNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeBase> resp = putUpdateNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update shape properties.
     * 
     * @param request Request for putUpdateNotesSlideShape. (required)
     * @return ApiResponse&lt;ShapeBase&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeBase> putUpdateNotesSlideShapeWithHttpInfo(PutUpdateNotesSlideShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putUpdateNotesSlideShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Update shape properties. (asynchronously)
     * 
     * @param request Request for putUpdateNotesSlideShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapeAsync(PutUpdateNotesSlideShapeRequest request, final ApiCallback<ShapeBase> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putUpdateNotesSlideShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeBase>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putUpdateNotesSlideShapeParagraph
     * @param request Request for putUpdateNotesSlideShapeParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapeParagraphCall(PutUpdateNotesSlideShapeParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putUpdateNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putUpdateNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putUpdateNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling putUpdateNotesSlideShapeParagraph(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Update paragraph properties.
     * 
     * @param request Request for putUpdateNotesSlideShapeParagraph. (required)
     * @return Paragraph
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Paragraph putUpdateNotesSlideShapeParagraph(PutUpdateNotesSlideShapeParagraphRequest request) throws ApiException {
        try {
            ApiResponse<Paragraph> resp = putUpdateNotesSlideShapeParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Paragraph> resp = putUpdateNotesSlideShapeParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update paragraph properties.
     * 
     * @param request Request for putUpdateNotesSlideShapeParagraph. (required)
     * @return ApiResponse&lt;Paragraph&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Paragraph> putUpdateNotesSlideShapeParagraphWithHttpInfo(PutUpdateNotesSlideShapeParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putUpdateNotesSlideShapeParagraphCall(request, null, null);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Update paragraph properties. (asynchronously)
     * 
     * @param request Request for putUpdateNotesSlideShapeParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapeParagraphAsync(PutUpdateNotesSlideShapeParagraphRequest request, final ApiCallback<Paragraph> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putUpdateNotesSlideShapeParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Paragraph>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putUpdateNotesSlideShapePortion
     * @param request Request for putUpdateNotesSlideShapePortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapePortionCall(PutUpdateNotesSlideShapePortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putUpdateNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putUpdateNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putUpdateNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling putUpdateNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling putUpdateNotesSlideShapePortion(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.objectToString(request.getName())).replaceAll("\\{" + "slideIndex" + "\\}", apiClient.objectToString(request.getSlideIndex())).replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath())).replaceAll("\\{" + "shapeIndex" + "\\}", apiClient.objectToString(request.getShapeIndex())).replaceAll("\\{" + "paragraphIndex" + "\\}", apiClient.objectToString(request.getParagraphIndex())).replaceAll("\\{" + "portionIndex" + "\\}", apiClient.objectToString(request.getPortionIndex()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "password", request.getPassword());
        apiClient.addQueryParameter(queryParams, "folder", request.getFolder());
        apiClient.addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Update portion properties.
     * 
     * @param request Request for putUpdateNotesSlideShapePortion. (required)
     * @return Portion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portion putUpdateNotesSlideShapePortion(PutUpdateNotesSlideShapePortionRequest request) throws ApiException {
        try {
            ApiResponse<Portion> resp = putUpdateNotesSlideShapePortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<Portion> resp = putUpdateNotesSlideShapePortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update portion properties.
     * 
     * @param request Request for putUpdateNotesSlideShapePortion. (required)
     * @return ApiResponse&lt;Portion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portion> putUpdateNotesSlideShapePortionWithHttpInfo(PutUpdateNotesSlideShapePortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putUpdateNotesSlideShapePortionCall(request, null, null);
        Type returnType = new TypeToken<Portion>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Update portion properties. (asynchronously)
     * 
     * @param request Request for putUpdateNotesSlideShapePortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapePortionAsync(PutUpdateNotesSlideShapePortionRequest request, final ApiCallback<Portion> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putUpdateNotesSlideShapePortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<Portion>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for storageExists
     * @param request Request for storageExists. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call storageExistsCall(StorageExistsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storageName' is set
        if (request.getStorageName() == null) {
            throw new ApiException("Missing the required parameter 'storageName' when calling storageExists(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/{storageName}/exist"
            .replaceAll("\\{" + "storageName" + "\\}", apiClient.objectToString(request.getStorageName()));

        List<Pair> queryParams = new ArrayList<Pair>();

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Check if storage exists
     * 
     * @param request Request for storageExists. (required)
     * @return StorageExist
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StorageExist storageExists(StorageExistsRequest request) throws ApiException {
        try {
            ApiResponse<StorageExist> resp = storageExistsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<StorageExist> resp = storageExistsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Check if storage exists
     * 
     * @param request Request for storageExists. (required)
     * @return ApiResponse&lt;StorageExist&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StorageExist> storageExistsWithHttpInfo(StorageExistsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = storageExistsCall(request, null, null);
        Type returnType = new TypeToken<StorageExist>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Check if storage exists (asynchronously)
     * 
     * @param request Request for storageExists. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call storageExistsAsync(StorageExistsRequest request, final ApiCallback<StorageExist> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = storageExistsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<StorageExist>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for uploadFile
     * @param request Request for uploadFile. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadFileCall(UploadFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (request.getFile() == null) {
            throw new ApiException("Missing the required parameter 'file' when calling uploadFile(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/storage/file/{path}"
            .replaceAll("\\{" + "path" + "\\}", apiClient.objectToString(request.getPath()));

        List<Pair> queryParams = new ArrayList<Pair>();
        apiClient.addQueryParameter(queryParams, "storageName", request.getStorageName());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();
        if (request.getFile() != null)
        formParams.put("file", request.getFile());

        final String[] accepts = {
            "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "multipart/form-data"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return apiClient.buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Upload file
     * 
     * @param request Request for uploadFile. (required)
     * @return FilesUploadResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesUploadResult uploadFile(UploadFileRequest request) throws ApiException {
        try {
            ApiResponse<FilesUploadResult> resp = uploadFileWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<FilesUploadResult> resp = uploadFileWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Upload file
     * 
     * @param request Request for uploadFile. (required)
     * @return ApiResponse&lt;FilesUploadResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesUploadResult> uploadFileWithHttpInfo(UploadFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = uploadFileCall(request, null, null);
        Type returnType = new TypeToken<FilesUploadResult>(){}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Upload file (asynchronously)
     * 
     * @param request Request for uploadFile. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadFileAsync(UploadFileRequest request, final ApiCallback<FilesUploadResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = uploadFileCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<FilesUploadResult>(){}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    private final ApiClient apiClient;
}
