 package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

 public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.i("@example","Airplan mode is changed" + intent.getBooleanExtra("state",false));
            if (intent.getBooleanExtra("state",false)){
                changeAirPlane(R.drawable.ic_airplanemode_active_black_24dp);
            }
            else {
                changeAirPlane(R.drawable.ic_airplanemode_inactive_black_24dp);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(receiver, filter);
    }
     private void changeAirPlane(int image){
         ((ImageView)findViewById(R.id.imageAirPlane))
                 .setImageResource(image);
     }
}
