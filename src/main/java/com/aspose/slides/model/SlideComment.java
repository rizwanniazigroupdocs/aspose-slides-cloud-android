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
import com.aspose.slides.model.SlideComment;
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
 * Represents comment of slide
 */
@ApiModel(description = "Represents comment of slide")
public class SlideComment {
  @SerializedName(value = "author", alternate = { "Author" })
  private String author;

  @SerializedName(value = "text", alternate = { "Text" })
  private String text;

  @SerializedName(value = "createdTime", alternate = { "CreatedTime" })
  private String createdTime;

  @SerializedName(value = "childComments", alternate = { "ChildComments" })
  private List<SlideComment> childComments = null;


  public SlideComment() {
    super();
  }

  public SlideComment author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Author.
   * @return author
  **/
  @ApiModelProperty(value = "Author.")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public SlideComment text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text.
   * @return text
  **/
  @ApiModelProperty(value = "Text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SlideComment createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Creation time.
   * @return createdTime
  **/
  @ApiModelProperty(value = "Creation time.")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public SlideComment childComments(List<SlideComment> childComments) {
    this.childComments = childComments;
    return this;
  }

  public SlideComment addChildCommentsItem(SlideComment childCommentsItem) {
    if (this.childComments == null) {
      this.childComments = new ArrayList<SlideComment>();
    }
    this.childComments.add(childCommentsItem);
    return this;
  }

   /**
   * Child comments.
   * @return childComments
  **/
  @ApiModelProperty(value = "Child comments.")
  public List<SlideComment> getChildComments() {
    return childComments;
  }

  public void setChildComments(List<SlideComment> childComments) {
    this.childComments = childComments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlideComment slideComment = (SlideComment) o;
    return true && Objects.equals(this.author, slideComment.author) && Objects.equals(this.text, slideComment.text) && Objects.equals(this.createdTime, slideComment.createdTime) && Objects.equals(this.childComments, slideComment.childComments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, text, createdTime, childComments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlideComment {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    childComments: ").append(toIndentedString(childComments)).append("\n");
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
