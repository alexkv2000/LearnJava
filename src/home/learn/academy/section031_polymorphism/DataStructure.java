/*
 * Copyright 2019. http://devonline.academy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package home.learn.academy.section031_polymorphism;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public interface DataStructure {

    void add(int value);

    void add(int[] array);

    void add(DynaArray dynaArray);

    void add(LinkedList list);

    int size();

    void clear();

    int[] toArray();

    boolean remove(int value);

    boolean contains(int value);
}
