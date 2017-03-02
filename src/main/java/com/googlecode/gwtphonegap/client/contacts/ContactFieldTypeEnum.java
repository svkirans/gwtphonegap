/*
 * Copyright 2017 Venkata Kiran.
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
    
    ADDRESSES("navigator.contacts.fieldType.addresses"),
    BIRTHDAY("navigator.contacts.fieldType.birthday"),
    CATEGORIES("navigator.contacts.fieldType.categories"),
    COUNTRY("navigator.contacts.fieldType.country"),
    DEPARTMENT("navigator.contacts.fieldType.department"),
    DISPLAYNAME("navigator.contacts.fieldType.displayName"),
    EMAILS("navigator.contacts.fieldType.emails"),
    FAMILYNAME("navigator.contacts.fieldType.familyName"),
    FORMATTED("navigator.contacts.fieldType.formatted"),
    GIVENNAME("navigator.contacts.fieldType.givenName"),
    HONORIFICPREFIX("navigator.contacts.fieldType.honorificPrefix"),
    HONORIFICSUFFIX("navigator.contacts.fieldType.honorificSuffix"),
    ID("navigator.contacts.fieldType.id"),
    IMS("navigator.contacts.fieldType.ims"),
    LOCALITY("navigator.contacts.fieldType.locality"),
    MIDDLENAME("navigator.contacts.fieldType.middleName"),
    NAME("navigator.contacts.fieldType.name"),
    NICKNAME("navigator.contacts.fieldType.nickname"),
    NOTE("navigator.contacts.fieldType.note"),
    ORGANIZATIONS("navigator.contacts.fieldType.organizations"),
    PHONENUMBERS("navigator.contacts.fieldType.phoneNumbers"),
    PHOTOS("navigator.contacts.fieldType.photos"),
    POSTALCODE("navigator.contacts.fieldType.postalCode"),
    REGION("navigator.contacts.fieldType.region"),
    STREETADDRESS("navigator.contacts.fieldType.streetAddress"),
    TITLE("navigator.contacts.fieldType.title"),
    URLS("navigator.contacts.fieldType.urls");
    
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
