package com.example.listviewwitharrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> dataset = new ArrayList<>();
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dataset.add("Android");
        dataset.add("iOS");
        dataset.add("Bada");
        dataset.add("BOSS");
        dataset.add("Palm");
        dataset.add("Rim");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dataset);

        ((ListView) findViewById(R.id.listView)).setAdapter(adapter);
        ((ListView)findViewById(R.id.listView)).setOnItemClickListener(this::onListClick);

        findViewById(R.id.btnAdd).setOnClickListener(this::newOs);
    }

    private void newOs(View view) {

            dataset.add(((EditText)findViewById(R.id.edtText)).getText().toString());
            adapter.notifyDataSetChanged();

    }


    private void onListClick(AdapterView<?> adapterView, View view ,int pos,long id) {
        ((EditText)findViewById(R.id.edtText)).setText(adapter.getItem(pos));
    }


}
