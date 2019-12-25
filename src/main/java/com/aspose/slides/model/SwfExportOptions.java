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
 * Provides options that control how a presentation is saved in SWF format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in SWF format.")
public class SwfExportOptions extends ExportOptions {
  @SerializedName(value = "showHiddenSlides", alternate = { "ShowHiddenSlides" })
  private Boolean showHiddenSlides;

  @SerializedName(value = "compressed", alternate = { "Compressed" })
  private Boolean compressed;

  @SerializedName(value = "viewerIncluded", alternate = { "ViewerIncluded" })
  private Boolean viewerIncluded;

  @SerializedName(value = "showPageBorder", alternate = { "ShowPageBorder" })
  private Boolean showPageBorder;

  @SerializedName(value = "showFullScreen", alternate = { "ShowFullScreen" })
  private Boolean showFullScreen;

  @SerializedName(value = "showPageStepper", alternate = { "ShowPageStepper" })
  private Boolean showPageStepper;

  @SerializedName(value = "showSearch", alternate = { "ShowSearch" })
  private Boolean showSearch;

  @SerializedName(value = "showTopPane", alternate = { "ShowTopPane" })
  private Boolean showTopPane;

  @SerializedName(value = "showBottomPane", alternate = { "ShowBottomPane" })
  private Boolean showBottomPane;

  @SerializedName(value = "showLeftPane", alternate = { "ShowLeftPane" })
  private Boolean showLeftPane;

  @SerializedName(value = "startOpenLeftPane", alternate = { "StartOpenLeftPane" })
  private Boolean startOpenLeftPane;

  @SerializedName(value = "enableContextMenu", alternate = { "EnableContextMenu" })
  private Boolean enableContextMenu;

  @SerializedName(value = "logoImage", alternate = { "LogoImage" })
  private String logoImage;

  @SerializedName(value = "logoLink", alternate = { "LogoLink" })
  private String logoLink;

  @SerializedName(value = "jpegQuality", alternate = { "JpegQuality" })
  private Integer jpegQuality;

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


  public SwfExportOptions() {
    super();
    setFormat("SWF");
  }

  public SwfExportOptions showHiddenSlides(Boolean showHiddenSlides) {
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

  public SwfExportOptions compressed(Boolean compressed) {
    this.compressed = compressed;
    return this;
  }

   /**
   * Specifies whether the generated SWF document should be compressed or not. Default is true. 
   * @return compressed
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the generated SWF document should be compressed or not. Default is true. ")
  public Boolean isCompressed() {
    return compressed;
  }

  public void setCompressed(Boolean compressed) {
    this.compressed = compressed;
  }

  public SwfExportOptions viewerIncluded(Boolean viewerIncluded) {
    this.viewerIncluded = viewerIncluded;
    return this;
  }

   /**
   * Specifies whether the generated SWF document should include the integrated document viewer or not. Default is true. 
   * @return viewerIncluded
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the generated SWF document should include the integrated document viewer or not. Default is true. ")
  public Boolean isViewerIncluded() {
    return viewerIncluded;
  }

  public void setViewerIncluded(Boolean viewerIncluded) {
    this.viewerIncluded = viewerIncluded;
  }

  public SwfExportOptions showPageBorder(Boolean showPageBorder) {
    this.showPageBorder = showPageBorder;
    return this;
  }

   /**
   * Specifies whether border around pages should be shown. Default is true. 
   * @return showPageBorder
  **/
  @ApiModelProperty(required = true, value = "Specifies whether border around pages should be shown. Default is true. ")
  public Boolean isShowPageBorder() {
    return showPageBorder;
  }

  public void setShowPageBorder(Boolean showPageBorder) {
    this.showPageBorder = showPageBorder;
  }

  public SwfExportOptions showFullScreen(Boolean showFullScreen) {
    this.showFullScreen = showFullScreen;
    return this;
  }

   /**
   * Show/hide fullscreen button. Can be overridden in flashvars. Default is true. 
   * @return showFullScreen
  **/
  @ApiModelProperty(required = true, value = "Show/hide fullscreen button. Can be overridden in flashvars. Default is true. ")
  public Boolean isShowFullScreen() {
    return showFullScreen;
  }

  public void setShowFullScreen(Boolean showFullScreen) {
    this.showFullScreen = showFullScreen;
  }

  public SwfExportOptions showPageStepper(Boolean showPageStepper) {
    this.showPageStepper = showPageStepper;
    return this;
  }

   /**
   * Show/hide page stepper. Can be overridden in flashvars. Default is true. 
   * @return showPageStepper
  **/
  @ApiModelProperty(required = true, value = "Show/hide page stepper. Can be overridden in flashvars. Default is true. ")
  public Boolean isShowPageStepper() {
    return showPageStepper;
  }

  public void setShowPageStepper(Boolean showPageStepper) {
    this.showPageStepper = showPageStepper;
  }

  public SwfExportOptions showSearch(Boolean showSearch) {
    this.showSearch = showSearch;
    return this;
  }

   /**
   * Show/hide search section. Can be overridden in flashvars. Default is true. 
   * @return showSearch
  **/
  @ApiModelProperty(required = true, value = "Show/hide search section. Can be overridden in flashvars. Default is true. ")
  public Boolean isShowSearch() {
    return showSearch;
  }

  public void setShowSearch(Boolean showSearch) {
    this.showSearch = showSearch;
  }

  public SwfExportOptions showTopPane(Boolean showTopPane) {
    this.showTopPane = showTopPane;
    return this;
  }

   /**
   * Show/hide whole top pane. Can be overridden in flashvars. Default is true. 
   * @return showTopPane
  **/
  @ApiModelProperty(required = true, value = "Show/hide whole top pane. Can be overridden in flashvars. Default is true. ")
  public Boolean isShowTopPane() {
    return showTopPane;
  }

  public void setShowTopPane(Boolean showTopPane) {
    this.showTopPane = showTopPane;
  }

  public SwfExportOptions showBottomPane(Boolean showBottomPane) {
    this.showBottomPane = showBottomPane;
    return this;
  }

   /**
   * Show/hide bottom pane. Can be overridden in flashvars. Default is true. 
   * @return showBottomPane
  **/
  @ApiModelProperty(required = true, value = "Show/hide bottom pane. Can be overridden in flashvars. Default is true. ")
  public Boolean isShowBottomPane() {
    return showBottomPane;
  }

  public void setShowBottomPane(Boolean showBottomPane) {
    this.showBottomPane = showBottomPane;
  }

  public SwfExportOptions showLeftPane(Boolean showLeftPane) {
    this.showLeftPane = showLeftPane;
    return this;
  }

   /**
   * Show/hide left pane. Can be overridden in flashvars. Default is true. 
   * @return showLeftPane
  **/
  @ApiModelProperty(required = true, value = "Show/hide left pane. Can be overridden in flashvars. Default is true. ")
  public Boolean isShowLeftPane() {
    return showLeftPane;
  }

  public void setShowLeftPane(Boolean showLeftPane) {
    this.showLeftPane = showLeftPane;
  }

  public SwfExportOptions startOpenLeftPane(Boolean startOpenLeftPane) {
    this.startOpenLeftPane = startOpenLeftPane;
    return this;
  }

   /**
   * Start with opened left pane. Can be overridden in flashvars. Default is false. 
   * @return startOpenLeftPane
  **/
  @ApiModelProperty(required = true, value = "Start with opened left pane. Can be overridden in flashvars. Default is false. ")
  public Boolean isStartOpenLeftPane() {
    return startOpenLeftPane;
  }

  public void setStartOpenLeftPane(Boolean startOpenLeftPane) {
    this.startOpenLeftPane = startOpenLeftPane;
  }

  public SwfExportOptions enableContextMenu(Boolean enableContextMenu) {
    this.enableContextMenu = enableContextMenu;
    return this;
  }

   /**
   * Enable/disable context menu. Default is true. 
   * @return enableContextMenu
  **/
  @ApiModelProperty(required = true, value = "Enable/disable context menu. Default is true. ")
  public Boolean isEnableContextMenu() {
    return enableContextMenu;
  }

  public void setEnableContextMenu(Boolean enableContextMenu) {
    this.enableContextMenu = enableContextMenu;
  }

  public SwfExportOptions logoImage(String logoImage) {
    this.logoImage = logoImage;
    return this;
  }

   /**
   * Image that will be displayed as logo in the top right corner of the viewer. The image data is a base 64 string. Image should be 32x64 pixels PNG image, otherwise logo can be displayed improperly. 
   * @return logoImage
  **/
  @ApiModelProperty(value = "Image that will be displayed as logo in the top right corner of the viewer. The image data is a base 64 string. Image should be 32x64 pixels PNG image, otherwise logo can be displayed improperly. ")
  public String getLogoImage() {
    return logoImage;
  }

  public void setLogoImage(String logoImage) {
    this.logoImage = logoImage;
  }

  public SwfExportOptions logoLink(String logoLink) {
    this.logoLink = logoLink;
    return this;
  }

   /**
   * Gets or sets the full hyperlink address for a logo. Has an effect only if a LogoImage is specified. 
   * @return logoLink
  **/
  @ApiModelProperty(value = "Gets or sets the full hyperlink address for a logo. Has an effect only if a LogoImage is specified. ")
  public String getLogoLink() {
    return logoLink;
  }

  public void setLogoLink(String logoLink) {
    this.logoLink = logoLink;
  }

  public SwfExportOptions jpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
    return this;
  }

   /**
   * Specifies the quality of JPEG images. Default is 95.
   * @return jpegQuality
  **/
  @ApiModelProperty(required = true, value = "Specifies the quality of JPEG images. Default is 95.")
  public Integer getJpegQuality() {
    return jpegQuality;
  }

  public void setJpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
  }

  public SwfExportOptions notesPosition(NotesPositionEnum notesPosition) {
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

  public SwfExportOptions commentsPosition(CommentsPositionEnum commentsPosition) {
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

  public SwfExportOptions commentsAreaWidth(Integer commentsAreaWidth) {
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

  public SwfExportOptions commentsAreaColor(String commentsAreaColor) {
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

  public SwfExportOptions showCommentsByNoAuthor(Boolean showCommentsByNoAuthor) {
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
    SwfExportOptions swfExportOptions = (SwfExportOptions) o;
    return true && Objects.equals(this.showHiddenSlides, swfExportOptions.showHiddenSlides) && Objects.equals(this.compressed, swfExportOptions.compressed) && Objects.equals(this.viewerIncluded, swfExportOptions.viewerIncluded) && Objects.equals(this.showPageBorder, swfExportOptions.showPageBorder) && Objects.equals(this.showFullScreen, swfExportOptions.showFullScreen) && Objects.equals(this.showPageStepper, swfExportOptions.showPageStepper) && Objects.equals(this.showSearch, swfExportOptions.showSearch) && Objects.equals(this.showTopPane, swfExportOptions.showTopPane) && Objects.equals(this.showBottomPane, swfExportOptions.showBottomPane) && Objects.equals(this.showLeftPane, swfExportOptions.showLeftPane) && Objects.equals(this.startOpenLeftPane, swfExportOptions.startOpenLeftPane) && Objects.equals(this.enableContextMenu, swfExportOptions.enableContextMenu) && Objects.equals(this.logoImage, swfExportOptions.logoImage) && Objects.equals(this.logoLink, swfExportOptions.logoLink) && Objects.equals(this.jpegQuality, swfExportOptions.jpegQuality) && Objects.equals(this.notesPosition, swfExportOptions.notesPosition) && Objects.equals(this.commentsPosition, swfExportOptions.commentsPosition) && Objects.equals(this.commentsAreaWidth, swfExportOptions.commentsAreaWidth) && Objects.equals(this.commentsAreaColor, swfExportOptions.commentsAreaColor) && Objects.equals(this.showCommentsByNoAuthor, swfExportOptions.showCommentsByNoAuthor) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showHiddenSlides, compressed, viewerIncluded, showPageBorder, showFullScreen, showPageStepper, showSearch, showTopPane, showBottomPane, showLeftPane, startOpenLeftPane, enableContextMenu, logoImage, logoLink, jpegQuality, notesPosition, commentsPosition, commentsAreaWidth, commentsAreaColor, showCommentsByNoAuthor, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwfExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
    sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
    sb.append("    viewerIncluded: ").append(toIndentedString(viewerIncluded)).append("\n");
    sb.append("    showPageBorder: ").append(toIndentedString(showPageBorder)).append("\n");
    sb.append("    showFullScreen: ").append(toIndentedString(showFullScreen)).append("\n");
    sb.append("    showPageStepper: ").append(toIndentedString(showPageStepper)).append("\n");
    sb.append("    showSearch: ").append(toIndentedString(showSearch)).append("\n");
    sb.append("    showTopPane: ").append(toIndentedString(showTopPane)).append("\n");
    sb.append("    showBottomPane: ").append(toIndentedString(showBottomPane)).append("\n");
    sb.append("    showLeftPane: ").append(toIndentedString(showLeftPane)).append("\n");
    sb.append("    startOpenLeftPane: ").append(toIndentedString(startOpenLeftPane)).append("\n");
    sb.append("    enableContextMenu: ").append(toIndentedString(enableContextMenu)).append("\n");
    sb.append("    logoImage: ").append(toIndentedString(logoImage)).append("\n");
    sb.append("    logoLink: ").append(toIndentedString(logoLink)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
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
