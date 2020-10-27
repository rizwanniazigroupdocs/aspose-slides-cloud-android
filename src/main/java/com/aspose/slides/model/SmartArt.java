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
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.ShapeBase;
import com.aspose.slides.model.SmartArtNode;
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
 * Represents SmartArt shape resource.
 */
@ApiModel(description = "Represents SmartArt shape resource.")
public class SmartArt extends ShapeBase {
  /**
   * Layout type.
   */
  @JsonAdapter(LayoutEnum.Adapter.class)
  public enum LayoutEnum {
    ACCENTPROCESS("AccentProcess"),
    
    ACCENTEDPICTURE("AccentedPicture"),
    
    ALTERNATINGFLOW("AlternatingFlow"),
    
    ALTERNATINGHEXAGONS("AlternatingHexagons"),
    
    ALTERNATINGPICTUREBLOCKS("AlternatingPictureBlocks"),
    
    ALTERNATINGPICTURECIRCLES("AlternatingPictureCircles"),
    
    ARROWRIBBON("ArrowRibbon"),
    
    ASCENDINGPICTUREACCENTPROCESS("AscendingPictureAccentProcess"),
    
    BALANCE("Balance"),
    
    BASICBENDINGPROCESS("BasicBendingProcess"),
    
    BASICBLOCKLIST("BasicBlockList"),
    
    BASICCHEVRONPROCESS("BasicChevronProcess"),
    
    BASICCYCLE("BasicCycle"),
    
    BASICMATRIX("BasicMatrix"),
    
    BASICPIE("BasicPie"),
    
    BASICPROCESS("BasicProcess"),
    
    BASICPYRAMID("BasicPyramid"),
    
    BASICRADIAL("BasicRadial"),
    
    BASICTARGET("BasicTarget"),
    
    BASICTIMELINE("BasicTimeline"),
    
    BASICVENN("BasicVenn"),
    
    BENDINGPICTUREACCENTLIST("BendingPictureAccentList"),
    
    BENDINGPICTUREBLOCKS("BendingPictureBlocks"),
    
    BENDINGPICTURECAPTION("BendingPictureCaption"),
    
    BENDINGPICTURECAPTIONLIST("BendingPictureCaptionList"),
    
    BENDINGPICTURESEMITRANSPARENTTEXT("BendingPictureSemiTransparentText"),
    
    BLOCKCYCLE("BlockCycle"),
    
    BUBBLEPICTURELIST("BubblePictureList"),
    
    CAPTIONEDPICTURES("CaptionedPictures"),
    
    CHEVRONLIST("ChevronList"),
    
    CIRCLEACCENTTIMELINE("CircleAccentTimeline"),
    
    CIRCLEARROWPROCESS("CircleArrowProcess"),
    
    CIRCLEPICTUREHIERARCHY("CirclePictureHierarchy"),
    
    CIRCLERELATIONSHIP("CircleRelationship"),
    
    CIRCULARBENDINGPROCESS("CircularBendingProcess"),
    
    CIRCULARPICTURECALLOUT("CircularPictureCallout"),
    
    CLOSEDCHEVRONPROCESS("ClosedChevronProcess"),
    
    CONTINUOUSARROWPROCESS("ContinuousArrowProcess"),
    
    CONTINUOUSBLOCKPROCESS("ContinuousBlockProcess"),
    
    CONTINUOUSCYCLE("ContinuousCycle"),
    
    CONTINUOUSPICTURELIST("ContinuousPictureList"),
    
    CONVERGINGARROWS("ConvergingArrows"),
    
    CONVERGINGRADIAL("ConvergingRadial"),
    
    COUNTERBALANCEARROWS("CounterbalanceArrows"),
    
    CYCLEMATRIX("CycleMatrix"),
    
    DESCENDINGBLOCKLIST("DescendingBlockList"),
    
    DESCENDINGPROCESS("DescendingProcess"),
    
    DETAILEDPROCESS("DetailedProcess"),
    
    DIVERGINGARROWS("DivergingArrows"),
    
    DIVERGINGRADIAL("DivergingRadial"),
    
    EQUATION("Equation"),
    
    FRAMEDTEXTPICTURE("FramedTextPicture"),
    
    FUNNEL("Funnel"),
    
    GEAR("Gear"),
    
    GRIDMATRIX("GridMatrix"),
    
    GROUPEDLIST("GroupedList"),
    
    HALFCIRCLEORGANIZATIONCHART("HalfCircleOrganizationChart"),
    
    HEXAGONCLUSTER("HexagonCluster"),
    
    HIERARCHY("Hierarchy"),
    
    HIERARCHYLIST("HierarchyList"),
    
    HORIZONTALBULLETLIST("HorizontalBulletList"),
    
    HORIZONTALHIERARCHY("HorizontalHierarchy"),
    
    HORIZONTALLABELEDHIERARCHY("HorizontalLabeledHierarchy"),
    
    HORIZONTALMULTILEVELHIERARCHY("HorizontalMultiLevelHierarchy"),
    
    HORIZONTALORGANIZATIONCHART("HorizontalOrganizationChart"),
    
    HORIZONTALPICTURELIST("HorizontalPictureList"),
    
    INCREASINGARROWSPROCESS("IncreasingArrowsProcess"),
    
    INCREASINGCIRCLEPROCESS("IncreasingCircleProcess"),
    
    INVERTEDPYRAMID("InvertedPyramid"),
    
    LABELEDHIERARCHY("LabeledHierarchy"),
    
    LINEARVENN("LinearVenn"),
    
    LINEDLIST("LinedList"),
    
    MULTIDIRECTIONALCYCLE("MultidirectionalCycle"),
    
    NAMEANDTITLEORGANIZATIONCHART("NameandTitleOrganizationChart"),
    
    NESTEDTARGET("NestedTarget"),
    
    NONDIRECTIONALCYCLE("NondirectionalCycle"),
    
    OPPOSINGARROWS("OpposingArrows"),
    
    OPPOSINGIDEAS("OpposingIdeas"),
    
    ORGANIZATIONCHART("OrganizationChart"),
    
    PHASEDPROCESS("PhasedProcess"),
    
    PICTUREACCENTBLOCKS("PictureAccentBlocks"),
    
    PICTUREACCENTLIST("PictureAccentList"),
    
    PICTUREACCENTPROCESS("PictureAccentProcess"),
    
    PICTURECAPTIONLIST("PictureCaptionList"),
    
    PICTUREGRID("PictureGrid"),
    
    PICTURELINEUP("PictureLineup"),
    
    PICTURESTRIPS("PictureStrips"),
    
    PIEPROCESS("PieProcess"),
    
    PLUSANDMINUS("PlusandMinus"),
    
    PROCESSARROWS("ProcessArrows"),
    
    PROCESSLIST("ProcessList"),
    
    PYRAMIDLIST("PyramidList"),
    
    RADIALCLUSTER("RadialCluster"),
    
    RADIALCYCLE("RadialCycle"),
    
    RADIALLIST("RadialList"),
    
    RADIALVENN("RadialVenn"),
    
    RANDOMTORESULTPROCESS("RandomToResultProcess"),
    
    REPEATINGBENDINGPROCESS("RepeatingBendingProcess"),
    
    REVERSELIST("ReverseList"),
    
    SEGMENTEDCYCLE("SegmentedCycle"),
    
    SEGMENTEDPROCESS("SegmentedProcess"),
    
    SEGMENTEDPYRAMID("SegmentedPyramid"),
    
    SNAPSHOTPICTURELIST("SnapshotPictureList"),
    
    SPIRALPICTURE("SpiralPicture"),
    
    SQUAREACCENTLIST("SquareAccentList"),
    
    STACKEDLIST("StackedList"),
    
    STACKEDVENN("StackedVenn"),
    
    STAGGEREDPROCESS("StaggeredProcess"),
    
    STEPDOWNPROCESS("StepDownProcess"),
    
    STEPUPPROCESS("StepUpProcess"),
    
    SUBSTEPPROCESS("SubStepProcess"),
    
    TABLEHIERARCHY("TableHierarchy"),
    
    TABLELIST("TableList"),
    
    TARGETLIST("TargetList"),
    
    TEXTCYCLE("TextCycle"),
    
    TITLEPICTURELINEUP("TitlePictureLineup"),
    
    TITLEDMATRIX("TitledMatrix"),
    
    TITLEDPICTUREACCENTLIST("TitledPictureAccentList"),
    
    TITLEDPICTUREBLOCKS("TitledPictureBlocks"),
    
    TRAPEZOIDLIST("TrapezoidList"),
    
    UPWARDARROW("UpwardArrow"),
    
    VERTICALACCENTLIST("VerticalAccentList"),
    
    VERTICALARROWLIST("VerticalArrowList"),
    
    VERTICALBENDINGPROCESS("VerticalBendingProcess"),
    
    VERTICALBLOCKLIST("VerticalBlockList"),
    
    VERTICALBOXLIST("VerticalBoxList"),
    
    VERTICALBULLETLIST("VerticalBulletList"),
    
    VERTICALCHEVRONLIST("VerticalChevronList"),
    
    VERTICALCIRCLELIST("VerticalCircleList"),
    
    VERTICALCURVEDLIST("VerticalCurvedList"),
    
    VERTICALEQUATION("VerticalEquation"),
    
    VERTICALPICTUREACCENTLIST("VerticalPictureAccentList"),
    
    VERTICALPICTURELIST("VerticalPictureList"),
    
    VERTICALPROCESS("VerticalProcess"),
    
    CUSTOM("Custom"),
    
    PICTUREORGANIZATIONCHART("PictureOrganizationChart");

    private String value;

    LayoutEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LayoutEnum fromValue(String text) {
      for (LayoutEnum b : LayoutEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LayoutEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LayoutEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LayoutEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LayoutEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "layout", alternate = { "Layout" })
  private LayoutEnum layout;

  /**
   * Quick style.
   */
  @JsonAdapter(QuickStyleEnum.Adapter.class)
  public enum QuickStyleEnum {
    SIMPLEFILL("SimpleFill"),
    
    WHITEOUTLINE("WhiteOutline"),
    
    SUBTLEEFFECT("SubtleEffect"),
    
    MODERATEEFFECT("ModerateEffect"),
    
    INTENCEEFFECT("IntenceEffect"),
    
    POLISHED("Polished"),
    
    INSET("Inset"),
    
    CARTOON("Cartoon"),
    
    POWDER("Powder"),
    
    BRICKSCENE("BrickScene"),
    
    FLATSCENE("FlatScene"),
    
    METALLICSCENE("MetallicScene"),
    
    SUNSETSCENE("SunsetScene"),
    
    BIRDSEYESCENE("BirdsEyeScene");

    private String value;

    QuickStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QuickStyleEnum fromValue(String text) {
      for (QuickStyleEnum b : QuickStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<QuickStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QuickStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QuickStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return QuickStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "quickStyle", alternate = { "QuickStyle" })
  private QuickStyleEnum quickStyle;

  /**
   * Color style.
   */
  @JsonAdapter(ColorStyleEnum.Adapter.class)
  public enum ColorStyleEnum {
    DARK1OUTLINE("Dark1Outline"),
    
    DARK2OUTLINE("Dark2Outline"),
    
    DARKFILL("DarkFill"),
    
    COLORFULACCENTCOLORS("ColorfulAccentColors"),
    
    COLORFULACCENTCOLORS2TO3("ColorfulAccentColors2to3"),
    
    COLORFULACCENTCOLORS3TO4("ColorfulAccentColors3to4"),
    
    COLORFULACCENTCOLORS4TO5("ColorfulAccentColors4to5"),
    
    COLORFULACCENTCOLORS5TO6("ColorfulAccentColors5to6"),
    
    COLOREDOUTLINEACCENT1("ColoredOutlineAccent1"),
    
    COLOREDFILLACCENT1("ColoredFillAccent1"),
    
    GRADIENTRANGEACCENT1("GradientRangeAccent1"),
    
    GRADIENTLOOPACCENT1("GradientLoopAccent1"),
    
    TRANSPARENTGRADIENTRANGEACCENT1("TransparentGradientRangeAccent1"),
    
    COLOREDOUTLINEACCENT2("ColoredOutlineAccent2"),
    
    COLOREDFILLACCENT2("ColoredFillAccent2"),
    
    GRADIENTRANGEACCENT2("GradientRangeAccent2"),
    
    GRADIENTLOOPACCENT2("GradientLoopAccent2"),
    
    TRANSPARENTGRADIENTRANGEACCENT2("TransparentGradientRangeAccent2"),
    
    COLOREDOUTLINEACCENT3("ColoredOutlineAccent3"),
    
    COLOREDFILLACCENT3("ColoredFillAccent3"),
    
    GRADIENTRANGEACCENT3("GradientRangeAccent3"),
    
    GRADIENTLOOPACCENT3("GradientLoopAccent3"),
    
    TRANSPARENTGRADIENTRANGEACCENT3("TransparentGradientRangeAccent3"),
    
    COLOREDOUTLINEACCENT4("ColoredOutlineAccent4"),
    
    COLOREDFILLACCENT4("ColoredFillAccent4"),
    
    GRADIENTRANGEACCENT4("GradientRangeAccent4"),
    
    GRADIENTLOOPACCENT4("GradientLoopAccent4"),
    
    TRANSPARENTGRADIENTRANGEACCENT4("TransparentGradientRangeAccent4"),
    
    COLOREDOUTLINEACCENT5("ColoredOutlineAccent5"),
    
    COLOREDFILLACCENT5("ColoredFillAccent5"),
    
    GRADIENTRANGEACCENT5("GradientRangeAccent5"),
    
    GRADIENTLOOPACCENT5("GradientLoopAccent5"),
    
    TRANSPARENTGRADIENTRANGEACCENT5("TransparentGradientRangeAccent5"),
    
    COLOREDOUTLINEACCENT6("ColoredOutlineAccent6"),
    
    COLOREDFILLACCENT6("ColoredFillAccent6"),
    
    GRADIENTRANGEACCENT6("GradientRangeAccent6"),
    
    GRADIENTLOOPACCENT6("GradientLoopAccent6"),
    
    TRANSPARENTGRADIENTRANGEACCENT6("TransparentGradientRangeAccent6");

    private String value;

    ColorStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColorStyleEnum fromValue(String text) {
      for (ColorStyleEnum b : ColorStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ColorStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColorStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "colorStyle", alternate = { "ColorStyle" })
  private ColorStyleEnum colorStyle;

  @SerializedName(value = "nodes", alternate = { "Nodes" })
  private List<SmartArtNode> nodes = null;

  @SerializedName(value = "isReversed", alternate = { "IsReversed" })
  private Boolean isReversed;


  public SmartArt() {
    super();
    setType(TypeEnum.SMARTART);
  }

  public SmartArt layout(LayoutEnum layout) {
    this.layout = layout;
    return this;
  }

   /**
   * Layout type.
   * @return layout
  **/
  @ApiModelProperty(required = true, value = "Layout type.")
  public LayoutEnum getLayout() {
    return layout;
  }

  public void setLayout(LayoutEnum layout) {
    this.layout = layout;
  }

  public SmartArt quickStyle(QuickStyleEnum quickStyle) {
    this.quickStyle = quickStyle;
    return this;
  }

   /**
   * Quick style.
   * @return quickStyle
  **/
  @ApiModelProperty(required = true, value = "Quick style.")
  public QuickStyleEnum getQuickStyle() {
    return quickStyle;
  }

  public void setQuickStyle(QuickStyleEnum quickStyle) {
    this.quickStyle = quickStyle;
  }

  public SmartArt colorStyle(ColorStyleEnum colorStyle) {
    this.colorStyle = colorStyle;
    return this;
  }

   /**
   * Color style.
   * @return colorStyle
  **/
  @ApiModelProperty(required = true, value = "Color style.")
  public ColorStyleEnum getColorStyle() {
    return colorStyle;
  }

  public void setColorStyle(ColorStyleEnum colorStyle) {
    this.colorStyle = colorStyle;
  }

  public SmartArt nodes(List<SmartArtNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public SmartArt addNodesItem(SmartArtNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<SmartArtNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Collection of nodes in SmartArt object.             
   * @return nodes
  **/
  @ApiModelProperty(value = "Collection of nodes in SmartArt object.             ")
  public List<SmartArtNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<SmartArtNode> nodes) {
    this.nodes = nodes;
  }

  public SmartArt isReversed(Boolean isReversed) {
    this.isReversed = isReversed;
    return this;
  }

   /**
   * The state of the SmartArt diagram with regard to (left-to-right) LTR or (right-to-left) RTL, if the diagram supports reversal.
   * @return isReversed
  **/
  @ApiModelProperty(required = true, value = "The state of the SmartArt diagram with regard to (left-to-right) LTR or (right-to-left) RTL, if the diagram supports reversal.")
  public Boolean isIsReversed() {
    return isReversed;
  }

  public void setIsReversed(Boolean isReversed) {
    this.isReversed = isReversed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartArt smartArt = (SmartArt) o;
    return true && Objects.equals(this.layout, smartArt.layout) && Objects.equals(this.quickStyle, smartArt.quickStyle) && Objects.equals(this.colorStyle, smartArt.colorStyle) && Objects.equals(this.nodes, smartArt.nodes) && Objects.equals(this.isReversed, smartArt.isReversed) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layout, quickStyle, colorStyle, nodes, isReversed, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartArt {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    quickStyle: ").append(toIndentedString(quickStyle)).append("\n");
    sb.append("    colorStyle: ").append(toIndentedString(colorStyle)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    isReversed: ").append(toIndentedString(isReversed)).append("\n");
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

  static {
      typeDeterminers.put("Type", TypeEnum.SMARTART);
  }
}
