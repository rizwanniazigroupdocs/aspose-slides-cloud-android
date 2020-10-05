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
import com.aspose.slides.model.GeometryShape;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.ResourceUriElement;
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
 * Represents Connector resource.
 */
@ApiModel(description = "Represents Connector resource.")
public class Connector extends GeometryShape {
  @SerializedName(value = "startShapeConnectedTo", alternate = { "StartShapeConnectedTo" })
  private ResourceUri startShapeConnectedTo;

  @SerializedName(value = "startShapeConnectedToIndex", alternate = { "StartShapeConnectedToIndex" })
  private Integer startShapeConnectedToIndex;

  @SerializedName(value = "endShapeConnectedTo", alternate = { "EndShapeConnectedTo" })
  private ResourceUri endShapeConnectedTo;

  @SerializedName(value = "endShapeConnectedToIndex", alternate = { "EndShapeConnectedToIndex" })
  private Integer endShapeConnectedToIndex;


  public Connector() {
    super();
    setType(TypeEnum.CONNECTOR);
  }

  public Connector startShapeConnectedTo(ResourceUri startShapeConnectedTo) {
    this.startShapeConnectedTo = startShapeConnectedTo;
    return this;
  }

   /**
   * Start shape link.
   * @return startShapeConnectedTo
  **/
  @ApiModelProperty(value = "Start shape link.")
  public ResourceUri getStartShapeConnectedTo() {
    return startShapeConnectedTo;
  }

  public void setStartShapeConnectedTo(ResourceUri startShapeConnectedTo) {
    this.startShapeConnectedTo = startShapeConnectedTo;
  }

  public Connector startShapeConnectedToIndex(Integer startShapeConnectedToIndex) {
    this.startShapeConnectedToIndex = startShapeConnectedToIndex;
    return this;
  }

   /**
   * Start shape index.
   * @return startShapeConnectedToIndex
  **/
  @ApiModelProperty(value = "Start shape index.")
  public Integer getStartShapeConnectedToIndex() {
    return startShapeConnectedToIndex;
  }

  public void setStartShapeConnectedToIndex(Integer startShapeConnectedToIndex) {
    this.startShapeConnectedToIndex = startShapeConnectedToIndex;
  }

  public Connector endShapeConnectedTo(ResourceUri endShapeConnectedTo) {
    this.endShapeConnectedTo = endShapeConnectedTo;
    return this;
  }

   /**
   * End shape link.
   * @return endShapeConnectedTo
  **/
  @ApiModelProperty(value = "End shape link.")
  public ResourceUri getEndShapeConnectedTo() {
    return endShapeConnectedTo;
  }

  public void setEndShapeConnectedTo(ResourceUri endShapeConnectedTo) {
    this.endShapeConnectedTo = endShapeConnectedTo;
  }

  public Connector endShapeConnectedToIndex(Integer endShapeConnectedToIndex) {
    this.endShapeConnectedToIndex = endShapeConnectedToIndex;
    return this;
  }

   /**
   * End shape index.
   * @return endShapeConnectedToIndex
  **/
  @ApiModelProperty(value = "End shape index.")
  public Integer getEndShapeConnectedToIndex() {
    return endShapeConnectedToIndex;
  }

  public void setEndShapeConnectedToIndex(Integer endShapeConnectedToIndex) {
    this.endShapeConnectedToIndex = endShapeConnectedToIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connector connector = (Connector) o;
    return true && Objects.equals(this.startShapeConnectedTo, connector.startShapeConnectedTo) && Objects.equals(this.startShapeConnectedToIndex, connector.startShapeConnectedToIndex) && Objects.equals(this.endShapeConnectedTo, connector.endShapeConnectedTo) && Objects.equals(this.endShapeConnectedToIndex, connector.endShapeConnectedToIndex) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startShapeConnectedTo, startShapeConnectedToIndex, endShapeConnectedTo, endShapeConnectedToIndex, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connector {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startShapeConnectedTo: ").append(toIndentedString(startShapeConnectedTo)).append("\n");
    sb.append("    startShapeConnectedToIndex: ").append(toIndentedString(startShapeConnectedToIndex)).append("\n");
    sb.append("    endShapeConnectedTo: ").append(toIndentedString(endShapeConnectedTo)).append("\n");
    sb.append("    endShapeConnectedToIndex: ").append(toIndentedString(endShapeConnectedToIndex)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.CONNECTOR);
  }
}
