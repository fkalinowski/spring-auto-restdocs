/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package capital.scalable.restdocs.jackson.constraints;

import java.util.List;

import org.springframework.core.MethodParameter;

public interface ConstraintReader {
    String CONSTRAINTS_ATTRIBUTE = "constraints";
    String OPTIONAL_ATTRIBUTE = "optionals";

    boolean isMandatory(Class<?> annotation);

    List<String> getConstraintMessages(Class<?> javaBaseClass, String javaFieldName);

    List<String> getConstraintMessages(MethodParameter param);

    List<String> getOptionalMessages(Class<?> javaBaseClass, String javaFieldName);
}
