package nnh.king.appevents.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabSelectedListener;

import nnh.king.appevents.R;
import nnh.king.appevents.abstracts.BaseActivity;
import nnh.king.appevents.adapters.HomeItemAdapter;

public class Home extends BaseActivity {

    private CoordinatorLayout coordinatorLayout;
    private HomeItemAdapter homeItemAdapter;
    private ListView listView;

    @Override
    protected int layoutById() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.three_buttons_activity);

        BottomBar bottomBar = BottomBar.attach(this, savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.menu, new OnMenuTabSelectedListener() {
            @Override
            public void onMenuItemSelected(int itemId) {
                switch (itemId) {
                    case R.id.home_item:
                        gotoHome();
                        break;
                    case R.id.search_item:
                        gotoSearch();
                        break;
                    case R.id.calendar_item:
                        gotoCalendar();
                        break;
                    case R.id.user_item:
                        gotoUser();
                        break;
                }
            }
        });

//        bottomBar.setBackgroundColor(16777215);
        bottomBar.setDefaultTabPosition(0);

        listView = (ListView) findViewById(R.id.activity_home_listview);
    }

    @Override
    protected void setEvents() {

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                gotoDetail();
            }
        });
    }

    @Override
    protected void initData() {
        homeItemAdapter = new HomeItemAdapter(this);
        for (int i = 1; i < 5; i++) {
            homeItemAdapter.addItem("Row Item #" + i);
        }
        listView.setAdapter(homeItemAdapter);
    }

    @Override
    protected String TAG() {
        return null;
    }

    private void gotoDetail() {
        Intent i = new Intent(this, ActivityDetailEvents.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
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
