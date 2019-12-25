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
import com.aspose.slides.model.Axis;
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
 * Represents chart axes
 */
@ApiModel(description = "Represents chart axes")
public class Axes {
  @SerializedName(value = "horizontalAxis", alternate = { "HorizontalAxis" })
  private Axis horizontalAxis;

  @SerializedName(value = "verticalAxis", alternate = { "VerticalAxis" })
  private Axis verticalAxis;

  @SerializedName(value = "secondaryHorizontalAxis", alternate = { "SecondaryHorizontalAxis" })
  private Axis secondaryHorizontalAxis;

  @SerializedName(value = "secondaryVerticalAxis", alternate = { "SecondaryVerticalAxis" })
  private Axis secondaryVerticalAxis;


  public Axes() {
    super();
  }

  public Axes horizontalAxis(Axis horizontalAxis) {
    this.horizontalAxis = horizontalAxis;
    return this;
  }

   /**
   * Gets or sets the horizontal axis.
   * @return horizontalAxis
  **/
  @ApiModelProperty(value = "Gets or sets the horizontal axis.")
  public Axis getHorizontalAxis() {
    return horizontalAxis;
  }

  public void setHorizontalAxis(Axis horizontalAxis) {
    this.horizontalAxis = horizontalAxis;
  }

  public Axes verticalAxis(Axis verticalAxis) {
    this.verticalAxis = verticalAxis;
    return this;
  }

   /**
   * Gets or sets the vertical axis.
   * @return verticalAxis
  **/
  @ApiModelProperty(value = "Gets or sets the vertical axis.")
  public Axis getVerticalAxis() {
    return verticalAxis;
  }

  public void setVerticalAxis(Axis verticalAxis) {
    this.verticalAxis = verticalAxis;
  }

  public Axes secondaryHorizontalAxis(Axis secondaryHorizontalAxis) {
    this.secondaryHorizontalAxis = secondaryHorizontalAxis;
    return this;
  }

   /**
   * Gets or sets the secondary horizontal axis.
   * @return secondaryHorizontalAxis
  **/
  @ApiModelProperty(value = "Gets or sets the secondary horizontal axis.")
  public Axis getSecondaryHorizontalAxis() {
    return secondaryHorizontalAxis;
  }

  public void setSecondaryHorizontalAxis(Axis secondaryHorizontalAxis) {
    this.secondaryHorizontalAxis = secondaryHorizontalAxis;
  }

  public Axes secondaryVerticalAxis(Axis secondaryVerticalAxis) {
    this.secondaryVerticalAxis = secondaryVerticalAxis;
    return this;
  }

   /**
   * Gets or sets the secondary vertical axis.
   * @return secondaryVerticalAxis
  **/
  @ApiModelProperty(value = "Gets or sets the secondary vertical axis.")
  public Axis getSecondaryVerticalAxis() {
    return secondaryVerticalAxis;
  }

  public void setSecondaryVerticalAxis(Axis secondaryVerticalAxis) {
    this.secondaryVerticalAxis = secondaryVerticalAxis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Axes axes = (Axes) o;
    return true && Objects.equals(this.horizontalAxis, axes.horizontalAxis) && Objects.equals(this.verticalAxis, axes.verticalAxis) && Objects.equals(this.secondaryHorizontalAxis, axes.secondaryHorizontalAxis) && Objects.equals(this.secondaryVerticalAxis, axes.secondaryVerticalAxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(horizontalAxis, verticalAxis, secondaryHorizontalAxis, secondaryVerticalAxis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Axes {\n");
    
    sb.append("    horizontalAxis: ").append(toIndentedString(horizontalAxis)).append("\n");
    sb.append("    verticalAxis: ").append(toIndentedString(verticalAxis)).append("\n");
    sb.append("    secondaryHorizontalAxis: ").append(toIndentedString(secondaryHorizontalAxis)).append("\n");
    sb.append("    secondaryVerticalAxis: ").append(toIndentedString(secondaryVerticalAxis)).append("\n");
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
