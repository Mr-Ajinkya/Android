package codekulmanagement.codekul.com.listviewwithimage;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] memeTitle;
    String[] memeDescription;
    int[] images = {R.drawable.arrow_down,R.drawable.arrow_up,R.drawable.calculating,R.drawable.compass,R.drawable.group,R.drawable.meme9,
            R.drawable.warning,R.drawable.search,R.drawable.meme10,R.drawable.meme9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Resources res = getResources();
        memeTitle = res.getStringArray(R.array.titles);
        memeDescription = res.getStringArray(R.array.description);



        list = (ListView) findViewById(R.id.listView);

        myAdapter adapter = new myAdapter(this,memeTitle,images,memeDescription);
        list.setAdapter(adapter);

    }

    class myAdapter extends ArrayAdapter{

        Context context;
        int[] images;
        String[] title;
        String[] Description;

        public myAdapter(Context context, String[] titles,int[] imgs,String[] Des) {
            super(context, R.layout.simple_row, titles);
            this.context = context;
            this.images = imgs;
            this.title = titles;
            this.Description = Des;
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View row = convertView;
            if (row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.simple_row,parent,false);
            }
            ImageView imageView = (ImageView) row.findViewById(R.id.imageView);
            TextView memeText = (TextView) row.findViewById(R.id.textView);
            TextView memeDescription = (TextView) row.findViewById(R.id.textView2);

            imageView.setImageResource(images[position]);
            memeText.setText(title[position]);
            memeDescription.setText(Description[position]);


            return row;
        }
    }
}
