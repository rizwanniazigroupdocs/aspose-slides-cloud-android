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
import com.aspose.slides.model.TableCell;
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
 * Table Row.
 */
@ApiModel(description = "Table Row.")
public class TableRow {
  @SerializedName(value = "cells", alternate = { "Cells" })
  private List<TableCell> cells = null;

  @SerializedName(value = "minimalHeight", alternate = { "MinimalHeight" })
  private Double minimalHeight;

  @SerializedName(value = "height", alternate = { "Height" })
  private Double height;


  public TableRow() {
    super();
  }

  public TableRow cells(List<TableCell> cells) {
    this.cells = cells;
    return this;
  }

  public TableRow addCellsItem(TableCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<TableCell>();
    }
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Cells for the row.
   * @return cells
  **/
  @ApiModelProperty(value = "Cells for the row.")
  public List<TableCell> getCells() {
    return cells;
  }

  public void setCells(List<TableCell> cells) {
    this.cells = cells;
  }

  public TableRow minimalHeight(Double minimalHeight) {
    this.minimalHeight = minimalHeight;
    return this;
  }

   /**
   * Minimal height of the row.
   * @return minimalHeight
  **/
  @ApiModelProperty(required = true, value = "Minimal height of the row.")
  public Double getMinimalHeight() {
    return minimalHeight;
  }

  public void setMinimalHeight(Double minimalHeight) {
    this.minimalHeight = minimalHeight;
  }

  public TableRow height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the row.
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Height of the row.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRow tableRow = (TableRow) o;
    return true && Objects.equals(this.cells, tableRow.cells) && Objects.equals(this.minimalHeight, tableRow.minimalHeight) && Objects.equals(this.height, tableRow.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cells, minimalHeight, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRow {\n");
    
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    minimalHeight: ").append(toIndentedString(minimalHeight)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
