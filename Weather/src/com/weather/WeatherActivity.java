package com.weather;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class WeatherActivity extends FragmentActivity {
	
	MyAdapter mAdapter;
    ViewPager mPager;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_page_view);
        
        mAdapter = new MyAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.viewPager);
        mPager.setAdapter(mAdapter);

        
        createFragments();
    }

    /**
     * Create fragments.
     */
	private void createFragments() {
		ArrayList<Fragment> fragments = new ArrayList<Fragment>();
		
	
	}
}