package com.kerricklawson.hw6_criminalintent;

import java.util.ArrayList;

import android.content.Context;

public class CrimeLab {
	
	public void addCrime(Crime c) {
		mCrimes.add(c);
		}
	private ArrayList<Crime> mCrimes;

    private static CrimeLab sCrimeLab;
    @SuppressWarnings("unused")
	private Context mAppContext;

    private CrimeLab(Context appContext) {
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();

    }

    public static CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }
}
