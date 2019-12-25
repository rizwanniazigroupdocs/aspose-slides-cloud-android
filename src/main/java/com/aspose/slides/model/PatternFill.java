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
 * Represents Pattern Fill
 */
@ApiModel(description = "Represents Pattern Fill")
public class PatternFill extends FillFormat {
  @SerializedName(value = "backColor", alternate = { "BackColor" })
  private String backColor;

  @SerializedName(value = "foreColor", alternate = { "ForeColor" })
  private String foreColor;

  /**
   * Gets or sets the style of pattern fill.
   */
  @JsonAdapter(StyleEnum.Adapter.class)
  public enum StyleEnum {
    UNKNOWN("Unknown"),
    
    PERCENT05("Percent05"),
    
    PERCENT10("Percent10"),
    
    PERCENT20("Percent20"),
    
    PERCENT25("Percent25"),
    
    PERCENT30("Percent30"),
    
    PERCENT40("Percent40"),
    
    PERCENT50("Percent50"),
    
    PERCENT60("Percent60"),
    
    PERCENT70("Percent70"),
    
    PERCENT75("Percent75"),
    
    PERCENT80("Percent80"),
    
    PERCENT90("Percent90"),
    
    DARKHORIZONTAL("DarkHorizontal"),
    
    DARKVERTICAL("DarkVertical"),
    
    DARKDOWNWARDDIAGONAL("DarkDownwardDiagonal"),
    
    DARKUPWARDDIAGONAL("DarkUpwardDiagonal"),
    
    SMALLCHECKERBOARD("SmallCheckerBoard"),
    
    TRELLIS("Trellis"),
    
    LIGHTHORIZONTAL("LightHorizontal"),
    
    LIGHTVERTICAL("LightVertical"),
    
    LIGHTDOWNWARDDIAGONAL("LightDownwardDiagonal"),
    
    LIGHTUPWARDDIAGONAL("LightUpwardDiagonal"),
    
    SMALLGRID("SmallGrid"),
    
    DOTTEDDIAMOND("DottedDiamond"),
    
    WIDEDOWNWARDDIAGONAL("WideDownwardDiagonal"),
    
    WIDEUPWARDDIAGONAL("WideUpwardDiagonal"),
    
    DASHEDUPWARDDIAGONAL("DashedUpwardDiagonal"),
    
    DASHEDDOWNWARDDIAGONAL("DashedDownwardDiagonal"),
    
    NARROWVERTICAL("NarrowVertical"),
    
    NARROWHORIZONTAL("NarrowHorizontal"),
    
    DASHEDVERTICAL("DashedVertical"),
    
    DASHEDHORIZONTAL("DashedHorizontal"),
    
    LARGECONFETTI("LargeConfetti"),
    
    LARGEGRID("LargeGrid"),
    
    HORIZONTALBRICK("HorizontalBrick"),
    
    LARGECHECKERBOARD("LargeCheckerBoard"),
    
    SMALLCONFETTI("SmallConfetti"),
    
    ZIGZAG("Zigzag"),
    
    SOLIDDIAMOND("SolidDiamond"),
    
    DIAGONALBRICK("DiagonalBrick"),
    
    OUTLINEDDIAMOND("OutlinedDiamond"),
    
    PLAID("Plaid"),
    
    SPHERE("Sphere"),
    
    WEAVE("Weave"),
    
    DOTTEDGRID("DottedGrid"),
    
    DIVOT("Divot"),
    
    SHINGLE("Shingle"),
    
    WAVE("Wave"),
    
    HORIZONTAL("Horizontal"),
    
    VERTICAL("Vertical"),
    
    CROSS("Cross"),
    
    DOWNWARDDIAGONAL("DownwardDiagonal"),
    
    UPWARDDIAGONAL("UpwardDiagonal"),
    
    DIAGONALCROSS("DiagonalCross"),
    
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


  public PatternFill() {
    super();
    setType(TypeEnum.PATTERN);
  }

  public PatternFill backColor(String backColor) {
    this.backColor = backColor;
    return this;
  }

   /**
   * Gets or sets the back color of the pattern fill.
   * @return backColor
  **/
  @ApiModelProperty(value = "Gets or sets the back color of the pattern fill.")
  public String getBackColor() {
    return backColor;
  }

  public void setBackColor(String backColor) {
    this.backColor = backColor;
  }

  public PatternFill foreColor(String foreColor) {
    this.foreColor = foreColor;
    return this;
  }

   /**
   * Gets or sets the fore color of the pattern fill.
   * @return foreColor
  **/
  @ApiModelProperty(value = "Gets or sets the fore color of the pattern fill.")
  public String getForeColor() {
    return foreColor;
  }

  public void setForeColor(String foreColor) {
    this.foreColor = foreColor;
  }

  public PatternFill style(StyleEnum style) {
    this.style = style;
    return this;
  }

   /**
   * Gets or sets the style of pattern fill.
   * @return style
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the style of pattern fill.")
  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatternFill patternFill = (PatternFill) o;
    return true && Objects.equals(this.backColor, patternFill.backColor) && Objects.equals(this.foreColor, patternFill.foreColor) && Objects.equals(this.style, patternFill.style) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backColor, foreColor, style, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatternFill {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    backColor: ").append(toIndentedString(backColor)).append("\n");
    sb.append("    foreColor: ").append(toIndentedString(foreColor)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.PATTERN);
  }
}
