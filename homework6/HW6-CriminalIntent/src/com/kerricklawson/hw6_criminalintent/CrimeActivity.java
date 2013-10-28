package com.kerricklawson.hw6_criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class CrimeActivity extends FragmentActivity {

	protected Fragment createFragment() {
	return new CrimeFragment();
	}
}
