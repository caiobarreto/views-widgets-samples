/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.example.android.cardview

import android.app.Activity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

/**
 * Launcher Activity for the CardView sample app.
 */
class CardViewActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCenter.start(application, "62e7782f-7c6a-49b0-9b7b-f82d17299a8b",
                Analytics::class.java, Crashes::class.java)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)
        if (savedInstanceState == null) {
            fragmentManager.beginTransaction()
                    .add(R.id.container, CardViewFragment())
                    .commit()
        }
    }

}
