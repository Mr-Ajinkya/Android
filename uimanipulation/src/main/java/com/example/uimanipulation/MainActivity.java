package com.example.uimanipulation;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnOkay).setOnClickListener(this::clicked);

    }

    private void clicked(View view) {

        new Mytask().execute(0,100);

    }

    private void simpleRun() {

        TextView textView = (TextView) findViewById(R.id.txtText);

        for (int i = 0 ; i < 100; i ++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            textView.setText(String.valueOf(i));
        }
    }
    private void newThread(){
        new Thread(() -> {
            TextView textView = (TextView) findViewById(R.id.txtText);

            for (int i = 0 ; i < 100; i ++) {

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                textView.setText(String.valueOf(i));
            }

        }).start();
    }

    private class Mytask extends AsyncTask<Integer, Integer, Boolean>{

        private ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = ProgressDialog.show(MainActivity.this,"Counter","I am counting");
        }

        @Override
        protected Boolean doInBackground(Integer... params) {

            for(int i = params[0] ; i < params[1] ;  i++){

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress(i);
            }

            return true;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
            progressDialog.dismiss();
            if (aBoolean){}
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            ((TextView)findViewById(R.id.txtText)).setText(String.valueOf(values[0]));
        }
    }

}
