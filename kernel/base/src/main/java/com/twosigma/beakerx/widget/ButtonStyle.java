/*
 *  Copyright 2019 TWO SIGMA OPEN SOURCE, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.twosigma.beakerx.widget;

import java.util.HashMap;

public class ButtonStyle extends DescriptionStyle {

  public static final String MODEL_NAME_VALUE = "ButtonStyleModel";
  private String buttonColor=null;
  private String fontWeight="";

  public ButtonStyle() {
    super();
    openComm();
  }

  @Override
  public String getModelNameValue() {
    return MODEL_NAME_VALUE;
  }

  @Override
  protected void addValueChangeMsgCallback() {
  }

  @Override
  protected HashMap<String, Object> content(HashMap<String, Object> content) {
    content.put("font_weight", fontWeight);
    content.put("button_color", buttonColor);
    return content;
  }
}
