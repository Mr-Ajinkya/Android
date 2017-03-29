package codekulmanagement.codekul.com.internalstorage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

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
        if(view.getId() == R.id.btnSave)saveData();
    else displayData();
    }
    private void saveData(){

        try {
            FileOutputStream fos = openFileOutput("my.txt",MODE_APPEND);
            fos.write("Hello, Ajinkya".getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void displayData(){

        try {
            FileInputStream fis = openFileInput("my.txt");
            StringBuilder builder = new StringBuilder();
            while(true){
                int ch = fis.read();
                if(ch == -1) break;
                else builder.append((char) ch);
            }
            ((TextView)findViewById(R.id.txtData))
                    .setText(builder.toString());
            fis.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
