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
 * Arrow head properties.
 */
@ApiModel(description = "Arrow head properties.")
public class ArrowHeadProperties {
  /**
   * Length.
   */
  @JsonAdapter(LengthEnum.Adapter.class)
  public enum LengthEnum {
    SHORT("Short"),
    
    MEDIUM("Medium"),
    
    LONG("Long"),
    
    NOTDEFINED("NotDefined");

    private String value;

    LengthEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LengthEnum fromValue(String text) {
      for (LengthEnum b : LengthEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LengthEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LengthEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LengthEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LengthEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "length", alternate = { "Length" })
  private LengthEnum length;

  /**
   * Style.
   */
  @JsonAdapter(StyleEnum.Adapter.class)
  public enum StyleEnum {
    NONE("None"),
    
    TRIANGLE("Triangle"),
    
    STEALTH("Stealth"),
    
    DIAMOND("Diamond"),
    
    OVAL("Oval"),
    
    OPEN("Open"),
    
    NOTDEFINED("NotDefined");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StyleEnum fromValue(String text) {
      for (StyleEnum b : StyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "style", alternate = { "Style" })
  private StyleEnum style;

  /**
   * Width.
   */
  @JsonAdapter(WidthEnum.Adapter.class)
  public enum WidthEnum {
    NARROW("Narrow"),
    
    MEDIUM("Medium"),
    
    WIDE("Wide"),
    
    NOTDEFINED("NotDefined");

    private String value;

    WidthEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WidthEnum fromValue(String text) {
      for (WidthEnum b : WidthEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WidthEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WidthEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WidthEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WidthEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "width", alternate = { "Width" })
  private WidthEnum width;


  public ArrowHeadProperties() {
    super();
  }

  public ArrowHeadProperties length(LengthEnum length) {
    this.length = length;
    return this;
  }

   /**
   * Length.
   * @return length
  **/
  @ApiModelProperty(value = "Length.")
  public LengthEnum getLength() {
    return length;
  }

  public void setLength(LengthEnum length) {
    this.length = length;
  }

  public ArrowHeadProperties style(StyleEnum style) {
    this.style = style;
    return this;
  }

   /**
   * Style.
   * @return style
  **/
  @ApiModelProperty(value = "Style.")
  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public ArrowHeadProperties width(WidthEnum width) {
    this.width = width;
    return this;
  }

   /**
   * Width.
   * @return width
  **/
  @ApiModelProperty(value = "Width.")
  public WidthEnum getWidth() {
    return width;
  }

  public void setWidth(WidthEnum width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrowHeadProperties arrowHeadProperties = (ArrowHeadProperties) o;
    return true && Objects.equals(this.length, arrowHeadProperties.length) && Objects.equals(this.style, arrowHeadProperties.style) && Objects.equals(this.width, arrowHeadProperties.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, style, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrowHeadProperties {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
