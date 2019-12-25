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
 * Represents chart title
 */
@ApiModel(description = "Represents chart title")
public class ChartTitle {
  @SerializedName(value = "text", alternate = { "Text" })
  private String text;

  @SerializedName(value = "hasTitle", alternate = { "HasTitle" })
  private Boolean hasTitle;


  public ChartTitle() {
    super();
  }

  public ChartTitle text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get or sets the text.
   * @return text
  **/
  @ApiModelProperty(value = "Get or sets the text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ChartTitle hasTitle(Boolean hasTitle) {
    this.hasTitle = hasTitle;
    return this;
  }

   /**
   * Get or sets value determines visibility of title
   * @return hasTitle
  **/
  @ApiModelProperty(required = true, value = "Get or sets value determines visibility of title")
  public Boolean isHasTitle() {
    return hasTitle;
  }

  public void setHasTitle(Boolean hasTitle) {
    this.hasTitle = hasTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartTitle chartTitle = (ChartTitle) o;
    return true && Objects.equals(this.text, chartTitle.text) && Objects.equals(this.hasTitle, chartTitle.hasTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, hasTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartTitle {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    hasTitle: ").append(toIndentedString(hasTitle)).append("\n");
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
