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
import com.aspose.slides.model.ArrowHeadProperties;
import com.aspose.slides.model.CustomDashPattern;
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
 * Line format.
 */
@ApiModel(description = "Line format.")
public class LineFormat {
  /**
   * Alignment.
   */
  @JsonAdapter(AlignmentEnum.Adapter.class)
  public enum AlignmentEnum {
    CENTER("Center"),
    
    INSET("Inset"),
    
    NOTDEFINED("NotDefined");

    private String value;

    AlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlignmentEnum fromValue(String text) {
      for (AlignmentEnum b : AlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "alignment", alternate = { "Alignment" })
  private AlignmentEnum alignment;

  /**
   * Cap style.
   */
  @JsonAdapter(CapStyleEnum.Adapter.class)
  public enum CapStyleEnum {
    ROUND("Round"),
    
    SQUARE("Square"),
    
    FLAT("Flat"),
    
    NOTDEFINED("NotDefined");

    private String value;

    CapStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CapStyleEnum fromValue(String text) {
      for (CapStyleEnum b : CapStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CapStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CapStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CapStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CapStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "capStyle", alternate = { "CapStyle" })
  private CapStyleEnum capStyle;

  /**
   * Dash style.
   */
  @JsonAdapter(DashStyleEnum.Adapter.class)
  public enum DashStyleEnum {
    SOLID("Solid"),
    
    DOT("Dot"),
    
    DASH("Dash"),
    
    LARGEDASH("LargeDash"),
    
    DASHDOT("DashDot"),
    
    LARGEDASHDOT("LargeDashDot"),
    
    LARGEDASHDOTDOT("LargeDashDotDot"),
    
    SYSTEMDASH("SystemDash"),
    
    SYSTEMDOT("SystemDot"),
    
    SYSTEMDASHDOT("SystemDashDot"),
    
    SYSTEMDASHDOTDOT("SystemDashDotDot"),
    
    CUSTOM("Custom"),
    
    NOTDEFINED("NotDefined");

    private String value;

    DashStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DashStyleEnum fromValue(String text) {
      for (DashStyleEnum b : DashStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DashStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DashStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DashStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DashStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "dashStyle", alternate = { "DashStyle" })
  private DashStyleEnum dashStyle;

  /**
   * Join style.
   */
  @JsonAdapter(JoinStyleEnum.Adapter.class)
  public enum JoinStyleEnum {
    ROUND("Round"),
    
    BEVEL("Bevel"),
    
    MITER("Miter"),
    
    NOTDEFINED("NotDefined");

    private String value;

    JoinStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JoinStyleEnum fromValue(String text) {
      for (JoinStyleEnum b : JoinStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<JoinStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JoinStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JoinStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return JoinStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "joinStyle", alternate = { "JoinStyle" })
  private JoinStyleEnum joinStyle;

  /**
   * Style.
   */
  @JsonAdapter(StyleEnum.Adapter.class)
  public enum StyleEnum {
    SINGLE("Single"),
    
    THINTHIN("ThinThin"),
    
    THINTHICK("ThinThick"),
    
    THICKTHIN("ThickThin"),
    
    THICKBETWEENTHIN("ThickBetweenThin"),
    
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

  @SerializedName(value = "beginArrowHead", alternate = { "BeginArrowHead" })
  private ArrowHeadProperties beginArrowHead;

  @SerializedName(value = "endArrowHead", alternate = { "EndArrowHead" })
  private ArrowHeadProperties endArrowHead;

  @SerializedName(value = "customDashPattern", alternate = { "CustomDashPattern" })
  private CustomDashPattern customDashPattern;

  @SerializedName(value = "fillFormat", alternate = { "FillFormat" })
  private FillFormat fillFormat;

  @SerializedName(value = "miterLimit", alternate = { "MiterLimit" })
  private Double miterLimit;

  @SerializedName(value = "width", alternate = { "Width" })
  private Double width;


  public LineFormat() {
    super();
  }

  public LineFormat alignment(AlignmentEnum alignment) {
    this.alignment = alignment;
    return this;
  }

   /**
   * Alignment.
   * @return alignment
  **/
  @ApiModelProperty(required = true, value = "Alignment.")
  public AlignmentEnum getAlignment() {
    return alignment;
  }

  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }

  public LineFormat capStyle(CapStyleEnum capStyle) {
    this.capStyle = capStyle;
    return this;
  }

   /**
   * Cap style.
   * @return capStyle
  **/
  @ApiModelProperty(required = true, value = "Cap style.")
  public CapStyleEnum getCapStyle() {
    return capStyle;
  }

  public void setCapStyle(CapStyleEnum capStyle) {
    this.capStyle = capStyle;
  }

  public LineFormat dashStyle(DashStyleEnum dashStyle) {
    this.dashStyle = dashStyle;
    return this;
  }

   /**
   * Dash style.
   * @return dashStyle
  **/
  @ApiModelProperty(required = true, value = "Dash style.")
  public DashStyleEnum getDashStyle() {
    return dashStyle;
  }

  public void setDashStyle(DashStyleEnum dashStyle) {
    this.dashStyle = dashStyle;
  }

  public LineFormat joinStyle(JoinStyleEnum joinStyle) {
    this.joinStyle = joinStyle;
    return this;
  }

   /**
   * Join style.
   * @return joinStyle
  **/
  @ApiModelProperty(required = true, value = "Join style.")
  public JoinStyleEnum getJoinStyle() {
    return joinStyle;
  }

  public void setJoinStyle(JoinStyleEnum joinStyle) {
    this.joinStyle = joinStyle;
  }

  public LineFormat style(StyleEnum style) {
    this.style = style;
    return this;
  }

   /**
   * Style.
   * @return style
  **/
  @ApiModelProperty(required = true, value = "Style.")
  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public LineFormat beginArrowHead(ArrowHeadProperties beginArrowHead) {
    this.beginArrowHead = beginArrowHead;
    return this;
  }

   /**
   * Begin arrowhead.
   * @return beginArrowHead
  **/
  @ApiModelProperty(value = "Begin arrowhead.")
  public ArrowHeadProperties getBeginArrowHead() {
    return beginArrowHead;
  }

  public void setBeginArrowHead(ArrowHeadProperties beginArrowHead) {
    this.beginArrowHead = beginArrowHead;
  }

  public LineFormat endArrowHead(ArrowHeadProperties endArrowHead) {
    this.endArrowHead = endArrowHead;
    return this;
  }

   /**
   * End arrowhead.
   * @return endArrowHead
  **/
  @ApiModelProperty(value = "End arrowhead.")
  public ArrowHeadProperties getEndArrowHead() {
    return endArrowHead;
  }

  public void setEndArrowHead(ArrowHeadProperties endArrowHead) {
    this.endArrowHead = endArrowHead;
  }

  public LineFormat customDashPattern(CustomDashPattern customDashPattern) {
    this.customDashPattern = customDashPattern;
    return this;
  }

   /**
   * Custom dash pattern.
   * @return customDashPattern
  **/
  @ApiModelProperty(value = "Custom dash pattern.")
  public CustomDashPattern getCustomDashPattern() {
    return customDashPattern;
  }

  public void setCustomDashPattern(CustomDashPattern customDashPattern) {
    this.customDashPattern = customDashPattern;
  }

  public LineFormat fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Fill format.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Fill format.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public LineFormat miterLimit(Double miterLimit) {
    this.miterLimit = miterLimit;
    return this;
  }

   /**
   * Miter limit.
   * @return miterLimit
  **/
  @ApiModelProperty(required = true, value = "Miter limit.")
  public Double getMiterLimit() {
    return miterLimit;
  }

  public void setMiterLimit(Double miterLimit) {
    this.miterLimit = miterLimit;
  }

  public LineFormat width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Width.
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Width.")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
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
    LineFormat lineFormat = (LineFormat) o;
    return true && Objects.equals(this.alignment, lineFormat.alignment) && Objects.equals(this.capStyle, lineFormat.capStyle) && Objects.equals(this.dashStyle, lineFormat.dashStyle) && Objects.equals(this.joinStyle, lineFormat.joinStyle) && Objects.equals(this.style, lineFormat.style) && Objects.equals(this.beginArrowHead, lineFormat.beginArrowHead) && Objects.equals(this.endArrowHead, lineFormat.endArrowHead) && Objects.equals(this.customDashPattern, lineFormat.customDashPattern) && Objects.equals(this.fillFormat, lineFormat.fillFormat) && Objects.equals(this.miterLimit, lineFormat.miterLimit) && Objects.equals(this.width, lineFormat.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, capStyle, dashStyle, joinStyle, style, beginArrowHead, endArrowHead, customDashPattern, fillFormat, miterLimit, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineFormat {\n");
    
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    capStyle: ").append(toIndentedString(capStyle)).append("\n");
    sb.append("    dashStyle: ").append(toIndentedString(dashStyle)).append("\n");
    sb.append("    joinStyle: ").append(toIndentedString(joinStyle)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    beginArrowHead: ").append(toIndentedString(beginArrowHead)).append("\n");
    sb.append("    endArrowHead: ").append(toIndentedString(endArrowHead)).append("\n");
    sb.append("    customDashPattern: ").append(toIndentedString(customDashPattern)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    miterLimit: ").append(toIndentedString(miterLimit)).append("\n");
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
