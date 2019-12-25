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
import com.aspose.slides.model.ExportOptions;
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
 * Provides options that control how a presentation is saved in SVG format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in SVG format.")
public class SvgExportOptions extends ExportOptions {
  @SerializedName(value = "vectorizeText", alternate = { "VectorizeText" })
  private Boolean vectorizeText;

  @SerializedName(value = "metafileRasterizationDpi", alternate = { "MetafileRasterizationDpi" })
  private Integer metafileRasterizationDpi;

  @SerializedName(value = "disable3DText", alternate = { "Disable3DText" })
  private Boolean disable3DText;

  @SerializedName(value = "disableGradientSplit", alternate = { "DisableGradientSplit" })
  private Boolean disableGradientSplit;

  @SerializedName(value = "disableLineEndCropping", alternate = { "DisableLineEndCropping" })
  private Boolean disableLineEndCropping;

  @SerializedName(value = "jpegQuality", alternate = { "JpegQuality" })
  private Integer jpegQuality;

  /**
   * Represents the pictures compression level
   */
  @JsonAdapter(PicturesCompressionEnum.Adapter.class)
  public enum PicturesCompressionEnum {
    DPI330("Dpi330"),
    
    DPI220("Dpi220"),
    
    DPI150("Dpi150"),
    
    DPI96("Dpi96"),
    
    DPI72("Dpi72"),
    
    DOCUMENTRESOLUTION("DocumentResolution");

    private String value;

    PicturesCompressionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PicturesCompressionEnum fromValue(String text) {
      for (PicturesCompressionEnum b : PicturesCompressionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PicturesCompressionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PicturesCompressionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PicturesCompressionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PicturesCompressionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "picturesCompression", alternate = { "PicturesCompression" })
  private PicturesCompressionEnum picturesCompression;

  @SerializedName(value = "deletePicturesCroppedAreas", alternate = { "DeletePicturesCroppedAreas" })
  private Boolean deletePicturesCroppedAreas;

  /**
   * Determines a way of handling externally loaded fonts.
   */
  @JsonAdapter(ExternalFontsHandlingEnum.Adapter.class)
  public enum ExternalFontsHandlingEnum {
    ADDLINKSTOFONTFILES("AddLinksToFontFiles"),
    
    EMBED("Embed"),
    
    VECTORIZE("Vectorize");

    private String value;

    ExternalFontsHandlingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExternalFontsHandlingEnum fromValue(String text) {
      for (ExternalFontsHandlingEnum b : ExternalFontsHandlingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExternalFontsHandlingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExternalFontsHandlingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExternalFontsHandlingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ExternalFontsHandlingEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "externalFontsHandling", alternate = { "ExternalFontsHandling" })
  private ExternalFontsHandlingEnum externalFontsHandling;


  public SvgExportOptions() {
    super();
    setFormat("SVG");
  }

  public SvgExportOptions vectorizeText(Boolean vectorizeText) {
    this.vectorizeText = vectorizeText;
    return this;
  }

   /**
   * Determines whether the text on a slide will be saved as graphics.
   * @return vectorizeText
  **/
  @ApiModelProperty(required = true, value = "Determines whether the text on a slide will be saved as graphics.")
  public Boolean isVectorizeText() {
    return vectorizeText;
  }

  public void setVectorizeText(Boolean vectorizeText) {
    this.vectorizeText = vectorizeText;
  }

  public SvgExportOptions metafileRasterizationDpi(Integer metafileRasterizationDpi) {
    this.metafileRasterizationDpi = metafileRasterizationDpi;
    return this;
  }

   /**
   * Returns or sets the lower resolution limit for metafile rasterization.
   * @return metafileRasterizationDpi
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the lower resolution limit for metafile rasterization.")
  public Integer getMetafileRasterizationDpi() {
    return metafileRasterizationDpi;
  }

  public void setMetafileRasterizationDpi(Integer metafileRasterizationDpi) {
    this.metafileRasterizationDpi = metafileRasterizationDpi;
  }

  public SvgExportOptions disable3DText(Boolean disable3DText) {
    this.disable3DText = disable3DText;
    return this;
  }

   /**
   * Determines whether the 3D text is disabled in SVG.
   * @return disable3DText
  **/
  @ApiModelProperty(required = true, value = "Determines whether the 3D text is disabled in SVG.")
  public Boolean isDisable3DText() {
    return disable3DText;
  }

  public void setDisable3DText(Boolean disable3DText) {
    this.disable3DText = disable3DText;
  }

  public SvgExportOptions disableGradientSplit(Boolean disableGradientSplit) {
    this.disableGradientSplit = disableGradientSplit;
    return this;
  }

   /**
   * Disables splitting FromCornerX and FromCenter gradients.
   * @return disableGradientSplit
  **/
  @ApiModelProperty(required = true, value = "Disables splitting FromCornerX and FromCenter gradients.")
  public Boolean isDisableGradientSplit() {
    return disableGradientSplit;
  }

  public void setDisableGradientSplit(Boolean disableGradientSplit) {
    this.disableGradientSplit = disableGradientSplit;
  }

  public SvgExportOptions disableLineEndCropping(Boolean disableLineEndCropping) {
    this.disableLineEndCropping = disableLineEndCropping;
    return this;
  }

   /**
   * SVG 1.1 lacks ability to define insets for markers. Aspose.Slides SVG writing engine has workaround for that problem: it crops end of line with arrow, so, line doesn&#39;t overlap markers. This option switches off such behavior.
   * @return disableLineEndCropping
  **/
  @ApiModelProperty(required = true, value = "SVG 1.1 lacks ability to define insets for markers. Aspose.Slides SVG writing engine has workaround for that problem: it crops end of line with arrow, so, line doesn't overlap markers. This option switches off such behavior.")
  public Boolean isDisableLineEndCropping() {
    return disableLineEndCropping;
  }

  public void setDisableLineEndCropping(Boolean disableLineEndCropping) {
    this.disableLineEndCropping = disableLineEndCropping;
  }

  public SvgExportOptions jpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
    return this;
  }

   /**
   * Determines JPEG encoding quality.
   * @return jpegQuality
  **/
  @ApiModelProperty(required = true, value = "Determines JPEG encoding quality.")
  public Integer getJpegQuality() {
    return jpegQuality;
  }

  public void setJpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
  }

  public SvgExportOptions picturesCompression(PicturesCompressionEnum picturesCompression) {
    this.picturesCompression = picturesCompression;
    return this;
  }

   /**
   * Represents the pictures compression level
   * @return picturesCompression
  **/
  @ApiModelProperty(required = true, value = "Represents the pictures compression level")
  public PicturesCompressionEnum getPicturesCompression() {
    return picturesCompression;
  }

  public void setPicturesCompression(PicturesCompressionEnum picturesCompression) {
    this.picturesCompression = picturesCompression;
  }

  public SvgExportOptions deletePicturesCroppedAreas(Boolean deletePicturesCroppedAreas) {
    this.deletePicturesCroppedAreas = deletePicturesCroppedAreas;
    return this;
  }

   /**
   * A boolean flag indicates if the cropped parts remain as part of the document. If true the cropped  parts will removed, if false they will be serialized in the document (which can possible lead to a  larger file)
   * @return deletePicturesCroppedAreas
  **/
  @ApiModelProperty(required = true, value = "A boolean flag indicates if the cropped parts remain as part of the document. If true the cropped  parts will removed, if false they will be serialized in the document (which can possible lead to a  larger file)")
  public Boolean isDeletePicturesCroppedAreas() {
    return deletePicturesCroppedAreas;
  }

  public void setDeletePicturesCroppedAreas(Boolean deletePicturesCroppedAreas) {
    this.deletePicturesCroppedAreas = deletePicturesCroppedAreas;
  }

  public SvgExportOptions externalFontsHandling(ExternalFontsHandlingEnum externalFontsHandling) {
    this.externalFontsHandling = externalFontsHandling;
    return this;
  }

   /**
   * Determines a way of handling externally loaded fonts.
   * @return externalFontsHandling
  **/
  @ApiModelProperty(required = true, value = "Determines a way of handling externally loaded fonts.")
  public ExternalFontsHandlingEnum getExternalFontsHandling() {
    return externalFontsHandling;
  }

  public void setExternalFontsHandling(ExternalFontsHandlingEnum externalFontsHandling) {
    this.externalFontsHandling = externalFontsHandling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SvgExportOptions svgExportOptions = (SvgExportOptions) o;
    return true && Objects.equals(this.vectorizeText, svgExportOptions.vectorizeText) && Objects.equals(this.metafileRasterizationDpi, svgExportOptions.metafileRasterizationDpi) && Objects.equals(this.disable3DText, svgExportOptions.disable3DText) && Objects.equals(this.disableGradientSplit, svgExportOptions.disableGradientSplit) && Objects.equals(this.disableLineEndCropping, svgExportOptions.disableLineEndCropping) && Objects.equals(this.jpegQuality, svgExportOptions.jpegQuality) && Objects.equals(this.picturesCompression, svgExportOptions.picturesCompression) && Objects.equals(this.deletePicturesCroppedAreas, svgExportOptions.deletePicturesCroppedAreas) && Objects.equals(this.externalFontsHandling, svgExportOptions.externalFontsHandling) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorizeText, metafileRasterizationDpi, disable3DText, disableGradientSplit, disableLineEndCropping, jpegQuality, picturesCompression, deletePicturesCroppedAreas, externalFontsHandling, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SvgExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vectorizeText: ").append(toIndentedString(vectorizeText)).append("\n");
    sb.append("    metafileRasterizationDpi: ").append(toIndentedString(metafileRasterizationDpi)).append("\n");
    sb.append("    disable3DText: ").append(toIndentedString(disable3DText)).append("\n");
    sb.append("    disableGradientSplit: ").append(toIndentedString(disableGradientSplit)).append("\n");
    sb.append("    disableLineEndCropping: ").append(toIndentedString(disableLineEndCropping)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    picturesCompression: ").append(toIndentedString(picturesCompression)).append("\n");
    sb.append("    deletePicturesCroppedAreas: ").append(toIndentedString(deletePicturesCroppedAreas)).append("\n");
    sb.append("    externalFontsHandling: ").append(toIndentedString(externalFontsHandling)).append("\n");
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
