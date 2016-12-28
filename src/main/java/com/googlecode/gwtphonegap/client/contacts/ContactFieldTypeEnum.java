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
package com.googlecode.gwtphonegap.client.contacts;

/**
 * The ContactFieldType object is an enumeration of possible field types, 
 * such as 'phoneNumbers' or 'emails', that could be used to control which 
 * contact properties must be returned back from contacts.find() method 
 * (see contactFindOptions.desiredFields), or to specify fields to search in 
 * (through contactFields parameter). 
 * @author vkiran
 */
public enum ContactFieldTypeEnum {
    
    ADDRESSES("addresses"),
    BIRTHDAY("birthday"),
    CATEGORIES("categories"),
    COUNTRY("country"),
    DEPARTMENT("department"),
    DISPLAYNAME("displayName"),
    EMAILS("emails"),
    FAMILYNAME("familyName"),
    FORMATTED("formatted"),
    GIVENNAME("givenName"),
    HONORIFICPREFIX("honorificPrefix"),
    HONORIFICSUFFIX("honorificSuffix"),
    ID("id"),
    IMS("ims"),
    LOCALITY("locality"),
    MIDDLENAME("middleName"),
    NAME("name"),
    NICKNAME("nickname"),
    NOTE("note"),
    ORGANIZATIONS("organizations"),
    PHONENUMBERS("phoneNumbers"),
    PHOTOS("photos"),
    POSTALCODE("postalCode"),
    REGION("region"),
    STREETADDRESS("streetAddress"),
    TITLE("title"),
    URLS("urls");
    
    private String value;

    private ContactFieldTypeEnum() {
    }

    private ContactFieldTypeEnum(String value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
    
    
}
