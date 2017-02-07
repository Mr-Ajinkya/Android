package com.example.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.interactivitycommunication.R.id.edtEmail;

public class MainActivity extends AppCompatActivity {

    static final String KEY_EMAIL = "email";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnNext).setOnClickListener(this::goNext);

    }

    private void goNext(View view) {

        Intent  intent = new Intent(this, Main2Activity.class);//Start new activity

        Bundle bundle = new Bundle();
        bundle.putString(KEY_EMAIL,getEmail());
        intent.putExtras(bundle);

        startActivity(intent);
    }

    private String getEmail() {
        return ((EditText)findViewById(R.id.edtEmail)).getText().toString();

    }


}
