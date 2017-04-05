package codekulmanagement.codekul.com.services;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this,MyService.class);

    }


    public void play(View view) {
        startService(intent);
    }

    public void stop(View view) {
        stopService(intent);
    }
}
