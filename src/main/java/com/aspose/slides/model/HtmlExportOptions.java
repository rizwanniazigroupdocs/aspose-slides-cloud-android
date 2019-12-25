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
 * Provides options that control how a presentation is saved in Html format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in Html format.")
public class HtmlExportOptions extends ExportOptions {
  @SerializedName(value = "saveAsZip", alternate = { "SaveAsZip" })
  private Boolean saveAsZip;

  @SerializedName(value = "subDirectoryName", alternate = { "SubDirectoryName" })
  private String subDirectoryName;

  @SerializedName(value = "showHiddenSlides", alternate = { "ShowHiddenSlides" })
  private Boolean showHiddenSlides;

  @SerializedName(value = "svgResponsiveLayout", alternate = { "SvgResponsiveLayout" })
  private Boolean svgResponsiveLayout;

  @SerializedName(value = "jpegQuality", alternate = { "JpegQuality" })
  private Integer jpegQuality;

  /**
   * Represents the pictures compression level
   */
  @JsonAdapter(PicturesCompressionEnum.Adapter.class)
  public enum PicturesCompressionEnum {
    DPI330("Dpi330"),
    
    DPI220("Dpi220"),
    
    DPI150("Dpi150"),
    
    DPI96("Dpi96"),
    
    DPI72("Dpi72"),
    
    DOCUMENTRESOLUTION("DocumentResolution");

    private String value;

    PicturesCompressionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PicturesCompressionEnum fromValue(String text) {
      for (PicturesCompressionEnum b : PicturesCompressionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PicturesCompressionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PicturesCompressionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PicturesCompressionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PicturesCompressionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "picturesCompression", alternate = { "PicturesCompression" })
  private PicturesCompressionEnum picturesCompression;

  @SerializedName(value = "deletePicturesCroppedAreas", alternate = { "DeletePicturesCroppedAreas" })
  private Boolean deletePicturesCroppedAreas;

  /**
   * Gets or sets the position of the notes on the page.
   */
  @JsonAdapter(NotesPositionEnum.Adapter.class)
  public enum NotesPositionEnum {
    NONE("None"),
    
    BOTTOMFULL("BottomFull"),
    
    BOTTOMTRUNCATED("BottomTruncated");

    private String value;

    NotesPositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotesPositionEnum fromValue(String text) {
      for (NotesPositionEnum b : NotesPositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NotesPositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotesPositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotesPositionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NotesPositionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "notesPosition", alternate = { "NotesPosition" })
  private NotesPositionEnum notesPosition;

  /**
   * Gets or sets the position of the comments on the page.
   */
  @JsonAdapter(CommentsPositionEnum.Adapter.class)
  public enum CommentsPositionEnum {
    NONE("None"),
    
    BOTTOM("Bottom"),
    
    RIGHT("Right");

    private String value;

    CommentsPositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommentsPositionEnum fromValue(String text) {
      for (CommentsPositionEnum b : CommentsPositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CommentsPositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommentsPositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommentsPositionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CommentsPositionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "commentsPosition", alternate = { "CommentsPosition" })
  private CommentsPositionEnum commentsPosition;

  @SerializedName(value = "commentsAreaWidth", alternate = { "CommentsAreaWidth" })
  private Integer commentsAreaWidth;

  @SerializedName(value = "commentsAreaColor", alternate = { "CommentsAreaColor" })
  private String commentsAreaColor;

  @SerializedName(value = "showCommentsByNoAuthor", alternate = { "ShowCommentsByNoAuthor" })
  private Boolean showCommentsByNoAuthor;


  public HtmlExportOptions() {
    super();
    setFormat("HTML");
  }

  public HtmlExportOptions saveAsZip(Boolean saveAsZip) {
    this.saveAsZip = saveAsZip;
    return this;
  }

   /**
   * Get or sets flag for save presentation as zip file
   * @return saveAsZip
  **/
  @ApiModelProperty(required = true, value = "Get or sets flag for save presentation as zip file")
  public Boolean isSaveAsZip() {
    return saveAsZip;
  }

  public void setSaveAsZip(Boolean saveAsZip) {
    this.saveAsZip = saveAsZip;
  }

  public HtmlExportOptions subDirectoryName(String subDirectoryName) {
    this.subDirectoryName = subDirectoryName;
    return this;
  }

   /**
   * Get or set name of subdirectory in zip-file for store external files
   * @return subDirectoryName
  **/
  @ApiModelProperty(value = "Get or set name of subdirectory in zip-file for store external files")
  public String getSubDirectoryName() {
    return subDirectoryName;
  }

  public void setSubDirectoryName(String subDirectoryName) {
    this.subDirectoryName = subDirectoryName;
  }

  public HtmlExportOptions showHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
    return this;
  }

   /**
   * Specifies whether the generated document should include hidden slides or not. Default is false. 
   * @return showHiddenSlides
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the generated document should include hidden slides or not. Default is false. ")
  public Boolean isShowHiddenSlides() {
    return showHiddenSlides;
  }

  public void setShowHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
  }

  public HtmlExportOptions svgResponsiveLayout(Boolean svgResponsiveLayout) {
    this.svgResponsiveLayout = svgResponsiveLayout;
    return this;
  }

   /**
   * True to make layout responsive by excluding width and height attributes from svg container.
   * @return svgResponsiveLayout
  **/
  @ApiModelProperty(required = true, value = "True to make layout responsive by excluding width and height attributes from svg container.")
  public Boolean isSvgResponsiveLayout() {
    return svgResponsiveLayout;
  }

  public void setSvgResponsiveLayout(Boolean svgResponsiveLayout) {
    this.svgResponsiveLayout = svgResponsiveLayout;
  }

  public HtmlExportOptions jpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
    return this;
  }

   /**
   * Returns or sets a value determining the quality of the JPEG images inside PDF document.
   * @return jpegQuality
  **/
  @ApiModelProperty(required = true, value = "Returns or sets a value determining the quality of the JPEG images inside PDF document.")
  public Integer getJpegQuality() {
    return jpegQuality;
  }

  public void setJpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
  }

  public HtmlExportOptions picturesCompression(PicturesCompressionEnum picturesCompression) {
    this.picturesCompression = picturesCompression;
    return this;
  }

   /**
   * Represents the pictures compression level
   * @return picturesCompression
  **/
  @ApiModelProperty(value = "Represents the pictures compression level")
  public PicturesCompressionEnum getPicturesCompression() {
    return picturesCompression;
  }

  public void setPicturesCompression(PicturesCompressionEnum picturesCompression) {
    this.picturesCompression = picturesCompression;
  }

  public HtmlExportOptions deletePicturesCroppedAreas(Boolean deletePicturesCroppedAreas) {
    this.deletePicturesCroppedAreas = deletePicturesCroppedAreas;
    return this;
  }

   /**
   * A boolean flag indicates if the cropped parts remain as part of the document. If true the cropped  parts will removed, if false they will be serialized in the document (which can possible lead to a  larger file)
   * @return deletePicturesCroppedAreas
  **/
  @ApiModelProperty(required = true, value = "A boolean flag indicates if the cropped parts remain as part of the document. If true the cropped  parts will removed, if false they will be serialized in the document (which can possible lead to a  larger file)")
  public Boolean isDeletePicturesCroppedAreas() {
    return deletePicturesCroppedAreas;
  }

  public void setDeletePicturesCroppedAreas(Boolean deletePicturesCroppedAreas) {
    this.deletePicturesCroppedAreas = deletePicturesCroppedAreas;
  }

  public HtmlExportOptions notesPosition(NotesPositionEnum notesPosition) {
    this.notesPosition = notesPosition;
    return this;
  }

   /**
   * Gets or sets the position of the notes on the page.
   * @return notesPosition
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the position of the notes on the page.")
  public NotesPositionEnum getNotesPosition() {
    return notesPosition;
  }

  public void setNotesPosition(NotesPositionEnum notesPosition) {
    this.notesPosition = notesPosition;
  }

  public HtmlExportOptions commentsPosition(CommentsPositionEnum commentsPosition) {
    this.commentsPosition = commentsPosition;
    return this;
  }

   /**
   * Gets or sets the position of the comments on the page.
   * @return commentsPosition
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the position of the comments on the page.")
  public CommentsPositionEnum getCommentsPosition() {
    return commentsPosition;
  }

  public void setCommentsPosition(CommentsPositionEnum commentsPosition) {
    this.commentsPosition = commentsPosition;
  }

  public HtmlExportOptions commentsAreaWidth(Integer commentsAreaWidth) {
    this.commentsAreaWidth = commentsAreaWidth;
    return this;
  }

   /**
   * Gets or sets the width of the comment output area in pixels (Applies only if comments are displayed on the right).
   * @return commentsAreaWidth
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the width of the comment output area in pixels (Applies only if comments are displayed on the right).")
  public Integer getCommentsAreaWidth() {
    return commentsAreaWidth;
  }

  public void setCommentsAreaWidth(Integer commentsAreaWidth) {
    this.commentsAreaWidth = commentsAreaWidth;
  }

  public HtmlExportOptions commentsAreaColor(String commentsAreaColor) {
    this.commentsAreaColor = commentsAreaColor;
    return this;
  }

   /**
   * Gets or sets the color of comments area (Applies only if comments are displayed on the right).
   * @return commentsAreaColor
  **/
  @ApiModelProperty(value = "Gets or sets the color of comments area (Applies only if comments are displayed on the right).")
  public String getCommentsAreaColor() {
    return commentsAreaColor;
  }

  public void setCommentsAreaColor(String commentsAreaColor) {
    this.commentsAreaColor = commentsAreaColor;
  }

  public HtmlExportOptions showCommentsByNoAuthor(Boolean showCommentsByNoAuthor) {
    this.showCommentsByNoAuthor = showCommentsByNoAuthor;
    return this;
  }

   /**
   * True if comments that have no author are displayed. (Applies only if comments are displayed).
   * @return showCommentsByNoAuthor
  **/
  @ApiModelProperty(required = true, value = "True if comments that have no author are displayed. (Applies only if comments are displayed).")
  public Boolean isShowCommentsByNoAuthor() {
    return showCommentsByNoAuthor;
  }

  public void setShowCommentsByNoAuthor(Boolean showCommentsByNoAuthor) {
    this.showCommentsByNoAuthor = showCommentsByNoAuthor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlExportOptions htmlExportOptions = (HtmlExportOptions) o;
    return true && Objects.equals(this.saveAsZip, htmlExportOptions.saveAsZip) && Objects.equals(this.subDirectoryName, htmlExportOptions.subDirectoryName) && Objects.equals(this.showHiddenSlides, htmlExportOptions.showHiddenSlides) && Objects.equals(this.svgResponsiveLayout, htmlExportOptions.svgResponsiveLayout) && Objects.equals(this.jpegQuality, htmlExportOptions.jpegQuality) && Objects.equals(this.picturesCompression, htmlExportOptions.picturesCompression) && Objects.equals(this.deletePicturesCroppedAreas, htmlExportOptions.deletePicturesCroppedAreas) && Objects.equals(this.notesPosition, htmlExportOptions.notesPosition) && Objects.equals(this.commentsPosition, htmlExportOptions.commentsPosition) && Objects.equals(this.commentsAreaWidth, htmlExportOptions.commentsAreaWidth) && Objects.equals(this.commentsAreaColor, htmlExportOptions.commentsAreaColor) && Objects.equals(this.showCommentsByNoAuthor, htmlExportOptions.showCommentsByNoAuthor) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saveAsZip, subDirectoryName, showHiddenSlides, svgResponsiveLayout, jpegQuality, picturesCompression, deletePicturesCroppedAreas, notesPosition, commentsPosition, commentsAreaWidth, commentsAreaColor, showCommentsByNoAuthor, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    saveAsZip: ").append(toIndentedString(saveAsZip)).append("\n");
    sb.append("    subDirectoryName: ").append(toIndentedString(subDirectoryName)).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
    sb.append("    svgResponsiveLayout: ").append(toIndentedString(svgResponsiveLayout)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    picturesCompression: ").append(toIndentedString(picturesCompression)).append("\n");
    sb.append("    deletePicturesCroppedAreas: ").append(toIndentedString(deletePicturesCroppedAreas)).append("\n");
    sb.append("    notesPosition: ").append(toIndentedString(notesPosition)).append("\n");
    sb.append("    commentsPosition: ").append(toIndentedString(commentsPosition)).append("\n");
    sb.append("    commentsAreaWidth: ").append(toIndentedString(commentsAreaWidth)).append("\n");
    sb.append("    commentsAreaColor: ").append(toIndentedString(commentsAreaColor)).append("\n");
    sb.append("    showCommentsByNoAuthor: ").append(toIndentedString(showCommentsByNoAuthor)).append("\n");
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
