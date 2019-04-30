package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> modules;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);



        if(year.equalsIgnoreCase("year 1")){
            Module module1 = new Module("C111",false);
            Module module2 = new Module("C105", true);
            Module module3 = new Module("A113",false);
            modules.add(module1);
            modules.add(module2);
            modules.add(module3);
        }else if(year.equalsIgnoreCase("year 2")){
            Module module1 = new Module("C203",true);
            Module module2 = new Module("C346", true);
            Module module3 = new Module("C202",true);
            modules.add(module1);
            modules.add(module2);
            modules.add(module3);
        }else{
            Module module1 = new Module("C347",true);
            Module module2 = new Module("C349", true);
            Module module3 = new Module("C302",true);
            modules.add(module1);
            modules.add(module2);
            modules.add(module3);
        }

        aa = new ModuleAdapter(this, R.layout.row, modules);
        lv.setAdapter(aa);




    }



}
