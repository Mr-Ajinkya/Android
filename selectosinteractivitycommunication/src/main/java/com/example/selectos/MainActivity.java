package com.example.selectos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnAndroid).setOnClickListener(this::onAndroid);
        findViewById(R.id.btnApple).setOnClickListener(this::onApple);
    }

    private void onApple(View view) {

        Intent intent = new Intent(this,Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("one","iOS 5");
        bundle.putString("two","iOS 6");
        intent.putExtras(bundle);
        startActivity(intent);


    }

    private void onAndroid(View view) {

        Intent intent = new Intent(this,Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("one","Nougat");
        bundle.putString("two","Marshmallow");
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
