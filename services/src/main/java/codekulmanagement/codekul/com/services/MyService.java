package codekulmanagement.codekul.com.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {

    private MediaPlayer player;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        throw new UnsupportedOperationException("Not yet implemented");
    }

    public int onStartCommand(Intent intent, int flags, int startId){
        new Thread(new Runnable() {
            @Override
            public void run() {
                player = MediaPlayer.create(MyService.this, R.raw.you);
                player.start();
            }
        }).start();
        return START_NOT_STICKY;
    }
    public void onDestroy(){
        player.stop();
        player.release();
        super.onDestroy();
    }

}
