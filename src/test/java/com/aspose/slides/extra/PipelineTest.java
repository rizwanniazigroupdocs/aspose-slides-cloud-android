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
import com.aspose.slides.FileInfo;
import com.aspose.slides.model.*;
import com.aspose.slides.model.request.PostSlidesPipelineRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

/**
 * API tests for PlaceholdersApi
 */
public class PipelineTest extends ApiTest {
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void placeholderTest() throws ApiException, IOException {
        RequestInputFile file1 = new RequestInputFile();
        file1.setIndex(0);

        RequestInputFile file2 = new RequestInputFile();
        file2.setIndex(1);

        Input input = new Input();
        input.setTemplateData(file1);
        input.setTemplate(file2);

        OutputFile output = new OutputFile();

        Save task = new Save();
        task.setFormat(Save.FormatEnum.PPTX);
        task.setOutput(output);
        List<Task> tasks = new ArrayList<Task>();
        tasks.add(task);

        Pipeline pipeline = new Pipeline();
        pipeline.setInput(input);
        pipeline.setTasks(tasks);

        FileInfo fileInfo1 = new FileInfo();
        fileInfo1.setMimeType("text/xml");
        fileInfo1.setData(Files.readAllBytes(Paths.get("TestData/TemplatingCVDataWithBase64.xml")));

        FileInfo fileInfo2 = new FileInfo();
        fileInfo2.setName("TemplateCV.pptx");
        fileInfo2.setData(Files.readAllBytes(Paths.get("TestData/TemplateCV.pptx")));
        
        List<FileInfo> files = new ArrayList<FileInfo>();
        files.add(fileInfo1);
        files.add(fileInfo2);
        
        PostSlidesPipelineRequest request = new PostSlidesPipelineRequest();
        request.setPipeline(pipeline);
        request.setFiles(files);
                
        File response = api.postSlidesPipeline(request);
        assertTrue(response.isFile());
    }
}
