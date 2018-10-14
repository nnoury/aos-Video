// Copyright 2017 Archos SA
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.archos.mediacenter.video.cover;

import com.archos.mediacenter.video.browser.loader.LastAddedLoader;
import com.archos.mediacenter.video.R;

import android.content.Context;
import android.support.v4.content.CursorLoader;

public class RecentlyAddedVideosProvider extends VideoSingleCursorCoverProvider {

	private final static String TAG = "RecentlyAddedVideosProvider";
	private final static boolean DBG = false;

	public RecentlyAddedVideosProvider( Context context ) {
		super (context);
	}

    /**
     *  Get the cursor loader for this provider
     */
    protected CursorLoader getCursorLoader() {

        return new LastAddedLoader(mContext);
    }

    protected int getLoaderManagerId() {
        return VIDEO_RECENTLY_ADDED_LOADER_ID;
    }

	@Override
	void setErrorMessage() {
        mErrorMessage = mContext.getResources().getString(R.string.you_have_no_recently_added_video);
    }
}
