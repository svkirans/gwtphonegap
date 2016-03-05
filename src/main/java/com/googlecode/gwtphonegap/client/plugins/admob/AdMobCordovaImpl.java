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

package com.googlecode.gwtphonegap.client.plugins.admob;

public class AdMobCordovaImpl implements AdMob {

    private boolean initialized;
    
    @Override
    public void initialize() {
        if (!testForPlugin()) {
            throw new IllegalStateException("cannot find AdMob plugin - did you include AdMob.js?");
        }
        initialized = true;
    }
    
    private native boolean testForPlugin() /*-{
        if (!$wnd.AdMob) {
            return false;
        }
        return true;
    }-*/;

    @Override
    public void createBanner(AdMobOptions options) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize AdMob plugin before using it");
        }
        createBannerNative(options);
    }
    
    private native void createBannerNative(AdMobOptions options) /*-{
        $wnd.AdMob.createBanner(options);
    }-*/;

    @Override
    public void removeBanner() {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize AdMob plugin before using it");
        }
        removeBannerNative();
    }

    private native void removeBannerNative() /*-{
        $wnd.AdMob.removeBanner();
    }-*/;
    
    @Override
    public void hideBanner() {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize AdMob plugin before using it");
        }
        hideBannerNative();
    }
    
    private native void hideBannerNative() /*-{
        $wnd.AdMob.hideBanner();
    }-*/;
    
    @Override
    public void showBanner(int position) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize AdMob plugin before using it");
        }
        showBannerNative(position);
    }
    
    private native void showBannerNative(int position) /*-{
        $wnd.AdMob.showBanner(position);
    }-*/;
    
    @Override
    public void showBannerAtXY(int x, int y) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize AdMob plugin before using it");
        }
        showBannerAtXYNative(x, y);
    }

    private native void showBannerAtXYNative(int x, int y) /*-{
        $wnd.AdMob.showBannerAtXY(x, y);
    }-*/;
    
    @Override
    public void prepareInterstitial(AdMobOptions options) {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize AdMob plugin before using it");
        }
        prepareInterstitialNative(options);
    }
    
    private native void prepareInterstitialNative(AdMobOptions options) /*-{
        $wnd.AdMob.prepareInterstitial(options);
    }-*/;

    @Override
    public void showInterstitial() {
        if (!initialized) {
            throw new IllegalStateException("you have to initialize AdMob plugin before using it");
        }
        showInterstitialNative();
    }
    
    private native void showInterstitialNative() /*-{
        $wnd.AdMob.showInterstitial();
    }-*/;

}
