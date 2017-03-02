package com.example.addnumberactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    static final String KEY_NUM = "num1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent respnseIntent =  getIntent();
        findViewById(R.id.btnNext).setOnClickListener(this::goNext1);
    }

    private void goNext1(View view) {
        Intent intent = new Intent(this,Main3Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString(KEY_NUM,getNumber1());
        startActivity(intent);
    }

    private String getNumber1() {
        return ((EditText) findViewById(R.id.edtNumber)).getText().toString();
    }
}
