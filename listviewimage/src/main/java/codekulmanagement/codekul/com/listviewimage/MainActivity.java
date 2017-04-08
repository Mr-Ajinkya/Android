package codekulmanagement.codekul.com.listviewimage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;
    ArrayList progList;

    public static Integer[] progImages = {
                R.drawable.warning,R.drawable.warning,R.drawable.warning,
                R.drawable.warning,R.drawable.warning,R.drawable.warning,
                R.drawable.warning,R.drawable.warning,R.drawable.warning,
    };

    public static String[] progNames = {
            "Object","Class","Polymorphism","Inheritance","JDBC","Abstract","Constructor","Android","Swing"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter = new MyListAdapter(this,progNames,progImages);
        lv = (ListView) findViewById(R.id.listView2);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Clicked on " + progNames[position],Toast.LENGTH_SHORT).show();
            }
        });


    }


}
