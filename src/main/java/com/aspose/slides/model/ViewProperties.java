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
import com.aspose.slides.model.CommonSlideViewProperties;
import com.aspose.slides.model.NormalViewRestoredProperties;
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
 * Slides document properties.
 */
@ApiModel(description = "Slides document properties.")
public class ViewProperties extends ResourceBase {
  /**
   * Last used view mode.
   */
  @JsonAdapter(LastViewEnum.Adapter.class)
  public enum LastViewEnum {
    NOTDEFINED("NotDefined"),
    
    SLIDEVIEW("SlideView"),
    
    SLIDEMASTERVIEW("SlideMasterView"),
    
    NOTESVIEW("NotesView"),
    
    HANDOUTVIEW("HandoutView"),
    
    NOTESMASTERVIEW("NotesMasterView"),
    
    OUTLINEVIEW("OutlineView"),
    
    SLIDESORTERVIEW("SlideSorterView"),
    
    SLIDETHUMBNAILVIEW("SlideThumbnailView");

    private String value;

    LastViewEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LastViewEnum fromValue(String text) {
      for (LastViewEnum b : LastViewEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LastViewEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LastViewEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LastViewEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LastViewEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "lastView", alternate = { "LastView" })
  private LastViewEnum lastView;

  /**
   * Horizontal bar state.
   */
  @JsonAdapter(HorizontalBarStateEnum.Adapter.class)
  public enum HorizontalBarStateEnum {
    MINIMIZED("Minimized"),
    
    RESTORED("Restored"),
    
    MAXIMIZED("Maximized");

    private String value;

    HorizontalBarStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HorizontalBarStateEnum fromValue(String text) {
      for (HorizontalBarStateEnum b : HorizontalBarStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HorizontalBarStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HorizontalBarStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HorizontalBarStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HorizontalBarStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "horizontalBarState", alternate = { "HorizontalBarState" })
  private HorizontalBarStateEnum horizontalBarState;

  /**
   * Vertical bar state.
   */
  @JsonAdapter(VerticalBarStateEnum.Adapter.class)
  public enum VerticalBarStateEnum {
    MINIMIZED("Minimized"),
    
    RESTORED("Restored"),
    
    MAXIMIZED("Maximized");

    private String value;

    VerticalBarStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerticalBarStateEnum fromValue(String text) {
      for (VerticalBarStateEnum b : VerticalBarStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VerticalBarStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerticalBarStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerticalBarStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerticalBarStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "verticalBarState", alternate = { "VerticalBarState" })
  private VerticalBarStateEnum verticalBarState;

  @SerializedName(value = "preferSingleView", alternate = { "PreferSingleView" })
  private Boolean preferSingleView;

  @SerializedName(value = "restoredLeft", alternate = { "RestoredLeft" })
  private NormalViewRestoredProperties restoredLeft;

  @SerializedName(value = "restoredTop", alternate = { "RestoredTop" })
  private NormalViewRestoredProperties restoredTop;

  @SerializedName(value = "slideViewProperties", alternate = { "SlideViewProperties" })
  private CommonSlideViewProperties slideViewProperties;

  @SerializedName(value = "notesViewProperties", alternate = { "NotesViewProperties" })
  private CommonSlideViewProperties notesViewProperties;

  /**
   * True if the comments should be shown.
   */
  @JsonAdapter(ShowCommentsEnum.Adapter.class)
  public enum ShowCommentsEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    ShowCommentsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShowCommentsEnum fromValue(String text) {
      for (ShowCommentsEnum b : ShowCommentsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ShowCommentsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShowCommentsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShowCommentsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ShowCommentsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "showComments", alternate = { "ShowComments" })
  private ShowCommentsEnum showComments;


  public ViewProperties() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
  }

  public ViewProperties lastView(LastViewEnum lastView) {
    this.lastView = lastView;
    return this;
  }

   /**
   * Last used view mode.
   * @return lastView
  **/
  @ApiModelProperty(value = "Last used view mode.")
  public LastViewEnum getLastView() {
    return lastView;
  }

  public void setLastView(LastViewEnum lastView) {
    this.lastView = lastView;
  }

  public ViewProperties horizontalBarState(HorizontalBarStateEnum horizontalBarState) {
    this.horizontalBarState = horizontalBarState;
    return this;
  }

   /**
   * Horizontal bar state.
   * @return horizontalBarState
  **/
  @ApiModelProperty(value = "Horizontal bar state.")
  public HorizontalBarStateEnum getHorizontalBarState() {
    return horizontalBarState;
  }

  public void setHorizontalBarState(HorizontalBarStateEnum horizontalBarState) {
    this.horizontalBarState = horizontalBarState;
  }

  public ViewProperties verticalBarState(VerticalBarStateEnum verticalBarState) {
    this.verticalBarState = verticalBarState;
    return this;
  }

   /**
   * Vertical bar state.
   * @return verticalBarState
  **/
  @ApiModelProperty(value = "Vertical bar state.")
  public VerticalBarStateEnum getVerticalBarState() {
    return verticalBarState;
  }

  public void setVerticalBarState(VerticalBarStateEnum verticalBarState) {
    this.verticalBarState = verticalBarState;
  }

  public ViewProperties preferSingleView(Boolean preferSingleView) {
    this.preferSingleView = preferSingleView;
    return this;
  }

   /**
   * True to prefer single view.
   * @return preferSingleView
  **/
  @ApiModelProperty(value = "True to prefer single view.")
  public Boolean isPreferSingleView() {
    return preferSingleView;
  }

  public void setPreferSingleView(Boolean preferSingleView) {
    this.preferSingleView = preferSingleView;
  }

  public ViewProperties restoredLeft(NormalViewRestoredProperties restoredLeft) {
    this.restoredLeft = restoredLeft;
    return this;
  }

   /**
   * The sizing of the side content region of the normal view, when the region is of a variable restored size.
   * @return restoredLeft
  **/
  @ApiModelProperty(value = "The sizing of the side content region of the normal view, when the region is of a variable restored size.")
  public NormalViewRestoredProperties getRestoredLeft() {
    return restoredLeft;
  }

  public void setRestoredLeft(NormalViewRestoredProperties restoredLeft) {
    this.restoredLeft = restoredLeft;
  }

  public ViewProperties restoredTop(NormalViewRestoredProperties restoredTop) {
    this.restoredTop = restoredTop;
    return this;
  }

   /**
   * The sizing of the top slide region of the normal view, when the region is of a variable restored size.
   * @return restoredTop
  **/
  @ApiModelProperty(value = "The sizing of the top slide region of the normal view, when the region is of a variable restored size.")
  public NormalViewRestoredProperties getRestoredTop() {
    return restoredTop;
  }

  public void setRestoredTop(NormalViewRestoredProperties restoredTop) {
    this.restoredTop = restoredTop;
  }

  public ViewProperties slideViewProperties(CommonSlideViewProperties slideViewProperties) {
    this.slideViewProperties = slideViewProperties;
    return this;
  }

   /**
   * Slide view mode properties.
   * @return slideViewProperties
  **/
  @ApiModelProperty(value = "Slide view mode properties.")
  public CommonSlideViewProperties getSlideViewProperties() {
    return slideViewProperties;
  }

  public void setSlideViewProperties(CommonSlideViewProperties slideViewProperties) {
    this.slideViewProperties = slideViewProperties;
  }

  public ViewProperties notesViewProperties(CommonSlideViewProperties notesViewProperties) {
    this.notesViewProperties = notesViewProperties;
    return this;
  }

   /**
   * Notes view mode properties.
   * @return notesViewProperties
  **/
  @ApiModelProperty(value = "Notes view mode properties.")
  public CommonSlideViewProperties getNotesViewProperties() {
    return notesViewProperties;
  }

  public void setNotesViewProperties(CommonSlideViewProperties notesViewProperties) {
    this.notesViewProperties = notesViewProperties;
  }

  public ViewProperties showComments(ShowCommentsEnum showComments) {
    this.showComments = showComments;
    return this;
  }

   /**
   * True if the comments should be shown.
   * @return showComments
  **/
  @ApiModelProperty(value = "True if the comments should be shown.")
  public ShowCommentsEnum getShowComments() {
    return showComments;
  }

  public void setShowComments(ShowCommentsEnum showComments) {
    this.showComments = showComments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewProperties viewProperties = (ViewProperties) o;
    return true && Objects.equals(this.lastView, viewProperties.lastView) && Objects.equals(this.horizontalBarState, viewProperties.horizontalBarState) && Objects.equals(this.verticalBarState, viewProperties.verticalBarState) && Objects.equals(this.preferSingleView, viewProperties.preferSingleView) && Objects.equals(this.restoredLeft, viewProperties.restoredLeft) && Objects.equals(this.restoredTop, viewProperties.restoredTop) && Objects.equals(this.slideViewProperties, viewProperties.slideViewProperties) && Objects.equals(this.notesViewProperties, viewProperties.notesViewProperties) && Objects.equals(this.showComments, viewProperties.showComments) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastView, horizontalBarState, verticalBarState, preferSingleView, restoredLeft, restoredTop, slideViewProperties, notesViewProperties, showComments, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lastView: ").append(toIndentedString(lastView)).append("\n");
    sb.append("    horizontalBarState: ").append(toIndentedString(horizontalBarState)).append("\n");
    sb.append("    verticalBarState: ").append(toIndentedString(verticalBarState)).append("\n");
    sb.append("    preferSingleView: ").append(toIndentedString(preferSingleView)).append("\n");
    sb.append("    restoredLeft: ").append(toIndentedString(restoredLeft)).append("\n");
    sb.append("    restoredTop: ").append(toIndentedString(restoredTop)).append("\n");
    sb.append("    slideViewProperties: ").append(toIndentedString(slideViewProperties)).append("\n");
    sb.append("    notesViewProperties: ").append(toIndentedString(notesViewProperties)).append("\n");
    sb.append("    showComments: ").append(toIndentedString(showComments)).append("\n");
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
