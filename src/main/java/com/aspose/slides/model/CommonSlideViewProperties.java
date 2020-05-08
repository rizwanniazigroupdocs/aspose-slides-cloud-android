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
 * Slide view properties.
 */
@ApiModel(description = "Slide view properties.")
public class CommonSlideViewProperties {
  @SerializedName(value = "scale", alternate = { "Scale" })
  private Integer scale;

  @SerializedName(value = "variableScale", alternate = { "VariableScale" })
  private Boolean variableScale;


  public CommonSlideViewProperties() {
    super();
  }

  public CommonSlideViewProperties scale(Integer scale) {
    this.scale = scale;
    return this;
  }

   /**
   * The view scaling ratio (percentage).
   * @return scale
  **/
  @ApiModelProperty(value = "The view scaling ratio (percentage).")
  public Integer getScale() {
    return scale;
  }

  public void setScale(Integer scale) {
    this.scale = scale;
  }

  public CommonSlideViewProperties variableScale(Boolean variableScale) {
    this.variableScale = variableScale;
    return this;
  }

   /**
   * True if the view content should automatically scale to best fit the current window size.
   * @return variableScale
  **/
  @ApiModelProperty(value = "True if the view content should automatically scale to best fit the current window size.")
  public Boolean isVariableScale() {
    return variableScale;
  }

  public void setVariableScale(Boolean variableScale) {
    this.variableScale = variableScale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonSlideViewProperties commonSlideViewProperties = (CommonSlideViewProperties) o;
    return true && Objects.equals(this.scale, commonSlideViewProperties.scale) && Objects.equals(this.variableScale, commonSlideViewProperties.variableScale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale, variableScale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonSlideViewProperties {\n");
    
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    variableScale: ").append(toIndentedString(variableScale)).append("\n");
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
