package com.example.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> dataSet = new ArrayList<>();
        dataSet.add("India");
        dataSet.add("Russia");
        dataSet.add("Nepal");
        dataSet.add("London");
        dataSet.add("China");
        dataSet.add("Bhutan");
        dataSet.add("America");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,dataSet);

        ListView listNation = (ListView) findViewById(R.id.listNation);
        listNation.setAdapter(adapter);
    }
}
