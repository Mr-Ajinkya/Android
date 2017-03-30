package codekulmanagement.codekul.com.externalstorage;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btnSave).setOnClickListener(this::click);
        findViewById(R.id.btnDisplay).setOnClickListener(this::click);


    }

    private void click(View view) {
        if (view.getId() == R.id.btnSave) savePublicData();
        else readPublicData();
    }

    private void savePublicData() {
        if (isMediaGood()) {
            File file = new File(Environment
                    .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                    "my.txt");
            try {
                FileOutputStream fos = new FileOutputStream(file);
                fos.write("Hello Ajinkya".getBytes());
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else mt(getResources().getString(R.string.bad_media));
    }

    private void readPublicData() {
        if (isMediaGood()) {
            File file = new File(Environment
                    .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                    "my.txt");
            try {
                FileInputStream fis = new FileInputStream(file);
                StringBuilder builder = new StringBuilder();
                while (true) {
                    int ch = fis.read();
                    if (ch == -1) break;
                    else builder.append((char) ch);
                }
                fis.close();
                ((TextView) findViewById(R.id.txtData))
                        .setText(builder.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else mt(getResources().getString(R.string.bad_media));
    }

    private Boolean isMediaGood() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }

    private void mt(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
