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
 * Represents one cell of table.
 */
@ApiModel(description = "Represents one cell of table.")
public class TableCell {
  @SerializedName(value = "text", alternate = { "Text" })
  private String text;

  @SerializedName(value = "rowSpan", alternate = { "RowSpan" })
  private Integer rowSpan;

  @SerializedName(value = "colSpan", alternate = { "ColSpan" })
  private Integer colSpan;

  @SerializedName(value = "marginTop", alternate = { "MarginTop" })
  private Double marginTop;

  @SerializedName(value = "marginRight", alternate = { "MarginRight" })
  private Double marginRight;

  @SerializedName(value = "marginLeft", alternate = { "MarginLeft" })
  private Double marginLeft;

  @SerializedName(value = "marginBottom", alternate = { "MarginBottom" })
  private Double marginBottom;

  /**
   * Text anchor type.
   */
  @JsonAdapter(TextAnchorTypeEnum.Adapter.class)
  public enum TextAnchorTypeEnum {
    TOP("Top"),
    
    CENTER("Center"),
    
    BOTTOM("Bottom"),
    
    JUSTIFIED("Justified"),
    
    DISTRIBUTED("Distributed"),
    
    NOTDEFINED("NotDefined");

    private String value;

    TextAnchorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextAnchorTypeEnum fromValue(String text) {
      for (TextAnchorTypeEnum b : TextAnchorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextAnchorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextAnchorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextAnchorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextAnchorTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "textAnchorType", alternate = { "TextAnchorType" })
  private TextAnchorTypeEnum textAnchorType;

  /**
   * The type of vertical text.
   */
  @JsonAdapter(TextVerticalTypeEnum.Adapter.class)
  public enum TextVerticalTypeEnum {
    HORIZONTAL("Horizontal"),
    
    VERTICAL("Vertical"),
    
    VERTICAL270("Vertical270"),
    
    WORDARTVERTICAL("WordArtVertical"),
    
    EASTASIANVERTICAL("EastAsianVertical"),
    
    MONGOLIANVERTICAL("MongolianVertical"),
    
    WORDARTVERTICALRIGHTTOLEFT("WordArtVerticalRightToLeft"),
    
    NOTDEFINED("NotDefined");

    private String value;

    TextVerticalTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextVerticalTypeEnum fromValue(String text) {
      for (TextVerticalTypeEnum b : TextVerticalTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextVerticalTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextVerticalTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextVerticalTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextVerticalTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "textVerticalType", alternate = { "TextVerticalType" })
  private TextVerticalTypeEnum textVerticalType;

  @SerializedName(value = "fillFormat", alternate = { "FillFormat" })
  private FillFormat fillFormat;

  @SerializedName(value = "borderTop", alternate = { "BorderTop" })
  private LineFormat borderTop;

  @SerializedName(value = "borderRight", alternate = { "BorderRight" })
  private LineFormat borderRight;

  @SerializedName(value = "borderLeft", alternate = { "BorderLeft" })
  private LineFormat borderLeft;

  @SerializedName(value = "borderBottom", alternate = { "BorderBottom" })
  private LineFormat borderBottom;

  @SerializedName(value = "borderDiagonalUp", alternate = { "BorderDiagonalUp" })
  private LineFormat borderDiagonalUp;

  @SerializedName(value = "borderDiagonalDown", alternate = { "BorderDiagonalDown" })
  private LineFormat borderDiagonalDown;


  public TableCell() {
    super();
  }

  public TableCell text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Cell text.
   * @return text
  **/
  @ApiModelProperty(value = "Cell text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TableCell rowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
    return this;
  }

   /**
   * The number of rows spanned by a merged cell.
   * @return rowSpan
  **/
  @ApiModelProperty(required = true, value = "The number of rows spanned by a merged cell.")
  public Integer getRowSpan() {
    return rowSpan;
  }

  public void setRowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
  }

  public TableCell colSpan(Integer colSpan) {
    this.colSpan = colSpan;
    return this;
  }

   /**
   * The number of columns spanned by a merged cell.
   * @return colSpan
  **/
  @ApiModelProperty(required = true, value = "The number of columns spanned by a merged cell.")
  public Integer getColSpan() {
    return colSpan;
  }

  public void setColSpan(Integer colSpan) {
    this.colSpan = colSpan;
  }

  public TableCell marginTop(Double marginTop) {
    this.marginTop = marginTop;
    return this;
  }

   /**
   * The top margin of the cell.
   * @return marginTop
  **/
  @ApiModelProperty(required = true, value = "The top margin of the cell.")
  public Double getMarginTop() {
    return marginTop;
  }

  public void setMarginTop(Double marginTop) {
    this.marginTop = marginTop;
  }

  public TableCell marginRight(Double marginRight) {
    this.marginRight = marginRight;
    return this;
  }

   /**
   * The right margin of the cell.
   * @return marginRight
  **/
  @ApiModelProperty(required = true, value = "The right margin of the cell.")
  public Double getMarginRight() {
    return marginRight;
  }

  public void setMarginRight(Double marginRight) {
    this.marginRight = marginRight;
  }

  public TableCell marginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

   /**
   * The left margin of the cell.
   * @return marginLeft
  **/
  @ApiModelProperty(required = true, value = "The left margin of the cell.")
  public Double getMarginLeft() {
    return marginLeft;
  }

  public void setMarginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
  }

  public TableCell marginBottom(Double marginBottom) {
    this.marginBottom = marginBottom;
    return this;
  }

   /**
   * The bottom margin of the cell.
   * @return marginBottom
  **/
  @ApiModelProperty(required = true, value = "The bottom margin of the cell.")
  public Double getMarginBottom() {
    return marginBottom;
  }

  public void setMarginBottom(Double marginBottom) {
    this.marginBottom = marginBottom;
  }

  public TableCell textAnchorType(TextAnchorTypeEnum textAnchorType) {
    this.textAnchorType = textAnchorType;
    return this;
  }

   /**
   * Text anchor type.
   * @return textAnchorType
  **/
  @ApiModelProperty(required = true, value = "Text anchor type.")
  public TextAnchorTypeEnum getTextAnchorType() {
    return textAnchorType;
  }

  public void setTextAnchorType(TextAnchorTypeEnum textAnchorType) {
    this.textAnchorType = textAnchorType;
  }

  public TableCell textVerticalType(TextVerticalTypeEnum textVerticalType) {
    this.textVerticalType = textVerticalType;
    return this;
  }

   /**
   * The type of vertical text.
   * @return textVerticalType
  **/
  @ApiModelProperty(required = true, value = "The type of vertical text.")
  public TextVerticalTypeEnum getTextVerticalType() {
    return textVerticalType;
  }

  public void setTextVerticalType(TextVerticalTypeEnum textVerticalType) {
    this.textVerticalType = textVerticalType;
  }

  public TableCell fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Fill properties set of the cell.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Fill properties set of the cell.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public TableCell borderTop(LineFormat borderTop) {
    this.borderTop = borderTop;
    return this;
  }

   /**
   * Line properties set for the top border of the cell.
   * @return borderTop
  **/
  @ApiModelProperty(value = "Line properties set for the top border of the cell.")
  public LineFormat getBorderTop() {
    return borderTop;
  }

  public void setBorderTop(LineFormat borderTop) {
    this.borderTop = borderTop;
  }

  public TableCell borderRight(LineFormat borderRight) {
    this.borderRight = borderRight;
    return this;
  }

   /**
   * Line properties set for the right border of the cell.
   * @return borderRight
  **/
  @ApiModelProperty(value = "Line properties set for the right border of the cell.")
  public LineFormat getBorderRight() {
    return borderRight;
  }

  public void setBorderRight(LineFormat borderRight) {
    this.borderRight = borderRight;
  }

  public TableCell borderLeft(LineFormat borderLeft) {
    this.borderLeft = borderLeft;
    return this;
  }

   /**
   * Line properties set for the left border of the cell.
   * @return borderLeft
  **/
  @ApiModelProperty(value = "Line properties set for the left border of the cell.")
  public LineFormat getBorderLeft() {
    return borderLeft;
  }

  public void setBorderLeft(LineFormat borderLeft) {
    this.borderLeft = borderLeft;
  }

  public TableCell borderBottom(LineFormat borderBottom) {
    this.borderBottom = borderBottom;
    return this;
  }

   /**
   * Line properties set for the bottom border of the cell.
   * @return borderBottom
  **/
  @ApiModelProperty(value = "Line properties set for the bottom border of the cell.")
  public LineFormat getBorderBottom() {
    return borderBottom;
  }

  public void setBorderBottom(LineFormat borderBottom) {
    this.borderBottom = borderBottom;
  }

  public TableCell borderDiagonalUp(LineFormat borderDiagonalUp) {
    this.borderDiagonalUp = borderDiagonalUp;
    return this;
  }

   /**
   * Line properties set for the diagonal up border of the cell.
   * @return borderDiagonalUp
  **/
  @ApiModelProperty(value = "Line properties set for the diagonal up border of the cell.")
  public LineFormat getBorderDiagonalUp() {
    return borderDiagonalUp;
  }

  public void setBorderDiagonalUp(LineFormat borderDiagonalUp) {
    this.borderDiagonalUp = borderDiagonalUp;
  }

  public TableCell borderDiagonalDown(LineFormat borderDiagonalDown) {
    this.borderDiagonalDown = borderDiagonalDown;
    return this;
  }

   /**
   * Line properties set for the diagonal down border of the cell.
   * @return borderDiagonalDown
  **/
  @ApiModelProperty(value = "Line properties set for the diagonal down border of the cell.")
  public LineFormat getBorderDiagonalDown() {
    return borderDiagonalDown;
  }

  public void setBorderDiagonalDown(LineFormat borderDiagonalDown) {
    this.borderDiagonalDown = borderDiagonalDown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableCell tableCell = (TableCell) o;
    return true && Objects.equals(this.text, tableCell.text) && Objects.equals(this.rowSpan, tableCell.rowSpan) && Objects.equals(this.colSpan, tableCell.colSpan) && Objects.equals(this.marginTop, tableCell.marginTop) && Objects.equals(this.marginRight, tableCell.marginRight) && Objects.equals(this.marginLeft, tableCell.marginLeft) && Objects.equals(this.marginBottom, tableCell.marginBottom) && Objects.equals(this.textAnchorType, tableCell.textAnchorType) && Objects.equals(this.textVerticalType, tableCell.textVerticalType) && Objects.equals(this.fillFormat, tableCell.fillFormat) && Objects.equals(this.borderTop, tableCell.borderTop) && Objects.equals(this.borderRight, tableCell.borderRight) && Objects.equals(this.borderLeft, tableCell.borderLeft) && Objects.equals(this.borderBottom, tableCell.borderBottom) && Objects.equals(this.borderDiagonalUp, tableCell.borderDiagonalUp) && Objects.equals(this.borderDiagonalDown, tableCell.borderDiagonalDown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, rowSpan, colSpan, marginTop, marginRight, marginLeft, marginBottom, textAnchorType, textVerticalType, fillFormat, borderTop, borderRight, borderLeft, borderBottom, borderDiagonalUp, borderDiagonalDown);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableCell {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    rowSpan: ").append(toIndentedString(rowSpan)).append("\n");
    sb.append("    colSpan: ").append(toIndentedString(colSpan)).append("\n");
    sb.append("    marginTop: ").append(toIndentedString(marginTop)).append("\n");
    sb.append("    marginRight: ").append(toIndentedString(marginRight)).append("\n");
    sb.append("    marginLeft: ").append(toIndentedString(marginLeft)).append("\n");
    sb.append("    marginBottom: ").append(toIndentedString(marginBottom)).append("\n");
    sb.append("    textAnchorType: ").append(toIndentedString(textAnchorType)).append("\n");
    sb.append("    textVerticalType: ").append(toIndentedString(textVerticalType)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    borderTop: ").append(toIndentedString(borderTop)).append("\n");
    sb.append("    borderRight: ").append(toIndentedString(borderRight)).append("\n");
    sb.append("    borderLeft: ").append(toIndentedString(borderLeft)).append("\n");
    sb.append("    borderBottom: ").append(toIndentedString(borderBottom)).append("\n");
    sb.append("    borderDiagonalUp: ").append(toIndentedString(borderDiagonalUp)).append("\n");
    sb.append("    borderDiagonalDown: ").append(toIndentedString(borderDiagonalDown)).append("\n");
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
