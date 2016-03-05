/*
 * Copyright (c) 2015 Washington State Department of Transportation
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

import com.googlecode.gwtphonegap.client.plugins.PhoneGapPlugin;

/**
 * This class is a wrapper for the cordova-admob-pro plugin.
 * <p>
 * The implementation is based on 
 * <a href="https://github.com/floatinghotpot/cordova-admob-pro/blob/master/www/AdMob.js">AdMob.js</a>.
 * 
 * @author Wayne Dyck
 * 
 */
public interface AdMob extends PhoneGapPlugin {
    
    /**
     * Create a banner Ad.
     * 
     * @param options  see methods in {@link AdMobOptions}
     */
    public void createBanner(AdMobOptions options);
    
    /**
     * Destroy the banner, remove it from screen.
     */    
    public void removeBanner();

    /**
     * Hide the banner, remove it from screen, but can show it later.
     */
    public void hideBanner();

    /**
     * Show banner at given position.
     * 
     * @param position
     */
    public void showBanner(int position);
    
    /**
     * Show banner at given position with (x,y).
     * 
     * @param x  in pixels. Offset from screen left
     * @param y  in pixels. Offset from screen top
     */
    public void showBannerAtXY(int x, int y);

    /**
     * Prepare an interstitial Ad for showing.
     */
    public void prepareInterstitial(AdMobOptions options);

    /**
     * Show interstitial Ad when it's ready.
     */
    public void showInterstitial();
}
