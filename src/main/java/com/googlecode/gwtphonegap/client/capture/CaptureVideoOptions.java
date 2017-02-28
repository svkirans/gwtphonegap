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
 * Encapsulates video capture configuration options.
 * @author Daniel Kurka
 */
public class CaptureVideoOptions {
	private int limit;

	private long duration;
        
        private int quality;

	public CaptureVideoOptions() {
		this.limit = 1;
		this.duration = -1;
                this.quality = 1;
	}

        /**
         * returns the maximum number of video clips to capture.
         * @return 
         */
	public int getLimit() {
		return limit;
	}

        /**
         * The maximum number of video clips the device's user can capture in a 
         * single capture operation. The value must be greater than or equal to 
         * 1 (defaults to 1).
         * @param limit 
         */
	public void setLimit(int limit) {
		this.limit = limit;
	}

        /**
         * The maximum duration of a video clip, in seconds.
         * @return 
         */
	public long getDuration() {
		return duration;
	}

        /**
         * The maximum duration of a video clip, in seconds.
         * @param duration 
         */
	public void setDuration(long duration) {
		this.duration = duration;
	}

        /**
         * @return the quality
         */
        public int getQuality() {
            return quality;
        }

        /**
         * Android supports an additional quality property, to allow capturing 
         * video at different qualities. A value of 1 ( the default ) means high
         * quality and value of 0 means low quality, suitable for MMS messages.
         * Android only.
         * @param quality the quality to set
         */
        public void setQuality(int quality) {
            this.quality = quality;
        }
}
