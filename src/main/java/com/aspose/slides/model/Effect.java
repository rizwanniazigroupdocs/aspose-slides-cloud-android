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
 * Represents comment of slide
 */
@ApiModel(description = "Represents comment of slide")
public class Effect {
  /**
   * Effect type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    APPEAR("Appear"),
    
    CURVEUPDOWN("CurveUpDown"),
    
    ASCEND("Ascend"),
    
    BLAST("Blast"),
    
    BLINDS("Blinds"),
    
    BLINK("Blink"),
    
    BOLDFLASH("BoldFlash"),
    
    BOLDREVEAL("BoldReveal"),
    
    BOOMERANG("Boomerang"),
    
    BOUNCE("Bounce"),
    
    BOX("Box"),
    
    BRUSHONCOLOR("BrushOnColor"),
    
    BRUSHONUNDERLINE("BrushOnUnderline"),
    
    CENTERREVOLVE("CenterRevolve"),
    
    CHANGEFILLCOLOR("ChangeFillColor"),
    
    CHANGEFONT("ChangeFont"),
    
    CHANGEFONTCOLOR("ChangeFontColor"),
    
    CHANGEFONTSIZE("ChangeFontSize"),
    
    CHANGEFONTSTYLE("ChangeFontStyle"),
    
    CHANGELINECOLOR("ChangeLineColor"),
    
    CHECKERBOARD("Checkerboard"),
    
    CIRCLE("Circle"),
    
    COLORBLEND("ColorBlend"),
    
    COLORTYPEWRITER("ColorTypewriter"),
    
    COLORWAVE("ColorWave"),
    
    COMPLEMENTARYCOLOR("ComplementaryColor"),
    
    COMPLEMENTARYCOLOR2("ComplementaryColor2"),
    
    COMPRESS("Compress"),
    
    CONTRASTINGCOLOR("ContrastingColor"),
    
    CRAWL("Crawl"),
    
    CREDITS("Credits"),
    
    CUSTOM("Custom"),
    
    DARKEN("Darken"),
    
    DESATURATE("Desaturate"),
    
    DESCEND("Descend"),
    
    DIAMOND("Diamond"),
    
    DISSOLVE("Dissolve"),
    
    EASEINOUT("EaseInOut"),
    
    EXPAND("Expand"),
    
    FADE("Fade"),
    
    FADEDSWIVEL("FadedSwivel"),
    
    FADEDZOOM("FadedZoom"),
    
    FLASHBULB("FlashBulb"),
    
    FLASHONCE("FlashOnce"),
    
    FLICKER("Flicker"),
    
    FLIP("Flip"),
    
    FLOAT("Float"),
    
    FLY("Fly"),
    
    FOLD("Fold"),
    
    GLIDE("Glide"),
    
    GROWANDTURN("GrowAndTurn"),
    
    GROWSHRINK("GrowShrink"),
    
    GROWWITHCOLOR("GrowWithColor"),
    
    LIGHTEN("Lighten"),
    
    LIGHTSPEED("LightSpeed"),
    
    MEDIAPAUSE("MediaPause"),
    
    MEDIAPLAY("MediaPlay"),
    
    MEDIASTOP("MediaStop"),
    
    PATH4POINTSTAR("Path4PointStar"),
    
    PATH5POINTSTAR("Path5PointStar"),
    
    PATH6POINTSTAR("Path6PointStar"),
    
    PATH8POINTSTAR("Path8PointStar"),
    
    PATHARCDOWN("PathArcDown"),
    
    PATHARCLEFT("PathArcLeft"),
    
    PATHARCRIGHT("PathArcRight"),
    
    PATHARCUP("PathArcUp"),
    
    PATHBEAN("PathBean"),
    
    PATHBOUNCELEFT("PathBounceLeft"),
    
    PATHBOUNCERIGHT("PathBounceRight"),
    
    PATHBUZZSAW("PathBuzzsaw"),
    
    PATHCIRCLE("PathCircle"),
    
    PATHCRESCENTMOON("PathCrescentMoon"),
    
    PATHCURVEDSQUARE("PathCurvedSquare"),
    
    PATHCURVEDX("PathCurvedX"),
    
    PATHCURVYLEFT("PathCurvyLeft"),
    
    PATHCURVYRIGHT("PathCurvyRight"),
    
    PATHCURVYSTAR("PathCurvyStar"),
    
    PATHDECAYINGWAVE("PathDecayingWave"),
    
    PATHDIAGONALDOWNRIGHT("PathDiagonalDownRight"),
    
    PATHDIAGONALUPRIGHT("PathDiagonalUpRight"),
    
    PATHDIAMOND("PathDiamond"),
    
    PATHDOWN("PathDown"),
    
    PATHEQUALTRIANGLE("PathEqualTriangle"),
    
    PATHFIGURE8FOUR("PathFigure8Four"),
    
    PATHFOOTBALL("PathFootball"),
    
    PATHFUNNEL("PathFunnel"),
    
    PATHHEART("PathHeart"),
    
    PATHHEARTBEAT("PathHeartbeat"),
    
    PATHHEXAGON("PathHexagon"),
    
    PATHHORIZONTALFIGURE8("PathHorizontalFigure8"),
    
    PATHINVERTEDSQUARE("PathInvertedSquare"),
    
    PATHINVERTEDTRIANGLE("PathInvertedTriangle"),
    
    PATHLEFT("PathLeft"),
    
    PATHLOOPDELOOP("PathLoopdeLoop"),
    
    PATHNEUTRON("PathNeutron"),
    
    PATHOCTAGON("PathOctagon"),
    
    PATHPARALLELOGRAM("PathParallelogram"),
    
    PATHPEANUT("PathPeanut"),
    
    PATHPENTAGON("PathPentagon"),
    
    PATHPLUS("PathPlus"),
    
    PATHPOINTYSTAR("PathPointyStar"),
    
    PATHRIGHT("PathRight"),
    
    PATHRIGHTTRIANGLE("PathRightTriangle"),
    
    PATHSCURVE1("PathSCurve1"),
    
    PATHSCURVE2("PathSCurve2"),
    
    PATHSINEWAVE("PathSineWave"),
    
    PATHSPIRALLEFT("PathSpiralLeft"),
    
    PATHSPIRALRIGHT("PathSpiralRight"),
    
    PATHSPRING("PathSpring"),
    
    PATHSQUARE("PathSquare"),
    
    PATHSTAIRSDOWN("PathStairsDown"),
    
    PATHSWOOSH("PathSwoosh"),
    
    PATHTEARDROP("PathTeardrop"),
    
    PATHTRAPEZOID("PathTrapezoid"),
    
    PATHTURNDOWN("PathTurnDown"),
    
    PATHTURNRIGHT("PathTurnRight"),
    
    PATHTURNUP("PathTurnUp"),
    
    PATHTURNUPRIGHT("PathTurnUpRight"),
    
    PATHUP("PathUp"),
    
    PATHUSER("PathUser"),
    
    PATHVERTICALFIGURE8("PathVerticalFigure8"),
    
    PATHWAVE("PathWave"),
    
    PATHZIGZAG("PathZigzag"),
    
    PEEK("Peek"),
    
    PINWHEEL("Pinwheel"),
    
    PLUS("Plus"),
    
    RANDOMBARS("RandomBars"),
    
    RANDOMEFFECTS("RandomEffects"),
    
    RISEUP("RiseUp"),
    
    SHIMMER("Shimmer"),
    
    SLING("Sling"),
    
    SPIN("Spin"),
    
    SPINNER("Spinner"),
    
    SPIRAL("Spiral"),
    
    SPLIT("Split"),
    
    STRETCH("Stretch"),
    
    STRIPS("Strips"),
    
    STYLEEMPHASIS("StyleEmphasis"),
    
    SWISH("Swish"),
    
    SWIVEL("Swivel"),
    
    TEETER("Teeter"),
    
    THREAD("Thread"),
    
    TRANSPARENCY("Transparency"),
    
    UNFOLD("Unfold"),
    
    VERTICALGROW("VerticalGrow"),
    
    WAVE("Wave"),
    
    WEDGE("Wedge"),
    
    WHEEL("Wheel"),
    
    WHIP("Whip"),
    
    WIPE("Wipe"),
    
    MAGNIFY("Magnify"),
    
    ZOOM("Zoom"),
    
    OLEOBJECTSHOW("OLEObjectShow"),
    
    OLEOBJECTEDIT("OLEObjectEdit"),
    
    OLEOBJECTOPEN("OLEObjectOpen");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "type", alternate = { "Type" })
  private TypeEnum type;

  /**
   * Effect subtype.
   */
  @JsonAdapter(SubtypeEnum.Adapter.class)
  public enum SubtypeEnum {
    NONE("None"),
    
    ACROSS("Across"),
    
    BOTTOM("Bottom"),
    
    BOTTOMLEFT("BottomLeft"),
    
    BOTTOMRIGHT("BottomRight"),
    
    CENTER("Center"),
    
    CLOCKWISE("Clockwise"),
    
    COUNTERCLOCKWISE("CounterClockwise"),
    
    GRADUALANDCYCLECLOCKWISE("GradualAndCycleClockwise"),
    
    GRADUALANDCYCLECOUNTERCLOCKWISE("GradualAndCycleCounterClockwise"),
    
    DOWN("Down"),
    
    DOWNLEFT("DownLeft"),
    
    DOWNRIGHT("DownRight"),
    
    FONTALLCAPS("FontAllCaps"),
    
    FONTBOLD("FontBold"),
    
    FONTITALIC("FontItalic"),
    
    FONTSHADOW("FontShadow"),
    
    FONTSTRIKETHROUGH("FontStrikethrough"),
    
    FONTUNDERLINE("FontUnderline"),
    
    GRADUAL("Gradual"),
    
    HORIZONTAL("Horizontal"),
    
    HORIZONTALIN("HorizontalIn"),
    
    HORIZONTALOUT("HorizontalOut"),
    
    IN("In"),
    
    INBOTTOM("InBottom"),
    
    INCENTER("InCenter"),
    
    INSLIGHTLY("InSlightly"),
    
    INSTANT("Instant"),
    
    LEFT("Left"),
    
    ORDINALMASK("OrdinalMask"),
    
    OUT("Out"),
    
    OUTBOTTOM("OutBottom"),
    
    OUTCENTER("OutCenter"),
    
    OUTSLIGHTLY("OutSlightly"),
    
    RIGHT("Right"),
    
    SLIGHTLY("Slightly"),
    
    TOP("Top"),
    
    TOPLEFT("TopLeft"),
    
    TOPRIGHT("TopRight"),
    
    UP("Up"),
    
    UPLEFT("UpLeft"),
    
    UPRIGHT("UpRight"),
    
    VERTICAL("Vertical"),
    
    VERTICALIN("VerticalIn"),
    
    VERTICALOUT("VerticalOut"),
    
    WHEEL1("Wheel1"),
    
    WHEEL2("Wheel2"),
    
    WHEEL3("Wheel3"),
    
    WHEEL4("Wheel4"),
    
    WHEEL8("Wheel8");

    private String value;

    SubtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubtypeEnum fromValue(String text) {
      for (SubtypeEnum b : SubtypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubtypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "subtype", alternate = { "Subtype" })
  private SubtypeEnum subtype;

  /**
   * Preset class type.
   */
  @JsonAdapter(PresetClassTypeEnum.Adapter.class)
  public enum PresetClassTypeEnum {
    ENTRANCE("Entrance"),
    
    EXIT("Exit"),
    
    EMPHASIS("Emphasis"),
    
    PATH("Path"),
    
    MEDIACALL("MediaCall"),
    
    OLEACTIONVERBS("OLEActionVerbs");

    private String value;

    PresetClassTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PresetClassTypeEnum fromValue(String text) {
      for (PresetClassTypeEnum b : PresetClassTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PresetClassTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PresetClassTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PresetClassTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PresetClassTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "presetClassType", alternate = { "PresetClassType" })
  private PresetClassTypeEnum presetClassType;

  @SerializedName(value = "shapeIndex", alternate = { "ShapeIndex" })
  private Integer shapeIndex;

  /**
   * Effect trigger type.
   */
  @JsonAdapter(TriggerTypeEnum.Adapter.class)
  public enum TriggerTypeEnum {
    AFTERPREVIOUS("AfterPrevious"),
    
    ONCLICK("OnClick"),
    
    WITHPREVIOUS("WithPrevious");

    private String value;

    TriggerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TriggerTypeEnum fromValue(String text) {
      for (TriggerTypeEnum b : TriggerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TriggerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TriggerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TriggerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TriggerTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "triggerType", alternate = { "TriggerType" })
  private TriggerTypeEnum triggerType;

  @SerializedName(value = "accelerate", alternate = { "Accelerate" })
  private Double accelerate;

  @SerializedName(value = "autoReverse", alternate = { "AutoReverse" })
  private Boolean autoReverse;

  @SerializedName(value = "decelerate", alternate = { "Decelerate" })
  private Double decelerate;

  @SerializedName(value = "duration", alternate = { "Duration" })
  private Double duration;

  @SerializedName(value = "repeatCount", alternate = { "RepeatCount" })
  private Double repeatCount;

  @SerializedName(value = "repeatDuration", alternate = { "RepeatDuration" })
  private Double repeatDuration;

  /**
   * The way for a effect to restart after complete.
   */
  @JsonAdapter(RestartEnum.Adapter.class)
  public enum RestartEnum {
    ALWAYS("Always"),
    
    WHENNOTACTIVE("WhenNotActive"),
    
    NEVER("Never"),
    
    NOTDEFINED("NotDefined");

    private String value;

    RestartEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RestartEnum fromValue(String text) {
      for (RestartEnum b : RestartEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RestartEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RestartEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RestartEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RestartEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "restart", alternate = { "Restart" })
  private RestartEnum restart;

  @SerializedName(value = "speed", alternate = { "Speed" })
  private Double speed;

  @SerializedName(value = "triggerDelayTime", alternate = { "TriggerDelayTime" })
  private Double triggerDelayTime;


  public Effect() {
    super();
  }

  public Effect type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Effect type.
   * @return type
  **/
  @ApiModelProperty(value = "Effect type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Effect subtype(SubtypeEnum subtype) {
    this.subtype = subtype;
    return this;
  }

   /**
   * Effect subtype.
   * @return subtype
  **/
  @ApiModelProperty(value = "Effect subtype.")
  public SubtypeEnum getSubtype() {
    return subtype;
  }

  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }

  public Effect presetClassType(PresetClassTypeEnum presetClassType) {
    this.presetClassType = presetClassType;
    return this;
  }

   /**
   * Preset class type.
   * @return presetClassType
  **/
  @ApiModelProperty(value = "Preset class type.")
  public PresetClassTypeEnum getPresetClassType() {
    return presetClassType;
  }

  public void setPresetClassType(PresetClassTypeEnum presetClassType) {
    this.presetClassType = presetClassType;
  }

  public Effect shapeIndex(Integer shapeIndex) {
    this.shapeIndex = shapeIndex;
    return this;
  }

   /**
   * Shape index.
   * @return shapeIndex
  **/
  @ApiModelProperty(required = true, value = "Shape index.")
  public Integer getShapeIndex() {
    return shapeIndex;
  }

  public void setShapeIndex(Integer shapeIndex) {
    this.shapeIndex = shapeIndex;
  }

  public Effect triggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
    return this;
  }

   /**
   * Effect trigger type.
   * @return triggerType
  **/
  @ApiModelProperty(value = "Effect trigger type.")
  public TriggerTypeEnum getTriggerType() {
    return triggerType;
  }

  public void setTriggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
  }

  public Effect accelerate(Double accelerate) {
    this.accelerate = accelerate;
    return this;
  }

   /**
   * The percentage of duration accelerate behavior effect.
   * @return accelerate
  **/
  @ApiModelProperty(value = "The percentage of duration accelerate behavior effect.")
  public Double getAccelerate() {
    return accelerate;
  }

  public void setAccelerate(Double accelerate) {
    this.accelerate = accelerate;
  }

  public Effect autoReverse(Boolean autoReverse) {
    this.autoReverse = autoReverse;
    return this;
  }

   /**
   * True to automatically play the animation in reverse after playing it in the forward direction.
   * @return autoReverse
  **/
  @ApiModelProperty(value = "True to automatically play the animation in reverse after playing it in the forward direction.")
  public Boolean isAutoReverse() {
    return autoReverse;
  }

  public void setAutoReverse(Boolean autoReverse) {
    this.autoReverse = autoReverse;
  }

  public Effect decelerate(Double decelerate) {
    this.decelerate = decelerate;
    return this;
  }

   /**
   * The percentage of duration decelerate behavior effect.
   * @return decelerate
  **/
  @ApiModelProperty(value = "The percentage of duration decelerate behavior effect.")
  public Double getDecelerate() {
    return decelerate;
  }

  public void setDecelerate(Double decelerate) {
    this.decelerate = decelerate;
  }

  public Effect duration(Double duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of animation effect.
   * @return duration
  **/
  @ApiModelProperty(value = "The duration of animation effect.")
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public Effect repeatCount(Double repeatCount) {
    this.repeatCount = repeatCount;
    return this;
  }

   /**
   * The number of times the effect should repeat.
   * @return repeatCount
  **/
  @ApiModelProperty(value = "The number of times the effect should repeat.")
  public Double getRepeatCount() {
    return repeatCount;
  }

  public void setRepeatCount(Double repeatCount) {
    this.repeatCount = repeatCount;
  }

  public Effect repeatDuration(Double repeatDuration) {
    this.repeatDuration = repeatDuration;
    return this;
  }

   /**
   * The number of times the effect should repeat.
   * @return repeatDuration
  **/
  @ApiModelProperty(value = "The number of times the effect should repeat.")
  public Double getRepeatDuration() {
    return repeatDuration;
  }

  public void setRepeatDuration(Double repeatDuration) {
    this.repeatDuration = repeatDuration;
  }

  public Effect restart(RestartEnum restart) {
    this.restart = restart;
    return this;
  }

   /**
   * The way for a effect to restart after complete.
   * @return restart
  **/
  @ApiModelProperty(value = "The way for a effect to restart after complete.")
  public RestartEnum getRestart() {
    return restart;
  }

  public void setRestart(RestartEnum restart) {
    this.restart = restart;
  }

  public Effect speed(Double speed) {
    this.speed = speed;
    return this;
  }

   /**
   * The percentage by which to speed up (or slow down) the timing.
   * @return speed
  **/
  @ApiModelProperty(value = "The percentage by which to speed up (or slow down) the timing.")
  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  public Effect triggerDelayTime(Double triggerDelayTime) {
    this.triggerDelayTime = triggerDelayTime;
    return this;
  }

   /**
   * Delay time after trigger.
   * @return triggerDelayTime
  **/
  @ApiModelProperty(value = "Delay time after trigger.")
  public Double getTriggerDelayTime() {
    return triggerDelayTime;
  }

  public void setTriggerDelayTime(Double triggerDelayTime) {
    this.triggerDelayTime = triggerDelayTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Effect effect = (Effect) o;
    return true && Objects.equals(this.type, effect.type) && Objects.equals(this.subtype, effect.subtype) && Objects.equals(this.presetClassType, effect.presetClassType) && Objects.equals(this.shapeIndex, effect.shapeIndex) && Objects.equals(this.triggerType, effect.triggerType) && Objects.equals(this.accelerate, effect.accelerate) && Objects.equals(this.autoReverse, effect.autoReverse) && Objects.equals(this.decelerate, effect.decelerate) && Objects.equals(this.duration, effect.duration) && Objects.equals(this.repeatCount, effect.repeatCount) && Objects.equals(this.repeatDuration, effect.repeatDuration) && Objects.equals(this.restart, effect.restart) && Objects.equals(this.speed, effect.speed) && Objects.equals(this.triggerDelayTime, effect.triggerDelayTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subtype, presetClassType, shapeIndex, triggerType, accelerate, autoReverse, decelerate, duration, repeatCount, repeatDuration, restart, speed, triggerDelayTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Effect {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    presetClassType: ").append(toIndentedString(presetClassType)).append("\n");
    sb.append("    shapeIndex: ").append(toIndentedString(shapeIndex)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    accelerate: ").append(toIndentedString(accelerate)).append("\n");
    sb.append("    autoReverse: ").append(toIndentedString(autoReverse)).append("\n");
    sb.append("    decelerate: ").append(toIndentedString(decelerate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    repeatCount: ").append(toIndentedString(repeatCount)).append("\n");
    sb.append("    repeatDuration: ").append(toIndentedString(repeatDuration)).append("\n");
    sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    triggerDelayTime: ").append(toIndentedString(triggerDelayTime)).append("\n");
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
