package com.example.addnumberactivity;
/*Perform addition
* 1.Enter first number in first activity
 * 2.Enter second number in second activity
 * 3.Display first number and second number in third activity
 * 4.Show result in first activity*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    static final String KEY_NUM = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnNext).setOnClickListener(this::goNext);
    }

    private void goNext(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString(KEY_NUM,getNumber());
        startActivity(intent);
    }

    private String getNumber() {
        return ((EditText) findViewById(R.id.edtNumber)).getText().toString();
    }
}
