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
 * Represents the plot area
 */
@ApiModel(description = "Represents the plot area")
public class PlotArea {
  @SerializedName(value = "x", alternate = { "X" })
  private Double x;

  @SerializedName(value = "y", alternate = { "Y" })
  private Double y;

  @SerializedName(value = "width", alternate = { "Width" })
  private Double width;

  @SerializedName(value = "height", alternate = { "Height" })
  private Double height;

  /**
   * If layout of the plot area is defined manually specifies whether to layout the plot area by its inside (not including axis and axis labels) or outside.
   */
  @JsonAdapter(LayoutTargetTypeEnum.Adapter.class)
  public enum LayoutTargetTypeEnum {
    INNER("Inner"),
    
    OUTER("Outer");

    private String value;

    LayoutTargetTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LayoutTargetTypeEnum fromValue(String text) {
      for (LayoutTargetTypeEnum b : LayoutTargetTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LayoutTargetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LayoutTargetTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LayoutTargetTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LayoutTargetTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "layoutTargetType", alternate = { "LayoutTargetType" })
  private LayoutTargetTypeEnum layoutTargetType;

  @SerializedName(value = "fillFormat", alternate = { "FillFormat" })
  private FillFormat fillFormat;

  @SerializedName(value = "effectFormat", alternate = { "EffectFormat" })
  private EffectFormat effectFormat;

  @SerializedName(value = "lineFormat", alternate = { "LineFormat" })
  private LineFormat lineFormat;


  public PlotArea() {
    super();
  }

  public PlotArea x(Double x) {
    this.x = x;
    return this;
  }

   /**
   * the X location
   * @return x
  **/
  @ApiModelProperty(value = "the X location")
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public PlotArea y(Double y) {
    this.y = y;
    return this;
  }

   /**
   * the Y location
   * @return y
  **/
  @ApiModelProperty(value = "the Y location")
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public PlotArea width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Width
   * @return width
  **/
  @ApiModelProperty(value = "Width")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public PlotArea height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Height
   * @return height
  **/
  @ApiModelProperty(value = "Height")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public PlotArea layoutTargetType(LayoutTargetTypeEnum layoutTargetType) {
    this.layoutTargetType = layoutTargetType;
    return this;
  }

   /**
   * If layout of the plot area is defined manually specifies whether to layout the plot area by its inside (not including axis and axis labels) or outside.
   * @return layoutTargetType
  **/
  @ApiModelProperty(value = "If layout of the plot area is defined manually specifies whether to layout the plot area by its inside (not including axis and axis labels) or outside.")
  public LayoutTargetTypeEnum getLayoutTargetType() {
    return layoutTargetType;
  }

  public void setLayoutTargetType(LayoutTargetTypeEnum layoutTargetType) {
    this.layoutTargetType = layoutTargetType;
  }

  public PlotArea fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Get or sets the fill format.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Get or sets the fill format.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public PlotArea effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Get or sets the effect format.
   * @return effectFormat
  **/
  @ApiModelProperty(value = "Get or sets the effect format.")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public PlotArea lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Get or sets the line format.
   * @return lineFormat
  **/
  @ApiModelProperty(value = "Get or sets the line format.")
  public LineFormat getLineFormat() {
    return lineFormat;
  }

  public void setLineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlotArea plotArea = (PlotArea) o;
    return true && Objects.equals(this.x, plotArea.x) && Objects.equals(this.y, plotArea.y) && Objects.equals(this.width, plotArea.width) && Objects.equals(this.height, plotArea.height) && Objects.equals(this.layoutTargetType, plotArea.layoutTargetType) && Objects.equals(this.fillFormat, plotArea.fillFormat) && Objects.equals(this.effectFormat, plotArea.effectFormat) && Objects.equals(this.lineFormat, plotArea.lineFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, width, height, layoutTargetType, fillFormat, effectFormat, lineFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlotArea {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    layoutTargetType: ").append(toIndentedString(layoutTargetType)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    effectFormat: ").append(toIndentedString(effectFormat)).append("\n");
    sb.append("    lineFormat: ").append(toIndentedString(lineFormat)).append("\n");
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
