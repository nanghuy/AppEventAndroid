package nnh.king.appevents.activities;

import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabSelectedListener;

import nnh.king.appevents.R;
import nnh.king.appevents.abstracts.BaseActivity;

public class Home extends BaseActivity {

    private CoordinatorLayout coordinatorLayout;

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
                        Snackbar.make(coordinatorLayout, "Recent Item Selected", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.search_item:
                        Snackbar.make(coordinatorLayout, "Favorite Item Selected", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.calendar_item:
                        Snackbar.make(coordinatorLayout, "Location Item Selected", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.user_item:
                        Snackbar.make(coordinatorLayout, "Location Item Selected", Snackbar.LENGTH_LONG).show();
                        break;
                }
            }
        });

        bottomBar.setBackgroundColor(16777215);
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
}
