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
 * Represents fill overlay effect 
 */
@ApiModel(description = "Represents fill overlay effect ")
public class FillOverlayEffect {
  /**
   * blend mode
   */
  @JsonAdapter(BlendEnum.Adapter.class)
  public enum BlendEnum {
    DARKEN("Darken"),
    
    LIGHTEN("Lighten"),
    
    MULTIPLY("Multiply"),
    
    OVERLAY("Overlay"),
    
    SCREEN("Screen");

    private String value;

    BlendEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BlendEnum fromValue(String text) {
      for (BlendEnum b : BlendEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BlendEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BlendEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BlendEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BlendEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "blend", alternate = { "Blend" })
  private BlendEnum blend;


  public FillOverlayEffect() {
    super();
  }

  public FillOverlayEffect blend(BlendEnum blend) {
    this.blend = blend;
    return this;
  }

   /**
   * blend mode
   * @return blend
  **/
  @ApiModelProperty(required = true, value = "blend mode")
  public BlendEnum getBlend() {
    return blend;
  }

  public void setBlend(BlendEnum blend) {
    this.blend = blend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FillOverlayEffect fillOverlayEffect = (FillOverlayEffect) o;
    return true && Objects.equals(this.blend, fillOverlayEffect.blend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FillOverlayEffect {\n");
    
    sb.append("    blend: ").append(toIndentedString(blend)).append("\n");
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
