/*
 * Copyright 2013 Jake Wharton
 * Copyright 2014 Prateek Srivastava (@f2prateek)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dart.henson.plugin.attributes;

import org.gradle.api.Named;
import org.gradle.api.attributes.Attribute;

/**
 * Navigation attributes used for matching consumer and producer projects. It will be used to
 * decorate artifacts in both projects configurations.
 */
public interface NavigationTypeAttr extends Named {
  Attribute<NavigationTypeAttr> ATTRIBUTE = Attribute.of(NavigationTypeAttr.class);

  String NAVIGATION = "Navigation";
}