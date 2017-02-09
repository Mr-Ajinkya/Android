package com.example.imagedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    static final String KEY_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent responseIntent = getIntent();
        findViewById(R.id.btnBack).setOnClickListener(this::goback);
    }

    private void goback(View view) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_NAME,getText());
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();

    }

    private String getText() {
         return ((TextView) findViewById(R.id.edtText)).getText().toString();
    }
}
