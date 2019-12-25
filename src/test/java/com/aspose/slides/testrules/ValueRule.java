// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="TestInitializer.cs">
//   Copyright (c) 2018 Aspose.Slides for Cloud
// </copyright>
// <summary>
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
// 
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
// 
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

package com.aspose.slides.testrules;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

public class ValueRule extends TestRule {
    @SerializedName("Value")
    private JsonElement value;

    @SerializedName("InvalidValue")
    private JsonElement invalidValue;

    @SerializedName("Type")
    private String type;

    public Boolean getIsValueSet() {
        return value != null;
    }

    public Boolean getIsInvalidValueSet() {
        return invalidValue != null;
    }

    public Object getValue() {
        return getJsonElementValue(value);
    }

    public Object getInvalidValue() {
        return getJsonElementValue(invalidValue);
    }

    public String getType() {
        return type;
    }
    
    private Object getJsonElementValue(JsonElement element) {
        return element.isJsonNull()
            ? null
            : element.isJsonObject() ? element.getAsJsonObject() : element.isJsonArray() ? element.getAsJsonArray() : element.getAsString();
    }
}
