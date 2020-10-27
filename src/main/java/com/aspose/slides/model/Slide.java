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
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Presentation slide.
 */
@ApiModel(description = "Presentation slide.")
public class Slide extends ResourceBase {
  @SerializedName(value = "width", alternate = { "Width" })
  private Double width;

  @SerializedName(value = "height", alternate = { "Height" })
  private Double height;

  @SerializedName(value = "showMasterShapes", alternate = { "ShowMasterShapes" })
  private Boolean showMasterShapes;

  @SerializedName(value = "layoutSlide", alternate = { "LayoutSlide" })
  private ResourceUri layoutSlide;

  @SerializedName(value = "shapes", alternate = { "Shapes" })
  private ResourceUri shapes;

  @SerializedName(value = "theme", alternate = { "Theme" })
  private ResourceUri theme;

  @SerializedName(value = "placeholders", alternate = { "Placeholders" })
  private ResourceUri placeholders;

  @SerializedName(value = "images", alternate = { "Images" })
  private ResourceUri images;

  @SerializedName(value = "comments", alternate = { "Comments" })
  private ResourceUri comments;

  @SerializedName(value = "background", alternate = { "Background" })
  private ResourceUri background;

  @SerializedName(value = "notesSlide", alternate = { "NotesSlide" })
  private ResourceUri notesSlide;


  public Slide() {
    super();
  }

  public Slide width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets the width.
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the width.")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Slide height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets the height.
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the height.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Slide showMasterShapes(Boolean showMasterShapes) {
    this.showMasterShapes = showMasterShapes;
    return this;
  }

   /**
   * Specifies if shapes of the master slide should be shown on the slide. True by default.
   * @return showMasterShapes
  **/
  @ApiModelProperty(required = true, value = "Specifies if shapes of the master slide should be shown on the slide. True by default.")
  public Boolean isShowMasterShapes() {
    return showMasterShapes;
  }

  public void setShowMasterShapes(Boolean showMasterShapes) {
    this.showMasterShapes = showMasterShapes;
  }

  public Slide layoutSlide(ResourceUri layoutSlide) {
    this.layoutSlide = layoutSlide;
    return this;
  }

   /**
   * Gets or sets the  link to the layout slide.
   * @return layoutSlide
  **/
  @ApiModelProperty(value = "Gets or sets the  link to the layout slide.")
  public ResourceUri getLayoutSlide() {
    return layoutSlide;
  }

  public void setLayoutSlide(ResourceUri layoutSlide) {
    this.layoutSlide = layoutSlide;
  }

  public Slide shapes(ResourceUri shapes) {
    this.shapes = shapes;
    return this;
  }

   /**
   * Gets or sets the  link to list of top-level shapes.
   * @return shapes
  **/
  @ApiModelProperty(value = "Gets or sets the  link to list of top-level shapes.")
  public ResourceUri getShapes() {
    return shapes;
  }

  public void setShapes(ResourceUri shapes) {
    this.shapes = shapes;
  }

  public Slide theme(ResourceUri theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Gets or sets the link to theme.
   * @return theme
  **/
  @ApiModelProperty(value = "Gets or sets the link to theme.")
  public ResourceUri getTheme() {
    return theme;
  }

  public void setTheme(ResourceUri theme) {
    this.theme = theme;
  }

  public Slide placeholders(ResourceUri placeholders) {
    this.placeholders = placeholders;
    return this;
  }

   /**
   * Gets or sets the  link to placeholders.
   * @return placeholders
  **/
  @ApiModelProperty(value = "Gets or sets the  link to placeholders.")
  public ResourceUri getPlaceholders() {
    return placeholders;
  }

  public void setPlaceholders(ResourceUri placeholders) {
    this.placeholders = placeholders;
  }

  public Slide images(ResourceUri images) {
    this.images = images;
    return this;
  }

   /**
   * Gets or sets the link to images.
   * @return images
  **/
  @ApiModelProperty(value = "Gets or sets the link to images.")
  public ResourceUri getImages() {
    return images;
  }

  public void setImages(ResourceUri images) {
    this.images = images;
  }

  public Slide comments(ResourceUri comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Gets or sets the link to comments.
   * @return comments
  **/
  @ApiModelProperty(value = "Gets or sets the link to comments.")
  public ResourceUri getComments() {
    return comments;
  }

  public void setComments(ResourceUri comments) {
    this.comments = comments;
  }

  public Slide background(ResourceUri background) {
    this.background = background;
    return this;
  }

   /**
   * Get or sets the link to slide&#39;s background
   * @return background
  **/
  @ApiModelProperty(value = "Get or sets the link to slide's background")
  public ResourceUri getBackground() {
    return background;
  }

  public void setBackground(ResourceUri background) {
    this.background = background;
  }

  public Slide notesSlide(ResourceUri notesSlide) {
    this.notesSlide = notesSlide;
    return this;
  }

   /**
   * Get or sets the link to notes slide.
   * @return notesSlide
  **/
  @ApiModelProperty(value = "Get or sets the link to notes slide.")
  public ResourceUri getNotesSlide() {
    return notesSlide;
  }

  public void setNotesSlide(ResourceUri notesSlide) {
    this.notesSlide = notesSlide;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Slide slide = (Slide) o;
    return true && Objects.equals(this.width, slide.width) && Objects.equals(this.height, slide.height) && Objects.equals(this.showMasterShapes, slide.showMasterShapes) && Objects.equals(this.layoutSlide, slide.layoutSlide) && Objects.equals(this.shapes, slide.shapes) && Objects.equals(this.theme, slide.theme) && Objects.equals(this.placeholders, slide.placeholders) && Objects.equals(this.images, slide.images) && Objects.equals(this.comments, slide.comments) && Objects.equals(this.background, slide.background) && Objects.equals(this.notesSlide, slide.notesSlide) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, showMasterShapes, layoutSlide, shapes, theme, placeholders, images, comments, background, notesSlide, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Slide {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    showMasterShapes: ").append(toIndentedString(showMasterShapes)).append("\n");
    sb.append("    layoutSlide: ").append(toIndentedString(layoutSlide)).append("\n");
    sb.append("    shapes: ").append(toIndentedString(shapes)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    placeholders: ").append(toIndentedString(placeholders)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    notesSlide: ").append(toIndentedString(notesSlide)).append("\n");
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
