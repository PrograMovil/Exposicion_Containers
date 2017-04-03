package com.containers;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;

public class SearchViewActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Lunes");
        arrayList.add("Martes");
        arrayList.add("Miércoles");
        arrayList.add("Jueves");
        arrayList.add("Viernes");


        ListView list = (ListView) findViewById(R.id.list_view);
        final ListViewAdapter listAdapter = new ListViewAdapter(this, arrayList);
        list.setAdapter(listAdapter);

        SearchView searchView=(SearchView) findViewById(R.id.search);
        searchView.setQueryHint("Buscar los días..");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                String text = newText;
                listAdapter.filter(text);
                return false;
            }
        });



    }

    class ListViewAdapter extends BaseAdapter {
        Context context;
        LayoutInflater inflater;
        private ArrayList<String> diaslist;
        private ArrayList<String> arraylist;

        public ListViewAdapter(Context context, ArrayList<String> diasList) {
            this.context = context;
            this.diaslist = diasList;
            inflater = LayoutInflater.from(context);
            this.arraylist = new ArrayList<String>();
            this.arraylist.addAll(this.diaslist);
        }

        class ViewHolder {
            TextView name;
        }

        @Override
        public int getCount() {
            return this.diaslist.size();
        }

        @Override
        public Object getItem(int position) {
            return this.diaslist.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            final ViewHolder holder;
            if (convertView == null) {
                holder = new ViewHolder();
                convertView = inflater.inflate(R.layout.list_items, null);
                // Locate the TextViews in list_items.xml
                holder.name = (TextView) convertView.findViewById(R.id.dia);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            // Set the results into TextViews
            holder.name.setText(diaslist.get(position).toString());
            return convertView;
        }

        public void filter(String charText) {
            charText = charText.toLowerCase(Locale.getDefault());
            this.diaslist.clear();
            if (charText.length() == 0) {
                this.diaslist.addAll(this.arraylist);
            } else {
                for (String str : this.arraylist) {
                    if (str.toLowerCase(Locale.getDefault()).contains(charText)) {
                        this.diaslist.add(str);
                    }
                }
            }
            notifyDataSetChanged();
        }
    }
}
