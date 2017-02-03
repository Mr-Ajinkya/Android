package com.example.moreuidesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnRocket).setOnClickListener(this::showRocket);
        findViewById(R.id.btnTruck).setOnClickListener(this::showTruck);
    }

    private void showTruck(View view) {
        ((ImageView) findViewById(R.id.imageBig)).setImageResource(R.drawable.ic_truck);
    }

    private void showRocket(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageBig);
                imageView.setImageResource(R.drawable.ic_rocket);
    }
}
