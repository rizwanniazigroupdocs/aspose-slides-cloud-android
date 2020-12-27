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

import com.aspose.slides.ApiException;
import org.junit.Test;

import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import com.aspose.slides.model.request.GetSlideShapeRequest;
import java.io.IOException;
import static org.junit.Assert.assertTrue;

/**
 * API tests for abstract class deserialization
 */
public class AbstractClassTest extends ApiTest {
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     * 
     */
    @Test
    public void shapeTest() throws ApiException, IOException {
        initialize("getSlideShape", null, null);
        GetSlideShapeRequest request = new GetSlideShapeRequest();
        request.setName("test.pptx");
        request.setFolder("TempSlidesSDK");
        request.setPassword("password");
        request.setSlideIndex(1);
        request.setShapeIndex(1);
        ShapeBase shape = api.getSlideShape(request);
        assertTrue(shape instanceof Shape);
        assertTrue(((Shape)shape).getText().equals("1"));
    }

    /**
     * Check default model properties are set.
     * @throws ApiException
     */
    @Test
    public void chartTest() throws ApiException {
        Chart chart = new Chart();
        assertTrue(chart.getType().equals(Chart.TypeEnum.CHART));
    }
}
