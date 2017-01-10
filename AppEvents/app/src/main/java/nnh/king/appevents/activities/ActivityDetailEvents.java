package nnh.king.appevents.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import nnh.king.appevents.R;
import nnh.king.appevents.abstracts.BaseActivity;
import nnh.king.appevents.adapters.DetailPageViewAdapter;

/**
 * Created by huy on 1/9/2017.
 */

public class ActivityDetailEvents extends BaseActivity {
    FragmentPagerAdapter fragmentPagerAdapter;
    ViewPager viewPager;
    PagerTabStrip pagerTabStrip;


    @Override
    protected int layoutById() {
        return R.layout.activity_detail_events;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {
        viewPager = (ViewPager) findViewById(R.id.vpPager);
        pagerTabStrip = (PagerTabStrip) findViewById(R.id.pager_header);
        pagerTabStrip.setTabIndicatorColor(16724940);
    }

    @Override
    protected void setEvents() {

    }

    @Override
    protected void initData() {
        fragmentPagerAdapter = new DetailPageViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);
        pagerTabStrip.setDrawFullUnderline(true);
    }

    @Override
    protected String TAG() {
        return null;
    }



}
