package com.example.basiccode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layoutRoot = new LinearLayout(this);
                layoutRoot.setOrientation(LinearLayout.VERTICAL);
                LinearLayout.LayoutParams paramsRoot =
                                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
               layoutRoot.setLayoutParams(paramsRoot);
        setContentView(layoutRoot);

        EditText edtUserName = new EditText(this);
                edtUserName.setHint("User Name");
                LinearLayout.LayoutParams paramsUserName =
                                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
                edtUserName.setLayoutParams(paramsUserName);
                layoutRoot.addView(edtUserName);

        Button btnOkay = new Button(this);
                LinearLayout.LayoutParams paramsOkay =
                                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
                btnOkay.setLayoutParams(paramsOkay);
                btnOkay.setText("Okay");
                layoutRoot.addView(btnOkay);


    }
}
