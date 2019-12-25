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
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Represents list of Links to Shapes resources
 */
@ApiModel(description = "Represents list of Links to Shapes resources")
public class Shapes extends ResourceBase {
  @SerializedName(value = "shapesLinks", alternate = { "ShapesLinks" })
  private List<ResourceUriElement> shapesLinks = null;


  public Shapes() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
    setShapesLinks(new ArrayList<ResourceUriElement>());
  }

  public Shapes shapesLinks(List<ResourceUriElement> shapesLinks) {
    this.shapesLinks = shapesLinks;
    return this;
  }

  public Shapes addShapesLinksItem(ResourceUriElement shapesLinksItem) {
    if (this.shapesLinks == null) {
      this.shapesLinks = new ArrayList<ResourceUriElement>();
    }
    this.shapesLinks.add(shapesLinksItem);
    return this;
  }

   /**
   * List of shape links.
   * @return shapesLinks
  **/
  @ApiModelProperty(value = "List of shape links.")
  public List<ResourceUriElement> getShapesLinks() {
    return shapesLinks;
  }

  public void setShapesLinks(List<ResourceUriElement> shapesLinks) {
    this.shapesLinks = shapesLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shapes shapes = (Shapes) o;
    return true && Objects.equals(this.shapesLinks, shapes.shapesLinks) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shapesLinks, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shapes {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    shapesLinks: ").append(toIndentedString(shapesLinks)).append("\n");
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
