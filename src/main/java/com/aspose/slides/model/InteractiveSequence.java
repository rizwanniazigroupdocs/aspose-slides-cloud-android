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
import com.aspose.slides.model.Effect;
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
 * Represents comments collection of slide
 */
@ApiModel(description = "Represents comments collection of slide")
public class InteractiveSequence {
  @SerializedName(value = "effects", alternate = { "Effects" })
  private List<Effect> effects = null;

  @SerializedName(value = "triggerShapeIndex", alternate = { "TriggerShapeIndex" })
  private Integer triggerShapeIndex;


  public InteractiveSequence() {
    super();
  }

  public InteractiveSequence effects(List<Effect> effects) {
    this.effects = effects;
    return this;
  }

  public InteractiveSequence addEffectsItem(Effect effectsItem) {
    if (this.effects == null) {
      this.effects = new ArrayList<Effect>();
    }
    this.effects.add(effectsItem);
    return this;
  }

   /**
   * Effect list.
   * @return effects
  **/
  @ApiModelProperty(value = "Effect list.")
  public List<Effect> getEffects() {
    return effects;
  }

  public void setEffects(List<Effect> effects) {
    this.effects = effects;
  }

  public InteractiveSequence triggerShapeIndex(Integer triggerShapeIndex) {
    this.triggerShapeIndex = triggerShapeIndex;
    return this;
  }

   /**
   * Index of the shape that triggers the sequence.
   * @return triggerShapeIndex
  **/
  @ApiModelProperty(required = true, value = "Index of the shape that triggers the sequence.")
  public Integer getTriggerShapeIndex() {
    return triggerShapeIndex;
  }

  public void setTriggerShapeIndex(Integer triggerShapeIndex) {
    this.triggerShapeIndex = triggerShapeIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveSequence interactiveSequence = (InteractiveSequence) o;
    return true && Objects.equals(this.effects, interactiveSequence.effects) && Objects.equals(this.triggerShapeIndex, interactiveSequence.triggerShapeIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effects, triggerShapeIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveSequence {\n");
    
    sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
    sb.append("    triggerShapeIndex: ").append(toIndentedString(triggerShapeIndex)).append("\n");
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
