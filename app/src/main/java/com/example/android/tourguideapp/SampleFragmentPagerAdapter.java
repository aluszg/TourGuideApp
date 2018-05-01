package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 8;
    private String map = "Map";
    private String one = "Belferus Zenepus";
    private String two = "UZetikus";
    private String three = "Rzepikus Rogalikus";
    private String four = "Odpadek";
    private String five = "Aldemedus";
    private String six = "Brukus";
    private String seven = "Czaruś";

    private String tabTitles[] = new String[] { map, one, two, three, four, five, six, seven};

    public SampleFragmentPagerAdapter(FragmentManager fm) {
        super (fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MapFragment ();
        } else if (position == 1){
            return new BacchusOneFragment ();
        } else if (position == 2){
            return new BacchusTwoFragment ();
        } else if (position == 3){
            return new BacchusThreeFragment ();
        } else if (position == 4){
            return new BacchusFourFragment ();
        } else if (position == 5){
            return new BacchusFiveFragment ();
        } else if (position == 6){
            return new BacchusSixFragment ();
        } else {
            return new BacchusSevenFragment ();
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
