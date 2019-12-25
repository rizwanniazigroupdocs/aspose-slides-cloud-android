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
 * Represents outer shadow effect 
 */
@ApiModel(description = "Represents outer shadow effect ")
public class OuterShadowEffect {
  @SerializedName(value = "direction", alternate = { "Direction" })
  private Double direction;

  @SerializedName(value = "distance", alternate = { "Distance" })
  private Double distance;

  @SerializedName(value = "blurRadius", alternate = { "BlurRadius" })
  private Double blurRadius;

  @SerializedName(value = "shadowColor", alternate = { "ShadowColor" })
  private String shadowColor;


  public OuterShadowEffect() {
    super();
  }

  public OuterShadowEffect direction(Double direction) {
    this.direction = direction;
    return this;
  }

   /**
   * direction
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "direction")
  public Double getDirection() {
    return direction;
  }

  public void setDirection(Double direction) {
    this.direction = direction;
  }

  public OuterShadowEffect distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * distance
   * @return distance
  **/
  @ApiModelProperty(required = true, value = "distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public OuterShadowEffect blurRadius(Double blurRadius) {
    this.blurRadius = blurRadius;
    return this;
  }

   /**
   * blur radius
   * @return blurRadius
  **/
  @ApiModelProperty(required = true, value = "blur radius")
  public Double getBlurRadius() {
    return blurRadius;
  }

  public void setBlurRadius(Double blurRadius) {
    this.blurRadius = blurRadius;
  }

  public OuterShadowEffect shadowColor(String shadowColor) {
    this.shadowColor = shadowColor;
    return this;
  }

   /**
   * shadow color
   * @return shadowColor
  **/
  @ApiModelProperty(value = "shadow color")
  public String getShadowColor() {
    return shadowColor;
  }

  public void setShadowColor(String shadowColor) {
    this.shadowColor = shadowColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterShadowEffect outerShadowEffect = (OuterShadowEffect) o;
    return true && Objects.equals(this.direction, outerShadowEffect.direction) && Objects.equals(this.distance, outerShadowEffect.distance) && Objects.equals(this.blurRadius, outerShadowEffect.blurRadius) && Objects.equals(this.shadowColor, outerShadowEffect.shadowColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, distance, blurRadius, shadowColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterShadowEffect {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    blurRadius: ").append(toIndentedString(blurRadius)).append("\n");
    sb.append("    shadowColor: ").append(toIndentedString(shadowColor)).append("\n");
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
