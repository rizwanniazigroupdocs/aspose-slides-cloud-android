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
import com.aspose.slides.model.InteractiveSequence;
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
 * Represents comments collection of slide
 */
@ApiModel(description = "Represents comments collection of slide")
public class SlideAnimation extends ResourceBase {
  @SerializedName(value = "mainSequence", alternate = { "MainSequence" })
  private List<Effect> mainSequence = null;

  @SerializedName(value = "interactiveSequences", alternate = { "InteractiveSequences" })
  private List<InteractiveSequence> interactiveSequences = null;


  public SlideAnimation() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
    setMainSequence(new ArrayList<Effect>());
    setInteractiveSequences(new ArrayList<InteractiveSequence>());
  }

  public SlideAnimation mainSequence(List<Effect> mainSequence) {
    this.mainSequence = mainSequence;
    return this;
  }

  public SlideAnimation addMainSequenceItem(Effect mainSequenceItem) {
    if (this.mainSequence == null) {
      this.mainSequence = new ArrayList<Effect>();
    }
    this.mainSequence.add(mainSequenceItem);
    return this;
  }

   /**
   * Main sequence.
   * @return mainSequence
  **/
  @ApiModelProperty(value = "Main sequence.")
  public List<Effect> getMainSequence() {
    return mainSequence;
  }

  public void setMainSequence(List<Effect> mainSequence) {
    this.mainSequence = mainSequence;
  }

  public SlideAnimation interactiveSequences(List<InteractiveSequence> interactiveSequences) {
    this.interactiveSequences = interactiveSequences;
    return this;
  }

  public SlideAnimation addInteractiveSequencesItem(InteractiveSequence interactiveSequencesItem) {
    if (this.interactiveSequences == null) {
      this.interactiveSequences = new ArrayList<InteractiveSequence>();
    }
    this.interactiveSequences.add(interactiveSequencesItem);
    return this;
  }

   /**
   * Interactive sequence list.
   * @return interactiveSequences
  **/
  @ApiModelProperty(value = "Interactive sequence list.")
  public List<InteractiveSequence> getInteractiveSequences() {
    return interactiveSequences;
  }

  public void setInteractiveSequences(List<InteractiveSequence> interactiveSequences) {
    this.interactiveSequences = interactiveSequences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlideAnimation slideAnimation = (SlideAnimation) o;
    return true && Objects.equals(this.mainSequence, slideAnimation.mainSequence) && Objects.equals(this.interactiveSequences, slideAnimation.interactiveSequences) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainSequence, interactiveSequences, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlideAnimation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mainSequence: ").append(toIndentedString(mainSequence)).append("\n");
    sb.append("    interactiveSequences: ").append(toIndentedString(interactiveSequences)).append("\n");
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
