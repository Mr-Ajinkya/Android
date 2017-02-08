package com.example.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    static final String KEY_BACK = "back";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent resonseIntent = getIntent();
        Bundle bundle = resonseIntent.getExtras();
        if(bundle != null){
            String email = bundle.getString(MainActivity.KEY_EMAIL);
                       ((EditText) findViewById(R.id.edtEmail)).setText(email);
        }
        findViewById(R.id.btnOkay).setOnClickListener(this::goback);
    }

    private void goback(View view) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_BACK,goback());
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();
    }



    private String goback() {
       return  ((EditText) findViewById(R.id.edtEmail)).getText().toString().toUpperCase();
    }


}
