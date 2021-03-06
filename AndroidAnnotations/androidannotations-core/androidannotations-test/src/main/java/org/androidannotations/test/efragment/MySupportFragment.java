/**
 * Copyright (C) 2010-2016 eBusiness Information, Excilys Group
 * Copyright (C) 2016-2020 the AndroidAnnotations project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.test.efragment;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.SystemService;
import org.androidannotations.annotations.Trace;
import org.androidannotations.annotations.Transactional;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.test.R;
import org.androidannotations.test.ebean.SomeBean;

import android.app.ActivityManager;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.Fragment;
import android.widget.TextView;

@EFragment(R.layout.injected)
public class MySupportFragment extends Fragment {

	@Bean
	SomeBean someBean;

	@ViewById
	TextView myTextView;

	@SystemService
	ActivityManager activityManager;

	@Click
	void myButton() {
	}

	@UiThread
	void uiThread() {

	}

	@Trace
	void trace() {

	}

	@Transactional
	void successfulTransaction(SQLiteDatabase db) {
	}

	@AfterInject
	void calledAfterInjection() {

	}

	@AfterViews
	void calledAfterViewInjection() {

	}

	@ViewById(R.id.my_text_view)
	void methodView1(TextView methodView1) {
	}

	void methodView2(@ViewById(R.id.my_text_view) TextView methodView2) {
	}

}
