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
 * Represents a chart legend
 */
@ApiModel(description = "Represents a chart legend")
public class Legend {
  /**
   * position
   */
  @JsonAdapter(PositionEnum.Adapter.class)
  public enum PositionEnum {
    BOTTOM("Bottom"),
    
    LEFT("Left"),
    
    RIGHT("Right"),
    
    TOP("Top"),
    
    TOPRIGHT("TopRight");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PositionEnum fromValue(String text) {
      for (PositionEnum b : PositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PositionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PositionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "position", alternate = { "Position" })
  private PositionEnum position;

  @SerializedName(value = "x", alternate = { "X" })
  private Double x;

  @SerializedName(value = "y", alternate = { "Y" })
  private Double y;

  @SerializedName(value = "width", alternate = { "Width" })
  private Double width;

  @SerializedName(value = "height", alternate = { "Height" })
  private Double height;

  @SerializedName(value = "overlay", alternate = { "Overlay" })
  private Boolean overlay;

  @SerializedName(value = "fillFormat", alternate = { "FillFormat" })
  private FillFormat fillFormat;

  @SerializedName(value = "effectFormat", alternate = { "EffectFormat" })
  private EffectFormat effectFormat;

  @SerializedName(value = "lineFormat", alternate = { "LineFormat" })
  private LineFormat lineFormat;


  public Legend() {
    super();
  }

  public Legend position(PositionEnum position) {
    this.position = position;
    return this;
  }

   /**
   * position
   * @return position
  **/
  @ApiModelProperty(required = true, value = "position")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public Legend x(Double x) {
    this.x = x;
    return this;
  }

   /**
   * the X location
   * @return x
  **/
  @ApiModelProperty(required = true, value = "the X location")
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public Legend y(Double y) {
    this.y = y;
    return this;
  }

   /**
   * the Y location
   * @return y
  **/
  @ApiModelProperty(required = true, value = "the Y location")
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public Legend width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Width
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Width")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Legend height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Height
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Height")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Legend overlay(Boolean overlay) {
    this.overlay = overlay;
    return this;
  }

   /**
   * true if other elements are allowed to overlay the legend
   * @return overlay
  **/
  @ApiModelProperty(required = true, value = "true if other elements are allowed to overlay the legend")
  public Boolean isOverlay() {
    return overlay;
  }

  public void setOverlay(Boolean overlay) {
    this.overlay = overlay;
  }

  public Legend fillFormat(FillFormat fillFormat) {
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

  public Legend effectFormat(EffectFormat effectFormat) {
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

  public Legend lineFormat(LineFormat lineFormat) {
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
    Legend legend = (Legend) o;
    return true && Objects.equals(this.position, legend.position) && Objects.equals(this.x, legend.x) && Objects.equals(this.y, legend.y) && Objects.equals(this.width, legend.width) && Objects.equals(this.height, legend.height) && Objects.equals(this.overlay, legend.overlay) && Objects.equals(this.fillFormat, legend.fillFormat) && Objects.equals(this.effectFormat, legend.effectFormat) && Objects.equals(this.lineFormat, legend.lineFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, x, y, width, height, overlay, fillFormat, effectFormat, lineFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Legend {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    overlay: ").append(toIndentedString(overlay)).append("\n");
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
