/*
 * Copyright 2011 - AndroidQuery.com (tinyeeliu@gmail.com)
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

package com.androidquery.util;

public interface Constants {

	public static final int LAYER_TYPE_SOFTWARE = 1;
	public static final int LAYER_TYPE_HARDWARE = 2;
	public static final int FLAG_HARDWARE_ACCELERATED = 0x01000000;
	public static final int FLAG_ACTIVITY_NO_ANIMATION = 0x00010000;
	public static final int OVER_SCROLL_ALWAYS = 0;
	public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
	public static final int OVER_SCROLL_NEVER = 2;
	public static final int INVISIBLE = -1;
	public static final int GONE = -2;
	public static final int FADE_IN = -1;
	
	public static final int TAG_URL = 0x40FF0001;
	public static final int TAG_SCROLL_STATE = 0x40FF0002;
	
	public static final float RATIO_PRESERVE = Float.MAX_VALUE;
	public static final String ACTIVE_ACCOUNT = "aq.account";
	
	public static final String AUTH_READER = "reader";
	public static final String AUTH_PICASA = "lh2";
	public static final String AUTH_SPREADSHEETS = "wise";
	public static final String AUTH_YOUTUBE = "youtube";
	public static final String AUTH_ANALYTICS = "analytics";
	public static final String AUTH_BLOGGER = "blogger";
	public static final String AUTH_CALENDAR = "cl";
	public static final String AUTH_BUZZ = "buzz";
	public static final String AUTH_CONTACTS = "cp";
	public static final String AUTH_FINANCE = "finance";
	public static final String AUTH_MAPS = "local";

}
