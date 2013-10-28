package com.kerricklawson.hw6_criminalintent;

import java.util.UUID;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class CrimeActivity extends FragmentActivity {

	protected Fragment createFragment() {
        UUID crimeId = (UUID)getIntent()
                .getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);
            return CrimeFragment.newInstance(crimeId);
	}
}
