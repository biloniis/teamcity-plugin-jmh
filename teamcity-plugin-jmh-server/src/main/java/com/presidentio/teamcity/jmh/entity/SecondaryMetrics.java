/**
 * Copyright 2015 presidentio
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.presidentio.teamcity.jmh.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Vitaliy on 16.04.2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecondaryMetrics {

    public SecondaryMetrics() {
    }

    public SecondaryMetrics(SecondaryMetrics secondaryMetrics) {
    }
}
