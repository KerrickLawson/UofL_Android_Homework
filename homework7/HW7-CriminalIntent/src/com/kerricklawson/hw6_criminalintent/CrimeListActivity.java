package com.kerricklawson.hw6_criminalintent;

import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		return new CrimeListFragment();
	}

}
