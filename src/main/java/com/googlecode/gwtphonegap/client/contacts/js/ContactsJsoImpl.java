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
package com.googlecode.gwtphonegap.client.contacts.js;

import com.google.gwt.core.client.JavaScriptObject;
import com.googlecode.gwtphonegap.client.contacts.Contact;
import com.googlecode.gwtphonegap.client.contacts.ContactFactory;
import com.googlecode.gwtphonegap.client.contacts.ContactFieldTypeEnum;
import com.googlecode.gwtphonegap.client.contacts.ContactFindCallback;
import com.googlecode.gwtphonegap.client.contacts.ContactFindOptions;
import com.googlecode.gwtphonegap.client.contacts.ContactPickCallback;
import com.googlecode.gwtphonegap.client.contacts.Contacts;
import com.googlecode.gwtphonegap.collection.client.JsLightArray;
import com.googlecode.gwtphonegap.collection.shared.CollectionFactory;
import com.googlecode.gwtphonegap.collection.shared.LightArray;
import java.util.List;

public class ContactsJsoImpl implements Contacts {

	@Override
	public native Contact create() /*-{
		return $wnd.navigator.contacts.create();
	}-*/;

	@Override
	public void find(List<ContactFieldTypeEnum> fields, ContactFindCallback callback, ContactFindOptions contactFindOptions) {
		if (!(fields instanceof JsLightArray<?>)) {
			throw new IllegalArgumentException();
		}
//		JsLightArray<?> jsLightArray = (JsLightArray<?>) fields;
//		JavaScriptObject jsFields = jsLightArray.getArray();
                List<ContactFieldTypeEnum> listContactFieldTypes = contactFindOptions.getDesiredFields();
                JavaScriptObject jsFields = convertContactFieldTypes(fields);
                JavaScriptObject desiredFields = convertContactFieldTypes(listContactFieldTypes);
                
		findNative(jsFields, callback, contactFindOptions,desiredFields);
	}

	private void callSuccess(ContactFindCallback callback, JavaScriptObject contacts) {
		JsLightArray<Contact> jsLightArray = new JsLightArray<Contact>(contacts);
		callback.onSuccess(jsLightArray);
	}

	public native void findNative(JavaScriptObject fields, ContactFindCallback callback, ContactFindOptions contactFindOptions,JavaScriptObject desiredFields) /*-{
		var instance = this;

		var sC = function(contacts) {
			instance.@com.googlecode.gwtphonegap.client.contacts.js.ContactsJsoImpl::callSuccess(Lcom/googlecode/gwtphonegap/client/contacts/ContactFindCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, contacts);
		};

		var eC = function(error) {
			callback.@com.googlecode.gwtphonegap.client.contacts.ContactFindCallback::onFailure(Lcom/googlecode/gwtphonegap/client/contacts/ContactError;)(error);
		};

		var lfilter = contactFindOptions.@com.googlecode.gwtphonegap.client.contacts.ContactFindOptions::getFilter()();
		var lmultiple = contactFindOptions.@com.googlecode.gwtphonegap.client.contacts.ContactFindOptions::isMultiple()();
                var lhasPhoneNumber = contactFindOptions.@com.googlecode.gwtphonegap.client.contacts.ContactFindOptions::hasPhoneNumber()();

		var options = {
			filter : lfilter,
			multiple : lmultiple,
                        hasPhoneNumber : lhasPhoneNumber,
                        desiredFields : desiredFields;    
		};

		$wnd.navigator.contacts.find(fields, $entry(sC), $entry(eC), options);
	}-*/;


	@Override
	public ContactFactory getFactory() {
		return new ContactFactoryJsoImpl();
	}

    @Override
    public native void pickContact(ContactPickCallback callback) /*-{
		var sC = function(contact) {
			callback.@com.googlecode.gwtphonegap.client.contacts.ContactPickCallback::onSuccess(*)(contact);
		};

		var eC = function(error) {
			callback.@com.googlecode.gwtphonegap.client.contacts.ContactPickCallback::onFailure(*)(error);
		};
       
       $wnd.navigator.contacts.pickContact($entry(sC),$entry(eC));
	}-*/;

        private JavaScriptObject convertContactFieldTypes(List<ContactFieldTypeEnum> listContactFieldTypes) {
            LightArray<String> fields = CollectionFactory.<String> constructArray();
            if(listContactFieldTypes != null && !listContactFieldTypes.isEmpty()){
                for (ContactFieldTypeEnum next : listContactFieldTypes) {
                    fields.push(next.getValue());
                }
            }
            JsLightArray<?> jsLightArray = (JsLightArray<?>) fields;
                    JavaScriptObject jsFields = jsLightArray.getArray();
            return jsFields;
        }

}
