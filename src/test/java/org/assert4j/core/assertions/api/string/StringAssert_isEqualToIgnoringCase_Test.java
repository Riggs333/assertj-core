/*
 * Created on Dec 24, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.assert4j.core.assertions.api.string;

import org.assert4j.core.assertions.api.StringAssert;
import org.assert4j.core.assertions.api.StringAssertBaseTest;

import static org.mockito.Mockito.verify;


/**
 * Tests for <code>{@link StringAssert#isEqualToIgnoringCase(String)}</code>.
 * 
 * @author Alex Ruiz
 */
public class StringAssert_isEqualToIgnoringCase_Test extends StringAssertBaseTest {

  @Override
  protected StringAssert invoke_api_method() {
    return assertions.isEqualToIgnoringCase("yoda");
  }

  @Override
  protected void verify_internal_effects() {
    verify(strings).assertEqualsIgnoringCase(getInfo(assertions), getActual(assertions), "yoda");
  }
}