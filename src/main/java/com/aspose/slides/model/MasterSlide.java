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
 * Master slide.
 */
@ApiModel(description = "Master slide.")
public class MasterSlide extends ResourceBase {
  @SerializedName(value = "name", alternate = { "Name" })
  private String name;

  @SerializedName(value = "layoutSlides", alternate = { "LayoutSlides" })
  private List<ResourceUri> layoutSlides = null;

  @SerializedName(value = "dependingSlides", alternate = { "DependingSlides" })
  private List<ResourceUri> dependingSlides = null;


  public MasterSlide() {
    super();
  }

  public MasterSlide name(String name) {
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

  public MasterSlide layoutSlides(List<ResourceUri> layoutSlides) {
    this.layoutSlides = layoutSlides;
    return this;
  }

  public MasterSlide addLayoutSlidesItem(ResourceUri layoutSlidesItem) {
    if (this.layoutSlides == null) {
      this.layoutSlides = new ArrayList<ResourceUri>();
    }
    this.layoutSlides.add(layoutSlidesItem);
    return this;
  }

   /**
   * List of layout slide links.
   * @return layoutSlides
  **/
  @ApiModelProperty(value = "List of layout slide links.")
  public List<ResourceUri> getLayoutSlides() {
    return layoutSlides;
  }

  public void setLayoutSlides(List<ResourceUri> layoutSlides) {
    this.layoutSlides = layoutSlides;
  }

  public MasterSlide dependingSlides(List<ResourceUri> dependingSlides) {
    this.dependingSlides = dependingSlides;
    return this;
  }

  public MasterSlide addDependingSlidesItem(ResourceUri dependingSlidesItem) {
    if (this.dependingSlides == null) {
      this.dependingSlides = new ArrayList<ResourceUri>();
    }
    this.dependingSlides.add(dependingSlidesItem);
    return this;
  }

   /**
   * List of depending slide links.
   * @return dependingSlides
  **/
  @ApiModelProperty(value = "List of depending slide links.")
  public List<ResourceUri> getDependingSlides() {
    return dependingSlides;
  }

  public void setDependingSlides(List<ResourceUri> dependingSlides) {
    this.dependingSlides = dependingSlides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterSlide masterSlide = (MasterSlide) o;
    return true && Objects.equals(this.name, masterSlide.name) && Objects.equals(this.layoutSlides, masterSlide.layoutSlides) && Objects.equals(this.dependingSlides, masterSlide.dependingSlides) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, layoutSlides, dependingSlides, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterSlide {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    layoutSlides: ").append(toIndentedString(layoutSlides)).append("\n");
    sb.append("    dependingSlides: ").append(toIndentedString(dependingSlides)).append("\n");
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
