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
import com.aspose.slides.model.ResourceBase;
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
 * Represents Slide&#39;s theme 
 */
@ApiModel(description = "Represents Slide's theme ")
public class Theme extends ResourceBase {
  @SerializedName(value = "name", alternate = { "Name" })
  private String name;

  @SerializedName(value = "colorScheme", alternate = { "ColorScheme" })
  private ResourceUriElement colorScheme;

  @SerializedName(value = "fontScheme", alternate = { "FontScheme" })
  private ResourceUriElement fontScheme;

  @SerializedName(value = "formatScheme", alternate = { "FormatScheme" })
  private ResourceUriElement formatScheme;


  public Theme() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
  }

  public Theme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name.
   * @return name
  **/
  @ApiModelProperty(value = "Name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Theme colorScheme(ResourceUriElement colorScheme) {
    this.colorScheme = colorScheme;
    return this;
  }

   /**
   * Color scheme.
   * @return colorScheme
  **/
  @ApiModelProperty(value = "Color scheme.")
  public ResourceUriElement getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(ResourceUriElement colorScheme) {
    this.colorScheme = colorScheme;
  }

  public Theme fontScheme(ResourceUriElement fontScheme) {
    this.fontScheme = fontScheme;
    return this;
  }

   /**
   * Font scheme.
   * @return fontScheme
  **/
  @ApiModelProperty(value = "Font scheme.")
  public ResourceUriElement getFontScheme() {
    return fontScheme;
  }

  public void setFontScheme(ResourceUriElement fontScheme) {
    this.fontScheme = fontScheme;
  }

  public Theme formatScheme(ResourceUriElement formatScheme) {
    this.formatScheme = formatScheme;
    return this;
  }

   /**
   * Format scheme.
   * @return formatScheme
  **/
  @ApiModelProperty(value = "Format scheme.")
  public ResourceUriElement getFormatScheme() {
    return formatScheme;
  }

  public void setFormatScheme(ResourceUriElement formatScheme) {
    this.formatScheme = formatScheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Theme theme = (Theme) o;
    return true && Objects.equals(this.name, theme.name) && Objects.equals(this.colorScheme, theme.colorScheme) && Objects.equals(this.fontScheme, theme.fontScheme) && Objects.equals(this.formatScheme, theme.formatScheme) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, colorScheme, fontScheme, formatScheme, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Theme {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    colorScheme: ").append(toIndentedString(colorScheme)).append("\n");
    sb.append("    fontScheme: ").append(toIndentedString(fontScheme)).append("\n");
    sb.append("    formatScheme: ").append(toIndentedString(formatScheme)).append("\n");
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
