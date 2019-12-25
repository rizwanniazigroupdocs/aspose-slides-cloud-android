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
 * Represents a chart axis
 */
@ApiModel(description = "Represents a chart axis")
public class Axis {
  @SerializedName(value = "isVisible", alternate = { "IsVisible" })
  private Boolean isVisible;

  @SerializedName(value = "hasTitle", alternate = { "HasTitle" })
  private Boolean hasTitle;

  /**
   * Axis position
   */
  @JsonAdapter(PositionEnum.Adapter.class)
  public enum PositionEnum {
    BOTTOM("Bottom"),
    
    LEFT("Left"),
    
    RIGHT("Right"),
    
    TOP("Top");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PositionEnum fromValue(String text) {
      for (PositionEnum b : PositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PositionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PositionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "position", alternate = { "Position" })
  private PositionEnum position;

  /**
   * The scaling value of the display units for the value axis
   */
  @JsonAdapter(DisplayUnitEnum.Adapter.class)
  public enum DisplayUnitEnum {
    NONE("None"),
    
    HUNDREDS("Hundreds"),
    
    THOUSANDS("Thousands"),
    
    TENTHOUSANDS("TenThousands"),
    
    HUNDREDTHOUSANDS("HundredThousands"),
    
    MILLIONS("Millions"),
    
    TENMILLIONS("TenMillions"),
    
    HUNDREDMILLIONS("HundredMillions"),
    
    BILLIONS("Billions"),
    
    TRILLIONS("Trillions"),
    
    CUSTOMVALUE("CustomValue");

    private String value;

    DisplayUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisplayUnitEnum fromValue(String text) {
      for (DisplayUnitEnum b : DisplayUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DisplayUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisplayUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisplayUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DisplayUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "displayUnit", alternate = { "DisplayUnit" })
  private DisplayUnitEnum displayUnit;

  /**
   * The smallest time unit that is represented on the date axis
   */
  @JsonAdapter(BaseUnitScaleEnum.Adapter.class)
  public enum BaseUnitScaleEnum {
    DAYS("Days"),
    
    MONTHS("Months"),
    
    YEARS("Years");

    private String value;

    BaseUnitScaleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BaseUnitScaleEnum fromValue(String text) {
      for (BaseUnitScaleEnum b : BaseUnitScaleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BaseUnitScaleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BaseUnitScaleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BaseUnitScaleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BaseUnitScaleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "baseUnitScale", alternate = { "BaseUnitScale" })
  private BaseUnitScaleEnum baseUnitScale;

  @SerializedName(value = "isAutomaticMajorUnit", alternate = { "IsAutomaticMajorUnit" })
  private Boolean isAutomaticMajorUnit;

  @SerializedName(value = "majorUnit", alternate = { "MajorUnit" })
  private Double majorUnit;

  /**
   * The major unit scale for the date axis
   */
  @JsonAdapter(MajorUnitScaleEnum.Adapter.class)
  public enum MajorUnitScaleEnum {
    DAYS("Days"),
    
    MONTHS("Months"),
    
    YEARS("Years");

    private String value;

    MajorUnitScaleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MajorUnitScaleEnum fromValue(String text) {
      for (MajorUnitScaleEnum b : MajorUnitScaleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MajorUnitScaleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MajorUnitScaleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MajorUnitScaleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MajorUnitScaleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "majorUnitScale", alternate = { "MajorUnitScale" })
  private MajorUnitScaleEnum majorUnitScale;

  /**
   * The type of major tick mark for the specified axis
   */
  @JsonAdapter(MajorTickMarkEnum.Adapter.class)
  public enum MajorTickMarkEnum {
    CROSS("Cross"),
    
    INSIDE("Inside"),
    
    NONE("None"),
    
    OUTSIDE("Outside");

    private String value;

    MajorTickMarkEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MajorTickMarkEnum fromValue(String text) {
      for (MajorTickMarkEnum b : MajorTickMarkEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MajorTickMarkEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MajorTickMarkEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MajorTickMarkEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MajorTickMarkEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "majorTickMark", alternate = { "MajorTickMark" })
  private MajorTickMarkEnum majorTickMark;

  @SerializedName(value = "isAutomaticMinorUnit", alternate = { "IsAutomaticMinorUnit" })
  private Boolean isAutomaticMinorUnit;

  @SerializedName(value = "minorUnit", alternate = { "MinorUnit" })
  private Double minorUnit;

  /**
   * The minor unit scale for the date axis
   */
  @JsonAdapter(MinorUnitScaleEnum.Adapter.class)
  public enum MinorUnitScaleEnum {
    DAYS("Days"),
    
    MONTHS("Months"),
    
    YEARS("Years");

    private String value;

    MinorUnitScaleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MinorUnitScaleEnum fromValue(String text) {
      for (MinorUnitScaleEnum b : MinorUnitScaleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MinorUnitScaleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MinorUnitScaleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MinorUnitScaleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MinorUnitScaleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "minorUnitScale", alternate = { "MinorUnitScale" })
  private MinorUnitScaleEnum minorUnitScale;

  /**
   * The type of minor tick mark for the specified axis
   */
  @JsonAdapter(MinorTickMarkEnum.Adapter.class)
  public enum MinorTickMarkEnum {
    CROSS("Cross"),
    
    INSIDE("Inside"),
    
    NONE("None"),
    
    OUTSIDE("Outside");

    private String value;

    MinorTickMarkEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MinorTickMarkEnum fromValue(String text) {
      for (MinorTickMarkEnum b : MinorTickMarkEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MinorTickMarkEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MinorTickMarkEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MinorTickMarkEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MinorTickMarkEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "minorTickMark", alternate = { "MinorTickMark" })
  private MinorTickMarkEnum minorTickMark;

  @SerializedName(value = "isAutomaticMaxValue", alternate = { "IsAutomaticMaxValue" })
  private Boolean isAutomaticMaxValue;

  @SerializedName(value = "maxValue", alternate = { "MaxValue" })
  private Double maxValue;

  @SerializedName(value = "isAutomaticMinValue", alternate = { "IsAutomaticMinValue" })
  private Boolean isAutomaticMinValue;

  @SerializedName(value = "minValue", alternate = { "MinValue" })
  private Double minValue;

  @SerializedName(value = "isLogarithmic", alternate = { "IsLogarithmic" })
  private Boolean isLogarithmic;

  @SerializedName(value = "logBase", alternate = { "LogBase" })
  private Double logBase;

  /**
   * The type of the category axis
   */
  @JsonAdapter(CategoryAxisTypeEnum.Adapter.class)
  public enum CategoryAxisTypeEnum {
    TEXT("Text"),
    
    DATE("Date");

    private String value;

    CategoryAxisTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryAxisTypeEnum fromValue(String text) {
      for (CategoryAxisTypeEnum b : CategoryAxisTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoryAxisTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryAxisTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryAxisTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoryAxisTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "categoryAxisType", alternate = { "CategoryAxisType" })
  private CategoryAxisTypeEnum categoryAxisType;

  @SerializedName(value = "axisBetweenCategories", alternate = { "AxisBetweenCategories" })
  private Boolean axisBetweenCategories;

  @SerializedName(value = "labelOffset", alternate = { "LabelOffset" })
  private Integer labelOffset;

  @SerializedName(value = "isPlotOrderReversed", alternate = { "IsPlotOrderReversed" })
  private Boolean isPlotOrderReversed;

  @SerializedName(value = "isNumberFormatLinkedToSource", alternate = { "IsNumberFormatLinkedToSource" })
  private Boolean isNumberFormatLinkedToSource;

  @SerializedName(value = "numberFormat", alternate = { "NumberFormat" })
  private String numberFormat;

  /**
   * The CrossType on the specified axis where the other axis crosses
   */
  @JsonAdapter(CrossTypeEnum.Adapter.class)
  public enum CrossTypeEnum {
    AXISCROSSESATZERO("AxisCrossesAtZero"),
    
    MAXIMUM("Maximum"),
    
    CUSTOM("Custom");

    private String value;

    CrossTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CrossTypeEnum fromValue(String text) {
      for (CrossTypeEnum b : CrossTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CrossTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CrossTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CrossTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CrossTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "crossType", alternate = { "CrossType" })
  private CrossTypeEnum crossType;

  @SerializedName(value = "crossAt", alternate = { "CrossAt" })
  private Double crossAt;

  @SerializedName(value = "isAutomaticTickMarksSpacing", alternate = { "IsAutomaticTickMarksSpacing" })
  private Boolean isAutomaticTickMarksSpacing;

  @SerializedName(value = "tickMarksSpacing", alternate = { "TickMarksSpacing" })
  private Integer tickMarksSpacing;

  @SerializedName(value = "isAutomaticTickLabelSpacing", alternate = { "IsAutomaticTickLabelSpacing" })
  private Boolean isAutomaticTickLabelSpacing;

  @SerializedName(value = "tickLabelSpacing", alternate = { "TickLabelSpacing" })
  private Integer tickLabelSpacing;

  /**
   * The position of tick-mark labels on the specified axis.
   */
  @JsonAdapter(TickLabelPositionEnum.Adapter.class)
  public enum TickLabelPositionEnum {
    HIGH("High"),
    
    LOW("Low"),
    
    NEXTTO("NextTo"),
    
    NONE("None");

    private String value;

    TickLabelPositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TickLabelPositionEnum fromValue(String text) {
      for (TickLabelPositionEnum b : TickLabelPositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TickLabelPositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TickLabelPositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TickLabelPositionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TickLabelPositionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "tickLabelPosition", alternate = { "TickLabelPosition" })
  private TickLabelPositionEnum tickLabelPosition;

  @SerializedName(value = "tickLabelRotationAngle", alternate = { "TickLabelRotationAngle" })
  private Double tickLabelRotationAngle;

  @SerializedName(value = "fillFormat", alternate = { "FillFormat" })
  private FillFormat fillFormat;

  @SerializedName(value = "effectFormat", alternate = { "EffectFormat" })
  private EffectFormat effectFormat;

  @SerializedName(value = "lineFormat", alternate = { "LineFormat" })
  private LineFormat lineFormat;


  public Axis() {
    super();
  }

  public Axis isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

   /**
   * True if the axis is visible
   * @return isVisible
  **/
  @ApiModelProperty(required = true, value = "True if the axis is visible")
  public Boolean isIsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }

  public Axis hasTitle(Boolean hasTitle) {
    this.hasTitle = hasTitle;
    return this;
  }

   /**
   * True if the axis has a visible title
   * @return hasTitle
  **/
  @ApiModelProperty(required = true, value = "True if the axis has a visible title")
  public Boolean isHasTitle() {
    return hasTitle;
  }

  public void setHasTitle(Boolean hasTitle) {
    this.hasTitle = hasTitle;
  }

  public Axis position(PositionEnum position) {
    this.position = position;
    return this;
  }

   /**
   * Axis position
   * @return position
  **/
  @ApiModelProperty(required = true, value = "Axis position")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public Axis displayUnit(DisplayUnitEnum displayUnit) {
    this.displayUnit = displayUnit;
    return this;
  }

   /**
   * The scaling value of the display units for the value axis
   * @return displayUnit
  **/
  @ApiModelProperty(required = true, value = "The scaling value of the display units for the value axis")
  public DisplayUnitEnum getDisplayUnit() {
    return displayUnit;
  }

  public void setDisplayUnit(DisplayUnitEnum displayUnit) {
    this.displayUnit = displayUnit;
  }

  public Axis baseUnitScale(BaseUnitScaleEnum baseUnitScale) {
    this.baseUnitScale = baseUnitScale;
    return this;
  }

   /**
   * The smallest time unit that is represented on the date axis
   * @return baseUnitScale
  **/
  @ApiModelProperty(required = true, value = "The smallest time unit that is represented on the date axis")
  public BaseUnitScaleEnum getBaseUnitScale() {
    return baseUnitScale;
  }

  public void setBaseUnitScale(BaseUnitScaleEnum baseUnitScale) {
    this.baseUnitScale = baseUnitScale;
  }

  public Axis isAutomaticMajorUnit(Boolean isAutomaticMajorUnit) {
    this.isAutomaticMajorUnit = isAutomaticMajorUnit;
    return this;
  }

   /**
   * True the major unit of the axis is automatically assigned
   * @return isAutomaticMajorUnit
  **/
  @ApiModelProperty(required = true, value = "True the major unit of the axis is automatically assigned")
  public Boolean isIsAutomaticMajorUnit() {
    return isAutomaticMajorUnit;
  }

  public void setIsAutomaticMajorUnit(Boolean isAutomaticMajorUnit) {
    this.isAutomaticMajorUnit = isAutomaticMajorUnit;
  }

  public Axis majorUnit(Double majorUnit) {
    this.majorUnit = majorUnit;
    return this;
  }

   /**
   * The major units for the date or value axis
   * @return majorUnit
  **/
  @ApiModelProperty(required = true, value = "The major units for the date or value axis")
  public Double getMajorUnit() {
    return majorUnit;
  }

  public void setMajorUnit(Double majorUnit) {
    this.majorUnit = majorUnit;
  }

  public Axis majorUnitScale(MajorUnitScaleEnum majorUnitScale) {
    this.majorUnitScale = majorUnitScale;
    return this;
  }

   /**
   * The major unit scale for the date axis
   * @return majorUnitScale
  **/
  @ApiModelProperty(required = true, value = "The major unit scale for the date axis")
  public MajorUnitScaleEnum getMajorUnitScale() {
    return majorUnitScale;
  }

  public void setMajorUnitScale(MajorUnitScaleEnum majorUnitScale) {
    this.majorUnitScale = majorUnitScale;
  }

  public Axis majorTickMark(MajorTickMarkEnum majorTickMark) {
    this.majorTickMark = majorTickMark;
    return this;
  }

   /**
   * The type of major tick mark for the specified axis
   * @return majorTickMark
  **/
  @ApiModelProperty(required = true, value = "The type of major tick mark for the specified axis")
  public MajorTickMarkEnum getMajorTickMark() {
    return majorTickMark;
  }

  public void setMajorTickMark(MajorTickMarkEnum majorTickMark) {
    this.majorTickMark = majorTickMark;
  }

  public Axis isAutomaticMinorUnit(Boolean isAutomaticMinorUnit) {
    this.isAutomaticMinorUnit = isAutomaticMinorUnit;
    return this;
  }

   /**
   * True the minor unit of the axis is automatically assigned
   * @return isAutomaticMinorUnit
  **/
  @ApiModelProperty(required = true, value = "True the minor unit of the axis is automatically assigned")
  public Boolean isIsAutomaticMinorUnit() {
    return isAutomaticMinorUnit;
  }

  public void setIsAutomaticMinorUnit(Boolean isAutomaticMinorUnit) {
    this.isAutomaticMinorUnit = isAutomaticMinorUnit;
  }

  public Axis minorUnit(Double minorUnit) {
    this.minorUnit = minorUnit;
    return this;
  }

   /**
   * The minor units for the date or value axis
   * @return minorUnit
  **/
  @ApiModelProperty(required = true, value = "The minor units for the date or value axis")
  public Double getMinorUnit() {
    return minorUnit;
  }

  public void setMinorUnit(Double minorUnit) {
    this.minorUnit = minorUnit;
  }

  public Axis minorUnitScale(MinorUnitScaleEnum minorUnitScale) {
    this.minorUnitScale = minorUnitScale;
    return this;
  }

   /**
   * The minor unit scale for the date axis
   * @return minorUnitScale
  **/
  @ApiModelProperty(required = true, value = "The minor unit scale for the date axis")
  public MinorUnitScaleEnum getMinorUnitScale() {
    return minorUnitScale;
  }

  public void setMinorUnitScale(MinorUnitScaleEnum minorUnitScale) {
    this.minorUnitScale = minorUnitScale;
  }

  public Axis minorTickMark(MinorTickMarkEnum minorTickMark) {
    this.minorTickMark = minorTickMark;
    return this;
  }

   /**
   * The type of minor tick mark for the specified axis
   * @return minorTickMark
  **/
  @ApiModelProperty(required = true, value = "The type of minor tick mark for the specified axis")
  public MinorTickMarkEnum getMinorTickMark() {
    return minorTickMark;
  }

  public void setMinorTickMark(MinorTickMarkEnum minorTickMark) {
    this.minorTickMark = minorTickMark;
  }

  public Axis isAutomaticMaxValue(Boolean isAutomaticMaxValue) {
    this.isAutomaticMaxValue = isAutomaticMaxValue;
    return this;
  }

   /**
   * True if the max value is automatically assigned
   * @return isAutomaticMaxValue
  **/
  @ApiModelProperty(required = true, value = "True if the max value is automatically assigned")
  public Boolean isIsAutomaticMaxValue() {
    return isAutomaticMaxValue;
  }

  public void setIsAutomaticMaxValue(Boolean isAutomaticMaxValue) {
    this.isAutomaticMaxValue = isAutomaticMaxValue;
  }

  public Axis maxValue(Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

   /**
   * The maximum value on the value axis
   * @return maxValue
  **/
  @ApiModelProperty(required = true, value = "The maximum value on the value axis")
  public Double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  public Axis isAutomaticMinValue(Boolean isAutomaticMinValue) {
    this.isAutomaticMinValue = isAutomaticMinValue;
    return this;
  }

   /**
   * True if the min value is automatically assigned
   * @return isAutomaticMinValue
  **/
  @ApiModelProperty(required = true, value = "True if the min value is automatically assigned")
  public Boolean isIsAutomaticMinValue() {
    return isAutomaticMinValue;
  }

  public void setIsAutomaticMinValue(Boolean isAutomaticMinValue) {
    this.isAutomaticMinValue = isAutomaticMinValue;
  }

  public Axis minValue(Double minValue) {
    this.minValue = minValue;
    return this;
  }

   /**
   * The minimum value on the value axis
   * @return minValue
  **/
  @ApiModelProperty(required = true, value = "The minimum value on the value axis")
  public Double getMinValue() {
    return minValue;
  }

  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  public Axis isLogarithmic(Boolean isLogarithmic) {
    this.isLogarithmic = isLogarithmic;
    return this;
  }

   /**
   * True if the value axis scale type is logarithmic
   * @return isLogarithmic
  **/
  @ApiModelProperty(required = true, value = "True if the value axis scale type is logarithmic")
  public Boolean isIsLogarithmic() {
    return isLogarithmic;
  }

  public void setIsLogarithmic(Boolean isLogarithmic) {
    this.isLogarithmic = isLogarithmic;
  }

  public Axis logBase(Double logBase) {
    this.logBase = logBase;
    return this;
  }

   /**
   * The logarithmic base. Default value is 10
   * @return logBase
  **/
  @ApiModelProperty(required = true, value = "The logarithmic base. Default value is 10")
  public Double getLogBase() {
    return logBase;
  }

  public void setLogBase(Double logBase) {
    this.logBase = logBase;
  }

  public Axis categoryAxisType(CategoryAxisTypeEnum categoryAxisType) {
    this.categoryAxisType = categoryAxisType;
    return this;
  }

   /**
   * The type of the category axis
   * @return categoryAxisType
  **/
  @ApiModelProperty(required = true, value = "The type of the category axis")
  public CategoryAxisTypeEnum getCategoryAxisType() {
    return categoryAxisType;
  }

  public void setCategoryAxisType(CategoryAxisTypeEnum categoryAxisType) {
    this.categoryAxisType = categoryAxisType;
  }

  public Axis axisBetweenCategories(Boolean axisBetweenCategories) {
    this.axisBetweenCategories = axisBetweenCategories;
    return this;
  }

   /**
   * True if the value axis crosses the category axis between categories. This property applies only to category axes, and it doesn&#39;t apply to 3-D charts
   * @return axisBetweenCategories
  **/
  @ApiModelProperty(required = true, value = "True if the value axis crosses the category axis between categories. This property applies only to category axes, and it doesn't apply to 3-D charts")
  public Boolean isAxisBetweenCategories() {
    return axisBetweenCategories;
  }

  public void setAxisBetweenCategories(Boolean axisBetweenCategories) {
    this.axisBetweenCategories = axisBetweenCategories;
  }

  public Axis labelOffset(Integer labelOffset) {
    this.labelOffset = labelOffset;
    return this;
  }

   /**
   * The distance of labels from the axis. Applied to category or date axis. Value must be between 0% and 1000%.             
   * @return labelOffset
  **/
  @ApiModelProperty(required = true, value = "The distance of labels from the axis. Applied to category or date axis. Value must be between 0% and 1000%.             ")
  public Integer getLabelOffset() {
    return labelOffset;
  }

  public void setLabelOffset(Integer labelOffset) {
    this.labelOffset = labelOffset;
  }

  public Axis isPlotOrderReversed(Boolean isPlotOrderReversed) {
    this.isPlotOrderReversed = isPlotOrderReversed;
    return this;
  }

   /**
   * True if MS PowerPoint plots data points from last to first
   * @return isPlotOrderReversed
  **/
  @ApiModelProperty(required = true, value = "True if MS PowerPoint plots data points from last to first")
  public Boolean isIsPlotOrderReversed() {
    return isPlotOrderReversed;
  }

  public void setIsPlotOrderReversed(Boolean isPlotOrderReversed) {
    this.isPlotOrderReversed = isPlotOrderReversed;
  }

  public Axis isNumberFormatLinkedToSource(Boolean isNumberFormatLinkedToSource) {
    this.isNumberFormatLinkedToSource = isNumberFormatLinkedToSource;
    return this;
  }

   /**
   * True if the format is linked to source data
   * @return isNumberFormatLinkedToSource
  **/
  @ApiModelProperty(required = true, value = "True if the format is linked to source data")
  public Boolean isIsNumberFormatLinkedToSource() {
    return isNumberFormatLinkedToSource;
  }

  public void setIsNumberFormatLinkedToSource(Boolean isNumberFormatLinkedToSource) {
    this.isNumberFormatLinkedToSource = isNumberFormatLinkedToSource;
  }

  public Axis numberFormat(String numberFormat) {
    this.numberFormat = numberFormat;
    return this;
  }

   /**
   * the format string for the Axis Labels
   * @return numberFormat
  **/
  @ApiModelProperty(value = "the format string for the Axis Labels")
  public String getNumberFormat() {
    return numberFormat;
  }

  public void setNumberFormat(String numberFormat) {
    this.numberFormat = numberFormat;
  }

  public Axis crossType(CrossTypeEnum crossType) {
    this.crossType = crossType;
    return this;
  }

   /**
   * The CrossType on the specified axis where the other axis crosses
   * @return crossType
  **/
  @ApiModelProperty(required = true, value = "The CrossType on the specified axis where the other axis crosses")
  public CrossTypeEnum getCrossType() {
    return crossType;
  }

  public void setCrossType(CrossTypeEnum crossType) {
    this.crossType = crossType;
  }

  public Axis crossAt(Double crossAt) {
    this.crossAt = crossAt;
    return this;
  }

   /**
   * The point on the axis where the perpendicular axis crosses it
   * @return crossAt
  **/
  @ApiModelProperty(required = true, value = "The point on the axis where the perpendicular axis crosses it")
  public Double getCrossAt() {
    return crossAt;
  }

  public void setCrossAt(Double crossAt) {
    this.crossAt = crossAt;
  }

  public Axis isAutomaticTickMarksSpacing(Boolean isAutomaticTickMarksSpacing) {
    this.isAutomaticTickMarksSpacing = isAutomaticTickMarksSpacing;
    return this;
  }

   /**
   * True for automatic tick marks spacing value
   * @return isAutomaticTickMarksSpacing
  **/
  @ApiModelProperty(required = true, value = "True for automatic tick marks spacing value")
  public Boolean isIsAutomaticTickMarksSpacing() {
    return isAutomaticTickMarksSpacing;
  }

  public void setIsAutomaticTickMarksSpacing(Boolean isAutomaticTickMarksSpacing) {
    this.isAutomaticTickMarksSpacing = isAutomaticTickMarksSpacing;
  }

  public Axis tickMarksSpacing(Integer tickMarksSpacing) {
    this.tickMarksSpacing = tickMarksSpacing;
    return this;
  }

   /**
   * Specifies how many tick marks shall be skipped before the next one shall be drawn. Applied to category or series axis.
   * @return tickMarksSpacing
  **/
  @ApiModelProperty(required = true, value = "Specifies how many tick marks shall be skipped before the next one shall be drawn. Applied to category or series axis.")
  public Integer getTickMarksSpacing() {
    return tickMarksSpacing;
  }

  public void setTickMarksSpacing(Integer tickMarksSpacing) {
    this.tickMarksSpacing = tickMarksSpacing;
  }

  public Axis isAutomaticTickLabelSpacing(Boolean isAutomaticTickLabelSpacing) {
    this.isAutomaticTickLabelSpacing = isAutomaticTickLabelSpacing;
    return this;
  }

   /**
   * True for automatic tick label spacing value
   * @return isAutomaticTickLabelSpacing
  **/
  @ApiModelProperty(required = true, value = "True for automatic tick label spacing value")
  public Boolean isIsAutomaticTickLabelSpacing() {
    return isAutomaticTickLabelSpacing;
  }

  public void setIsAutomaticTickLabelSpacing(Boolean isAutomaticTickLabelSpacing) {
    this.isAutomaticTickLabelSpacing = isAutomaticTickLabelSpacing;
  }

  public Axis tickLabelSpacing(Integer tickLabelSpacing) {
    this.tickLabelSpacing = tickLabelSpacing;
    return this;
  }

   /**
   * Specifies how many tick labels to skip between label that is drawn.
   * @return tickLabelSpacing
  **/
  @ApiModelProperty(required = true, value = "Specifies how many tick labels to skip between label that is drawn.")
  public Integer getTickLabelSpacing() {
    return tickLabelSpacing;
  }

  public void setTickLabelSpacing(Integer tickLabelSpacing) {
    this.tickLabelSpacing = tickLabelSpacing;
  }

  public Axis tickLabelPosition(TickLabelPositionEnum tickLabelPosition) {
    this.tickLabelPosition = tickLabelPosition;
    return this;
  }

   /**
   * The position of tick-mark labels on the specified axis.
   * @return tickLabelPosition
  **/
  @ApiModelProperty(required = true, value = "The position of tick-mark labels on the specified axis.")
  public TickLabelPositionEnum getTickLabelPosition() {
    return tickLabelPosition;
  }

  public void setTickLabelPosition(TickLabelPositionEnum tickLabelPosition) {
    this.tickLabelPosition = tickLabelPosition;
  }

  public Axis tickLabelRotationAngle(Double tickLabelRotationAngle) {
    this.tickLabelRotationAngle = tickLabelRotationAngle;
    return this;
  }

   /**
   * Represents the rotation angle of tick labels.
   * @return tickLabelRotationAngle
  **/
  @ApiModelProperty(required = true, value = "Represents the rotation angle of tick labels.")
  public Double getTickLabelRotationAngle() {
    return tickLabelRotationAngle;
  }

  public void setTickLabelRotationAngle(Double tickLabelRotationAngle) {
    this.tickLabelRotationAngle = tickLabelRotationAngle;
  }

  public Axis fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Get or sets the fill format.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Get or sets the fill format.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public Axis effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Get or sets the effect format.
   * @return effectFormat
  **/
  @ApiModelProperty(value = "Get or sets the effect format.")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public Axis lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Get or sets the line format.
   * @return lineFormat
  **/
  @ApiModelProperty(value = "Get or sets the line format.")
  public LineFormat getLineFormat() {
    return lineFormat;
  }

  public void setLineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Axis axis = (Axis) o;
    return true && Objects.equals(this.isVisible, axis.isVisible) && Objects.equals(this.hasTitle, axis.hasTitle) && Objects.equals(this.position, axis.position) && Objects.equals(this.displayUnit, axis.displayUnit) && Objects.equals(this.baseUnitScale, axis.baseUnitScale) && Objects.equals(this.isAutomaticMajorUnit, axis.isAutomaticMajorUnit) && Objects.equals(this.majorUnit, axis.majorUnit) && Objects.equals(this.majorUnitScale, axis.majorUnitScale) && Objects.equals(this.majorTickMark, axis.majorTickMark) && Objects.equals(this.isAutomaticMinorUnit, axis.isAutomaticMinorUnit) && Objects.equals(this.minorUnit, axis.minorUnit) && Objects.equals(this.minorUnitScale, axis.minorUnitScale) && Objects.equals(this.minorTickMark, axis.minorTickMark) && Objects.equals(this.isAutomaticMaxValue, axis.isAutomaticMaxValue) && Objects.equals(this.maxValue, axis.maxValue) && Objects.equals(this.isAutomaticMinValue, axis.isAutomaticMinValue) && Objects.equals(this.minValue, axis.minValue) && Objects.equals(this.isLogarithmic, axis.isLogarithmic) && Objects.equals(this.logBase, axis.logBase) && Objects.equals(this.categoryAxisType, axis.categoryAxisType) && Objects.equals(this.axisBetweenCategories, axis.axisBetweenCategories) && Objects.equals(this.labelOffset, axis.labelOffset) && Objects.equals(this.isPlotOrderReversed, axis.isPlotOrderReversed) && Objects.equals(this.isNumberFormatLinkedToSource, axis.isNumberFormatLinkedToSource) && Objects.equals(this.numberFormat, axis.numberFormat) && Objects.equals(this.crossType, axis.crossType) && Objects.equals(this.crossAt, axis.crossAt) && Objects.equals(this.isAutomaticTickMarksSpacing, axis.isAutomaticTickMarksSpacing) && Objects.equals(this.tickMarksSpacing, axis.tickMarksSpacing) && Objects.equals(this.isAutomaticTickLabelSpacing, axis.isAutomaticTickLabelSpacing) && Objects.equals(this.tickLabelSpacing, axis.tickLabelSpacing) && Objects.equals(this.tickLabelPosition, axis.tickLabelPosition) && Objects.equals(this.tickLabelRotationAngle, axis.tickLabelRotationAngle) && Objects.equals(this.fillFormat, axis.fillFormat) && Objects.equals(this.effectFormat, axis.effectFormat) && Objects.equals(this.lineFormat, axis.lineFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isVisible, hasTitle, position, displayUnit, baseUnitScale, isAutomaticMajorUnit, majorUnit, majorUnitScale, majorTickMark, isAutomaticMinorUnit, minorUnit, minorUnitScale, minorTickMark, isAutomaticMaxValue, maxValue, isAutomaticMinValue, minValue, isLogarithmic, logBase, categoryAxisType, axisBetweenCategories, labelOffset, isPlotOrderReversed, isNumberFormatLinkedToSource, numberFormat, crossType, crossAt, isAutomaticTickMarksSpacing, tickMarksSpacing, isAutomaticTickLabelSpacing, tickLabelSpacing, tickLabelPosition, tickLabelRotationAngle, fillFormat, effectFormat, lineFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Axis {\n");
    
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    hasTitle: ").append(toIndentedString(hasTitle)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    displayUnit: ").append(toIndentedString(displayUnit)).append("\n");
    sb.append("    baseUnitScale: ").append(toIndentedString(baseUnitScale)).append("\n");
    sb.append("    isAutomaticMajorUnit: ").append(toIndentedString(isAutomaticMajorUnit)).append("\n");
    sb.append("    majorUnit: ").append(toIndentedString(majorUnit)).append("\n");
    sb.append("    majorUnitScale: ").append(toIndentedString(majorUnitScale)).append("\n");
    sb.append("    majorTickMark: ").append(toIndentedString(majorTickMark)).append("\n");
    sb.append("    isAutomaticMinorUnit: ").append(toIndentedString(isAutomaticMinorUnit)).append("\n");
    sb.append("    minorUnit: ").append(toIndentedString(minorUnit)).append("\n");
    sb.append("    minorUnitScale: ").append(toIndentedString(minorUnitScale)).append("\n");
    sb.append("    minorTickMark: ").append(toIndentedString(minorTickMark)).append("\n");
    sb.append("    isAutomaticMaxValue: ").append(toIndentedString(isAutomaticMaxValue)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    isAutomaticMinValue: ").append(toIndentedString(isAutomaticMinValue)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    isLogarithmic: ").append(toIndentedString(isLogarithmic)).append("\n");
    sb.append("    logBase: ").append(toIndentedString(logBase)).append("\n");
    sb.append("    categoryAxisType: ").append(toIndentedString(categoryAxisType)).append("\n");
    sb.append("    axisBetweenCategories: ").append(toIndentedString(axisBetweenCategories)).append("\n");
    sb.append("    labelOffset: ").append(toIndentedString(labelOffset)).append("\n");
    sb.append("    isPlotOrderReversed: ").append(toIndentedString(isPlotOrderReversed)).append("\n");
    sb.append("    isNumberFormatLinkedToSource: ").append(toIndentedString(isNumberFormatLinkedToSource)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
    sb.append("    crossType: ").append(toIndentedString(crossType)).append("\n");
    sb.append("    crossAt: ").append(toIndentedString(crossAt)).append("\n");
    sb.append("    isAutomaticTickMarksSpacing: ").append(toIndentedString(isAutomaticTickMarksSpacing)).append("\n");
    sb.append("    tickMarksSpacing: ").append(toIndentedString(tickMarksSpacing)).append("\n");
    sb.append("    isAutomaticTickLabelSpacing: ").append(toIndentedString(isAutomaticTickLabelSpacing)).append("\n");
    sb.append("    tickLabelSpacing: ").append(toIndentedString(tickLabelSpacing)).append("\n");
    sb.append("    tickLabelPosition: ").append(toIndentedString(tickLabelPosition)).append("\n");
    sb.append("    tickLabelRotationAngle: ").append(toIndentedString(tickLabelRotationAngle)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    effectFormat: ").append(toIndentedString(effectFormat)).append("\n");
    sb.append("    lineFormat: ").append(toIndentedString(lineFormat)).append("\n");
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
