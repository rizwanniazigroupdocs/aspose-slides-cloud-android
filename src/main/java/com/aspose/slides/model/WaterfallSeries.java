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

package com.aspose.slides.model;

import java.util.Objects;
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.OneValueChartDataPoint;
import com.aspose.slides.model.OneValueSeries;
import com.aspose.slides.model.SeriesMarker;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * One value series.
 */
@ApiModel(description = "One value series.")
public class WaterfallSeries extends OneValueSeries {
  @SerializedName(value = "showConnectorLines", alternate = { "ShowConnectorLines" })
  private Boolean showConnectorLines;


  public WaterfallSeries() {
    super();
    setDataPointType(DataPointTypeEnum.ONEVALUE);
    setDataPoints(new ArrayList<OneValueChartDataPoint>());
  }

  public WaterfallSeries showConnectorLines(Boolean showConnectorLines) {
    this.showConnectorLines = showConnectorLines;
    return this;
  }

   /**
   * True if inner points are shown.
   * @return showConnectorLines
  **/
  @ApiModelProperty(value = "True if inner points are shown.")
  public Boolean isShowConnectorLines() {
    return showConnectorLines;
  }

  public void setShowConnectorLines(Boolean showConnectorLines) {
    this.showConnectorLines = showConnectorLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaterfallSeries waterfallSeries = (WaterfallSeries) o;
    return true && Objects.equals(this.showConnectorLines, waterfallSeries.showConnectorLines) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showConnectorLines, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaterfallSeries {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    showConnectorLines: ").append(toIndentedString(showConnectorLines)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }



  private static final Map<String, Object> typeDeterminers = new Hashtable<String, Object>();

  static {
      typeDeterminers.put("DataPointType", DataPointTypeEnum.ONEVALUE);
  }
}
