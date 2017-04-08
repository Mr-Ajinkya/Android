package codekulmanagement.codekul.com.testlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> dataSet;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataSet = new ArrayList<>();

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,dataSet);

        ListView listNation = (ListView) findViewById(R.id.listNation);
        listNation.setAdapter(adapter);
        findViewById(R.id.btnAdd).setOnClickListener(this::click);
        listNation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Item Clicked  ",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void click(View view) {
        String typeNat = ((EditText) findViewById(R.id.edtText)).getText().toString();
        if(typeNat.length() > 0)
            dataSet.add(typeNat);
    }
}
