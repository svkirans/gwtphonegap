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
public interface CameraConstants {
    
    public enum DestinationTypeEnum {
    
    
    DATA_URL(0),
    FILE_URI(1),
    NATIVE_URI(2);
    
    private int value;

    private DestinationTypeEnum() {
    }

    private DestinationTypeEnum(int value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    }
    
    public enum DirectionEnum {
    
    BACK(0),
    FRONT(1);
    
    private int value;

    private DirectionEnum() {
    }

    private DirectionEnum(int value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    
    
}
    
    public enum EncodingTypeEnum {
    
    JPEG(0),
    PNG(1);
    
    private int value;
    
    EncodingTypeEnum(int value){
        this.value = value;
    }

    private EncodingTypeEnum() {
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }    
}
    
    public enum MediaTypeEnum {
    
    PICTURE(0),
    VIDEO(1),
    ALLMEDIA(2);

    private int value;

    private MediaTypeEnum(int value) {
        this.value = value;
    }

    private MediaTypeEnum() {
    }
    
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
}
    
    public enum PictureSourceTypeEnum {


    PHOTOLIBRARY(0),
    CAMERA(1),
    SAVEDPHOTOALBUM(2);

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    private int value;

    PictureSourceTypeEnum(int value){
        this.value = value;
    }
    
    PictureSourceTypeEnum(){
    }
}
}
