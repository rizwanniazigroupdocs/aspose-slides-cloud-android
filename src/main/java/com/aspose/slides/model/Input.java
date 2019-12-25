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
import com.aspose.slides.model.InputFile;
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
 * Represents input document for pipeline.
 */
@ApiModel(description = "Represents input document for pipeline.")
public class Input {
  @SerializedName(value = "template", alternate = { "Template" })
  private InputFile template;

  @SerializedName(value = "htmlData", alternate = { "HtmlData" })
  private InputFile htmlData;

  @SerializedName(value = "templateData", alternate = { "TemplateData" })
  private InputFile templateData;


  public Input() {
    super();
  }

  public Input template(InputFile template) {
    this.template = template;
    return this;
  }

   /**
   * Get or sets template document. If property is null new empty presentation will be created.
   * @return template
  **/
  @ApiModelProperty(value = "Get or sets template document. If property is null new empty presentation will be created.")
  public InputFile getTemplate() {
    return template;
  }

  public void setTemplate(InputFile template) {
    this.template = template;
  }

  public Input htmlData(InputFile htmlData) {
    this.htmlData = htmlData;
    return this;
  }

   /**
   * Get or sets html data for generate new presentation.
   * @return htmlData
  **/
  @ApiModelProperty(value = "Get or sets html data for generate new presentation.")
  public InputFile getHtmlData() {
    return htmlData;
  }

  public void setHtmlData(InputFile htmlData) {
    this.htmlData = htmlData;
  }

  public Input templateData(InputFile templateData) {
    this.templateData = templateData;
    return this;
  }

   /**
   * Get or sets data for template engine.
   * @return templateData
  **/
  @ApiModelProperty(value = "Get or sets data for template engine.")
  public InputFile getTemplateData() {
    return templateData;
  }

  public void setTemplateData(InputFile templateData) {
    this.templateData = templateData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input input = (Input) o;
    return true && Objects.equals(this.template, input.template) && Objects.equals(this.htmlData, input.htmlData) && Objects.equals(this.templateData, input.templateData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template, htmlData, templateData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    htmlData: ").append(toIndentedString(htmlData)).append("\n");
    sb.append("    templateData: ").append(toIndentedString(templateData)).append("\n");
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
