package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnAnimate).setOnClickListener(this::animate);
    }

    private void animate(View view) {
        findViewById(R.id.imgVeh)
                               .startAnimation(AnimationUtils.loadAnimation(this, R.anim.sample));
    }
}
