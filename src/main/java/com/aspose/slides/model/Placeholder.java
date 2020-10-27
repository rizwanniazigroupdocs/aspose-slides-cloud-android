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
 * Represents placeholder
 */
@ApiModel(description = "Represents placeholder")
public class Placeholder extends ResourceBase {
  @SerializedName(value = "index", alternate = { "Index" })
  private Integer index;

  /**
   * Orientation.
   */
  @JsonAdapter(OrientationEnum.Adapter.class)
  public enum OrientationEnum {
    HORIZONTAL("Horizontal"),
    
    VERTICAL("Vertical");

    private String value;

    OrientationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrientationEnum fromValue(String text) {
      for (OrientationEnum b : OrientationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrientationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrientationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrientationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrientationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "orientation", alternate = { "Orientation" })
  private OrientationEnum orientation;

  /**
   * Size.
   */
  @JsonAdapter(SizeEnum.Adapter.class)
  public enum SizeEnum {
    FULL("Full"),
    
    HALF("Half"),
    
    QUARTER("Quarter");

    private String value;

    SizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SizeEnum fromValue(String text) {
      for (SizeEnum b : SizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SizeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SizeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "size", alternate = { "Size" })
  private SizeEnum size;

  /**
   * Placeholder type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TITLE("Title"),
    
    BODY("Body"),
    
    CENTEREDTITLE("CenteredTitle"),
    
    SUBTITLE("Subtitle"),
    
    DATEANDTIME("DateAndTime"),
    
    SLIDENUMBER("SlideNumber"),
    
    FOOTER("Footer"),
    
    HEADER("Header"),
    
    OBJECT("Object"),
    
    CHART("Chart"),
    
    TABLE("Table"),
    
    CLIPART("ClipArt"),
    
    DIAGRAM("Diagram"),
    
    MEDIA("Media"),
    
    SLIDEIMAGE("SlideImage"),
    
    PICTURE("Picture");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "type", alternate = { "Type" })
  private TypeEnum type;

  @SerializedName(value = "shape", alternate = { "Shape" })
  private ResourceUri shape;


  public Placeholder() {
    super();
  }

  public Placeholder index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Index.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Placeholder orientation(OrientationEnum orientation) {
    this.orientation = orientation;
    return this;
  }

   /**
   * Orientation.
   * @return orientation
  **/
  @ApiModelProperty(required = true, value = "Orientation.")
  public OrientationEnum getOrientation() {
    return orientation;
  }

  public void setOrientation(OrientationEnum orientation) {
    this.orientation = orientation;
  }

  public Placeholder size(SizeEnum size) {
    this.size = size;
    return this;
  }

   /**
   * Size.
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Size.")
  public SizeEnum getSize() {
    return size;
  }

  public void setSize(SizeEnum size) {
    this.size = size;
  }

  public Placeholder type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Placeholder type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Placeholder type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Placeholder shape(ResourceUri shape) {
    this.shape = shape;
    return this;
  }

   /**
   * Shape link.
   * @return shape
  **/
  @ApiModelProperty(value = "Shape link.")
  public ResourceUri getShape() {
    return shape;
  }

  public void setShape(ResourceUri shape) {
    this.shape = shape;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Placeholder placeholder = (Placeholder) o;
    return true && Objects.equals(this.index, placeholder.index) && Objects.equals(this.orientation, placeholder.orientation) && Objects.equals(this.size, placeholder.size) && Objects.equals(this.type, placeholder.type) && Objects.equals(this.shape, placeholder.shape) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, orientation, size, type, shape, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Placeholder {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
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
