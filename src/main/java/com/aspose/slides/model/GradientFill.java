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
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.GradientFillStop;
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
 * Represents gradient fill format
 */
@ApiModel(description = "Represents gradient fill format")
public class GradientFill extends FillFormat {
  /**
   * Gradient style.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    FROMCORNER1("FromCorner1"),
    
    FROMCORNER2("FromCorner2"),
    
    FROMCORNER3("FromCorner3"),
    
    FROMCORNER4("FromCorner4"),
    
    FROMCENTER("FromCenter"),
    
    NOTDEFINED("NotDefined");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "direction", alternate = { "Direction" })
  private DirectionEnum direction;

  /**
   * Gradient shape.
   */
  @JsonAdapter(ShapeEnum.Adapter.class)
  public enum ShapeEnum {
    LINEAR("Linear"),
    
    RECTANGLE("Rectangle"),
    
    RADIAL("Radial"),
    
    PATH("Path"),
    
    NOTDEFINED("NotDefined");

    private String value;

    ShapeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShapeEnum fromValue(String text) {
      for (ShapeEnum b : ShapeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ShapeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShapeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShapeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ShapeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "shape", alternate = { "Shape" })
  private ShapeEnum shape;

  @SerializedName(value = "stops", alternate = { "Stops" })
  private List<GradientFillStop> stops = null;

  @SerializedName(value = "linearAngle", alternate = { "LinearAngle" })
  private Double linearAngle;

  @SerializedName(value = "isScaled", alternate = { "IsScaled" })
  private Boolean isScaled;

  /**
   * Gradient flipping mode.
   */
  @JsonAdapter(TileFlipEnum.Adapter.class)
  public enum TileFlipEnum {
    NOFLIP("NoFlip"),
    
    FLIPX("FlipX"),
    
    FLIPY("FlipY"),
    
    FLIPBOTH("FlipBoth"),
    
    NOTDEFINED("NotDefined");

    private String value;

    TileFlipEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TileFlipEnum fromValue(String text) {
      for (TileFlipEnum b : TileFlipEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TileFlipEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TileFlipEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TileFlipEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TileFlipEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "tileFlip", alternate = { "TileFlip" })
  private TileFlipEnum tileFlip;


  public GradientFill() {
    super();
    setType(TypeEnum.GRADIENT);
    setStops(new ArrayList<GradientFillStop>());
  }

  public GradientFill direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Gradient style.
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "Gradient style.")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public GradientFill shape(ShapeEnum shape) {
    this.shape = shape;
    return this;
  }

   /**
   * Gradient shape.
   * @return shape
  **/
  @ApiModelProperty(required = true, value = "Gradient shape.")
  public ShapeEnum getShape() {
    return shape;
  }

  public void setShape(ShapeEnum shape) {
    this.shape = shape;
  }

  public GradientFill stops(List<GradientFillStop> stops) {
    this.stops = stops;
    return this;
  }

  public GradientFill addStopsItem(GradientFillStop stopsItem) {
    if (this.stops == null) {
      this.stops = new ArrayList<GradientFillStop>();
    }
    this.stops.add(stopsItem);
    return this;
  }

   /**
   * Gradient stops.
   * @return stops
  **/
  @ApiModelProperty(value = "Gradient stops.")
  public List<GradientFillStop> getStops() {
    return stops;
  }

  public void setStops(List<GradientFillStop> stops) {
    this.stops = stops;
  }

  public GradientFill linearAngle(Double linearAngle) {
    this.linearAngle = linearAngle;
    return this;
  }

   /**
   * Gradient angle.
   * @return linearAngle
  **/
  @ApiModelProperty(required = true, value = "Gradient angle.")
  public Double getLinearAngle() {
    return linearAngle;
  }

  public void setLinearAngle(Double linearAngle) {
    this.linearAngle = linearAngle;
  }

  public GradientFill isScaled(Boolean isScaled) {
    this.isScaled = isScaled;
    return this;
  }

   /**
   * True if the gradient is scaled.
   * @return isScaled
  **/
  @ApiModelProperty(required = true, value = "True if the gradient is scaled.")
  public Boolean isIsScaled() {
    return isScaled;
  }

  public void setIsScaled(Boolean isScaled) {
    this.isScaled = isScaled;
  }

  public GradientFill tileFlip(TileFlipEnum tileFlip) {
    this.tileFlip = tileFlip;
    return this;
  }

   /**
   * Gradient flipping mode.
   * @return tileFlip
  **/
  @ApiModelProperty(required = true, value = "Gradient flipping mode.")
  public TileFlipEnum getTileFlip() {
    return tileFlip;
  }

  public void setTileFlip(TileFlipEnum tileFlip) {
    this.tileFlip = tileFlip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradientFill gradientFill = (GradientFill) o;
    return true && Objects.equals(this.direction, gradientFill.direction) && Objects.equals(this.shape, gradientFill.shape) && Objects.equals(this.stops, gradientFill.stops) && Objects.equals(this.linearAngle, gradientFill.linearAngle) && Objects.equals(this.isScaled, gradientFill.isScaled) && Objects.equals(this.tileFlip, gradientFill.tileFlip) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, shape, stops, linearAngle, isScaled, tileFlip, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradientFill {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    linearAngle: ").append(toIndentedString(linearAngle)).append("\n");
    sb.append("    isScaled: ").append(toIndentedString(isScaled)).append("\n");
    sb.append("    tileFlip: ").append(toIndentedString(tileFlip)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.GRADIENT);
  }
}
