/*
 * Copyright (c) 2016 Washington State Department of Transportation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.googlecode.gwtphonegap.client.plugins.analytics;

public class AnalyticsCordovaImpl implements Analytics {

    private boolean initialized;

    @Override
    public void initialize() {
        if (!testForPlugin()) {
            throw new IllegalStateException("cannot find Analytics plugin - did you include analytics.js?");
        }
        initialized = true;
    }

    private native boolean testForPlugin() /*-{
		if (!$wnd.analytics) {
			return false;
		}
		return true;
    }-*/;

    @Override
    public void startTrackerWithId(String id) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize Analytics plugin before using it");
        }
        startTrackerWithIdNative(id);
    }

    private native void startTrackerWithIdNative(String id) /*-{
        $wnd.analytics.startTrackerWithId(id)
    }-*/;

    @Override
    public void setUserId(String id) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize Analytics plugin before using it");
        }
        setUserIdNative(id);
    }

    private native void setUserIdNative(String id) /*-{
        $wnd.analytics.setUserId(id);
    }-*/;

    @Override
    public void debugMode() {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize Analytics plugin before using it");
        }
        debugModeNative();
    }

    private native void debugModeNative() /*-{
        $wnd.analytics.debugMode();
    }-*/;

    @Override
    public void trackView(String screen) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize Analytics plugin before using it");
        }
        trackViewNative(screen);
    }

    private native void trackViewNative(String screen) /*-{
        $wnd.analytics.trackView(screen);
    }-*/;

    @Override
    public void addCustomDimension(int key, String value) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize Analytics plugin before using it");
        }
        addCustomDimensionNative(key, value);
    }

    private native void addCustomDimensionNative(int key, String value) /*-{
        $wnd.analytics.addCustomDimension(key, value);
    }-*/;

    @Override
    public void trackEvent(String category, String action, String label, int value) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize Analytics plugin before using it");
        }
        trackEventNative(category, action, label, value);
    }

    private native void trackEventNative(String category, String action, String label, int value) /*-{
        $wnd.analytics.trackEvent(category, action, label, value);
    }-*/;

    @Override
    public void trackException(String description, boolean fatal) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize Analytics plugin before using it");
        }
        trackExceptionNative(description, fatal);
    }

    private native void trackExceptionNative(String description, boolean fatal) /*-{
        $wnd.analytics.trackException(description, fatal);
    }-*/;

    @Override
    public void trackTiming(String category, int intervalInMilliseconds, String name, String label) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize Analytics plugin before using it");
        }
        trackTimingNative(category, intervalInMilliseconds, name, label);
    }

    private native void trackTimingNative(String category, int intervalInMilliseconds, String name, String label) /*-{
        $wnd.analytics.trackTiming(category, intervalInMilliseconds, name, label);
    }-*/;

    @Override
    public void addTransaction(String transactionId, String affiliation, String revenue, String tax, String shipping,
            String currencyCode) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize Analytics plugin before using it");
        }
        addTransactionNative(transactionId, affiliation, revenue, tax, shipping, currencyCode);
    }

    private native void addTransactionNative(String transactionId, String affiliation, String revenue, String tax,
            String shipping, String currencyCode) /*-{
        $wnd.analytics.addTransaction(transactionId, affiliation, revenue, tax, shipping, currencyCode);
    }-*/;

    @Override
    public void addTransactionItem(String transactionId, String name, String sku, String category, String price,
            String quantity, String currencyCode) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize Analytics plugin before using it");
        }
        addTransactionItemNative(transactionId, name, sku, category, price, quantity, currencyCode);
    }

    private native void addTransactionItemNative(String transactionId, String name, String sku, String category,
            String price, String quantity, String currencyCode) /*-{
        $wnd.analytics.addTransactionItem(transactionId, name, sku, category, price, quantity, currencyCode);
    }-*/;

}
