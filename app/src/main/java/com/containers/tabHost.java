package com.containers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

public class tabHost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host);
        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Pestaña 1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Pestaña 1");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Pestaña 2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Pestaña 2");
        host.addTab(spec);

        textoEnTabs();

        //Tab 3
        spec = host.newTabSpec("Pestaña 3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Pestaña 3");
        host.addTab(spec);
    }


    public void textoEnTabs(){

        String S="Lorem ipsum dolor sit amet, consectetur adipiscing elit. \n" +
                "Donec vel magna sed lectus lobortis tincidunt id eget urna. \n" +
                "Praesent lectus massa, lacinia nec placerat sed, euismod ut ipsum. \n" +
                "Quisque tincidunt ultricies lobortis. Sed placerat vitae enim vel gravida. \n" +
                "Phasellus egestas, libero sed varius aliquam, enim massa dapibus augue, \n" +
                "sed ullamcorper neque tellus sed justo. Vestibulum eu tempor leo. \n" +
                "Nullam venenatis neque eu nisl fringilla, a varius lorem congue.";

        TextView text = (TextView) findViewById(R.id.textView3);

        text.setText(S);

    }

}
