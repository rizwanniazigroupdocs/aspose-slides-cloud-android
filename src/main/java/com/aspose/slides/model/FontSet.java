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
 * Font set.
 */
@ApiModel(description = "Font set.")
public class FontSet {
  @SerializedName(value = "complexScript", alternate = { "ComplexScript" })
  private String complexScript;

  @SerializedName(value = "eastAsian", alternate = { "EastAsian" })
  private String eastAsian;

  @SerializedName(value = "latin", alternate = { "Latin" })
  private String latin;


  public FontSet() {
    super();
  }

  public FontSet complexScript(String complexScript) {
    this.complexScript = complexScript;
    return this;
  }

   /**
   * Complex script font.
   * @return complexScript
  **/
  @ApiModelProperty(value = "Complex script font.")
  public String getComplexScript() {
    return complexScript;
  }

  public void setComplexScript(String complexScript) {
    this.complexScript = complexScript;
  }

  public FontSet eastAsian(String eastAsian) {
    this.eastAsian = eastAsian;
    return this;
  }

   /**
   * East Asian font.
   * @return eastAsian
  **/
  @ApiModelProperty(value = "East Asian font.")
  public String getEastAsian() {
    return eastAsian;
  }

  public void setEastAsian(String eastAsian) {
    this.eastAsian = eastAsian;
  }

  public FontSet latin(String latin) {
    this.latin = latin;
    return this;
  }

   /**
   * Latin font.
   * @return latin
  **/
  @ApiModelProperty(value = "Latin font.")
  public String getLatin() {
    return latin;
  }

  public void setLatin(String latin) {
    this.latin = latin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FontSet fontSet = (FontSet) o;
    return true && Objects.equals(this.complexScript, fontSet.complexScript) && Objects.equals(this.eastAsian, fontSet.eastAsian) && Objects.equals(this.latin, fontSet.latin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complexScript, eastAsian, latin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FontSet {\n");
    
    sb.append("    complexScript: ").append(toIndentedString(complexScript)).append("\n");
    sb.append("    eastAsian: ").append(toIndentedString(eastAsian)).append("\n");
    sb.append("    latin: ").append(toIndentedString(latin)).append("\n");
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
