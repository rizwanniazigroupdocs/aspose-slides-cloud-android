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
 * Base class for all Slide&#39;s DTO objects 
 */
@ApiModel(description = "Base class for all Slide's DTO objects ")
public class ResourceBase {
  @SerializedName(value = "selfUri", alternate = { "SelfUri" })
  private ResourceUri selfUri;

  @SerializedName(value = "alternateLinks", alternate = { "AlternateLinks" })
  private List<ResourceUri> alternateLinks = null;


  public ResourceBase() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
  }

  public ResourceBase selfUri(ResourceUri selfUri) {
    this.selfUri = selfUri;
    return this;
  }

   /**
   * Gets or sets the link to this resource.
   * @return selfUri
  **/
  @ApiModelProperty(value = "Gets or sets the link to this resource.")
  public ResourceUri getSelfUri() {
    return selfUri;
  }

  public void setSelfUri(ResourceUri selfUri) {
    this.selfUri = selfUri;
  }

  public ResourceBase alternateLinks(List<ResourceUri> alternateLinks) {
    this.alternateLinks = alternateLinks;
    return this;
  }

  public ResourceBase addAlternateLinksItem(ResourceUri alternateLinksItem) {
    if (this.alternateLinks == null) {
      this.alternateLinks = new ArrayList<ResourceUri>();
    }
    this.alternateLinks.add(alternateLinksItem);
    return this;
  }

   /**
   * List of alternate links.
   * @return alternateLinks
  **/
  @ApiModelProperty(value = "List of alternate links.")
  public List<ResourceUri> getAlternateLinks() {
    return alternateLinks;
  }

  public void setAlternateLinks(List<ResourceUri> alternateLinks) {
    this.alternateLinks = alternateLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceBase resourceBase = (ResourceBase) o;
    return true && Objects.equals(this.selfUri, resourceBase.selfUri) && Objects.equals(this.alternateLinks, resourceBase.alternateLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selfUri, alternateLinks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceBase {\n");
    
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    alternateLinks: ").append(toIndentedString(alternateLinks)).append("\n");
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
