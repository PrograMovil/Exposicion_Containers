package com.containers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void cambiarAtabs(View view){
        Intent intent=new Intent(MainActivity.this,tabHost.class);

        MainActivity.this.startActivity(intent);

    }

    public void cambiarAwebView(View view){
        Intent intent=new Intent(MainActivity.this,WebViewActivity.class);

        MainActivity.this.startActivity(intent);

    }

    public void cambiarAListView(View view){
        Intent intent=new Intent(MainActivity.this,ListViewActivity.class);

        MainActivity.this.startActivity(intent);

    }

    public void cambiarAScrollView(View view){
        Intent intent=new Intent(MainActivity.this,ScrollViewActivity.class);

        MainActivity.this.startActivity(intent);

    }

    public void cambiarARadioGroup(View view){
        Intent intent=new Intent(MainActivity.this,RadioGroupActivity.class);

        MainActivity.this.startActivity(intent);

    }

    public void cambiarAGridView(View view){
        Intent intent=new Intent(MainActivity.this,GridViewActivity.class);

        MainActivity.this.startActivity(intent);

    }

    public void cambiarAExpandableListView(View view){
        Intent intent=new Intent(MainActivity.this,ExpandableListViewActivity.class);

        MainActivity.this.startActivity(intent);

    }

    public void cambiarASearchView(View view){
        Intent intent=new Intent(MainActivity.this,SearchViewActivity.class);

        MainActivity.this.startActivity(intent);

    }
}
