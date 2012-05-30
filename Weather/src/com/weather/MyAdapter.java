package com.weather;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter{

	public MyAdapter(FragmentManager fm) {
		super(fm);
		
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return ArrayListFragment.newInstance(position);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 10;
	}

}
