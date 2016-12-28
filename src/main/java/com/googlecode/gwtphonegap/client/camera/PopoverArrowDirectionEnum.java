/*
 * Copyright 2016 Venkata Kiran.
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
package com.googlecode.gwtphonegap.client.camera;

/**
 *
 * @author vkiran
 */
public enum PopoverArrowDirectionEnum {
    
    ARROW_UP(1),
    ARROW_DOWN(2),
    ARROW_LEFT(4),
    ARROW_RIGHT(8),
    ARROW_ANY(15);
    
    private int value;

    private PopoverArrowDirectionEnum() {
    }

    private PopoverArrowDirectionEnum(int value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    
    
}
