/**
 * Licensed under the GPL License. You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 * THIS PACKAGE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */
package psiprobe.model;

import com.codebox.bean.JavaBeanTester;

import org.junit.Test;

/**
 * The Class ApplicationSessionTest.
 */
public class ApplicationSessionTest {

  /**
   * Javabean tester.
   */
  // TODO Until JavabeanTester only uses default no-arg constructor for testing, skip dates.
  @Test
  public void javabeanTester() {
    JavaBeanTester.builder(ApplicationSession.class).loadData()
        .skip("creationTime", "lastAccessTime").test();
  }

}
