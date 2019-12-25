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
import com.aspose.slides.model.ExportOptions;
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
 * Provides options that control how a presentation is saved in PPTX format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in PPTX format.")
public class PptxExportOptions extends ExportOptions {
  /**
   * The conformance class to which the PresentationML document conforms. Read/write Conformance.
   */
  @JsonAdapter(ConformanceEnum.Adapter.class)
  public enum ConformanceEnum {
    ECMA376_2006("Ecma376_2006"),
    
    ISO29500_2008_TRANSITIONAL("Iso29500_2008_Transitional"),
    
    ISO29500_2008_STRICT("Iso29500_2008_Strict");

    private String value;

    ConformanceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConformanceEnum fromValue(String text) {
      for (ConformanceEnum b : ConformanceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConformanceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConformanceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConformanceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConformanceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "conformance", alternate = { "Conformance" })
  private ConformanceEnum conformance;


  public PptxExportOptions() {
    super();
    setFormat("PPTX");
  }

  public PptxExportOptions conformance(ConformanceEnum conformance) {
    this.conformance = conformance;
    return this;
  }

   /**
   * The conformance class to which the PresentationML document conforms. Read/write Conformance.
   * @return conformance
  **/
  @ApiModelProperty(required = true, value = "The conformance class to which the PresentationML document conforms. Read/write Conformance.")
  public ConformanceEnum getConformance() {
    return conformance;
  }

  public void setConformance(ConformanceEnum conformance) {
    this.conformance = conformance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PptxExportOptions pptxExportOptions = (PptxExportOptions) o;
    return true && Objects.equals(this.conformance, pptxExportOptions.conformance) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conformance, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PptxExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    conformance: ").append(toIndentedString(conformance)).append("\n");
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
