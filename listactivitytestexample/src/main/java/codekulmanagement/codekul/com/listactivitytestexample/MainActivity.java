package codekulmanagement.codekul.com.listactivitytestexample;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {


    String[] nation = {"India","Shri Lanka","America","Nepal","Bhutan","BanglaDesh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = getListView();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nation);
        listView.setAdapter(adapter);


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        TextView textView = (TextView) v;
        Toast.makeText(this,textView.getText()+" "+position,Toast.LENGTH_SHORT).show();
    }
}
