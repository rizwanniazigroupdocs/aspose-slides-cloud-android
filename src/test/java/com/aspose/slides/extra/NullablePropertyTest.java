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
import com.aspose.slides.model.*;
import com.aspose.slides.model.request.CopyFileRequest;
import com.aspose.slides.model.request.GetSlideShapeRequest;
import com.aspose.slides.model.request.PostAddNewShapeRequest;
import com.aspose.slides.model.request.PutSlideShapeInfoRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

/**
 * API tests for nullable property deserialization
 */
public class NullablePropertyTest extends ApiTest {
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     * 
     */
    @Test
    public void nullablePropertyTest() throws ApiException, IOException {
        initialize("noSpecificMethod", "noSpecificProperty", null);
        String folderName = "TempSlidesSDK";
        String fileName = "placeholders.pptx";
        String password = "password";
        double min1  = 44.3;
        double min2 = 12;
        double max1 = 104.3;
        double max2 = 87;
        CopyFileRequest request = new CopyFileRequest();
        request.setSrcPath("TempTests/" + fileName);
        request.setDestPath(folderName + "/" + fileName);
        api.copyFile(request);

        Chart testDto = new Chart();
        testDto.setChartType(Chart.ChartTypeEnum.LINE);
        testDto.setWidth(400.0);
        testDto.setHeight(300.0);
        ChartTitle testTitle = new ChartTitle();
        testTitle.setHasTitle(true);
        testTitle.setText("MyTitle");
        testDto.setTitle(testTitle);
        OneValueSeries testSeries = new OneValueSeries();
        testSeries.setType(OneValueSeries.TypeEnum.CLUSTEREDCOLUMN);
        testSeries.setDataPointType(OneValueSeries.DataPointTypeEnum.ONEVALUE);
        testSeries.setName("Series1");
        OneValueChartDataPoint testPoint1 = new OneValueChartDataPoint();
        testPoint1.setValue(40.0);
        OneValueChartDataPoint testPoint2 = new OneValueChartDataPoint();
        testPoint2.setValue(50.0);
        List<OneValueChartDataPoint> points = new ArrayList<OneValueChartDataPoint>();
        points.add(testPoint1);
        points.add(testPoint2);
        testSeries.setDataPoints(points);
        List<Series> series = new ArrayList<Series>();
        series.add(testSeries);
        testDto.setSeries(series);
        Axes testAxes = new Axes();
        Axis testAxis = new Axis();
        testAxis.setIsAutomaticMinValue(false);
        testAxis.setMinValue(min1);
        testAxis.setIsAutomaticMaxValue(false);
        testAxis.setMaxValue(max1);
        testAxes.setHorizontalAxis(testAxis);
        testDto.setAxes(testAxes);
        PostAddNewShapeRequest postRequest = new PostAddNewShapeRequest();
        postRequest.setName(fileName);
        postRequest.setFolder(folderName);
        postRequest.setPassword(password);
        postRequest.setSlideIndex(1);
        postRequest.setDto(testDto);
        api.postAddNewShape(postRequest);

        GetSlideShapeRequest getRequest = new GetSlideShapeRequest();
        getRequest.setName(fileName);
        getRequest.setFolder(folderName);
        getRequest.setPassword(password);
        getRequest.setSlideIndex(1);
        getRequest.setShapeIndex(4);
        api.getSlideShape(getRequest);
        ShapeBase result = api.getSlideShape(getRequest);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMinValue() == min1);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMaxValue() == max1);

        testDto = new Chart();
        testAxes = new Axes();
        testAxis = new Axis();
        testAxis.setMinValue(min2);
        testAxes.setHorizontalAxis(testAxis);
        testDto.setAxes(testAxes);
        PutSlideShapeInfoRequest putRequest = new PutSlideShapeInfoRequest();
        putRequest.setName(fileName);
        putRequest.setFolder(folderName);
        putRequest.setPassword(password);
        putRequest.setSlideIndex(1);
        putRequest.setShapeIndex(4);
        putRequest.setDto(testDto);
        api.putSlideShapeInfo(putRequest);

        result = api.getSlideShape(getRequest);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMinValue() == min2);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMaxValue() == max1);


        testAxis = new Axis();
        testAxis.setMaxValue(max2);
        testAxes.setHorizontalAxis(testAxis);
        api.putSlideShapeInfo(putRequest);

        result = api.getSlideShape(getRequest);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMinValue() == min2);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMaxValue() == max2);
    }
}
