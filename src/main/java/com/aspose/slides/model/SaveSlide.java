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
import com.aspose.slides.model.OutputFile;
import com.aspose.slides.model.Task;
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
 * Save slide task.
 */
@ApiModel(description = "Save slide task.")
public class SaveSlide extends Task {
  @SerializedName(value = "output", alternate = { "Output" })
  private OutputFile output;

  /**
   * Save format.
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    JPEG("Jpeg"),
    
    PNG("Png"),
    
    GIF("Gif"),
    
    BMP("Bmp"),
    
    TIFF("Tiff"),
    
    HTML("Html"),
    
    PDF("Pdf"),
    
    XPS("Xps"),
    
    PPTX("Pptx"),
    
    ODP("Odp"),
    
    OTP("Otp"),
    
    PPT("Ppt"),
    
    PPS("Pps"),
    
    PPSX("Ppsx"),
    
    PPTM("Pptm"),
    
    PPSM("Ppsm"),
    
    POTX("Potx"),
    
    POT("Pot"),
    
    POTM("Potm"),
    
    SVG("Svg");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String text) {
      for (FormatEnum b : FormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "format", alternate = { "Format" })
  private FormatEnum format;

  @SerializedName(value = "options", alternate = { "Options" })
  private ExportOptions options;

  @SerializedName(value = "width", alternate = { "Width" })
  private Integer width;

  @SerializedName(value = "height", alternate = { "Height" })
  private Integer height;

  @SerializedName(value = "position", alternate = { "Position" })
  private Integer position;


  public SaveSlide() {
    super();
    setType(TypeEnum.SAVESLIDE);
  }

  public SaveSlide output(OutputFile output) {
    this.output = output;
    return this;
  }

   /**
   * Output to save the slide to.
   * @return output
  **/
  @ApiModelProperty(value = "Output to save the slide to.")
  public OutputFile getOutput() {
    return output;
  }

  public void setOutput(OutputFile output) {
    this.output = output;
  }

  public SaveSlide format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Save format.
   * @return format
  **/
  @ApiModelProperty(required = true, value = "Save format.")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public SaveSlide options(ExportOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Save options.
   * @return options
  **/
  @ApiModelProperty(value = "Save options.")
  public ExportOptions getOptions() {
    return options;
  }

  public void setOptions(ExportOptions options) {
    this.options = options;
  }

  public SaveSlide width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Result width for saving to an image format.
   * @return width
  **/
  @ApiModelProperty(value = "Result width for saving to an image format.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public SaveSlide height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Result height for saving to an image format.
   * @return height
  **/
  @ApiModelProperty(value = "Result height for saving to an image format.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public SaveSlide position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Slide index.
   * @return position
  **/
  @ApiModelProperty(required = true, value = "Slide index.")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveSlide saveSlide = (SaveSlide) o;
    return true && Objects.equals(this.output, saveSlide.output) && Objects.equals(this.format, saveSlide.format) && Objects.equals(this.options, saveSlide.options) && Objects.equals(this.width, saveSlide.width) && Objects.equals(this.height, saveSlide.height) && Objects.equals(this.position, saveSlide.position) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output, format, options, width, height, position, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveSlide {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.SAVESLIDE);
  }
}
