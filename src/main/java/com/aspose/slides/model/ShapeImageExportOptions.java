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
 * Provides options that control how a shape is saved in thumbnail.
 */
@ApiModel(description = "Provides options that control how a shape is saved in thumbnail.")
public class ShapeImageExportOptions {
  @SerializedName(value = "scaleX", alternate = { "ScaleX" })
  private Double scaleX;

  @SerializedName(value = "scaleY", alternate = { "ScaleY" })
  private Double scaleY;

  /**
   * Get or sets thumbnail bounds
   */
  @JsonAdapter(ThumbnailBoundsEnum.Adapter.class)
  public enum ThumbnailBoundsEnum {
    SLIDE("Slide"),
    
    SHAPE("Shape"),
    
    APPEARANCE("Appearance");

    private String value;

    ThumbnailBoundsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ThumbnailBoundsEnum fromValue(String text) {
      for (ThumbnailBoundsEnum b : ThumbnailBoundsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ThumbnailBoundsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ThumbnailBoundsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ThumbnailBoundsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ThumbnailBoundsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "thumbnailBounds", alternate = { "ThumbnailBounds" })
  private ThumbnailBoundsEnum thumbnailBounds;

  @SerializedName(value = "format", alternate = { "Format" })
  private String format;


  public ShapeImageExportOptions() {
    super();
  }

  public ShapeImageExportOptions scaleX(Double scaleX) {
    this.scaleX = scaleX;
    return this;
  }

   /**
   * Get or sets scaling ratio by X axis.
   * @return scaleX
  **/
  @ApiModelProperty(required = true, value = "Get or sets scaling ratio by X axis.")
  public Double getScaleX() {
    return scaleX;
  }

  public void setScaleX(Double scaleX) {
    this.scaleX = scaleX;
  }

  public ShapeImageExportOptions scaleY(Double scaleY) {
    this.scaleY = scaleY;
    return this;
  }

   /**
   * Get or sets scaling ratio by Y axis.
   * @return scaleY
  **/
  @ApiModelProperty(required = true, value = "Get or sets scaling ratio by Y axis.")
  public Double getScaleY() {
    return scaleY;
  }

  public void setScaleY(Double scaleY) {
    this.scaleY = scaleY;
  }

  public ShapeImageExportOptions thumbnailBounds(ThumbnailBoundsEnum thumbnailBounds) {
    this.thumbnailBounds = thumbnailBounds;
    return this;
  }

   /**
   * Get or sets thumbnail bounds
   * @return thumbnailBounds
  **/
  @ApiModelProperty(required = true, value = "Get or sets thumbnail bounds")
  public ThumbnailBoundsEnum getThumbnailBounds() {
    return thumbnailBounds;
  }

  public void setThumbnailBounds(ThumbnailBoundsEnum thumbnailBounds) {
    this.thumbnailBounds = thumbnailBounds;
  }

  public ShapeImageExportOptions format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Gets export format.
   * @return format
  **/
  @ApiModelProperty(value = "Gets export format.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShapeImageExportOptions shapeImageExportOptions = (ShapeImageExportOptions) o;
    return true && Objects.equals(this.scaleX, shapeImageExportOptions.scaleX) && Objects.equals(this.scaleY, shapeImageExportOptions.scaleY) && Objects.equals(this.thumbnailBounds, shapeImageExportOptions.thumbnailBounds) && Objects.equals(this.format, shapeImageExportOptions.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaleX, scaleY, thumbnailBounds, format);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShapeImageExportOptions {\n");
    
    sb.append("    scaleX: ").append(toIndentedString(scaleX)).append("\n");
    sb.append("    scaleY: ").append(toIndentedString(scaleY)).append("\n");
    sb.append("    thumbnailBounds: ").append(toIndentedString(thumbnailBounds)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
