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
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
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
 * Represents portion resource
 */
@ApiModel(description = "Represents portion resource")
public class Portion extends ResourceBase {
  @SerializedName(value = "text", alternate = { "Text" })
  private String text;

  /**
   * True for bold font.
   */
  @JsonAdapter(FontBoldEnum.Adapter.class)
  public enum FontBoldEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    FontBoldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FontBoldEnum fromValue(String text) {
      for (FontBoldEnum b : FontBoldEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FontBoldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FontBoldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FontBoldEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FontBoldEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "fontBold", alternate = { "FontBold" })
  private FontBoldEnum fontBold;

  /**
   * True for italic font.
   */
  @JsonAdapter(FontItalicEnum.Adapter.class)
  public enum FontItalicEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    FontItalicEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FontItalicEnum fromValue(String text) {
      for (FontItalicEnum b : FontItalicEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FontItalicEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FontItalicEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FontItalicEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FontItalicEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "fontItalic", alternate = { "FontItalic" })
  private FontItalicEnum fontItalic;

  /**
   * Text underline type.
   */
  @JsonAdapter(FontUnderlineEnum.Adapter.class)
  public enum FontUnderlineEnum {
    NONE("None"),
    
    WORDS("Words"),
    
    SINGLE("Single"),
    
    DOUBLE("Double"),
    
    HEAVY("Heavy"),
    
    DOTTED("Dotted"),
    
    HEAVYDOTTED("HeavyDotted"),
    
    DASHED("Dashed"),
    
    HEAVYDASHED("HeavyDashed"),
    
    LONGDASHED("LongDashed"),
    
    HEAVYLONGDASHED("HeavyLongDashed"),
    
    DOTDASH("DotDash"),
    
    HEAVYDOTDASH("HeavyDotDash"),
    
    DOTDOTDASH("DotDotDash"),
    
    HEAVYDOTDOTDASH("HeavyDotDotDash"),
    
    WAVY("Wavy"),
    
    HEAVYWAVY("HeavyWavy"),
    
    DOUBLEWAVY("DoubleWavy"),
    
    NOTDEFINED("NotDefined");

    private String value;

    FontUnderlineEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FontUnderlineEnum fromValue(String text) {
      for (FontUnderlineEnum b : FontUnderlineEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FontUnderlineEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FontUnderlineEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FontUnderlineEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FontUnderlineEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "fontUnderline", alternate = { "FontUnderline" })
  private FontUnderlineEnum fontUnderline;

  /**
   * Text strikethrough type.
   */
  @JsonAdapter(StrikethroughTypeEnum.Adapter.class)
  public enum StrikethroughTypeEnum {
    NONE("None"),
    
    SINGLE("Single"),
    
    DOUBLE("Double"),
    
    NOTDEFINED("NotDefined");

    private String value;

    StrikethroughTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StrikethroughTypeEnum fromValue(String text) {
      for (StrikethroughTypeEnum b : StrikethroughTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StrikethroughTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StrikethroughTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StrikethroughTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StrikethroughTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "strikethroughType", alternate = { "StrikethroughType" })
  private StrikethroughTypeEnum strikethroughType;

  /**
   * Text capitalization type.
   */
  @JsonAdapter(TextCapTypeEnum.Adapter.class)
  public enum TextCapTypeEnum {
    NONE("None"),
    
    SMALL("Small"),
    
    ALL("All"),
    
    NOTDEFINED("NotDefined");

    private String value;

    TextCapTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextCapTypeEnum fromValue(String text) {
      for (TextCapTypeEnum b : TextCapTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextCapTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextCapTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextCapTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextCapTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "textCapType", alternate = { "TextCapType" })
  private TextCapTypeEnum textCapType;

  @SerializedName(value = "escapement", alternate = { "Escapement" })
  private Double escapement;

  @SerializedName(value = "spacing", alternate = { "Spacing" })
  private Double spacing;

  @SerializedName(value = "fontColor", alternate = { "FontColor" })
  private String fontColor;

  @SerializedName(value = "highlightColor", alternate = { "HighlightColor" })
  private String highlightColor;

  @SerializedName(value = "fontHeight", alternate = { "FontHeight" })
  private Double fontHeight;

  /**
   * True to normalize the text.
   */
  @JsonAdapter(NormaliseHeightEnum.Adapter.class)
  public enum NormaliseHeightEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    NormaliseHeightEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NormaliseHeightEnum fromValue(String text) {
      for (NormaliseHeightEnum b : NormaliseHeightEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NormaliseHeightEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NormaliseHeightEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NormaliseHeightEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NormaliseHeightEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "normaliseHeight", alternate = { "NormaliseHeight" })
  private NormaliseHeightEnum normaliseHeight;

  /**
   * True if the text proof should be disabled.
   */
  @JsonAdapter(ProofDisabledEnum.Adapter.class)
  public enum ProofDisabledEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    ProofDisabledEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProofDisabledEnum fromValue(String text) {
      for (ProofDisabledEnum b : ProofDisabledEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProofDisabledEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProofDisabledEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProofDisabledEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProofDisabledEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "proofDisabled", alternate = { "ProofDisabled" })
  private ProofDisabledEnum proofDisabled;

  @SerializedName(value = "smartTagClean", alternate = { "SmartTagClean" })
  private Boolean smartTagClean;

  @SerializedName(value = "kerningMinimalSize", alternate = { "KerningMinimalSize" })
  private Double kerningMinimalSize;

  /**
   * True if numbers should ignore East-Asian specific vertical text layout.
   */
  @JsonAdapter(KumimojiEnum.Adapter.class)
  public enum KumimojiEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    KumimojiEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KumimojiEnum fromValue(String text) {
      for (KumimojiEnum b : KumimojiEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KumimojiEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KumimojiEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KumimojiEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KumimojiEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "kumimoji", alternate = { "Kumimoji" })
  private KumimojiEnum kumimoji;

  @SerializedName(value = "languageId", alternate = { "LanguageId" })
  private String languageId;

  @SerializedName(value = "alternativeLanguageId", alternate = { "AlternativeLanguageId" })
  private String alternativeLanguageId;

  /**
   * True if underline style has own FillFormat properties.
   */
  @JsonAdapter(IsHardUnderlineFillEnum.Adapter.class)
  public enum IsHardUnderlineFillEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    IsHardUnderlineFillEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsHardUnderlineFillEnum fromValue(String text) {
      for (IsHardUnderlineFillEnum b : IsHardUnderlineFillEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IsHardUnderlineFillEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsHardUnderlineFillEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsHardUnderlineFillEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IsHardUnderlineFillEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "isHardUnderlineFill", alternate = { "IsHardUnderlineFill" })
  private IsHardUnderlineFillEnum isHardUnderlineFill;

  /**
   * True if underline style has own LineFormat properties.
   */
  @JsonAdapter(IsHardUnderlineLineEnum.Adapter.class)
  public enum IsHardUnderlineLineEnum {
    FALSE("False"),
    
    TRUE("True"),
    
    NOTDEFINED("NotDefined");

    private String value;

    IsHardUnderlineLineEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsHardUnderlineLineEnum fromValue(String text) {
      for (IsHardUnderlineLineEnum b : IsHardUnderlineLineEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IsHardUnderlineLineEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsHardUnderlineLineEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsHardUnderlineLineEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IsHardUnderlineLineEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "isHardUnderlineLine", alternate = { "IsHardUnderlineLine" })
  private IsHardUnderlineLineEnum isHardUnderlineLine;

  @SerializedName(value = "fillFormat", alternate = { "FillFormat" })
  private FillFormat fillFormat;

  @SerializedName(value = "effectFormat", alternate = { "EffectFormat" })
  private EffectFormat effectFormat;

  @SerializedName(value = "lineFormat", alternate = { "LineFormat" })
  private LineFormat lineFormat;

  @SerializedName(value = "underlineFillFormat", alternate = { "UnderlineFillFormat" })
  private FillFormat underlineFillFormat;

  @SerializedName(value = "underlineLineFormat", alternate = { "UnderlineLineFormat" })
  private LineFormat underlineLineFormat;


  public Portion() {
    super();
  }

  public Portion text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text.
   * @return text
  **/
  @ApiModelProperty(value = "Text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Portion fontBold(FontBoldEnum fontBold) {
    this.fontBold = fontBold;
    return this;
  }

   /**
   * True for bold font.
   * @return fontBold
  **/
  @ApiModelProperty(value = "True for bold font.")
  public FontBoldEnum getFontBold() {
    return fontBold;
  }

  public void setFontBold(FontBoldEnum fontBold) {
    this.fontBold = fontBold;
  }

  public Portion fontItalic(FontItalicEnum fontItalic) {
    this.fontItalic = fontItalic;
    return this;
  }

   /**
   * True for italic font.
   * @return fontItalic
  **/
  @ApiModelProperty(value = "True for italic font.")
  public FontItalicEnum getFontItalic() {
    return fontItalic;
  }

  public void setFontItalic(FontItalicEnum fontItalic) {
    this.fontItalic = fontItalic;
  }

  public Portion fontUnderline(FontUnderlineEnum fontUnderline) {
    this.fontUnderline = fontUnderline;
    return this;
  }

   /**
   * Text underline type.
   * @return fontUnderline
  **/
  @ApiModelProperty(value = "Text underline type.")
  public FontUnderlineEnum getFontUnderline() {
    return fontUnderline;
  }

  public void setFontUnderline(FontUnderlineEnum fontUnderline) {
    this.fontUnderline = fontUnderline;
  }

  public Portion strikethroughType(StrikethroughTypeEnum strikethroughType) {
    this.strikethroughType = strikethroughType;
    return this;
  }

   /**
   * Text strikethrough type.
   * @return strikethroughType
  **/
  @ApiModelProperty(value = "Text strikethrough type.")
  public StrikethroughTypeEnum getStrikethroughType() {
    return strikethroughType;
  }

  public void setStrikethroughType(StrikethroughTypeEnum strikethroughType) {
    this.strikethroughType = strikethroughType;
  }

  public Portion textCapType(TextCapTypeEnum textCapType) {
    this.textCapType = textCapType;
    return this;
  }

   /**
   * Text capitalization type.
   * @return textCapType
  **/
  @ApiModelProperty(value = "Text capitalization type.")
  public TextCapTypeEnum getTextCapType() {
    return textCapType;
  }

  public void setTextCapType(TextCapTypeEnum textCapType) {
    this.textCapType = textCapType;
  }

  public Portion escapement(Double escapement) {
    this.escapement = escapement;
    return this;
  }

   /**
   * Superscript or subscript of the text.
   * @return escapement
  **/
  @ApiModelProperty(value = "Superscript or subscript of the text.")
  public Double getEscapement() {
    return escapement;
  }

  public void setEscapement(Double escapement) {
    this.escapement = escapement;
  }

  public Portion spacing(Double spacing) {
    this.spacing = spacing;
    return this;
  }

   /**
   * Intercharacter spacing increment.
   * @return spacing
  **/
  @ApiModelProperty(value = "Intercharacter spacing increment.")
  public Double getSpacing() {
    return spacing;
  }

  public void setSpacing(Double spacing) {
    this.spacing = spacing;
  }

  public Portion fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

   /**
   * Font color.
   * @return fontColor
  **/
  @ApiModelProperty(value = "Font color.")
  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public Portion highlightColor(String highlightColor) {
    this.highlightColor = highlightColor;
    return this;
  }

   /**
   * Highlight color.
   * @return highlightColor
  **/
  @ApiModelProperty(value = "Highlight color.")
  public String getHighlightColor() {
    return highlightColor;
  }

  public void setHighlightColor(String highlightColor) {
    this.highlightColor = highlightColor;
  }

  public Portion fontHeight(Double fontHeight) {
    this.fontHeight = fontHeight;
    return this;
  }

   /**
   * Font height.
   * @return fontHeight
  **/
  @ApiModelProperty(value = "Font height.")
  public Double getFontHeight() {
    return fontHeight;
  }

  public void setFontHeight(Double fontHeight) {
    this.fontHeight = fontHeight;
  }

  public Portion normaliseHeight(NormaliseHeightEnum normaliseHeight) {
    this.normaliseHeight = normaliseHeight;
    return this;
  }

   /**
   * True to normalize the text.
   * @return normaliseHeight
  **/
  @ApiModelProperty(value = "True to normalize the text.")
  public NormaliseHeightEnum getNormaliseHeight() {
    return normaliseHeight;
  }

  public void setNormaliseHeight(NormaliseHeightEnum normaliseHeight) {
    this.normaliseHeight = normaliseHeight;
  }

  public Portion proofDisabled(ProofDisabledEnum proofDisabled) {
    this.proofDisabled = proofDisabled;
    return this;
  }

   /**
   * True if the text proof should be disabled.
   * @return proofDisabled
  **/
  @ApiModelProperty(value = "True if the text proof should be disabled.")
  public ProofDisabledEnum getProofDisabled() {
    return proofDisabled;
  }

  public void setProofDisabled(ProofDisabledEnum proofDisabled) {
    this.proofDisabled = proofDisabled;
  }

  public Portion smartTagClean(Boolean smartTagClean) {
    this.smartTagClean = smartTagClean;
    return this;
  }

   /**
   * True if smart tag should be cleaned.
   * @return smartTagClean
  **/
  @ApiModelProperty(value = "True if smart tag should be cleaned.")
  public Boolean isSmartTagClean() {
    return smartTagClean;
  }

  public void setSmartTagClean(Boolean smartTagClean) {
    this.smartTagClean = smartTagClean;
  }

  public Portion kerningMinimalSize(Double kerningMinimalSize) {
    this.kerningMinimalSize = kerningMinimalSize;
    return this;
  }

   /**
   * Minimal font size for kerning.
   * @return kerningMinimalSize
  **/
  @ApiModelProperty(value = "Minimal font size for kerning.")
  public Double getKerningMinimalSize() {
    return kerningMinimalSize;
  }

  public void setKerningMinimalSize(Double kerningMinimalSize) {
    this.kerningMinimalSize = kerningMinimalSize;
  }

  public Portion kumimoji(KumimojiEnum kumimoji) {
    this.kumimoji = kumimoji;
    return this;
  }

   /**
   * True if numbers should ignore East-Asian specific vertical text layout.
   * @return kumimoji
  **/
  @ApiModelProperty(value = "True if numbers should ignore East-Asian specific vertical text layout.")
  public KumimojiEnum getKumimoji() {
    return kumimoji;
  }

  public void setKumimoji(KumimojiEnum kumimoji) {
    this.kumimoji = kumimoji;
  }

  public Portion languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }

   /**
   * Proving language ID.
   * @return languageId
  **/
  @ApiModelProperty(value = "Proving language ID.")
  public String getLanguageId() {
    return languageId;
  }

  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  public Portion alternativeLanguageId(String alternativeLanguageId) {
    this.alternativeLanguageId = alternativeLanguageId;
    return this;
  }

   /**
   * Alternative proving language ID.
   * @return alternativeLanguageId
  **/
  @ApiModelProperty(value = "Alternative proving language ID.")
  public String getAlternativeLanguageId() {
    return alternativeLanguageId;
  }

  public void setAlternativeLanguageId(String alternativeLanguageId) {
    this.alternativeLanguageId = alternativeLanguageId;
  }

  public Portion isHardUnderlineFill(IsHardUnderlineFillEnum isHardUnderlineFill) {
    this.isHardUnderlineFill = isHardUnderlineFill;
    return this;
  }

   /**
   * True if underline style has own FillFormat properties.
   * @return isHardUnderlineFill
  **/
  @ApiModelProperty(value = "True if underline style has own FillFormat properties.")
  public IsHardUnderlineFillEnum getIsHardUnderlineFill() {
    return isHardUnderlineFill;
  }

  public void setIsHardUnderlineFill(IsHardUnderlineFillEnum isHardUnderlineFill) {
    this.isHardUnderlineFill = isHardUnderlineFill;
  }

  public Portion isHardUnderlineLine(IsHardUnderlineLineEnum isHardUnderlineLine) {
    this.isHardUnderlineLine = isHardUnderlineLine;
    return this;
  }

   /**
   * True if underline style has own LineFormat properties.
   * @return isHardUnderlineLine
  **/
  @ApiModelProperty(value = "True if underline style has own LineFormat properties.")
  public IsHardUnderlineLineEnum getIsHardUnderlineLine() {
    return isHardUnderlineLine;
  }

  public void setIsHardUnderlineLine(IsHardUnderlineLineEnum isHardUnderlineLine) {
    this.isHardUnderlineLine = isHardUnderlineLine;
  }

  public Portion fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Fill format.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Fill format.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public Portion effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Effect format.
   * @return effectFormat
  **/
  @ApiModelProperty(value = "Effect format.")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public Portion lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Line format.
   * @return lineFormat
  **/
  @ApiModelProperty(value = "Line format.")
  public LineFormat getLineFormat() {
    return lineFormat;
  }

  public void setLineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
  }

  public Portion underlineFillFormat(FillFormat underlineFillFormat) {
    this.underlineFillFormat = underlineFillFormat;
    return this;
  }

   /**
   * Underline fill format.
   * @return underlineFillFormat
  **/
  @ApiModelProperty(value = "Underline fill format.")
  public FillFormat getUnderlineFillFormat() {
    return underlineFillFormat;
  }

  public void setUnderlineFillFormat(FillFormat underlineFillFormat) {
    this.underlineFillFormat = underlineFillFormat;
  }

  public Portion underlineLineFormat(LineFormat underlineLineFormat) {
    this.underlineLineFormat = underlineLineFormat;
    return this;
  }

   /**
   * Underline line format.
   * @return underlineLineFormat
  **/
  @ApiModelProperty(value = "Underline line format.")
  public LineFormat getUnderlineLineFormat() {
    return underlineLineFormat;
  }

  public void setUnderlineLineFormat(LineFormat underlineLineFormat) {
    this.underlineLineFormat = underlineLineFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Portion portion = (Portion) o;
    return true && Objects.equals(this.text, portion.text) && Objects.equals(this.fontBold, portion.fontBold) && Objects.equals(this.fontItalic, portion.fontItalic) && Objects.equals(this.fontUnderline, portion.fontUnderline) && Objects.equals(this.strikethroughType, portion.strikethroughType) && Objects.equals(this.textCapType, portion.textCapType) && Objects.equals(this.escapement, portion.escapement) && Objects.equals(this.spacing, portion.spacing) && Objects.equals(this.fontColor, portion.fontColor) && Objects.equals(this.highlightColor, portion.highlightColor) && Objects.equals(this.fontHeight, portion.fontHeight) && Objects.equals(this.normaliseHeight, portion.normaliseHeight) && Objects.equals(this.proofDisabled, portion.proofDisabled) && Objects.equals(this.smartTagClean, portion.smartTagClean) && Objects.equals(this.kerningMinimalSize, portion.kerningMinimalSize) && Objects.equals(this.kumimoji, portion.kumimoji) && Objects.equals(this.languageId, portion.languageId) && Objects.equals(this.alternativeLanguageId, portion.alternativeLanguageId) && Objects.equals(this.isHardUnderlineFill, portion.isHardUnderlineFill) && Objects.equals(this.isHardUnderlineLine, portion.isHardUnderlineLine) && Objects.equals(this.fillFormat, portion.fillFormat) && Objects.equals(this.effectFormat, portion.effectFormat) && Objects.equals(this.lineFormat, portion.lineFormat) && Objects.equals(this.underlineFillFormat, portion.underlineFillFormat) && Objects.equals(this.underlineLineFormat, portion.underlineLineFormat) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, fontBold, fontItalic, fontUnderline, strikethroughType, textCapType, escapement, spacing, fontColor, highlightColor, fontHeight, normaliseHeight, proofDisabled, smartTagClean, kerningMinimalSize, kumimoji, languageId, alternativeLanguageId, isHardUnderlineFill, isHardUnderlineLine, fillFormat, effectFormat, lineFormat, underlineFillFormat, underlineLineFormat, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fontBold: ").append(toIndentedString(fontBold)).append("\n");
    sb.append("    fontItalic: ").append(toIndentedString(fontItalic)).append("\n");
    sb.append("    fontUnderline: ").append(toIndentedString(fontUnderline)).append("\n");
    sb.append("    strikethroughType: ").append(toIndentedString(strikethroughType)).append("\n");
    sb.append("    textCapType: ").append(toIndentedString(textCapType)).append("\n");
    sb.append("    escapement: ").append(toIndentedString(escapement)).append("\n");
    sb.append("    spacing: ").append(toIndentedString(spacing)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    highlightColor: ").append(toIndentedString(highlightColor)).append("\n");
    sb.append("    fontHeight: ").append(toIndentedString(fontHeight)).append("\n");
    sb.append("    normaliseHeight: ").append(toIndentedString(normaliseHeight)).append("\n");
    sb.append("    proofDisabled: ").append(toIndentedString(proofDisabled)).append("\n");
    sb.append("    smartTagClean: ").append(toIndentedString(smartTagClean)).append("\n");
    sb.append("    kerningMinimalSize: ").append(toIndentedString(kerningMinimalSize)).append("\n");
    sb.append("    kumimoji: ").append(toIndentedString(kumimoji)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    alternativeLanguageId: ").append(toIndentedString(alternativeLanguageId)).append("\n");
    sb.append("    isHardUnderlineFill: ").append(toIndentedString(isHardUnderlineFill)).append("\n");
    sb.append("    isHardUnderlineLine: ").append(toIndentedString(isHardUnderlineLine)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    effectFormat: ").append(toIndentedString(effectFormat)).append("\n");
    sb.append("    lineFormat: ").append(toIndentedString(lineFormat)).append("\n");
    sb.append("    underlineFillFormat: ").append(toIndentedString(underlineFillFormat)).append("\n");
    sb.append("    underlineLineFormat: ").append(toIndentedString(underlineLineFormat)).append("\n");
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
