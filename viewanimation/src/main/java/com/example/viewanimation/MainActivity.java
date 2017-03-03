package com.example.viewanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnRotate).setOnClickListener(this::onRotate);
        findViewById(R.id.btnZoom).setOnClickListener(this::onZoom);
    }

    private void onZoom(View view) {

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        findViewById(R.id.imgCen).startAnimation(animation);
    }

    private void onRotate(View view) {

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        findViewById(R.id.imgCen).startAnimation(animation);
    }
}
