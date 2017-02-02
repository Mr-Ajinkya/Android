package com.example.uidesign;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOkay = (Button) findViewById(R.id.btnOkay);
        btnOkay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                doUpperCase();// Perform action on click
            }
            //on Click method UpperCase
            private void doUpperCase() {
                EditText edtUserName = (EditText) findViewById(R.id.edtUserName);

                String typedText = edtUserName.getText().toString();
                edtUserName.setText(typedText.toUpperCase());
            }


        });

    }


}