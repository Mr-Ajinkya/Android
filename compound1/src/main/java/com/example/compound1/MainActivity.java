package com.example.compound1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layRt = (RelativeLayout) findViewById(R.id.activity_main);

        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        View compoundView = inflater.inflate(R.layout.compound_view, layRt, true);
        ((TextView)compoundView.findViewById(R.id.txtInf)).setText("This is new info");
    }
}
