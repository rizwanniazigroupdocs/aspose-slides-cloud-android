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
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Represents document DTO.
 */
@ApiModel(description = "Represents document DTO.")
public class Document extends ResourceBase {
  @SerializedName(value = "documentProperties", alternate = { "DocumentProperties" })
  private ResourceUri documentProperties;

  @SerializedName(value = "viewProperties", alternate = { "ViewProperties" })
  private ResourceUri viewProperties;

  @SerializedName(value = "slides", alternate = { "Slides" })
  private ResourceUri slides;

  @SerializedName(value = "images", alternate = { "Images" })
  private ResourceUri images;

  @SerializedName(value = "layoutSlides", alternate = { "LayoutSlides" })
  private ResourceUri layoutSlides;

  @SerializedName(value = "masterSlides", alternate = { "MasterSlides" })
  private ResourceUri masterSlides;


  public Document() {
    super();
  }

  public Document documentProperties(ResourceUri documentProperties) {
    this.documentProperties = documentProperties;
    return this;
  }

   /**
   * Link to Document properties.
   * @return documentProperties
  **/
  @ApiModelProperty(value = "Link to Document properties.")
  public ResourceUri getDocumentProperties() {
    return documentProperties;
  }

  public void setDocumentProperties(ResourceUri documentProperties) {
    this.documentProperties = documentProperties;
  }

  public Document viewProperties(ResourceUri viewProperties) {
    this.viewProperties = viewProperties;
    return this;
  }

   /**
   * Link to Document properties.
   * @return viewProperties
  **/
  @ApiModelProperty(value = "Link to Document properties.")
  public ResourceUri getViewProperties() {
    return viewProperties;
  }

  public void setViewProperties(ResourceUri viewProperties) {
    this.viewProperties = viewProperties;
  }

  public Document slides(ResourceUri slides) {
    this.slides = slides;
    return this;
  }

   /**
   * Link to slides collection.
   * @return slides
  **/
  @ApiModelProperty(value = "Link to slides collection.")
  public ResourceUri getSlides() {
    return slides;
  }

  public void setSlides(ResourceUri slides) {
    this.slides = slides;
  }

  public Document images(ResourceUri images) {
    this.images = images;
    return this;
  }

   /**
   * Link to images collection.
   * @return images
  **/
  @ApiModelProperty(value = "Link to images collection.")
  public ResourceUri getImages() {
    return images;
  }

  public void setImages(ResourceUri images) {
    this.images = images;
  }

  public Document layoutSlides(ResourceUri layoutSlides) {
    this.layoutSlides = layoutSlides;
    return this;
  }

   /**
   * Link to layout slides collection.
   * @return layoutSlides
  **/
  @ApiModelProperty(value = "Link to layout slides collection.")
  public ResourceUri getLayoutSlides() {
    return layoutSlides;
  }

  public void setLayoutSlides(ResourceUri layoutSlides) {
    this.layoutSlides = layoutSlides;
  }

  public Document masterSlides(ResourceUri masterSlides) {
    this.masterSlides = masterSlides;
    return this;
  }

   /**
   * Link to master slides collection.
   * @return masterSlides
  **/
  @ApiModelProperty(value = "Link to master slides collection.")
  public ResourceUri getMasterSlides() {
    return masterSlides;
  }

  public void setMasterSlides(ResourceUri masterSlides) {
    this.masterSlides = masterSlides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return true && Objects.equals(this.documentProperties, document.documentProperties) && Objects.equals(this.viewProperties, document.viewProperties) && Objects.equals(this.slides, document.slides) && Objects.equals(this.images, document.images) && Objects.equals(this.layoutSlides, document.layoutSlides) && Objects.equals(this.masterSlides, document.masterSlides) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentProperties, viewProperties, slides, images, layoutSlides, masterSlides, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    documentProperties: ").append(toIndentedString(documentProperties)).append("\n");
    sb.append("    viewProperties: ").append(toIndentedString(viewProperties)).append("\n");
    sb.append("    slides: ").append(toIndentedString(slides)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    layoutSlides: ").append(toIndentedString(layoutSlides)).append("\n");
    sb.append("    masterSlides: ").append(toIndentedString(masterSlides)).append("\n");
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
