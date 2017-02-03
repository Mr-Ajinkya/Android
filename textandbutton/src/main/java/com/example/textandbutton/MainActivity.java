package com.example.textandbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        TextView txt;
        Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.myText);
        btn = (Button) findViewById(R.id.mybutton);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                txt.setText("WelCome to Android");
            }
        });
    }
}
