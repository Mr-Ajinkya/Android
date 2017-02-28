package com.example.compoundview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnAdd).setOnClickListener(this::onClick);
    }

    private void onClick(View view) {

        LinearLayout relative = (LinearLayout) findViewById(R.id.horizontal);
        relative.addView(makeCompoundView());


    }

    private View makeCompoundView(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        return inflater.inflate(R.layout.compound_view, null, false);



    }


}
