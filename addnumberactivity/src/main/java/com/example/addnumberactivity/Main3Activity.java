package com.example.addnumberactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent respnseIntent =  getIntent();
        Bundle bundle = respnseIntent.getExtras();
        if(bundle != null){
            String num1 = bundle.getString(MainActivity.KEY_NUM);
            ((EditText)findViewById(R.id.edtText)).setText(Integer.toString(Integer.parseInt(num1)));
        }




        }



       /* Bundle bundle = respnseIntent.getExtras();
        if(bundle != null){
            String name = bundle.getString(MainActivity.KEY_NUM);
            ((EditText) findViewById(R.id.btnText)).setText(name);

        }*/
    }
