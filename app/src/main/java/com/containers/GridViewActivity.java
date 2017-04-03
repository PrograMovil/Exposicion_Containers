package com.containers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Integer[] imagenes = {
            R.drawable.droid, R.drawable.droid,
            R.drawable.droid, R.drawable.droid,
            R.drawable.droid, R.drawable.droid,
            R.drawable.droid, R.drawable.droid,
            R.drawable.droid, R.drawable.droid,
            R.drawable.droid, R.drawable.droid,
            R.drawable.droid, R.drawable.droid,
            R.drawable.droid, R.drawable.droid,
            R.drawable.droid, R.drawable.droid,
            R.drawable.droid, R.drawable.droid,
            R.drawable.droid, R.drawable.droid,
            R.drawable.droid, R.drawable.droid
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView grid = (GridView) findViewById(R.id.gridView);
        ImageAdapter imageAdapter = new ImageAdapter();
        grid.setAdapter(imageAdapter);
        grid.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,imagenes[position],Toast.LENGTH_SHORT).show();
    }


    public class ImageAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return imagenes.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(GridViewActivity.this);
            imageView.setLayoutParams(new GridView.LayoutParams(100,100));
            imageView.setImageResource(imagenes[position]);
            return imageView;
        }

    }

}
