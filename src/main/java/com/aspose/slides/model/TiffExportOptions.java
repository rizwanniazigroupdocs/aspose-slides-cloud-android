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
 * Provides options that control how a presentation is saved in TIFF format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in TIFF format.")
public class TiffExportOptions extends ExportOptions {
  /**
   * Compression type.
   */
  @JsonAdapter(CompressionEnum.Adapter.class)
  public enum CompressionEnum {
    DEFAULT("Default"),
    
    NONE("None"),
    
    CCITT3("CCITT3"),
    
    CCITT4("CCITT4"),
    
    LZW("LZW"),
    
    RLE("RLE");

    private String value;

    CompressionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompressionEnum fromValue(String text) {
      for (CompressionEnum b : CompressionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CompressionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompressionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompressionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CompressionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "compression", alternate = { "Compression" })
  private CompressionEnum compression;

  @SerializedName(value = "width", alternate = { "Width" })
  private Integer width;

  @SerializedName(value = "height", alternate = { "Height" })
  private Integer height;

  @SerializedName(value = "dpiX", alternate = { "DpiX" })
  private Integer dpiX;

  @SerializedName(value = "dpiY", alternate = { "DpiY" })
  private Integer dpiY;

  @SerializedName(value = "showHiddenSlides", alternate = { "ShowHiddenSlides" })
  private Boolean showHiddenSlides;

  /**
   * Specifies the pixel format for the generated images. Read/write ImagePixelFormat.
   */
  @JsonAdapter(PixelFormatEnum.Adapter.class)
  public enum PixelFormatEnum {
    FORMAT1BPPINDEXED("Format1bppIndexed"),
    
    FORMAT4BPPINDEXED("Format4bppIndexed"),
    
    FORMAT8BPPINDEXED("Format8bppIndexed"),
    
    FORMAT24BPPRGB("Format24bppRgb"),
    
    FORMAT32BPPARGB("Format32bppArgb");

    private String value;

    PixelFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PixelFormatEnum fromValue(String text) {
      for (PixelFormatEnum b : PixelFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PixelFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PixelFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PixelFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PixelFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "pixelFormat", alternate = { "PixelFormat" })
  private PixelFormatEnum pixelFormat;

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


  public TiffExportOptions() {
    super();
    setFormat("TIFF");
  }

  public TiffExportOptions compression(CompressionEnum compression) {
    this.compression = compression;
    return this;
  }

   /**
   * Compression type.
   * @return compression
  **/
  @ApiModelProperty(required = true, value = "Compression type.")
  public CompressionEnum getCompression() {
    return compression;
  }

  public void setCompression(CompressionEnum compression) {
    this.compression = compression;
  }

  public TiffExportOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width.
   * @return width
  **/
  @ApiModelProperty(value = "Width.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public TiffExportOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height.
   * @return height
  **/
  @ApiModelProperty(value = "Height.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public TiffExportOptions dpiX(Integer dpiX) {
    this.dpiX = dpiX;
    return this;
  }

   /**
   * Horizontal resolution, in dots per inch.
   * @return dpiX
  **/
  @ApiModelProperty(value = "Horizontal resolution, in dots per inch.")
  public Integer getDpiX() {
    return dpiX;
  }

  public void setDpiX(Integer dpiX) {
    this.dpiX = dpiX;
  }

  public TiffExportOptions dpiY(Integer dpiY) {
    this.dpiY = dpiY;
    return this;
  }

   /**
   * Vertical resolution, in dots per inch.
   * @return dpiY
  **/
  @ApiModelProperty(value = "Vertical resolution, in dots per inch.")
  public Integer getDpiY() {
    return dpiY;
  }

  public void setDpiY(Integer dpiY) {
    this.dpiY = dpiY;
  }

  public TiffExportOptions showHiddenSlides(Boolean showHiddenSlides) {
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

  public TiffExportOptions pixelFormat(PixelFormatEnum pixelFormat) {
    this.pixelFormat = pixelFormat;
    return this;
  }

   /**
   * Specifies the pixel format for the generated images. Read/write ImagePixelFormat.
   * @return pixelFormat
  **/
  @ApiModelProperty(required = true, value = "Specifies the pixel format for the generated images. Read/write ImagePixelFormat.")
  public PixelFormatEnum getPixelFormat() {
    return pixelFormat;
  }

  public void setPixelFormat(PixelFormatEnum pixelFormat) {
    this.pixelFormat = pixelFormat;
  }

  public TiffExportOptions notesPosition(NotesPositionEnum notesPosition) {
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

  public TiffExportOptions commentsPosition(CommentsPositionEnum commentsPosition) {
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

  public TiffExportOptions commentsAreaWidth(Integer commentsAreaWidth) {
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

  public TiffExportOptions commentsAreaColor(String commentsAreaColor) {
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

  public TiffExportOptions showCommentsByNoAuthor(Boolean showCommentsByNoAuthor) {
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
    TiffExportOptions tiffExportOptions = (TiffExportOptions) o;
    return true && Objects.equals(this.compression, tiffExportOptions.compression) && Objects.equals(this.width, tiffExportOptions.width) && Objects.equals(this.height, tiffExportOptions.height) && Objects.equals(this.dpiX, tiffExportOptions.dpiX) && Objects.equals(this.dpiY, tiffExportOptions.dpiY) && Objects.equals(this.showHiddenSlides, tiffExportOptions.showHiddenSlides) && Objects.equals(this.pixelFormat, tiffExportOptions.pixelFormat) && Objects.equals(this.notesPosition, tiffExportOptions.notesPosition) && Objects.equals(this.commentsPosition, tiffExportOptions.commentsPosition) && Objects.equals(this.commentsAreaWidth, tiffExportOptions.commentsAreaWidth) && Objects.equals(this.commentsAreaColor, tiffExportOptions.commentsAreaColor) && Objects.equals(this.showCommentsByNoAuthor, tiffExportOptions.showCommentsByNoAuthor) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compression, width, height, dpiX, dpiY, showHiddenSlides, pixelFormat, notesPosition, commentsPosition, commentsAreaWidth, commentsAreaColor, showCommentsByNoAuthor, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    dpiX: ").append(toIndentedString(dpiX)).append("\n");
    sb.append("    dpiY: ").append(toIndentedString(dpiY)).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
    sb.append("    pixelFormat: ").append(toIndentedString(pixelFormat)).append("\n");
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
