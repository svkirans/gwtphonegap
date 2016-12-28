/*
 * Copyright 2010 Daniel Kurka
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
package com.googlecode.gwtphonegap.client.contacts;

import java.util.List;

public class ContactFindOptions {
	private String filter;
	private boolean multiple;
        private List<ContactFieldTypeEnum> desiredFields;
        private boolean hasPhoneNumber = false;

	public ContactFindOptions() {
		this("");
	}

	public ContactFindOptions(String filter) {
		this(filter, false);
	}

	public ContactFindOptions(String filter, boolean multiple) {
		this.filter = filter;
                this.multiple = multiple;
	}

        /**
         * The search string used to find navigator.contacts.
         * @param filter 
         */
	public void setFilter(String filter) {
		this.filter = filter;
	}

        /**
         * Determines if the find operation returns multiple navigator.contacts.
         * @param multiple 
         */
	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}

	public String getFilter() {
		return filter;
	}

	public boolean isMultiple() {
		return multiple;
	}

        /**
         * @return the desiredFields
         */
        public List<ContactFieldTypeEnum> getDesiredFields() {
            return desiredFields;
        }

        /**
         * Contact fields to be returned back. If specified, the resulting Contact object only features values for these fields. 
         * @param desiredFields the desiredFields to set
         */
        public void setDesiredFields(List<ContactFieldTypeEnum> desiredFields) {
            this.desiredFields = desiredFields;
        }

        /**
         * @return the hasPhoneNumber
         */
        public boolean hasPhoneNumber() {
            return hasPhoneNumber;
        }

        /**
         * Filters the search to only return contacts with a phone number informed. 
         * Android only
         * @param hasPhoneNumber the hasPhoneNumber to set
         */
        public void setHasPhoneNumber(boolean hasPhoneNumber) {
            this.hasPhoneNumber = hasPhoneNumber;
        }

}
