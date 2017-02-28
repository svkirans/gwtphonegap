/*
 * Copyright 2011 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.gwtphonegap.client.capture;

/**
 * Encapsulates the error code resulting from a failed media capture operation.
 * @author Daniel Kurka
 */
public interface CaptureError {

        /**
         * The camera or microphone failed to capture image or sound.
         */
	public static final int CAPTURE_INTERNAL_ERR = 0;
        /**
         * The camera or audio capture application is currently serving another capture request.
         */
	public static final int CAPTURE_APPLICATION_BUSY = 1;
        /**
         * Invalid use of the API (e.g., the value of limit is less than one).
         */
	public static final int CAPTURE_INVALID_ARGUMENT = 2;
        /**
         * The user exits the camera or audio capture application before capturing anything.
         */
	public static final int CAPTURE_NO_MEDIA_FILES = 3;
        /**
         * The user denied a permission required to perform the given capture request.
         */
        public static final int CAPTURE_PERMISSION_DENIED = 4;
        /**
         * The requested capture operation is not supported.
         */
	public static final int CAPTURE_NOT_SUPPORTED = 20;

	public int getCode();
}
