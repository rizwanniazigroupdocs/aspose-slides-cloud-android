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
 * Layout slide.
 */
@ApiModel(description = "Layout slide.")
public class LayoutSlide extends ResourceBase {
  @SerializedName(value = "name", alternate = { "Name" })
  private String name;

  /**
   * Layout slide type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TITLE("Title"),
    
    TEXT("Text"),
    
    TWOCOLUMNTEXT("TwoColumnText"),
    
    TABLE("Table"),
    
    TEXTANDCHART("TextAndChart"),
    
    CHARTANDTEXT("ChartAndText"),
    
    DIAGRAM("Diagram"),
    
    CHART("Chart"),
    
    TEXTANDCLIPART("TextAndClipArt"),
    
    CLIPARTANDTEXT("ClipArtAndText"),
    
    TITLEONLY("TitleOnly"),
    
    BLANK("Blank"),
    
    TEXTANDOBJECT("TextAndObject"),
    
    OBJECTANDTEXT("ObjectAndText"),
    
    OBJECT("Object"),
    
    TITLEANDOBJECT("TitleAndObject"),
    
    TEXTANDMEDIA("TextAndMedia"),
    
    MEDIAANDTEXT("MediaAndText"),
    
    OBJECTOVERTEXT("ObjectOverText"),
    
    TEXTOVEROBJECT("TextOverObject"),
    
    TEXTANDTWOOBJECTS("TextAndTwoObjects"),
    
    TWOOBJECTSANDTEXT("TwoObjectsAndText"),
    
    TWOOBJECTSOVERTEXT("TwoObjectsOverText"),
    
    FOUROBJECTS("FourObjects"),
    
    VERTICALTEXT("VerticalText"),
    
    CLIPARTANDVERTICALTEXT("ClipArtAndVerticalText"),
    
    VERTICALTITLEANDTEXT("VerticalTitleAndText"),
    
    VERTICALTITLEANDTEXTOVERCHART("VerticalTitleAndTextOverChart"),
    
    TWOOBJECTS("TwoObjects"),
    
    OBJECTANDTWOOBJECT("ObjectAndTwoObject"),
    
    TWOOBJECTSANDOBJECT("TwoObjectsAndObject"),
    
    SECTIONHEADER("SectionHeader"),
    
    TWOTEXTANDTWOOBJECTS("TwoTextAndTwoObjects"),
    
    TITLEOBJECTANDCAPTION("TitleObjectAndCaption"),
    
    PICTUREANDCAPTION("PictureAndCaption"),
    
    CUSTOM("Custom");

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

  @SerializedName(value = "masterSlide", alternate = { "MasterSlide" })
  private ResourceUriElement masterSlide;

  @SerializedName(value = "dependingSlides", alternate = { "DependingSlides" })
  private List<ResourceUriElement> dependingSlides = null;


  public LayoutSlide() {
    super();
  }

  public LayoutSlide name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name.
   * @return name
  **/
  @ApiModelProperty(value = "Name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LayoutSlide type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Layout slide type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Layout slide type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public LayoutSlide masterSlide(ResourceUriElement masterSlide) {
    this.masterSlide = masterSlide;
    return this;
  }

   /**
   * Master slide link.
   * @return masterSlide
  **/
  @ApiModelProperty(value = "Master slide link.")
  public ResourceUriElement getMasterSlide() {
    return masterSlide;
  }

  public void setMasterSlide(ResourceUriElement masterSlide) {
    this.masterSlide = masterSlide;
  }

  public LayoutSlide dependingSlides(List<ResourceUriElement> dependingSlides) {
    this.dependingSlides = dependingSlides;
    return this;
  }

  public LayoutSlide addDependingSlidesItem(ResourceUriElement dependingSlidesItem) {
    if (this.dependingSlides == null) {
      this.dependingSlides = new ArrayList<ResourceUriElement>();
    }
    this.dependingSlides.add(dependingSlidesItem);
    return this;
  }

   /**
   * List of depending slides.
   * @return dependingSlides
  **/
  @ApiModelProperty(value = "List of depending slides.")
  public List<ResourceUriElement> getDependingSlides() {
    return dependingSlides;
  }

  public void setDependingSlides(List<ResourceUriElement> dependingSlides) {
    this.dependingSlides = dependingSlides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayoutSlide layoutSlide = (LayoutSlide) o;
    return true && Objects.equals(this.name, layoutSlide.name) && Objects.equals(this.type, layoutSlide.type) && Objects.equals(this.masterSlide, layoutSlide.masterSlide) && Objects.equals(this.dependingSlides, layoutSlide.dependingSlides) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, masterSlide, dependingSlides, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayoutSlide {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    masterSlide: ").append(toIndentedString(masterSlide)).append("\n");
    sb.append("    dependingSlides: ").append(toIndentedString(dependingSlides)).append("\n");
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
