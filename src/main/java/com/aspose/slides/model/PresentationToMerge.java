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
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Represents presentation to merge
 */
@ApiModel(description = "Represents presentation to merge")
public class PresentationToMerge {
  @SerializedName(value = "path", alternate = { "Path" })
  private String path;

  @SerializedName(value = "password", alternate = { "Password" })
  private String password;

  @SerializedName(value = "slides", alternate = { "Slides" })
  private List<Integer> slides = null;


  public PresentationToMerge() {
    super();
  }

  public PresentationToMerge path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get or sets the presentation path
   * @return path
  **/
  @ApiModelProperty(value = "Get or sets the presentation path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public PresentationToMerge password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get or sets the presentation password
   * @return password
  **/
  @ApiModelProperty(value = "Get or sets the presentation password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PresentationToMerge slides(List<Integer> slides) {
    this.slides = slides;
    return this;
  }

  public PresentationToMerge addSlidesItem(Integer slidesItem) {
    if (this.slides == null) {
      this.slides = new ArrayList<Integer>();
    }
    this.slides.add(slidesItem);
    return this;
  }

   /**
   * Get or sets the indexes of slides to merge
   * @return slides
  **/
  @ApiModelProperty(value = "Get or sets the indexes of slides to merge")
  public List<Integer> getSlides() {
    return slides;
  }

  public void setSlides(List<Integer> slides) {
    this.slides = slides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationToMerge presentationToMerge = (PresentationToMerge) o;
    return true && Objects.equals(this.path, presentationToMerge.path) && Objects.equals(this.password, presentationToMerge.password) && Objects.equals(this.slides, presentationToMerge.slides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, password, slides);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationToMerge {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    slides: ").append(toIndentedString(slides)).append("\n");
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
