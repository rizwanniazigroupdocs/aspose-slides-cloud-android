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
 * Represents a series marker
 */
@ApiModel(description = "Represents a series marker")
public class SeriesMarker {
  @SerializedName(value = "size", alternate = { "Size" })
  private Integer size;

  /**
   * symbol
   */
  @JsonAdapter(SymbolEnum.Adapter.class)
  public enum SymbolEnum {
    CIRCLE("Circle"),
    
    DASH("Dash"),
    
    DIAMOND("Diamond"),
    
    DOT("Dot"),
    
    NONE("None"),
    
    PICTURE("Picture"),
    
    PLUS("Plus"),
    
    SQUARE("Square"),
    
    STAR("Star"),
    
    TRIANGLE("Triangle"),
    
    X("X"),
    
    NOTDEFINED("NotDefined");

    private String value;

    SymbolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SymbolEnum fromValue(String text) {
      for (SymbolEnum b : SymbolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SymbolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SymbolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SymbolEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SymbolEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "symbol", alternate = { "Symbol" })
  private SymbolEnum symbol;

  @SerializedName(value = "fillFormat", alternate = { "FillFormat" })
  private FillFormat fillFormat;

  @SerializedName(value = "effectFormat", alternate = { "EffectFormat" })
  private EffectFormat effectFormat;

  @SerializedName(value = "lineFormat", alternate = { "LineFormat" })
  private LineFormat lineFormat;


  public SeriesMarker() {
    super();
  }

  public SeriesMarker size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * size
   * @return size
  **/
  @ApiModelProperty(required = true, value = "size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public SeriesMarker symbol(SymbolEnum symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * symbol
   * @return symbol
  **/
  @ApiModelProperty(required = true, value = "symbol")
  public SymbolEnum getSymbol() {
    return symbol;
  }

  public void setSymbol(SymbolEnum symbol) {
    this.symbol = symbol;
  }

  public SeriesMarker fillFormat(FillFormat fillFormat) {
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

  public SeriesMarker effectFormat(EffectFormat effectFormat) {
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

  public SeriesMarker lineFormat(LineFormat lineFormat) {
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
    SeriesMarker seriesMarker = (SeriesMarker) o;
    return true && Objects.equals(this.size, seriesMarker.size) && Objects.equals(this.symbol, seriesMarker.symbol) && Objects.equals(this.fillFormat, seriesMarker.fillFormat) && Objects.equals(this.effectFormat, seriesMarker.effectFormat) && Objects.equals(this.lineFormat, seriesMarker.lineFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, symbol, fillFormat, effectFormat, lineFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesMarker {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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
