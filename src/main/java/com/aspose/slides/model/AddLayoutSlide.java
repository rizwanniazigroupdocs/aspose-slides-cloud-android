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
import com.aspose.slides.model.InputFile;
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
import java.util.Hashtable;
import java.util.Map;

/**
 * Add layout slide task.
 */
@ApiModel(description = "Add layout slide task.")
public class AddLayoutSlide extends Task {
  @SerializedName(value = "cloneFromFile", alternate = { "CloneFromFile" })
  private InputFile cloneFromFile;

  @SerializedName(value = "cloneFromPosition", alternate = { "CloneFromPosition" })
  private Integer cloneFromPosition;


  public AddLayoutSlide() {
    super();
    setType(TypeEnum.ADDLAYOUTSLIDE);
  }

  public AddLayoutSlide cloneFromFile(InputFile cloneFromFile) {
    this.cloneFromFile = cloneFromFile;
    return this;
  }

   /**
   * Source file.
   * @return cloneFromFile
  **/
  @ApiModelProperty(value = "Source file.")
  public InputFile getCloneFromFile() {
    return cloneFromFile;
  }

  public void setCloneFromFile(InputFile cloneFromFile) {
    this.cloneFromFile = cloneFromFile;
  }

  public AddLayoutSlide cloneFromPosition(Integer cloneFromPosition) {
    this.cloneFromPosition = cloneFromPosition;
    return this;
  }

   /**
   * Source layout slide position.
   * @return cloneFromPosition
  **/
  @ApiModelProperty(required = true, value = "Source layout slide position.")
  public Integer getCloneFromPosition() {
    return cloneFromPosition;
  }

  public void setCloneFromPosition(Integer cloneFromPosition) {
    this.cloneFromPosition = cloneFromPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddLayoutSlide addLayoutSlide = (AddLayoutSlide) o;
    return true && Objects.equals(this.cloneFromFile, addLayoutSlide.cloneFromFile) && Objects.equals(this.cloneFromPosition, addLayoutSlide.cloneFromPosition) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloneFromFile, cloneFromPosition, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddLayoutSlide {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cloneFromFile: ").append(toIndentedString(cloneFromFile)).append("\n");
    sb.append("    cloneFromPosition: ").append(toIndentedString(cloneFromPosition)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.ADDLAYOUTSLIDE);
  }
}
