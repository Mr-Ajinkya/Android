package com.example.selectos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.btnBack).setOnClickListener(this::onBack);

        Intent intentResponse = getIntent();
        Bundle bundle = intentResponse.getExtras();
        if(bundle != null){
            String one = bundle.getString("one");
            String two = bundle.getString("two");

            ((RadioButton)findViewById(R.id.radOne)).setText(one);
            ((RadioButton)findViewById(R.id.radTwo)).setText(two);



        }


    }

    private void onBack(View view) {

        int checked = ((RadioGroup)findViewById(R.id.radGrp)).getCheckedRadioButtonId();
        Intent intentBack = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("res" , ((RadioButton)findViewById(checked)).getText().toString());
        intentBack.putExtras(bundle);
        setResult(RESULT_OK,intentBack);

        finish();
    }
}
