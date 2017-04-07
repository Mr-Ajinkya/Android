package codekulmanagement.codekul.com.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String Names[] = {"Ajinkya", "Rahul", "Priya", "Sandeep", "Aniruddha", "Viren", "Prasad"};

        ArrayAdapter<String> nameAdpter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Names);
        final ListView nameListView = (ListView) findViewById(R.id.namesListView);
        nameListView.setAdapter(nameAdpter);

        nameListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this,name,Toast.LENGTH_LONG).show();
            }
        });


    }
}
