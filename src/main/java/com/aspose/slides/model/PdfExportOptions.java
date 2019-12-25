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
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Provides options that control how a presentation is saved in Pdf format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in Pdf format.")
public class PdfExportOptions extends ExportOptions {
  /**
   * Specifies compression type to be used for all textual content in the document.
   */
  @JsonAdapter(TextCompressionEnum.Adapter.class)
  public enum TextCompressionEnum {
    NONE("None"),
    
    FLATE("Flate");

    private String value;

    TextCompressionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextCompressionEnum fromValue(String text) {
      for (TextCompressionEnum b : TextCompressionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextCompressionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextCompressionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextCompressionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextCompressionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "textCompression", alternate = { "TextCompression" })
  private TextCompressionEnum textCompression;

  @SerializedName(value = "embedFullFonts", alternate = { "EmbedFullFonts" })
  private Boolean embedFullFonts;

  /**
   * Desired conformance level for generated PDF document.
   */
  @JsonAdapter(ComplianceEnum.Adapter.class)
  public enum ComplianceEnum {
    PDF15("Pdf15"),
    
    PDFA1B("PdfA1b");

    private String value;

    ComplianceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComplianceEnum fromValue(String text) {
      for (ComplianceEnum b : ComplianceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ComplianceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComplianceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComplianceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ComplianceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "compliance", alternate = { "Compliance" })
  private ComplianceEnum compliance;

  @SerializedName(value = "sufficientResolution", alternate = { "SufficientResolution" })
  private Double sufficientResolution;

  @SerializedName(value = "jpegQuality", alternate = { "JpegQuality" })
  private Integer jpegQuality;

  @SerializedName(value = "drawSlidesFrame", alternate = { "DrawSlidesFrame" })
  private Boolean drawSlidesFrame;

  @SerializedName(value = "showHiddenSlides", alternate = { "ShowHiddenSlides" })
  private Boolean showHiddenSlides;

  @SerializedName(value = "saveMetafilesAsPng", alternate = { "SaveMetafilesAsPng" })
  private Boolean saveMetafilesAsPng;

  @SerializedName(value = "password", alternate = { "Password" })
  private String password;

  @SerializedName(value = "embedTrueTypeFontsForASCII", alternate = { "EmbedTrueTypeFontsForASCII" })
  private Boolean embedTrueTypeFontsForASCII;

  @SerializedName(value = "additionalCommonFontFamilies", alternate = { "AdditionalCommonFontFamilies" })
  private List<String> additionalCommonFontFamilies = null;

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

  @SerializedName(value = "imageTransparentColor", alternate = { "ImageTransparentColor" })
  private String imageTransparentColor;

  @SerializedName(value = "applyImageTransparent", alternate = { "ApplyImageTransparent" })
  private Boolean applyImageTransparent;


  public PdfExportOptions() {
    super();
    setFormat("PDF");
    setAdditionalCommonFontFamilies(new ArrayList<String>());
  }

  public PdfExportOptions textCompression(TextCompressionEnum textCompression) {
    this.textCompression = textCompression;
    return this;
  }

   /**
   * Specifies compression type to be used for all textual content in the document.
   * @return textCompression
  **/
  @ApiModelProperty(required = true, value = "Specifies compression type to be used for all textual content in the document.")
  public TextCompressionEnum getTextCompression() {
    return textCompression;
  }

  public void setTextCompression(TextCompressionEnum textCompression) {
    this.textCompression = textCompression;
  }

  public PdfExportOptions embedFullFonts(Boolean embedFullFonts) {
    this.embedFullFonts = embedFullFonts;
    return this;
  }

   /**
   * Determines if all characters of font should be embedded or only used subset.
   * @return embedFullFonts
  **/
  @ApiModelProperty(required = true, value = "Determines if all characters of font should be embedded or only used subset.")
  public Boolean isEmbedFullFonts() {
    return embedFullFonts;
  }

  public void setEmbedFullFonts(Boolean embedFullFonts) {
    this.embedFullFonts = embedFullFonts;
  }

  public PdfExportOptions compliance(ComplianceEnum compliance) {
    this.compliance = compliance;
    return this;
  }

   /**
   * Desired conformance level for generated PDF document.
   * @return compliance
  **/
  @ApiModelProperty(required = true, value = "Desired conformance level for generated PDF document.")
  public ComplianceEnum getCompliance() {
    return compliance;
  }

  public void setCompliance(ComplianceEnum compliance) {
    this.compliance = compliance;
  }

  public PdfExportOptions sufficientResolution(Double sufficientResolution) {
    this.sufficientResolution = sufficientResolution;
    return this;
  }

   /**
   * Returns or sets a value determining resolution of images inside PDF document.  Property affects on file size, time of export and image quality. The default value is 96.
   * @return sufficientResolution
  **/
  @ApiModelProperty(required = true, value = "Returns or sets a value determining resolution of images inside PDF document.  Property affects on file size, time of export and image quality. The default value is 96.")
  public Double getSufficientResolution() {
    return sufficientResolution;
  }

  public void setSufficientResolution(Double sufficientResolution) {
    this.sufficientResolution = sufficientResolution;
  }

  public PdfExportOptions jpegQuality(Integer jpegQuality) {
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

  public PdfExportOptions drawSlidesFrame(Boolean drawSlidesFrame) {
    this.drawSlidesFrame = drawSlidesFrame;
    return this;
  }

   /**
   * True to draw black frame around each slide.
   * @return drawSlidesFrame
  **/
  @ApiModelProperty(required = true, value = "True to draw black frame around each slide.")
  public Boolean isDrawSlidesFrame() {
    return drawSlidesFrame;
  }

  public void setDrawSlidesFrame(Boolean drawSlidesFrame) {
    this.drawSlidesFrame = drawSlidesFrame;
  }

  public PdfExportOptions showHiddenSlides(Boolean showHiddenSlides) {
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

  public PdfExportOptions saveMetafilesAsPng(Boolean saveMetafilesAsPng) {
    this.saveMetafilesAsPng = saveMetafilesAsPng;
    return this;
  }

   /**
   * True to convert all metafiles used in a presentation to the PNG images.
   * @return saveMetafilesAsPng
  **/
  @ApiModelProperty(required = true, value = "True to convert all metafiles used in a presentation to the PNG images.")
  public Boolean isSaveMetafilesAsPng() {
    return saveMetafilesAsPng;
  }

  public void setSaveMetafilesAsPng(Boolean saveMetafilesAsPng) {
    this.saveMetafilesAsPng = saveMetafilesAsPng;
  }

  public PdfExportOptions password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Setting user password to protect the PDF document. 
   * @return password
  **/
  @ApiModelProperty(value = "Setting user password to protect the PDF document. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PdfExportOptions embedTrueTypeFontsForASCII(Boolean embedTrueTypeFontsForASCII) {
    this.embedTrueTypeFontsForASCII = embedTrueTypeFontsForASCII;
    return this;
  }

   /**
   * Determines if Aspose.Slides will embed common fonts for ASCII (33..127 code range) text. Fonts for character codes greater than 127 are always embedded. Common fonts list includes PDF&#39;s base 14 fonts and additional user specified fonts.
   * @return embedTrueTypeFontsForASCII
  **/
  @ApiModelProperty(required = true, value = "Determines if Aspose.Slides will embed common fonts for ASCII (33..127 code range) text. Fonts for character codes greater than 127 are always embedded. Common fonts list includes PDF's base 14 fonts and additional user specified fonts.")
  public Boolean isEmbedTrueTypeFontsForASCII() {
    return embedTrueTypeFontsForASCII;
  }

  public void setEmbedTrueTypeFontsForASCII(Boolean embedTrueTypeFontsForASCII) {
    this.embedTrueTypeFontsForASCII = embedTrueTypeFontsForASCII;
  }

  public PdfExportOptions additionalCommonFontFamilies(List<String> additionalCommonFontFamilies) {
    this.additionalCommonFontFamilies = additionalCommonFontFamilies;
    return this;
  }

  public PdfExportOptions addAdditionalCommonFontFamiliesItem(String additionalCommonFontFamiliesItem) {
    if (this.additionalCommonFontFamilies == null) {
      this.additionalCommonFontFamilies = new ArrayList<String>();
    }
    this.additionalCommonFontFamilies.add(additionalCommonFontFamiliesItem);
    return this;
  }

   /**
   * Returns or sets an array of user-defined names of font families which Aspose.Slides should consider common.
   * @return additionalCommonFontFamilies
  **/
  @ApiModelProperty(value = "Returns or sets an array of user-defined names of font families which Aspose.Slides should consider common.")
  public List<String> getAdditionalCommonFontFamilies() {
    return additionalCommonFontFamilies;
  }

  public void setAdditionalCommonFontFamilies(List<String> additionalCommonFontFamilies) {
    this.additionalCommonFontFamilies = additionalCommonFontFamilies;
  }

  public PdfExportOptions notesPosition(NotesPositionEnum notesPosition) {
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

  public PdfExportOptions commentsPosition(CommentsPositionEnum commentsPosition) {
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

  public PdfExportOptions commentsAreaWidth(Integer commentsAreaWidth) {
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

  public PdfExportOptions commentsAreaColor(String commentsAreaColor) {
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

  public PdfExportOptions showCommentsByNoAuthor(Boolean showCommentsByNoAuthor) {
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

  public PdfExportOptions imageTransparentColor(String imageTransparentColor) {
    this.imageTransparentColor = imageTransparentColor;
    return this;
  }

   /**
   * Image transparent color.
   * @return imageTransparentColor
  **/
  @ApiModelProperty(value = "Image transparent color.")
  public String getImageTransparentColor() {
    return imageTransparentColor;
  }

  public void setImageTransparentColor(String imageTransparentColor) {
    this.imageTransparentColor = imageTransparentColor;
  }

  public PdfExportOptions applyImageTransparent(Boolean applyImageTransparent) {
    this.applyImageTransparent = applyImageTransparent;
    return this;
  }

   /**
   * True to apply specified ImageTransparentColor  to an image.
   * @return applyImageTransparent
  **/
  @ApiModelProperty(required = true, value = "True to apply specified ImageTransparentColor  to an image.")
  public Boolean isApplyImageTransparent() {
    return applyImageTransparent;
  }

  public void setApplyImageTransparent(Boolean applyImageTransparent) {
    this.applyImageTransparent = applyImageTransparent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfExportOptions pdfExportOptions = (PdfExportOptions) o;
    return true && Objects.equals(this.textCompression, pdfExportOptions.textCompression) && Objects.equals(this.embedFullFonts, pdfExportOptions.embedFullFonts) && Objects.equals(this.compliance, pdfExportOptions.compliance) && Objects.equals(this.sufficientResolution, pdfExportOptions.sufficientResolution) && Objects.equals(this.jpegQuality, pdfExportOptions.jpegQuality) && Objects.equals(this.drawSlidesFrame, pdfExportOptions.drawSlidesFrame) && Objects.equals(this.showHiddenSlides, pdfExportOptions.showHiddenSlides) && Objects.equals(this.saveMetafilesAsPng, pdfExportOptions.saveMetafilesAsPng) && Objects.equals(this.password, pdfExportOptions.password) && Objects.equals(this.embedTrueTypeFontsForASCII, pdfExportOptions.embedTrueTypeFontsForASCII) && Objects.equals(this.additionalCommonFontFamilies, pdfExportOptions.additionalCommonFontFamilies) && Objects.equals(this.notesPosition, pdfExportOptions.notesPosition) && Objects.equals(this.commentsPosition, pdfExportOptions.commentsPosition) && Objects.equals(this.commentsAreaWidth, pdfExportOptions.commentsAreaWidth) && Objects.equals(this.commentsAreaColor, pdfExportOptions.commentsAreaColor) && Objects.equals(this.showCommentsByNoAuthor, pdfExportOptions.showCommentsByNoAuthor) && Objects.equals(this.imageTransparentColor, pdfExportOptions.imageTransparentColor) && Objects.equals(this.applyImageTransparent, pdfExportOptions.applyImageTransparent) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textCompression, embedFullFonts, compliance, sufficientResolution, jpegQuality, drawSlidesFrame, showHiddenSlides, saveMetafilesAsPng, password, embedTrueTypeFontsForASCII, additionalCommonFontFamilies, notesPosition, commentsPosition, commentsAreaWidth, commentsAreaColor, showCommentsByNoAuthor, imageTransparentColor, applyImageTransparent, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    textCompression: ").append(toIndentedString(textCompression)).append("\n");
    sb.append("    embedFullFonts: ").append(toIndentedString(embedFullFonts)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    sufficientResolution: ").append(toIndentedString(sufficientResolution)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    drawSlidesFrame: ").append(toIndentedString(drawSlidesFrame)).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
    sb.append("    saveMetafilesAsPng: ").append(toIndentedString(saveMetafilesAsPng)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    embedTrueTypeFontsForASCII: ").append(toIndentedString(embedTrueTypeFontsForASCII)).append("\n");
    sb.append("    additionalCommonFontFamilies: ").append(toIndentedString(additionalCommonFontFamilies)).append("\n");
    sb.append("    notesPosition: ").append(toIndentedString(notesPosition)).append("\n");
    sb.append("    commentsPosition: ").append(toIndentedString(commentsPosition)).append("\n");
    sb.append("    commentsAreaWidth: ").append(toIndentedString(commentsAreaWidth)).append("\n");
    sb.append("    commentsAreaColor: ").append(toIndentedString(commentsAreaColor)).append("\n");
    sb.append("    showCommentsByNoAuthor: ").append(toIndentedString(showCommentsByNoAuthor)).append("\n");
    sb.append("    imageTransparentColor: ").append(toIndentedString(imageTransparentColor)).append("\n");
    sb.append("    applyImageTransparent: ").append(toIndentedString(applyImageTransparent)).append("\n");
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
