/**
 * Copyright (C) 2016-2019 the AndroidAnnotations project
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
package org.androidannotations.test.ebean;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootFragment;

import android.app.Fragment;

@EBean
public class SomeBeanWithRootFragment {

	@RootFragment
	Fragment fragment;

	Fragment fragmentByMethod;

	Fragment fragmentByParam1;

	Fragment fragmentByParam2;

	@RootFragment
	void setFragment(Fragment fragment) {
		this.fragmentByMethod = fragment;
	}

	void setFragment2(@RootFragment Fragment fragment1, @RootFragment Fragment fragment2) {
		this.fragmentByParam1 = fragment1;
		this.fragmentByParam2 = fragment2;
	}

}
