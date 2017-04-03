package com.containers;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class ExpandableListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list_view);

        ExpandableListView expanList = (ExpandableListView) findViewById(R.id.expanList);
        expanList.setAdapter(new ExpanListAdapter(this));

    }

    class ExpanListAdapter extends BaseExpandableListAdapter {
        Context context;
        String[] mainOptions = {"Option 1","Option 2","Option 3"};
        String[][] options = {
                {"Option 1.1","Option 1.2","Option 1.3"},
                {"Option 2.1","Option 2.2","Option 2.3"},
                {"Option 3.1","Option 3.2","Option 3.3"}
        };

        ExpanListAdapter(Context context){
            this.context = context;
        }

        @Override
        public int getGroupCount() {
            return mainOptions.length;
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            return options[groupPosition].length;
        }

        @Override
        public Object getGroup(int groupPosition) {
            return groupPosition;
        }

        @Override
        public Object getChild(int groupPosition, int childPosition) {
            return null;
        }

        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return 0;
        }

        @Override
        public boolean hasStableIds() {
            return false;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            TextView textView = new TextView(context);
            textView.setText(mainOptions[groupPosition]);
            textView.setTextSize(30);
            textView.setTypeface(null, Typeface.BOLD);
            textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            return textView;
        }

        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
            TextView textView = new TextView(context);
            textView.setText(options[groupPosition][childPosition]);
            textView.setTextSize(20);
            textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            return textView;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return true;
        }
    }
}
