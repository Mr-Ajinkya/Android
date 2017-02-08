package com.example.passdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent responseIntent = getIntent();
        Bundle bundle = responseIntent.getExtras();
        if(bundle != null){
            String name = bundle.getString(First_acivity.KEY_NAME);
            ((EditText) findViewById(R.id.edtText)).setText(name);

        }
    }
}
