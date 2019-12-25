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
 * Represents Resource URI
 */
@ApiModel(description = "Represents Resource URI")
public class ResourceUri {
  @SerializedName(value = "href", alternate = { "Href" })
  private String href;

  @SerializedName(value = "relation", alternate = { "Relation" })
  private String relation;

  @SerializedName(value = "linkType", alternate = { "LinkType" })
  private String linkType;

  @SerializedName(value = "title", alternate = { "Title" })
  private String title;


  public ResourceUri() {
    super();
  }

  public ResourceUri href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Gets or sets the href.
   * @return href
  **/
  @ApiModelProperty(value = "Gets or sets the href.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ResourceUri relation(String relation) {
    this.relation = relation;
    return this;
  }

   /**
   * Gets or sets the relation.
   * @return relation
  **/
  @ApiModelProperty(value = "Gets or sets the relation.")
  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }

  public ResourceUri linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * Gets or sets the type of link.
   * @return linkType
  **/
  @ApiModelProperty(value = "Gets or sets the type of link.")
  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  public ResourceUri title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Gets or sets the title of link.
   * @return title
  **/
  @ApiModelProperty(value = "Gets or sets the title of link.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceUri resourceUri = (ResourceUri) o;
    return true && Objects.equals(this.href, resourceUri.href) && Objects.equals(this.relation, resourceUri.relation) && Objects.equals(this.linkType, resourceUri.linkType) && Objects.equals(this.title, resourceUri.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, relation, linkType, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceUri {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
