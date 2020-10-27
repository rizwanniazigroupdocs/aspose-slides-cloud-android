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
import com.aspose.slides.model.TableColumn;
import com.aspose.slides.model.TableRow;
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
 * Represents Table shape resource.
 */
@ApiModel(description = "Represents Table shape resource.")
public class Table extends ShapeBase {
  /**
   * Builtin table style.
   */
  @JsonAdapter(StyleEnum.Adapter.class)
  public enum StyleEnum {
    NONE("None"),
    
    MEDIUMSTYLE2ACCENT1("MediumStyle2Accent1"),
    
    MEDIUMSTYLE2("MediumStyle2"),
    
    NOSTYLENOGRID("NoStyleNoGrid"),
    
    THEMEDSTYLE1ACCENT1("ThemedStyle1Accent1"),
    
    THEMEDSTYLE1ACCENT2("ThemedStyle1Accent2"),
    
    THEMEDSTYLE1ACCENT3("ThemedStyle1Accent3"),
    
    THEMEDSTYLE1ACCENT4("ThemedStyle1Accent4"),
    
    THEMEDSTYLE1ACCENT5("ThemedStyle1Accent5"),
    
    THEMEDSTYLE1ACCENT6("ThemedStyle1Accent6"),
    
    NOSTYLETABLEGRID("NoStyleTableGrid"),
    
    THEMEDSTYLE2ACCENT1("ThemedStyle2Accent1"),
    
    THEMEDSTYLE2ACCENT2("ThemedStyle2Accent2"),
    
    THEMEDSTYLE2ACCENT3("ThemedStyle2Accent3"),
    
    THEMEDSTYLE2ACCENT4("ThemedStyle2Accent4"),
    
    THEMEDSTYLE2ACCENT5("ThemedStyle2Accent5"),
    
    THEMEDSTYLE2ACCENT6("ThemedStyle2Accent6"),
    
    LIGHTSTYLE1("LightStyle1"),
    
    LIGHTSTYLE1ACCENT1("LightStyle1Accent1"),
    
    LIGHTSTYLE1ACCENT2("LightStyle1Accent2"),
    
    LIGHTSTYLE1ACCENT3("LightStyle1Accent3"),
    
    LIGHTSTYLE1ACCENT4("LightStyle1Accent4"),
    
    LIGHTSTYLE2ACCENT5("LightStyle2Accent5"),
    
    LIGHTSTYLE1ACCENT6("LightStyle1Accent6"),
    
    LIGHTSTYLE2("LightStyle2"),
    
    LIGHTSTYLE2ACCENT1("LightStyle2Accent1"),
    
    LIGHTSTYLE2ACCENT2("LightStyle2Accent2"),
    
    LIGHTSTYLE2ACCENT3("LightStyle2Accent3"),
    
    MEDIUMSTYLE2ACCENT3("MediumStyle2Accent3"),
    
    MEDIUMSTYLE2ACCENT4("MediumStyle2Accent4"),
    
    MEDIUMSTYLE2ACCENT5("MediumStyle2Accent5"),
    
    LIGHTSTYLE2ACCENT6("LightStyle2Accent6"),
    
    LIGHTSTYLE2ACCENT4("LightStyle2Accent4"),
    
    LIGHTSTYLE3("LightStyle3"),
    
    LIGHTSTYLE3ACCENT1("LightStyle3Accent1"),
    
    MEDIUMSTYLE2ACCENT2("MediumStyle2Accent2"),
    
    LIGHTSTYLE3ACCENT2("LightStyle3Accent2"),
    
    LIGHTSTYLE3ACCENT3("LightStyle3Accent3"),
    
    LIGHTSTYLE3ACCENT4("LightStyle3Accent4"),
    
    LIGHTSTYLE3ACCENT5("LightStyle3Accent5"),
    
    LIGHTSTYLE3ACCENT6("LightStyle3Accent6"),
    
    MEDIUMSTYLE1("MediumStyle1"),
    
    MEDIUMSTYLE1ACCENT1("MediumStyle1Accent1"),
    
    MEDIUMSTYLE1ACCENT2("MediumStyle1Accent2"),
    
    MEDIUMSTYLE1ACCENT3("MediumStyle1Accent3"),
    
    MEDIUMSTYLE1ACCENT4("MediumStyle1Accent4"),
    
    MEDIUMSTYLE1ACCENT5("MediumStyle1Accent5"),
    
    MEDIUMSTYLE1ACCENT6("MediumStyle1Accent6"),
    
    MEDIUMSTYLE2ACCENT6("MediumStyle2Accent6"),
    
    MEDIUMSTYLE3("MediumStyle3"),
    
    MEDIUMSTYLE3ACCENT1("MediumStyle3Accent1"),
    
    MEDIUMSTYLE3ACCENT2("MediumStyle3Accent2"),
    
    MEDIUMSTYLE3ACCENT3("MediumStyle3Accent3"),
    
    MEDIUMSTYLE3ACCENT4("MediumStyle3Accent4"),
    
    MEDIUMSTYLE3ACCENT5("MediumStyle3Accent5"),
    
    MEDIUMSTYLE3ACCENT6("MediumStyle3Accent6"),
    
    MEDIUMSTYLE4("MediumStyle4"),
    
    MEDIUMSTYLE4ACCENT1("MediumStyle4Accent1"),
    
    MEDIUMSTYLE4ACCENT2("MediumStyle4Accent2"),
    
    MEDIUMSTYLE4ACCENT3("MediumStyle4Accent3"),
    
    MEDIUMSTYLE4ACCENT4("MediumStyle4Accent4"),
    
    MEDIUMSTYLE4ACCENT5("MediumStyle4Accent5"),
    
    MEDIUMSTYLE4ACCENT6("MediumStyle4Accent6"),
    
    DARKSTYLE1("DarkStyle1"),
    
    DARKSTYLE1ACCENT1("DarkStyle1Accent1"),
    
    DARKSTYLE1ACCENT2("DarkStyle1Accent2"),
    
    DARKSTYLE1ACCENT3("DarkStyle1Accent3"),
    
    DARKSTYLE1ACCENT4("DarkStyle1Accent4"),
    
    DARKSTYLE1ACCENT5("DarkStyle1Accent5"),
    
    DARKSTYLE1ACCENT6("DarkStyle1Accent6"),
    
    DARKSTYLE2("DarkStyle2"),
    
    DARKSTYLE2ACCENT1ACCENT2("DarkStyle2Accent1Accent2"),
    
    DARKSTYLE2ACCENT3ACCENT4("DarkStyle2Accent3Accent4"),
    
    DARKSTYLE2ACCENT5ACCENT6("DarkStyle2Accent5Accent6"),
    
    LIGHTSTYLE1ACCENT5("LightStyle1Accent5"),
    
    CUSTOM("Custom");

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

  @SerializedName(value = "rows", alternate = { "Rows" })
  private List<TableRow> rows = null;

  @SerializedName(value = "columns", alternate = { "Columns" })
  private List<TableColumn> columns = null;

  @SerializedName(value = "firstCol", alternate = { "FirstCol" })
  private Boolean firstCol;

  @SerializedName(value = "firstRow", alternate = { "FirstRow" })
  private Boolean firstRow;

  @SerializedName(value = "horizontalBanding", alternate = { "HorizontalBanding" })
  private Boolean horizontalBanding;

  @SerializedName(value = "lastCol", alternate = { "LastCol" })
  private Boolean lastCol;

  @SerializedName(value = "lastRow", alternate = { "LastRow" })
  private Boolean lastRow;

  @SerializedName(value = "rightToLeft", alternate = { "RightToLeft" })
  private Boolean rightToLeft;

  @SerializedName(value = "verticalBanding", alternate = { "VerticalBanding" })
  private Boolean verticalBanding;


  public Table() {
    super();
    setType(TypeEnum.TABLE);
  }

  public Table style(StyleEnum style) {
    this.style = style;
    return this;
  }

   /**
   * Builtin table style.
   * @return style
  **/
  @ApiModelProperty(value = "Builtin table style.")
  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public Table rows(List<TableRow> rows) {
    this.rows = rows;
    return this;
  }

  public Table addRowsItem(TableRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<TableRow>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Rows.
   * @return rows
  **/
  @ApiModelProperty(value = "Rows.")
  public List<TableRow> getRows() {
    return rows;
  }

  public void setRows(List<TableRow> rows) {
    this.rows = rows;
  }

  public Table columns(List<TableColumn> columns) {
    this.columns = columns;
    return this;
  }

  public Table addColumnsItem(TableColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<TableColumn>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns.
   * @return columns
  **/
  @ApiModelProperty(value = "Columns.")
  public List<TableColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<TableColumn> columns) {
    this.columns = columns;
  }

  public Table firstCol(Boolean firstCol) {
    this.firstCol = firstCol;
    return this;
  }

   /**
   * Determines whether the first column of a table has to be drawn with a special formatting.
   * @return firstCol
  **/
  @ApiModelProperty(value = "Determines whether the first column of a table has to be drawn with a special formatting.")
  public Boolean isFirstCol() {
    return firstCol;
  }

  public void setFirstCol(Boolean firstCol) {
    this.firstCol = firstCol;
  }

  public Table firstRow(Boolean firstRow) {
    this.firstRow = firstRow;
    return this;
  }

   /**
   * Determines whether the first row of a table has to be drawn with a special formatting.
   * @return firstRow
  **/
  @ApiModelProperty(value = "Determines whether the first row of a table has to be drawn with a special formatting.")
  public Boolean isFirstRow() {
    return firstRow;
  }

  public void setFirstRow(Boolean firstRow) {
    this.firstRow = firstRow;
  }

  public Table horizontalBanding(Boolean horizontalBanding) {
    this.horizontalBanding = horizontalBanding;
    return this;
  }

   /**
   * Determines whether the even rows has to be drawn with a different formatting.
   * @return horizontalBanding
  **/
  @ApiModelProperty(value = "Determines whether the even rows has to be drawn with a different formatting.")
  public Boolean isHorizontalBanding() {
    return horizontalBanding;
  }

  public void setHorizontalBanding(Boolean horizontalBanding) {
    this.horizontalBanding = horizontalBanding;
  }

  public Table lastCol(Boolean lastCol) {
    this.lastCol = lastCol;
    return this;
  }

   /**
   * Determines whether the last column of a table has to be drawn with a special formatting.
   * @return lastCol
  **/
  @ApiModelProperty(value = "Determines whether the last column of a table has to be drawn with a special formatting.")
  public Boolean isLastCol() {
    return lastCol;
  }

  public void setLastCol(Boolean lastCol) {
    this.lastCol = lastCol;
  }

  public Table lastRow(Boolean lastRow) {
    this.lastRow = lastRow;
    return this;
  }

   /**
   * Determines whether the last row of a table has to be drawn with a special formatting.
   * @return lastRow
  **/
  @ApiModelProperty(value = "Determines whether the last row of a table has to be drawn with a special formatting.")
  public Boolean isLastRow() {
    return lastRow;
  }

  public void setLastRow(Boolean lastRow) {
    this.lastRow = lastRow;
  }

  public Table rightToLeft(Boolean rightToLeft) {
    this.rightToLeft = rightToLeft;
    return this;
  }

   /**
   * Determines whether the table has right to left reading order.
   * @return rightToLeft
  **/
  @ApiModelProperty(value = "Determines whether the table has right to left reading order.")
  public Boolean isRightToLeft() {
    return rightToLeft;
  }

  public void setRightToLeft(Boolean rightToLeft) {
    this.rightToLeft = rightToLeft;
  }

  public Table verticalBanding(Boolean verticalBanding) {
    this.verticalBanding = verticalBanding;
    return this;
  }

   /**
   * Determines whether the even columns has to be drawn with a different formatting.
   * @return verticalBanding
  **/
  @ApiModelProperty(value = "Determines whether the even columns has to be drawn with a different formatting.")
  public Boolean isVerticalBanding() {
    return verticalBanding;
  }

  public void setVerticalBanding(Boolean verticalBanding) {
    this.verticalBanding = verticalBanding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Table table = (Table) o;
    return true && Objects.equals(this.style, table.style) && Objects.equals(this.rows, table.rows) && Objects.equals(this.columns, table.columns) && Objects.equals(this.firstCol, table.firstCol) && Objects.equals(this.firstRow, table.firstRow) && Objects.equals(this.horizontalBanding, table.horizontalBanding) && Objects.equals(this.lastCol, table.lastCol) && Objects.equals(this.lastRow, table.lastRow) && Objects.equals(this.rightToLeft, table.rightToLeft) && Objects.equals(this.verticalBanding, table.verticalBanding) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(style, rows, columns, firstCol, firstRow, horizontalBanding, lastCol, lastRow, rightToLeft, verticalBanding, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    firstCol: ").append(toIndentedString(firstCol)).append("\n");
    sb.append("    firstRow: ").append(toIndentedString(firstRow)).append("\n");
    sb.append("    horizontalBanding: ").append(toIndentedString(horizontalBanding)).append("\n");
    sb.append("    lastCol: ").append(toIndentedString(lastCol)).append("\n");
    sb.append("    lastRow: ").append(toIndentedString(lastRow)).append("\n");
    sb.append("    rightToLeft: ").append(toIndentedString(rightToLeft)).append("\n");
    sb.append("    verticalBanding: ").append(toIndentedString(verticalBanding)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.TABLE);
  }
}
