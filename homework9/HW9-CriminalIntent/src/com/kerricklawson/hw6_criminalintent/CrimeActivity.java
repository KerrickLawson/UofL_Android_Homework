package com.kerricklawson.hw6_criminalintent;

import java.util.UUID;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.view.WindowManager;

public class CrimeActivity extends FragmentActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	// Hide the window title.
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	// Hide the status bar and other OS-level chrome
	getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	super.onCreate(savedInstanceState);
	}

	protected Fragment createFragment() {
        UUID crimeId = (UUID)getIntent()
                .getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);
            return CrimeFragment.newInstance(crimeId);
	}
}
