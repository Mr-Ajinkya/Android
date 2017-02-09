package com.example.imagedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnSuperman).setOnClickListener(this::showSuperman);
        findViewById(R.id.btnSpiderman).setOnClickListener(this::showSpiderman);
        findViewById(R.id.btnBatman).setOnClickListener(this::showBatman);
        findViewById(R.id.btnIronman).setOnClickListener(this::showIronman);

    }

    private void showIronman(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageRef);
        imageView.setImageResource(R.drawable.iron_man);
    }

    private void showBatman(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageRef);
        imageView.setImageResource(R.drawable.batman);
    }

    private void showSpiderman(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageRef);
        imageView.setImageResource(R.drawable.spider_man);
    }

    private void showSuperman(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageRef);
        imageView.setImageResource(R.drawable.superman);
    }


}
