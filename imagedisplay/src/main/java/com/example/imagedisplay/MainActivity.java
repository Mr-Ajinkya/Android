package com.example.imagedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int REQ_NEXT = 5555;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnSuperman).setOnClickListener(this::showSuperman);
        findViewById(R.id.btnSpiderman).setOnClickListener(this::showSpiderman);
        findViewById(R.id.btnBatman).setOnClickListener(this::showBatman);
        findViewById(R.id.btnIronman).setOnClickListener(this::showIronman);
        findViewById(R.id.btnNext).setOnClickListener(this::createNew);

    }

    private void createNew(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        // startActivity(intent);
        startActivityForResult(intent, REQ_NEXT);
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 5555) {
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    ((TextView) findViewById(R.id.txtText))
                            .setText(data.getExtras().getString(Main2Activity.KEY_NAME));

                }
            }


        }
    }
}
