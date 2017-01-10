package nnh.king.appevents.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.CalendarView;
import android.widget.ListView;

import java.util.Calendar;

import nnh.king.appevents.R;
import nnh.king.appevents.abstracts.BaseActivity;
import nnh.king.appevents.adapters.CalendarItemAdapter;

import static nnh.king.appevents.R.drawable.calendar;

/**
 * Created by huy on 1/9/2017.
 */

public class ActivityCalendar extends BaseActivity {
//    private CalendarItemAdapter calendarItemAdapter;
//    private ListView listView;
//    private CalendarView calendarView;

    @Override
    protected int layoutById() {
        return R.layout.activity_calendar;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {

//        listView = (ListView) findViewById(R.id.activity_calendar_list_view);
//
//        calendarItemAdapter = new CalendarItemAdapter(this);
//        for (int i = 1; i < 30; i++) {
//            calendarItemAdapter.addItem("Row Item #" + i);
//            if (i % 4 == 0) {
//                calendarItemAdapter.addSectionHeaderItem("Section #" + i);
//            }
//        }
//        listView.setAdapter(calendarItemAdapter);
//
//        calendarView = (CalendarView)findViewById(R.id.activity_calendar_view);
    }


    @Override
    protected void setEvents() {

    }

    @Override
    protected void initData() {

//        calendarView.setUnfocusedMonthDateColor(14277081);


    }

    @Override
    protected String TAG() {
        return null;
    }

}
