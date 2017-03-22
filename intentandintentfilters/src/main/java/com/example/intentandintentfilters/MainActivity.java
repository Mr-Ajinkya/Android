package com.example.intentandintentfilters;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnOkay).setOnClickListener(this::click);
    }

    private void click(View view) {
        /*Intent intent = new Intent();
        intent.setAction("com.example.action.NEWS");
        startActivity(intent);*/
        //OpenAllApps();
        openCommonWithData();
    }
    private void openComman(){
        Intent intent = new Intent();
        intent.setAction("com.example.action.COMMAN");
        startActivity(intent);
    }
    private void OpenAllApps(){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(intent);
    }
    private void dial(){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        startActivity(intent);
    }
    private void call(){
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel://9689545755"));
        startActivity(intent);
    }
    private void openCommonWithData(){
        Intent intent = new Intent();
        intent.setAction("com.example.action.COMMAN");
        intent.setData(Uri.parse("http://codekul.com"));
        startActivity(intent);
    }
}
