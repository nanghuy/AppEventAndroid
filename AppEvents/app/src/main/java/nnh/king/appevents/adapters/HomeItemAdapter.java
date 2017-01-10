package nnh.king.appevents.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.TreeSet;

import nnh.king.appevents.R;

/**
 * Created by huy on 1/6/2017.
 */

public class HomeItemAdapter extends BaseAdapter {

    private static final int ITEM_WEATHER = 0;
    private static final int ITEM_HOME = 1;
    private static final int ITEM_EVENTS = 2;

    private ArrayList<String> mData = new ArrayList<String>();
    private TreeSet<Integer> sectionHeader = new TreeSet<Integer>();

    private LayoutInflater mInflater;

    public HomeItemAdapter(Context context) {
        mInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(final String item) {
        mData.add(item);
        notifyDataSetChanged();
    }

    public void addSectionHeaderItem(final String item) {
        mData.add(item);
        sectionHeader.add(mData.size() - 1);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public int getItemViewType(int position) {
//        return sectionHeader.contains(position) ? TYPE_SEPARATOR : TYPE_ITEM;

        switch (position) {
            case 0:
                return ITEM_WEATHER;
            case 1:
                return ITEM_HOME;
            case 2:
                return ITEM_EVENTS;
            default:
                return ITEM_EVENTS;
        }
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        int rowType = getItemViewType(position);

        if (convertView == null) {
            holder = new ViewHolder();
            switch (rowType) {
                case ITEM_WEATHER:
                    convertView = mInflater.inflate(R.layout.row_weather_home, null);
//                    holder.textView = (TextView) convertView.findViewById(R.id.);
                    break;
                case ITEM_HOME:
                    convertView = mInflater.inflate(R.layout.row_item_home, null);
//                    holder.textView = (TextView) convertView.findViewById(R.id.textSeparator);
                    break;
                case ITEM_EVENTS:
                    convertView = mInflater.inflate(R.layout.row_events_item_home, null);
                    break;

            }
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        return convertView;
    }

    public static class ViewHolder {
        public TextView textView;
    }
}
