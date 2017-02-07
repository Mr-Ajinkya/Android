package com.example.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            Intent resonseIntent = getIntent();
        Bundle bundle = resonseIntent.getExtras();
        if(bundle != null){
            String email = bundle.getString(MainActivity.KEY_EMAIL);
                       ((EditText) findViewById(R.id.edtEmail)).setText(email);
        }

    }
}
