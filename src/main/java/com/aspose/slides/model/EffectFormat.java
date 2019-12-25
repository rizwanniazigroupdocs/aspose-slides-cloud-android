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
import com.aspose.slides.model.BlurEffect;
import com.aspose.slides.model.FillOverlayEffect;
import com.aspose.slides.model.GlowEffect;
import com.aspose.slides.model.InnerShadowEffect;
import com.aspose.slides.model.OuterShadowEffect;
import com.aspose.slides.model.PresetShadowEffect;
import com.aspose.slides.model.ReflectionEffect;
import com.aspose.slides.model.SoftEdgeEffect;
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
 * Effect format
 */
@ApiModel(description = "Effect format")
public class EffectFormat {
  @SerializedName(value = "blur", alternate = { "Blur" })
  private BlurEffect blur;

  @SerializedName(value = "glow", alternate = { "Glow" })
  private GlowEffect glow;

  @SerializedName(value = "innerShadow", alternate = { "InnerShadow" })
  private InnerShadowEffect innerShadow;

  @SerializedName(value = "outerShadow", alternate = { "OuterShadow" })
  private OuterShadowEffect outerShadow;

  @SerializedName(value = "presetShadow", alternate = { "PresetShadow" })
  private PresetShadowEffect presetShadow;

  @SerializedName(value = "softEdge", alternate = { "SoftEdge" })
  private SoftEdgeEffect softEdge;

  @SerializedName(value = "reflection", alternate = { "Reflection" })
  private ReflectionEffect reflection;

  @SerializedName(value = "fillOverlay", alternate = { "FillOverlay" })
  private FillOverlayEffect fillOverlay;


  public EffectFormat() {
    super();
  }

  public EffectFormat blur(BlurEffect blur) {
    this.blur = blur;
    return this;
  }

   /**
   * blur effect
   * @return blur
  **/
  @ApiModelProperty(value = "blur effect")
  public BlurEffect getBlur() {
    return blur;
  }

  public void setBlur(BlurEffect blur) {
    this.blur = blur;
  }

  public EffectFormat glow(GlowEffect glow) {
    this.glow = glow;
    return this;
  }

   /**
   * glow effect
   * @return glow
  **/
  @ApiModelProperty(value = "glow effect")
  public GlowEffect getGlow() {
    return glow;
  }

  public void setGlow(GlowEffect glow) {
    this.glow = glow;
  }

  public EffectFormat innerShadow(InnerShadowEffect innerShadow) {
    this.innerShadow = innerShadow;
    return this;
  }

   /**
   * inner shadow effect
   * @return innerShadow
  **/
  @ApiModelProperty(value = "inner shadow effect")
  public InnerShadowEffect getInnerShadow() {
    return innerShadow;
  }

  public void setInnerShadow(InnerShadowEffect innerShadow) {
    this.innerShadow = innerShadow;
  }

  public EffectFormat outerShadow(OuterShadowEffect outerShadow) {
    this.outerShadow = outerShadow;
    return this;
  }

   /**
   * outer shadow effect
   * @return outerShadow
  **/
  @ApiModelProperty(value = "outer shadow effect")
  public OuterShadowEffect getOuterShadow() {
    return outerShadow;
  }

  public void setOuterShadow(OuterShadowEffect outerShadow) {
    this.outerShadow = outerShadow;
  }

  public EffectFormat presetShadow(PresetShadowEffect presetShadow) {
    this.presetShadow = presetShadow;
    return this;
  }

   /**
   * preset shadow effect
   * @return presetShadow
  **/
  @ApiModelProperty(value = "preset shadow effect")
  public PresetShadowEffect getPresetShadow() {
    return presetShadow;
  }

  public void setPresetShadow(PresetShadowEffect presetShadow) {
    this.presetShadow = presetShadow;
  }

  public EffectFormat softEdge(SoftEdgeEffect softEdge) {
    this.softEdge = softEdge;
    return this;
  }

   /**
   * soft edge effect
   * @return softEdge
  **/
  @ApiModelProperty(value = "soft edge effect")
  public SoftEdgeEffect getSoftEdge() {
    return softEdge;
  }

  public void setSoftEdge(SoftEdgeEffect softEdge) {
    this.softEdge = softEdge;
  }

  public EffectFormat reflection(ReflectionEffect reflection) {
    this.reflection = reflection;
    return this;
  }

   /**
   * reflection effect
   * @return reflection
  **/
  @ApiModelProperty(value = "reflection effect")
  public ReflectionEffect getReflection() {
    return reflection;
  }

  public void setReflection(ReflectionEffect reflection) {
    this.reflection = reflection;
  }

  public EffectFormat fillOverlay(FillOverlayEffect fillOverlay) {
    this.fillOverlay = fillOverlay;
    return this;
  }

   /**
   * fill overlay effect
   * @return fillOverlay
  **/
  @ApiModelProperty(value = "fill overlay effect")
  public FillOverlayEffect getFillOverlay() {
    return fillOverlay;
  }

  public void setFillOverlay(FillOverlayEffect fillOverlay) {
    this.fillOverlay = fillOverlay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectFormat effectFormat = (EffectFormat) o;
    return true && Objects.equals(this.blur, effectFormat.blur) && Objects.equals(this.glow, effectFormat.glow) && Objects.equals(this.innerShadow, effectFormat.innerShadow) && Objects.equals(this.outerShadow, effectFormat.outerShadow) && Objects.equals(this.presetShadow, effectFormat.presetShadow) && Objects.equals(this.softEdge, effectFormat.softEdge) && Objects.equals(this.reflection, effectFormat.reflection) && Objects.equals(this.fillOverlay, effectFormat.fillOverlay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blur, glow, innerShadow, outerShadow, presetShadow, softEdge, reflection, fillOverlay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectFormat {\n");
    
    sb.append("    blur: ").append(toIndentedString(blur)).append("\n");
    sb.append("    glow: ").append(toIndentedString(glow)).append("\n");
    sb.append("    innerShadow: ").append(toIndentedString(innerShadow)).append("\n");
    sb.append("    outerShadow: ").append(toIndentedString(outerShadow)).append("\n");
    sb.append("    presetShadow: ").append(toIndentedString(presetShadow)).append("\n");
    sb.append("    softEdge: ").append(toIndentedString(softEdge)).append("\n");
    sb.append("    reflection: ").append(toIndentedString(reflection)).append("\n");
    sb.append("    fillOverlay: ").append(toIndentedString(fillOverlay)).append("\n");
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
