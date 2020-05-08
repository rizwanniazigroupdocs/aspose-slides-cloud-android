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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * The sizing of the slide region.
 */
@ApiModel(description = "The sizing of the slide region.")
public class NormalViewRestoredProperties {
  @SerializedName(value = "autoAdjust", alternate = { "AutoAdjust" })
  private Boolean autoAdjust;

  @SerializedName(value = "dimensionSize", alternate = { "DimensionSize" })
  private Double dimensionSize;


  public NormalViewRestoredProperties() {
    super();
  }

  public NormalViewRestoredProperties autoAdjust(Boolean autoAdjust) {
    this.autoAdjust = autoAdjust;
    return this;
  }

   /**
   * True if the size of the side content region should compensate for the new size when resizing the window containing the view within the application.
   * @return autoAdjust
  **/
  @ApiModelProperty(value = "True if the size of the side content region should compensate for the new size when resizing the window containing the view within the application.")
  public Boolean isAutoAdjust() {
    return autoAdjust;
  }

  public void setAutoAdjust(Boolean autoAdjust) {
    this.autoAdjust = autoAdjust;
  }

  public NormalViewRestoredProperties dimensionSize(Double dimensionSize) {
    this.dimensionSize = dimensionSize;
    return this;
  }

   /**
   * The size of the slide region.
   * @return dimensionSize
  **/
  @ApiModelProperty(value = "The size of the slide region.")
  public Double getDimensionSize() {
    return dimensionSize;
  }

  public void setDimensionSize(Double dimensionSize) {
    this.dimensionSize = dimensionSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalViewRestoredProperties normalViewRestoredProperties = (NormalViewRestoredProperties) o;
    return true && Objects.equals(this.autoAdjust, normalViewRestoredProperties.autoAdjust) && Objects.equals(this.dimensionSize, normalViewRestoredProperties.dimensionSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAdjust, dimensionSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalViewRestoredProperties {\n");
    
    sb.append("    autoAdjust: ").append(toIndentedString(autoAdjust)).append("\n");
    sb.append("    dimensionSize: ").append(toIndentedString(dimensionSize)).append("\n");
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

}
