package codekulmanagement.codekul.com.services;

import android.app.IntentService;
import android.content.Intent;

public class MyIntentService extends IntentService {


    public MyIntentService() {

        super("MyIntentService");
    }



    @Override
    protected void onHandleIntent(Intent intent) {
        for (int i = 0; i < 10000; i++){

        }
    }



}
