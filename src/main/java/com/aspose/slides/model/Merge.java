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
import com.aspose.slides.model.MergingSource;
import com.aspose.slides.model.Task;
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
 * Merge presentations task.
 */
@ApiModel(description = "Merge presentations task.")
public class Merge extends Task {
  @SerializedName(value = "presentations", alternate = { "Presentations" })
  private List<MergingSource> presentations = null;


  public Merge() {
    super();
    setType(TypeEnum.MERGE);
    setPresentations(new ArrayList<MergingSource>());
  }

  public Merge presentations(List<MergingSource> presentations) {
    this.presentations = presentations;
    return this;
  }

  public Merge addPresentationsItem(MergingSource presentationsItem) {
    if (this.presentations == null) {
      this.presentations = new ArrayList<MergingSource>();
    }
    this.presentations.add(presentationsItem);
    return this;
  }

   /**
   * Information about documents and slides being merging sources.
   * @return presentations
  **/
  @ApiModelProperty(value = "Information about documents and slides being merging sources.")
  public List<MergingSource> getPresentations() {
    return presentations;
  }

  public void setPresentations(List<MergingSource> presentations) {
    this.presentations = presentations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merge merge = (Merge) o;
    return true && Objects.equals(this.presentations, merge.presentations) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentations, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merge {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    presentations: ").append(toIndentedString(presentations)).append("\n");
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

  static {
      typeDeterminers.put("Type", TypeEnum.MERGE);
  }
}
