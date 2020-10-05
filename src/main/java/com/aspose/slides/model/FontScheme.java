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
import com.aspose.slides.model.FontSet;
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
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
 * Represents font scheme
 */
@ApiModel(description = "Represents font scheme")
public class FontScheme extends ResourceBase {
  @SerializedName(value = "major", alternate = { "Major" })
  private FontSet major;

  @SerializedName(value = "minor", alternate = { "Minor" })
  private FontSet minor;

  @SerializedName(value = "name", alternate = { "Name" })
  private String name;


  public FontScheme() {
    super();
  }

  public FontScheme major(FontSet major) {
    this.major = major;
    return this;
  }

   /**
   * Gets or sets fonts collection for a \&quot;heading\&quot; part of the slide.
   * @return major
  **/
  @ApiModelProperty(value = "Gets or sets fonts collection for a \"heading\" part of the slide.")
  public FontSet getMajor() {
    return major;
  }

  public void setMajor(FontSet major) {
    this.major = major;
  }

  public FontScheme minor(FontSet minor) {
    this.minor = minor;
    return this;
  }

   /**
   * Gets or sets  the fonts collection for a \&quot;body\&quot; part of the slide.
   * @return minor
  **/
  @ApiModelProperty(value = "Gets or sets  the fonts collection for a \"body\" part of the slide.")
  public FontSet getMinor() {
    return minor;
  }

  public void setMinor(FontSet minor) {
    this.minor = minor;
  }

  public FontScheme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the name.
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FontScheme fontScheme = (FontScheme) o;
    return true && Objects.equals(this.major, fontScheme.major) && Objects.equals(this.minor, fontScheme.minor) && Objects.equals(this.name, fontScheme.name) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(major, minor, name, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FontScheme {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
