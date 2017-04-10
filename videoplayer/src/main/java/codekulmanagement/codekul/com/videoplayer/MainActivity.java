package codekulmanagement.codekul.com.videoplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setVideoPath("rtsp://r1---sn-a5mlrn7d.googlevideo.com/Cj0LENy73wIaNAn5u1OhQNl0sBMYDSANFC3nbutYMOCoAUIASARgp4G2psLo7rxYigELOEZ5V1RvTXFfRkkM/E05FD548DBA99EA45AF3B707502AE4B0056C2EBF.75A966ADB0C391019DCD8610E5DEBC6780FAC1C6/yt6/1/video.3gp");


        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
