package com.example.dialogs;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnAlert).setOnClickListener(this::clicked);
        findViewById(R.id.btnDatePicker).setOnClickListener(this::clicked);
        findViewById(R.id.btnTimePicker).setOnClickListener(this::clicked);
        findViewById(R.id.btnProgress).setOnClickListener(this::clicked);
        findViewById(R.id.btnCustom).setOnClickListener(this::clicked);
    }

    private void clicked(View view) {

        if (view.getId() == R.id.btnAlert) showDialog(MyDailog.DIALOG_ALERT);
        if (view.getId() == R.id.btnDatePicker) showDialog(MyDailog.DIALOG_DATE_PICKER);
        if (view.getId() == R.id.btnTimePicker) showDialog(MyDailog.DIALOG_TIME_PICKER);
        if (view.getId() == R.id.btnProgress) showDialog(MyDailog.DIALOG_PROGRESS);
        if (view.getId() == R.id.btnCustom) showDialog(MyDailog.DIALOG_CUSTOM);
    }

    private void showAlert() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher)
                .setMessage(R.string.message)
                .setTitle(R.string.title);
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    private void showDialog(String tag) {

       MyDailog dialog = new MyDailog();
        dialog.show(getSupportFragmentManager(),tag);

    }
}
