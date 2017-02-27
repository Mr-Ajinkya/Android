package com.example.selectos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intentResponse = getIntent();
        Bundle bundle = intentResponse.getExtras();
        if(bundle != null){
            String one = bundle.getString("one");
            String two = bundle.getString("two");

            ((RadioButton)findViewById(R.id.radOne)).setText(one);
            ((RadioButton)findViewById(R.id.radTwo)).setText(two);



        }


    }
}
