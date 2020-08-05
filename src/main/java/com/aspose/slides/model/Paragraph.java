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
import com.aspose.slides.model.Portion;
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
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Represents paragraph resource
 */
@ApiModel(description = "Represents paragraph resource")
public class Paragraph extends ResourceBase {
  @SerializedName(value = "marginLeft", alternate = { "MarginLeft" })
  private Double marginLeft;

  @SerializedName(value = "marginRight", alternate = { "MarginRight" })
  private Double marginRight;

  @SerializedName(value = "spaceBefore", alternate = { "SpaceBefore" })
  private Double spaceBefore;

  @SerializedName(value = "spaceAfter", alternate = { "SpaceAfter" })
  private Double spaceAfter;

  @SerializedName(value = "spaceWithin", alternate = { "SpaceWithin" })
  private Double spaceWithin;

  @SerializedName(value = "indent", alternate = { "Indent" })
  private Double indent;

  /**
   * Text alignment.
   */
  @JsonAdapter(AlignmentEnum.Adapter.class)
  public enum AlignmentEnum {
    LEFT("Left"),
    
    CENTER("Center"),
    
    RIGHT("Right"),
    
    JUSTIFY("Justify"),
    
    JUSTIFYLOW("JustifyLow"),
    
    DISTRIBUTED("Distributed"),
    
    NOTDEFINED("NotDefined");

    private String value;

    AlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlignmentEnum fromValue(String text) {
      for (AlignmentEnum b : AlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "alignment", alternate = { "Alignment" })
  private AlignmentEnum alignment;

  /**
   * Font alignment.
   */
  @JsonAdapter(FontAlignmentEnum.Adapter.class)
  public enum FontAlignmentEnum {
    AUTOMATIC("Automatic"),
    
    TOP("Top"),
    
    CENTER("Center"),
    
    BOTTOM("Bottom"),
    
    BASELINE("Baseline"),
    
    DEFAULT("Default");

    private String value;

    FontAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FontAlignmentEnum fromValue(String text) {
      for (FontAlignmentEnum b : FontAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FontAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FontAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FontAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FontAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "fontAlignment", alternate = { "FontAlignment" })
  private FontAlignmentEnum fontAlignment;

  @SerializedName(value = "defaultTabSize", alternate = { "DefaultTabSize" })
  private Double defaultTabSize;

  @SerializedName(value = "depth", alternate = { "Depth" })
  private Integer depth;

  @SerializedName(value = "bulletChar", alternate = { "BulletChar" })
  private String bulletChar;

  @SerializedName(value = "bulletHeight", alternate = { "BulletHeight" })
  private Double bulletHeight;

  /**
   * Bullet type.
   */
  @JsonAdapter(BulletTypeEnum.Adapter.class)
  public enum BulletTypeEnum {
    NONE("None"),
    
    SYMBOL("Symbol"),
    
    NUMBERED("Numbered"),
    
    PICTURE("Picture"),
    
    NOTDEFINED("NotDefined");

    private String value;

    BulletTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BulletTypeEnum fromValue(String text) {
      for (BulletTypeEnum b : BulletTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BulletTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BulletTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BulletTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BulletTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "bulletType", alternate = { "BulletType" })
  private BulletTypeEnum bulletType;

  @SerializedName(value = "numberedBulletStartWith", alternate = { "NumberedBulletStartWith" })
  private Integer numberedBulletStartWith;

  /**
   * Numbered bullet style.
   */
  @JsonAdapter(NumberedBulletStyleEnum.Adapter.class)
  public enum NumberedBulletStyleEnum {
    BULLETALPHALCPERIOD("BulletAlphaLCPeriod"),
    
    BULLETALPHAUCPERIOD("BulletAlphaUCPeriod"),
    
    BULLETARABICPARENRIGHT("BulletArabicParenRight"),
    
    BULLETARABICPERIOD("BulletArabicPeriod"),
    
    BULLETROMANLCPARENBOTH("BulletRomanLCParenBoth"),
    
    BULLETROMANLCPARENRIGHT("BulletRomanLCParenRight"),
    
    BULLETROMANLCPERIOD("BulletRomanLCPeriod"),
    
    BULLETROMANUCPERIOD("BulletRomanUCPeriod"),
    
    BULLETALPHALCPARENBOTH("BulletAlphaLCParenBoth"),
    
    BULLETALPHALCPARENRIGHT("BulletAlphaLCParenRight"),
    
    BULLETALPHAUCPARENBOTH("BulletAlphaUCParenBoth"),
    
    BULLETALPHAUCPARENRIGHT("BulletAlphaUCParenRight"),
    
    BULLETARABICPARENBOTH("BulletArabicParenBoth"),
    
    BULLETARABICPLAIN("BulletArabicPlain"),
    
    BULLETROMANUCPARENBOTH("BulletRomanUCParenBoth"),
    
    BULLETROMANUCPARENRIGHT("BulletRomanUCParenRight"),
    
    BULLETSIMPCHINPLAIN("BulletSimpChinPlain"),
    
    BULLETSIMPCHINPERIOD("BulletSimpChinPeriod"),
    
    BULLETCIRCLENUMDBPLAIN("BulletCircleNumDBPlain"),
    
    BULLETCIRCLENUMWDWHITEPLAIN("BulletCircleNumWDWhitePlain"),
    
    BULLETCIRCLENUMWDBLACKPLAIN("BulletCircleNumWDBlackPlain"),
    
    BULLETTRADCHINPLAIN("BulletTradChinPlain"),
    
    BULLETTRADCHINPERIOD("BulletTradChinPeriod"),
    
    BULLETARABICALPHADASH("BulletArabicAlphaDash"),
    
    BULLETARABICABJADDASH("BulletArabicAbjadDash"),
    
    BULLETHEBREWALPHADASH("BulletHebrewAlphaDash"),
    
    BULLETKANJIKOREANPLAIN("BulletKanjiKoreanPlain"),
    
    BULLETKANJIKOREANPERIOD("BulletKanjiKoreanPeriod"),
    
    BULLETARABICDBPLAIN("BulletArabicDBPlain"),
    
    BULLETARABICDBPERIOD("BulletArabicDBPeriod"),
    
    BULLETTHAIALPHAPERIOD("BulletThaiAlphaPeriod"),
    
    BULLETTHAIALPHAPARENRIGHT("BulletThaiAlphaParenRight"),
    
    BULLETTHAIALPHAPARENBOTH("BulletThaiAlphaParenBoth"),
    
    BULLETTHAINUMPERIOD("BulletThaiNumPeriod"),
    
    BULLETTHAINUMPARENRIGHT("BulletThaiNumParenRight"),
    
    BULLETTHAINUMPARENBOTH("BulletThaiNumParenBoth"),
    
    BULLETHINDIALPHAPERIOD("BulletHindiAlphaPeriod"),
    
    BULLETHINDINUMPERIOD("BulletHindiNumPeriod"),
    
    BULLETKANJISIMPCHINDBPERIOD("BulletKanjiSimpChinDBPeriod"),
    
    BULLETHINDINUMPARENRIGHT("BulletHindiNumParenRight"),
    
    BULLETHINDIALPHA1PERIOD("BulletHindiAlpha1Period"),
    
    NOTDEFINED("NotDefined");

    private String value;

    NumberedBulletStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NumberedBulletStyleEnum fromValue(String text) {
      for (NumberedBulletStyleEnum b : NumberedBulletStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NumberedBulletStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NumberedBulletStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NumberedBulletStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NumberedBulletStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "numberedBulletStyle", alternate = { "NumberedBulletStyle" })
  private NumberedBulletStyleEnum numberedBulletStyle;

  /**
   * True if hanging punctuation is used with the paragraph.
   */
  @JsonAdapter(HangingPunctuationEnum.Adapter.class)
  public enum HangingPunctuationEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    HangingPunctuationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HangingPunctuationEnum fromValue(String text) {
      for (HangingPunctuationEnum b : HangingPunctuationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HangingPunctuationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HangingPunctuationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HangingPunctuationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HangingPunctuationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "hangingPunctuation", alternate = { "HangingPunctuation" })
  private HangingPunctuationEnum hangingPunctuation;

  /**
   * True if East Asian line break is used with the paragraph.
   */
  @JsonAdapter(EastAsianLineBreakEnum.Adapter.class)
  public enum EastAsianLineBreakEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    EastAsianLineBreakEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EastAsianLineBreakEnum fromValue(String text) {
      for (EastAsianLineBreakEnum b : EastAsianLineBreakEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EastAsianLineBreakEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EastAsianLineBreakEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EastAsianLineBreakEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EastAsianLineBreakEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "eastAsianLineBreak", alternate = { "EastAsianLineBreak" })
  private EastAsianLineBreakEnum eastAsianLineBreak;

  /**
   * True if Latin line break is used with the paragraph.
   */
  @JsonAdapter(LatinLineBreakEnum.Adapter.class)
  public enum LatinLineBreakEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    LatinLineBreakEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LatinLineBreakEnum fromValue(String text) {
      for (LatinLineBreakEnum b : LatinLineBreakEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LatinLineBreakEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LatinLineBreakEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LatinLineBreakEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LatinLineBreakEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "latinLineBreak", alternate = { "LatinLineBreak" })
  private LatinLineBreakEnum latinLineBreak;

  /**
   * True if right to left direction is used with the paragraph.
   */
  @JsonAdapter(RightToLeftEnum.Adapter.class)
  public enum RightToLeftEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    RightToLeftEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RightToLeftEnum fromValue(String text) {
      for (RightToLeftEnum b : RightToLeftEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RightToLeftEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RightToLeftEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RightToLeftEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RightToLeftEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "rightToLeft", alternate = { "RightToLeft" })
  private RightToLeftEnum rightToLeft;

  @SerializedName(value = "portionList", alternate = { "PortionList" })
  private List<Portion> portionList = null;


  public Paragraph() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
    setPortionList(new ArrayList<Portion>());
  }

  public Paragraph marginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

   /**
   * Left margin.
   * @return marginLeft
  **/
  @ApiModelProperty(value = "Left margin.")
  public Double getMarginLeft() {
    return marginLeft;
  }

  public void setMarginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
  }

  public Paragraph marginRight(Double marginRight) {
    this.marginRight = marginRight;
    return this;
  }

   /**
   * Right margin.
   * @return marginRight
  **/
  @ApiModelProperty(value = "Right margin.")
  public Double getMarginRight() {
    return marginRight;
  }

  public void setMarginRight(Double marginRight) {
    this.marginRight = marginRight;
  }

  public Paragraph spaceBefore(Double spaceBefore) {
    this.spaceBefore = spaceBefore;
    return this;
  }

   /**
   * Left spacing.
   * @return spaceBefore
  **/
  @ApiModelProperty(value = "Left spacing.")
  public Double getSpaceBefore() {
    return spaceBefore;
  }

  public void setSpaceBefore(Double spaceBefore) {
    this.spaceBefore = spaceBefore;
  }

  public Paragraph spaceAfter(Double spaceAfter) {
    this.spaceAfter = spaceAfter;
    return this;
  }

   /**
   * Right spacing.
   * @return spaceAfter
  **/
  @ApiModelProperty(value = "Right spacing.")
  public Double getSpaceAfter() {
    return spaceAfter;
  }

  public void setSpaceAfter(Double spaceAfter) {
    this.spaceAfter = spaceAfter;
  }

  public Paragraph spaceWithin(Double spaceWithin) {
    this.spaceWithin = spaceWithin;
    return this;
  }

   /**
   * Spacing between lines.
   * @return spaceWithin
  **/
  @ApiModelProperty(value = "Spacing between lines.")
  public Double getSpaceWithin() {
    return spaceWithin;
  }

  public void setSpaceWithin(Double spaceWithin) {
    this.spaceWithin = spaceWithin;
  }

  public Paragraph indent(Double indent) {
    this.indent = indent;
    return this;
  }

   /**
   * First line indent.
   * @return indent
  **/
  @ApiModelProperty(value = "First line indent.")
  public Double getIndent() {
    return indent;
  }

  public void setIndent(Double indent) {
    this.indent = indent;
  }

  public Paragraph alignment(AlignmentEnum alignment) {
    this.alignment = alignment;
    return this;
  }

   /**
   * Text alignment.
   * @return alignment
  **/
  @ApiModelProperty(value = "Text alignment.")
  public AlignmentEnum getAlignment() {
    return alignment;
  }

  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }

  public Paragraph fontAlignment(FontAlignmentEnum fontAlignment) {
    this.fontAlignment = fontAlignment;
    return this;
  }

   /**
   * Font alignment.
   * @return fontAlignment
  **/
  @ApiModelProperty(value = "Font alignment.")
  public FontAlignmentEnum getFontAlignment() {
    return fontAlignment;
  }

  public void setFontAlignment(FontAlignmentEnum fontAlignment) {
    this.fontAlignment = fontAlignment;
  }

  public Paragraph defaultTabSize(Double defaultTabSize) {
    this.defaultTabSize = defaultTabSize;
    return this;
  }

   /**
   * Default tabulation size.
   * @return defaultTabSize
  **/
  @ApiModelProperty(value = "Default tabulation size.")
  public Double getDefaultTabSize() {
    return defaultTabSize;
  }

  public void setDefaultTabSize(Double defaultTabSize) {
    this.defaultTabSize = defaultTabSize;
  }

  public Paragraph depth(Integer depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Depth.
   * @return depth
  **/
  @ApiModelProperty(value = "Depth.")
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public Paragraph bulletChar(String bulletChar) {
    this.bulletChar = bulletChar;
    return this;
  }

   /**
   * Bullet char.
   * @return bulletChar
  **/
  @ApiModelProperty(value = "Bullet char.")
  public String getBulletChar() {
    return bulletChar;
  }

  public void setBulletChar(String bulletChar) {
    this.bulletChar = bulletChar;
  }

  public Paragraph bulletHeight(Double bulletHeight) {
    this.bulletHeight = bulletHeight;
    return this;
  }

   /**
   * Bullet height.
   * @return bulletHeight
  **/
  @ApiModelProperty(value = "Bullet height.")
  public Double getBulletHeight() {
    return bulletHeight;
  }

  public void setBulletHeight(Double bulletHeight) {
    this.bulletHeight = bulletHeight;
  }

  public Paragraph bulletType(BulletTypeEnum bulletType) {
    this.bulletType = bulletType;
    return this;
  }

   /**
   * Bullet type.
   * @return bulletType
  **/
  @ApiModelProperty(value = "Bullet type.")
  public BulletTypeEnum getBulletType() {
    return bulletType;
  }

  public void setBulletType(BulletTypeEnum bulletType) {
    this.bulletType = bulletType;
  }

  public Paragraph numberedBulletStartWith(Integer numberedBulletStartWith) {
    this.numberedBulletStartWith = numberedBulletStartWith;
    return this;
  }

   /**
   * Starting number for a numbered bullet.
   * @return numberedBulletStartWith
  **/
  @ApiModelProperty(value = "Starting number for a numbered bullet.")
  public Integer getNumberedBulletStartWith() {
    return numberedBulletStartWith;
  }

  public void setNumberedBulletStartWith(Integer numberedBulletStartWith) {
    this.numberedBulletStartWith = numberedBulletStartWith;
  }

  public Paragraph numberedBulletStyle(NumberedBulletStyleEnum numberedBulletStyle) {
    this.numberedBulletStyle = numberedBulletStyle;
    return this;
  }

   /**
   * Numbered bullet style.
   * @return numberedBulletStyle
  **/
  @ApiModelProperty(value = "Numbered bullet style.")
  public NumberedBulletStyleEnum getNumberedBulletStyle() {
    return numberedBulletStyle;
  }

  public void setNumberedBulletStyle(NumberedBulletStyleEnum numberedBulletStyle) {
    this.numberedBulletStyle = numberedBulletStyle;
  }

  public Paragraph hangingPunctuation(HangingPunctuationEnum hangingPunctuation) {
    this.hangingPunctuation = hangingPunctuation;
    return this;
  }

   /**
   * True if hanging punctuation is used with the paragraph.
   * @return hangingPunctuation
  **/
  @ApiModelProperty(value = "True if hanging punctuation is used with the paragraph.")
  public HangingPunctuationEnum getHangingPunctuation() {
    return hangingPunctuation;
  }

  public void setHangingPunctuation(HangingPunctuationEnum hangingPunctuation) {
    this.hangingPunctuation = hangingPunctuation;
  }

  public Paragraph eastAsianLineBreak(EastAsianLineBreakEnum eastAsianLineBreak) {
    this.eastAsianLineBreak = eastAsianLineBreak;
    return this;
  }

   /**
   * True if East Asian line break is used with the paragraph.
   * @return eastAsianLineBreak
  **/
  @ApiModelProperty(value = "True if East Asian line break is used with the paragraph.")
  public EastAsianLineBreakEnum getEastAsianLineBreak() {
    return eastAsianLineBreak;
  }

  public void setEastAsianLineBreak(EastAsianLineBreakEnum eastAsianLineBreak) {
    this.eastAsianLineBreak = eastAsianLineBreak;
  }

  public Paragraph latinLineBreak(LatinLineBreakEnum latinLineBreak) {
    this.latinLineBreak = latinLineBreak;
    return this;
  }

   /**
   * True if Latin line break is used with the paragraph.
   * @return latinLineBreak
  **/
  @ApiModelProperty(value = "True if Latin line break is used with the paragraph.")
  public LatinLineBreakEnum getLatinLineBreak() {
    return latinLineBreak;
  }

  public void setLatinLineBreak(LatinLineBreakEnum latinLineBreak) {
    this.latinLineBreak = latinLineBreak;
  }

  public Paragraph rightToLeft(RightToLeftEnum rightToLeft) {
    this.rightToLeft = rightToLeft;
    return this;
  }

   /**
   * True if right to left direction is used with the paragraph.
   * @return rightToLeft
  **/
  @ApiModelProperty(value = "True if right to left direction is used with the paragraph.")
  public RightToLeftEnum getRightToLeft() {
    return rightToLeft;
  }

  public void setRightToLeft(RightToLeftEnum rightToLeft) {
    this.rightToLeft = rightToLeft;
  }

  public Paragraph portionList(List<Portion> portionList) {
    this.portionList = portionList;
    return this;
  }

  public Paragraph addPortionListItem(Portion portionListItem) {
    if (this.portionList == null) {
      this.portionList = new ArrayList<Portion>();
    }
    this.portionList.add(portionListItem);
    return this;
  }

   /**
   * List of portion links.
   * @return portionList
  **/
  @ApiModelProperty(value = "List of portion links.")
  public List<Portion> getPortionList() {
    return portionList;
  }

  public void setPortionList(List<Portion> portionList) {
    this.portionList = portionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paragraph paragraph = (Paragraph) o;
    return true && Objects.equals(this.marginLeft, paragraph.marginLeft) && Objects.equals(this.marginRight, paragraph.marginRight) && Objects.equals(this.spaceBefore, paragraph.spaceBefore) && Objects.equals(this.spaceAfter, paragraph.spaceAfter) && Objects.equals(this.spaceWithin, paragraph.spaceWithin) && Objects.equals(this.indent, paragraph.indent) && Objects.equals(this.alignment, paragraph.alignment) && Objects.equals(this.fontAlignment, paragraph.fontAlignment) && Objects.equals(this.defaultTabSize, paragraph.defaultTabSize) && Objects.equals(this.depth, paragraph.depth) && Objects.equals(this.bulletChar, paragraph.bulletChar) && Objects.equals(this.bulletHeight, paragraph.bulletHeight) && Objects.equals(this.bulletType, paragraph.bulletType) && Objects.equals(this.numberedBulletStartWith, paragraph.numberedBulletStartWith) && Objects.equals(this.numberedBulletStyle, paragraph.numberedBulletStyle) && Objects.equals(this.hangingPunctuation, paragraph.hangingPunctuation) && Objects.equals(this.eastAsianLineBreak, paragraph.eastAsianLineBreak) && Objects.equals(this.latinLineBreak, paragraph.latinLineBreak) && Objects.equals(this.rightToLeft, paragraph.rightToLeft) && Objects.equals(this.portionList, paragraph.portionList) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marginLeft, marginRight, spaceBefore, spaceAfter, spaceWithin, indent, alignment, fontAlignment, defaultTabSize, depth, bulletChar, bulletHeight, bulletType, numberedBulletStartWith, numberedBulletStyle, hangingPunctuation, eastAsianLineBreak, latinLineBreak, rightToLeft, portionList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paragraph {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    marginLeft: ").append(toIndentedString(marginLeft)).append("\n");
    sb.append("    marginRight: ").append(toIndentedString(marginRight)).append("\n");
    sb.append("    spaceBefore: ").append(toIndentedString(spaceBefore)).append("\n");
    sb.append("    spaceAfter: ").append(toIndentedString(spaceAfter)).append("\n");
    sb.append("    spaceWithin: ").append(toIndentedString(spaceWithin)).append("\n");
    sb.append("    indent: ").append(toIndentedString(indent)).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    fontAlignment: ").append(toIndentedString(fontAlignment)).append("\n");
    sb.append("    defaultTabSize: ").append(toIndentedString(defaultTabSize)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    bulletChar: ").append(toIndentedString(bulletChar)).append("\n");
    sb.append("    bulletHeight: ").append(toIndentedString(bulletHeight)).append("\n");
    sb.append("    bulletType: ").append(toIndentedString(bulletType)).append("\n");
    sb.append("    numberedBulletStartWith: ").append(toIndentedString(numberedBulletStartWith)).append("\n");
    sb.append("    numberedBulletStyle: ").append(toIndentedString(numberedBulletStyle)).append("\n");
    sb.append("    hangingPunctuation: ").append(toIndentedString(hangingPunctuation)).append("\n");
    sb.append("    eastAsianLineBreak: ").append(toIndentedString(eastAsianLineBreak)).append("\n");
    sb.append("    latinLineBreak: ").append(toIndentedString(latinLineBreak)).append("\n");
    sb.append("    rightToLeft: ").append(toIndentedString(rightToLeft)).append("\n");
    sb.append("    portionList: ").append(toIndentedString(portionList)).append("\n");
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
