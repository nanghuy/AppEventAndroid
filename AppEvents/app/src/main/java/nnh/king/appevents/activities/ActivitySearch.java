package nnh.king.appevents.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v17.leanback.widget.HorizontalGridView;
import nnh.king.appevents.R;
import nnh.king.appevents.abstracts.BaseActivity;
import nnh.king.appevents.adapters.SearchItemAdapter;

/**
 * Created by huy on 1/9/2017.
 */

public class ActivitySearch extends BaseActivity {
//    private CoordinatorLayout coordinatorLayout;

    private SearchItemAdapter searchItemAdapter;
    private HorizontalGridView gridView;

    @Override
    protected int layoutById() {
        return R.layout.activity_search;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {

        gridView = (HorizontalGridView )findViewById(R.id.activity_search_gridview);
    }

    @Override
    protected void setEvents() {

    }

    @Override
    protected void initData() {
        searchItemAdapter = new SearchItemAdapter(this);
        gridView.setAdapter(searchItemAdapter);
    }

    @Override
    protected String TAG() {
        return null;
    }

    private void gotoHome() {
        Intent i = new Intent(this, Home.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }

    private void gotoSearch() {
        Intent i = new Intent(this, ActivitySearch.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }

    private void gotoUser() {
        Intent i = new Intent(this, Activity_User.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }

    private void gotoCalendar() {
        Intent i = new Intent(this, ActivityCalendar.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
}
