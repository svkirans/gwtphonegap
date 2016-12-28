/*
 * Copyright 2013 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.gwtphonegap.client.camera;

/**
 * Parameters only used by iOS to specify the anchor element location and arrow direction of popover
 * used on iPad when selecting images from the library or album.
 * 
 * @author Daniel Kurka
 * 
 */
public class PopOverOptions {

  private int x = 0;

  private int y = 32;

  private int width = 320;

  private int height = 480;

  private int arrowDir;

  public PopOverOptions() {

  }

  public void setX(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getArrowDir() {
    return arrowDir;
  }

  public void setArrowDir(int arrowDir) {
    this.arrowDir = arrowDir;
  }

}
