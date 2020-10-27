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
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.ShapeBase;
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
 * Represents OleObjectFrame resource.
 */
@ApiModel(description = "Represents OleObjectFrame resource.")
public class OleObjectFrame extends ShapeBase {
  @SerializedName(value = "isObjectIcon", alternate = { "IsObjectIcon" })
  private Boolean isObjectIcon;

  @SerializedName(value = "substitutePictureTitle", alternate = { "SubstitutePictureTitle" })
  private String substitutePictureTitle;


  public OleObjectFrame() {
    super();
    setType(TypeEnum.OLEOBJECTFRAME);
  }

  public OleObjectFrame isObjectIcon(Boolean isObjectIcon) {
    this.isObjectIcon = isObjectIcon;
    return this;
  }

   /**
   * True if an object is visible as icon.
   * @return isObjectIcon
  **/
  @ApiModelProperty(required = true, value = "True if an object is visible as icon.")
  public Boolean isIsObjectIcon() {
    return isObjectIcon;
  }

  public void setIsObjectIcon(Boolean isObjectIcon) {
    this.isObjectIcon = isObjectIcon;
  }

  public OleObjectFrame substitutePictureTitle(String substitutePictureTitle) {
    this.substitutePictureTitle = substitutePictureTitle;
    return this;
  }

   /**
   * The title for OleObject icon.             
   * @return substitutePictureTitle
  **/
  @ApiModelProperty(value = "The title for OleObject icon.             ")
  public String getSubstitutePictureTitle() {
    return substitutePictureTitle;
  }

  public void setSubstitutePictureTitle(String substitutePictureTitle) {
    this.substitutePictureTitle = substitutePictureTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OleObjectFrame oleObjectFrame = (OleObjectFrame) o;
    return true && Objects.equals(this.isObjectIcon, oleObjectFrame.isObjectIcon) && Objects.equals(this.substitutePictureTitle, oleObjectFrame.substitutePictureTitle) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isObjectIcon, substitutePictureTitle, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OleObjectFrame {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isObjectIcon: ").append(toIndentedString(isObjectIcon)).append("\n");
    sb.append("    substitutePictureTitle: ").append(toIndentedString(substitutePictureTitle)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.OLEOBJECTFRAME);
  }
}
