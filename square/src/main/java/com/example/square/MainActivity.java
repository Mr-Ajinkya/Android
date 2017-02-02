package com.example.square;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtUser = new LinearLayout(this);
         edtUser.setHint("User Name");
        LinearLayout.LayoutParams paramsRoot =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        edtUser.setLayoutParams(paramsRoot);
        setContentView(edtUser);

        RadioButton radUser = new LinearLayout(this);

        LinearLayout.LayoutParams paramRad = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        radUser.setLayoutParams(paramRad);
        setContentView(radUser);


    }
}
