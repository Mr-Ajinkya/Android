package com.example.passdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class First_acivity extends AppCompatActivity {

    static final String KEY_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_acivity);

        findViewById(R.id.btnNext).setOnClickListener(this::goNext);

    }

    private void goNext(View view) {
        Intent intent = new Intent(this,Main2Activity.class);

        Bundle bundle = new Bundle();
        bundle.putString(KEY_NAME,getText());
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private String getText() {
        return ((EditText) findViewById(R.id.edtText)).getText().toString();

    }
}
