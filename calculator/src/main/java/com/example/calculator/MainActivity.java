package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnAdd).setOnClickListener(this::onAdd);
        findViewById(R.id.btnSub).setOnClickListener(this::onSub);
        findViewById(R.id.btnMul).setOnClickListener(this::onMul);
        findViewById(R.id.btnDiv).setOnClickListener(this::onDiv);
        findViewById(R.id.btnClear).setOnClickListener(this::onCls);
    }

    private void onCls(View view) {
       // ((TextView)findViewById(R.id.textRes)).setText(Integer.toString(result)).clear();
        ((EditText)findViewById(R.id.edtNum1)).getText().clear();
        ((EditText)findViewById(R.id.edtNum2)).getText().clear();

    }

    private void onDiv(View view) {
        EditText e1 = ((EditText) findViewById(R.id.edtNum1));
        EditText e2 = ((EditText) findViewById(R.id.edtNum2));
        TextView res = ((TextView)findViewById(R.id.textRes));
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int result = num1 / num2;
        res.setText(Integer.toString(result));
    }

    private void onMul(View view) {
        EditText e1 = ((EditText) findViewById(R.id.edtNum1));
        EditText e2 = ((EditText) findViewById(R.id.edtNum2));
        TextView res = ((TextView)findViewById(R.id.textRes));
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int result = num1 * num2;
        res.setText(Integer.toString(result));
    }

    private void onSub(View view) {
        EditText e1 = ((EditText) findViewById(R.id.edtNum1));
        EditText e2 = ((EditText) findViewById(R.id.edtNum2));
        TextView res = ((TextView)findViewById(R.id.textRes));
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int result = num1 - num2;
        res.setText(Integer.toString(result));
    }

    private void onAdd(View view) {
        EditText e1 = ((EditText) findViewById(R.id.edtNum1));
        EditText e2 = ((EditText) findViewById(R.id.edtNum2));
        TextView res = ((TextView)findViewById(R.id.textRes));
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int result = num1 + num2;
        res.setText(Integer.toString(result));

    }
}
