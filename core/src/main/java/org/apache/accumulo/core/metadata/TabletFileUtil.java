/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.accumulo.core.metadata;

import org.apache.hadoop.fs.Path;

/**
 * Utility class for validation of metadata tablet files.
 */
public class TabletFileUtil {

  /**
   * Validate if string is a valid path. Return normalized string or throw exception if not valid.
   * This was added to facilitate more use of TabletFile over String but this puts the validation in
   * one location in the case where TabletFile can't be used.
   */
  public static String validate(String path) {
    Path p = new Path(path);
    return validate(p).toString();
  }

  public static Path validate(Path path) {
    check(path);
    return path;
  }

  private static void check(Path p) {
    if (p.toUri().getScheme() == null) {
      throw new IllegalArgumentException("Invalid path provided, no scheme in " + p);
    }
  }
}
