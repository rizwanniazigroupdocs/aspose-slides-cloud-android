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
 * Request for presentations merge
 */
@ApiModel(description = "Request for presentations merge")
public class PresentationsMergeRequest {
  @SerializedName(value = "presentationPaths", alternate = { "PresentationPaths" })
  private List<String> presentationPaths = null;

  @SerializedName(value = "presentationPasswords", alternate = { "PresentationPasswords" })
  private List<String> presentationPasswords = null;


  public PresentationsMergeRequest() {
    super();
  }

  public PresentationsMergeRequest presentationPaths(List<String> presentationPaths) {
    this.presentationPaths = presentationPaths;
    return this;
  }

  public PresentationsMergeRequest addPresentationPathsItem(String presentationPathsItem) {
    if (this.presentationPaths == null) {
      this.presentationPaths = new ArrayList<String>();
    }
    this.presentationPaths.add(presentationPathsItem);
    return this;
  }

   /**
   * Gets or sets the presentation paths.
   * @return presentationPaths
  **/
  @ApiModelProperty(value = "Gets or sets the presentation paths.")
  public List<String> getPresentationPaths() {
    return presentationPaths;
  }

  public void setPresentationPaths(List<String> presentationPaths) {
    this.presentationPaths = presentationPaths;
  }

  public PresentationsMergeRequest presentationPasswords(List<String> presentationPasswords) {
    this.presentationPasswords = presentationPasswords;
    return this;
  }

  public PresentationsMergeRequest addPresentationPasswordsItem(String presentationPasswordsItem) {
    if (this.presentationPasswords == null) {
      this.presentationPasswords = new ArrayList<String>();
    }
    this.presentationPasswords.add(presentationPasswordsItem);
    return this;
  }

   /**
   * Gets or sets the presentation passwords.
   * @return presentationPasswords
  **/
  @ApiModelProperty(value = "Gets or sets the presentation passwords.")
  public List<String> getPresentationPasswords() {
    return presentationPasswords;
  }

  public void setPresentationPasswords(List<String> presentationPasswords) {
    this.presentationPasswords = presentationPasswords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationsMergeRequest presentationsMergeRequest = (PresentationsMergeRequest) o;
    return true && Objects.equals(this.presentationPaths, presentationsMergeRequest.presentationPaths) && Objects.equals(this.presentationPasswords, presentationsMergeRequest.presentationPasswords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationPaths, presentationPasswords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationsMergeRequest {\n");
    
    sb.append("    presentationPaths: ").append(toIndentedString(presentationPaths)).append("\n");
    sb.append("    presentationPasswords: ").append(toIndentedString(presentationPasswords)).append("\n");
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
