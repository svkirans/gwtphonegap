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

import com.googlecode.gwtphonegap.client.plugins.PhoneGapPlugin;

/**
 * This class is a wrapper for the google-analytics-plugin for Cordova. 
 * <p>
 * The implementation is based on 
 * <a href="https://github.com/danwilson/google-analytics-plugin/blob/master/www/analytics.js">analytics.js</a>
 *
 * @author Wayne Dyck
 *
 */
public interface Analytics extends PhoneGapPlugin {
	
    /**
     * Set up Analytics tracker
     *
     * @param id  your Google Analytics Mobile App property
     */
    public void startTrackerWithId(String id);

    /**
     * User ID of known user to send with Google Analytics hits
     * 
     * @param id
     */
    public void setUserId(String id);

    /**
     * Enable verbose logging
     */
    public void debugMode();

    /**
     * Track a Screen (PageView)
     *
     * @param screen  name of an application screen
     */
    public void trackView(String screen);

    /**
     * Enable the association of metadata with hits, users, and sessions
     * 
     * @param key  index of the custom dimension or metric. This index is 1-based
     * @param value  value of the custom dimension or metric
     */
    public void addCustomDimension(int key, String value);
    
    /**
     * Track an Event
     *
     * @param category  typically the object that was interacted with (e.g. 'Video')
     * @param action  type of interaction (e.g. 'play')
     * @param label  useful for categorizing events (e.g. 'Fall Campaign')
     * @param value  numeric value associated with the event (e.g. 42)
     */
    public void trackEvent(String category, String action, String label, int value);
    
    /**
     * Measure the number and type of caught and uncaught crashes and exceptions that occur
     * 
     * @param description  description of the exception (up to 100 characters). Accepts null
     * @param fatal  indicates whether the exception was fatal. true indicates fatal
     */
    public void trackException(String description, boolean fatal);
    
    /**
     * Measure user timings
     * 
     * @param category  string for categorizing all user timing variables into logical
     *                  groups (e.g. 'JS Dependencies').
     * @param intervalInMilliseconds  number of milliseconds in elapsed time to report
     *                                to Google Analytics (e.g. 20).
     * @param name  string to identify the variable being recorded (e.g. 'load').
     * @param label  string that can be used to add flexibility in visualizing user
     *               timings in the reports (e.g. 'Google CDN').
     */
    public void trackTiming(String category, int intervalInMilliseconds, String name, String label);
    
    /**
     * Represents the entire transaction that occurs in your app
     * 
     * @param transactionId  transaction ID. (e.g. 1234)
     * @param affiliation  store or affiliation from which this transaction occurred (e.g. Acme Clothing)
     * @param revenue  specifies the total revenue or grand total associated with the transaction (e.g. 11.99)
     * @param tax  specifies the total tax of the transaction. (e.g. 1.29)
     * @param shipping  specifies the total shipping cost of the transaction. (e.g. 5)
     * @param currencyCode  local currency of a particular transaction (e.g. EUR)
     */
    public void addTransaction(String transactionId, String affiliation, String revenue, String tax, String shipping,
            String currencyCode);
    
    /**
     * Represents the individual products that were in the shopping cart
     * 
     * @param transactionId  transaction ID. (e.g. 1234)
     * @param name  item name. (e.g. Fluffy Pink Bunnies)
     * @param sku  specifies the SKU or item code. (e.g. SKU47)
     * @param category  category to which the item belongs (e.g. Party Toys)
     * @param price  individual, unit, price for each item. (e.g. 11.99)
     * @param quantity  number of units purchased in the transaction
     * @param currencyCode  local currency of a particular transaction (e.g. EUR)
     */
    public void addTransactionItem(String transactionId, String name, String sku, String category, String price,
            String quantity, String currencyCode);

}
