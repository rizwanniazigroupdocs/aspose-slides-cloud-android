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

package com.aspose.slides.extra;

import com.aspose.slides.api.SlidesApi;
import com.aspose.slides.ApiException;
import org.junit.Test;

import com.aspose.slides.ApiTest;
import com.aspose.slides.Configuration;
import com.aspose.slides.FileInfo;
import com.aspose.slides.JSON;
import com.aspose.slides.model.*;
import com.aspose.slides.model.request.PostSlideSaveAsRequest;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * API tests for PlaceholdersApi
 */
public class TimeoutTest extends ApiTest {
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     * 
     */
    @Test
    public void timeoutTest() throws ApiException, IOException {
        /* unstable test
        initialize("postSlideSaveAs", null, null);
        String configContents = new String(Files.readAllBytes(Paths.get("testConfig.json")), Charset.defaultCharset());
        Configuration config = new JSON().deserialize(configContents, new TypeToken<Configuration>(){}.getType());
        config.setTimeout(1);
        initialize("postSlideSaveAs", null, null);
        PostSlideSaveAsRequest request = new PostSlideSaveAsRequest();
        request.setName("test.pptx");
        request.setFolder("TempSlidesSDK");
        request.setPassword("password");
        request.setSlideIndex(1);
        request.setFormat(SlideExportFormat.SVG);
        new SlidesApi(config).postSlideSaveAs(request);*/
    }
}
