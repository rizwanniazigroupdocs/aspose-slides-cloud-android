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
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.ResourceUri;
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
 * Picture fill.
 */
@ApiModel(description = "Picture fill.")
public class PictureFill extends FillFormat {
  @SerializedName(value = "cropBottom", alternate = { "CropBottom" })
  private Double cropBottom;

  @SerializedName(value = "cropLeft", alternate = { "CropLeft" })
  private Double cropLeft;

  @SerializedName(value = "cropRight", alternate = { "CropRight" })
  private Double cropRight;

  @SerializedName(value = "cropTop", alternate = { "CropTop" })
  private Double cropTop;

  @SerializedName(value = "dpi", alternate = { "Dpi" })
  private Integer dpi;

  @SerializedName(value = "image", alternate = { "Image" })
  private ResourceUri image;

  @SerializedName(value = "base64Data", alternate = { "Base64Data" })
  private String base64Data;

  @SerializedName(value = "svgData", alternate = { "SvgData" })
  private String svgData;

  /**
   * Fill mode.
   */
  @JsonAdapter(PictureFillModeEnum.Adapter.class)
  public enum PictureFillModeEnum {
    TILE("Tile"),
    
    STRETCH("Stretch");

    private String value;

    PictureFillModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PictureFillModeEnum fromValue(String text) {
      for (PictureFillModeEnum b : PictureFillModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PictureFillModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PictureFillModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PictureFillModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PictureFillModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "pictureFillMode", alternate = { "PictureFillMode" })
  private PictureFillModeEnum pictureFillMode;


  public PictureFill() {
    super();
    setType(TypeEnum.PICTURE);
  }

  public PictureFill cropBottom(Double cropBottom) {
    this.cropBottom = cropBottom;
    return this;
  }

   /**
   * Percentage of image height that is cropped from the bottom.
   * @return cropBottom
  **/
  @ApiModelProperty(required = true, value = "Percentage of image height that is cropped from the bottom.")
  public Double getCropBottom() {
    return cropBottom;
  }

  public void setCropBottom(Double cropBottom) {
    this.cropBottom = cropBottom;
  }

  public PictureFill cropLeft(Double cropLeft) {
    this.cropLeft = cropLeft;
    return this;
  }

   /**
   * Percentage of image height that is cropped from the left.
   * @return cropLeft
  **/
  @ApiModelProperty(required = true, value = "Percentage of image height that is cropped from the left.")
  public Double getCropLeft() {
    return cropLeft;
  }

  public void setCropLeft(Double cropLeft) {
    this.cropLeft = cropLeft;
  }

  public PictureFill cropRight(Double cropRight) {
    this.cropRight = cropRight;
    return this;
  }

   /**
   * Percentage of image height that is cropped from the right.
   * @return cropRight
  **/
  @ApiModelProperty(required = true, value = "Percentage of image height that is cropped from the right.")
  public Double getCropRight() {
    return cropRight;
  }

  public void setCropRight(Double cropRight) {
    this.cropRight = cropRight;
  }

  public PictureFill cropTop(Double cropTop) {
    this.cropTop = cropTop;
    return this;
  }

   /**
   * Percentage of image height that is cropped from the top.
   * @return cropTop
  **/
  @ApiModelProperty(required = true, value = "Percentage of image height that is cropped from the top.")
  public Double getCropTop() {
    return cropTop;
  }

  public void setCropTop(Double cropTop) {
    this.cropTop = cropTop;
  }

  public PictureFill dpi(Integer dpi) {
    this.dpi = dpi;
    return this;
  }

   /**
   * Picture resolution.
   * @return dpi
  **/
  @ApiModelProperty(required = true, value = "Picture resolution.")
  public Integer getDpi() {
    return dpi;
  }

  public void setDpi(Integer dpi) {
    this.dpi = dpi;
  }

  public PictureFill image(ResourceUri image) {
    this.image = image;
    return this;
  }

   /**
   * Internal image link.
   * @return image
  **/
  @ApiModelProperty(value = "Internal image link.")
  public ResourceUri getImage() {
    return image;
  }

  public void setImage(ResourceUri image) {
    this.image = image;
  }

  public PictureFill base64Data(String base64Data) {
    this.base64Data = base64Data;
    return this;
  }

   /**
   * Base 64 image data.
   * @return base64Data
  **/
  @ApiModelProperty(value = "Base 64 image data.")
  public String getBase64Data() {
    return base64Data;
  }

  public void setBase64Data(String base64Data) {
    this.base64Data = base64Data;
  }

  public PictureFill svgData(String svgData) {
    this.svgData = svgData;
    return this;
  }

   /**
   * SVG image data.
   * @return svgData
  **/
  @ApiModelProperty(value = "SVG image data.")
  public String getSvgData() {
    return svgData;
  }

  public void setSvgData(String svgData) {
    this.svgData = svgData;
  }

  public PictureFill pictureFillMode(PictureFillModeEnum pictureFillMode) {
    this.pictureFillMode = pictureFillMode;
    return this;
  }

   /**
   * Fill mode.
   * @return pictureFillMode
  **/
  @ApiModelProperty(required = true, value = "Fill mode.")
  public PictureFillModeEnum getPictureFillMode() {
    return pictureFillMode;
  }

  public void setPictureFillMode(PictureFillModeEnum pictureFillMode) {
    this.pictureFillMode = pictureFillMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PictureFill pictureFill = (PictureFill) o;
    return true && Objects.equals(this.cropBottom, pictureFill.cropBottom) && Objects.equals(this.cropLeft, pictureFill.cropLeft) && Objects.equals(this.cropRight, pictureFill.cropRight) && Objects.equals(this.cropTop, pictureFill.cropTop) && Objects.equals(this.dpi, pictureFill.dpi) && Objects.equals(this.image, pictureFill.image) && Objects.equals(this.base64Data, pictureFill.base64Data) && Objects.equals(this.svgData, pictureFill.svgData) && Objects.equals(this.pictureFillMode, pictureFill.pictureFillMode) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cropBottom, cropLeft, cropRight, cropTop, dpi, image, base64Data, svgData, pictureFillMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PictureFill {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cropBottom: ").append(toIndentedString(cropBottom)).append("\n");
    sb.append("    cropLeft: ").append(toIndentedString(cropLeft)).append("\n");
    sb.append("    cropRight: ").append(toIndentedString(cropRight)).append("\n");
    sb.append("    cropTop: ").append(toIndentedString(cropTop)).append("\n");
    sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(base64Data)).append("\n");
    sb.append("    svgData: ").append(toIndentedString(svgData)).append("\n");
    sb.append("    pictureFillMode: ").append(toIndentedString(pictureFillMode)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.PICTURE);
  }
}
