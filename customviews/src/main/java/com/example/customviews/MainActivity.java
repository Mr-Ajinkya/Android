package com.example.customviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //OurView ourView = new OurView(this);
        //setContentView(ourView);
        setContentView(R.layout.activity_main);
    }
}
