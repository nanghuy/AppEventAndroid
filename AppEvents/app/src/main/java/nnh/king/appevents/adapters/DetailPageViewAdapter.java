package nnh.king.appevents.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import nnh.king.appevents.activities.AboutFragment;
import nnh.king.appevents.activities.DiscussionFragment;

/**
 * Created by huy on 1/10/2017.
 */

public class DetailPageViewAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 2;

    public DetailPageViewAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return AboutFragment.newInstance(0,"About");
            case 1:
                return DiscussionFragment.newInstance(0,"Discussion");
            default:

        }
        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "About";
            case 1:
                return "Discussion";
            default:
                return "";
        }
    }
}
