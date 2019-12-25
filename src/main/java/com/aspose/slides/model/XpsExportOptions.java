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
 * Provides options that control how a presentation is saved in XPS format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in XPS format.")
public class XpsExportOptions extends ExportOptions {
  @SerializedName(value = "showHiddenSlides", alternate = { "ShowHiddenSlides" })
  private Boolean showHiddenSlides;

  @SerializedName(value = "saveMetafilesAsPng", alternate = { "SaveMetafilesAsPng" })
  private Boolean saveMetafilesAsPng;

  @SerializedName(value = "drawSlidesFrame", alternate = { "DrawSlidesFrame" })
  private Boolean drawSlidesFrame;


  public XpsExportOptions() {
    super();
    setFormat("XPS");
  }

  public XpsExportOptions showHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
    return this;
  }

   /**
   * Specifies whether the generated document should include hidden slides or not. Default is false. 
   * @return showHiddenSlides
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the generated document should include hidden slides or not. Default is false. ")
  public Boolean isShowHiddenSlides() {
    return showHiddenSlides;
  }

  public void setShowHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
  }

  public XpsExportOptions saveMetafilesAsPng(Boolean saveMetafilesAsPng) {
    this.saveMetafilesAsPng = saveMetafilesAsPng;
    return this;
  }

   /**
   * True to convert all metafiles used in a presentation to the PNG images.
   * @return saveMetafilesAsPng
  **/
  @ApiModelProperty(required = true, value = "True to convert all metafiles used in a presentation to the PNG images.")
  public Boolean isSaveMetafilesAsPng() {
    return saveMetafilesAsPng;
  }

  public void setSaveMetafilesAsPng(Boolean saveMetafilesAsPng) {
    this.saveMetafilesAsPng = saveMetafilesAsPng;
  }

  public XpsExportOptions drawSlidesFrame(Boolean drawSlidesFrame) {
    this.drawSlidesFrame = drawSlidesFrame;
    return this;
  }

   /**
   * True to draw black frame around each slide.
   * @return drawSlidesFrame
  **/
  @ApiModelProperty(required = true, value = "True to draw black frame around each slide.")
  public Boolean isDrawSlidesFrame() {
    return drawSlidesFrame;
  }

  public void setDrawSlidesFrame(Boolean drawSlidesFrame) {
    this.drawSlidesFrame = drawSlidesFrame;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XpsExportOptions xpsExportOptions = (XpsExportOptions) o;
    return true && Objects.equals(this.showHiddenSlides, xpsExportOptions.showHiddenSlides) && Objects.equals(this.saveMetafilesAsPng, xpsExportOptions.saveMetafilesAsPng) && Objects.equals(this.drawSlidesFrame, xpsExportOptions.drawSlidesFrame) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showHiddenSlides, saveMetafilesAsPng, drawSlidesFrame, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpsExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
    sb.append("    saveMetafilesAsPng: ").append(toIndentedString(saveMetafilesAsPng)).append("\n");
    sb.append("    drawSlidesFrame: ").append(toIndentedString(drawSlidesFrame)).append("\n");
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
