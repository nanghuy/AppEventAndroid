package nnh.king.appevents.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;


import nnh.king.appevents.R;
import nnh.king.appevents.abstracts.BaseActivity;

/**
 * Created by huy on 1/9/2017.
 */

public class Activity_User extends BaseActivity {
//    private CoordinatorLayout coordinatorLayout;

    @Override
    protected int layoutById() {
        return R.layout.activity_user;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {
//        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.three_buttons_activity);
//
//        BottomBar bottomBar = BottomBar.attach(this, savedInstanceState);
//        bottomBar.setItemsFromMenu(R.menu.menu, new OnMenuTabSelectedListener() {
//            @Override
//            public void onMenuItemSelected(int itemId) {
//                switch (itemId) {
//                    case R.id.home_item:
//                        gotoHome();
//                        break;
//                    case R.id.search_item:
//                        gotoSearch();
//                        break;
//                    case R.id.calendar_item:
//                        gotoCalendar();
//                        break;
//                    case R.id.user_item:
//                        gotoUser();
//                        break;
//                }
//            }
//        });
//
////        bottomBar.setBackgroundColor(16777215);
//        bottomBar.setDefaultTabPosition(3);
    }

    @Override
    protected void setEvents() {

    }

    @Override
    protected void initData() {

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
