package codekulmanagement.codekul.com.listviewimage;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ajinkya Virkud on 4/7/2017.
 */

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] progNames;
    private final Integer[] progImages;

    public MyListAdapter(Activity context, String[] progNames, Integer[] progImages) {
        super(context, R.layout.activity_image_list,progNames);
        this.context = context;
        this.progNames = progNames;
        this.progImages = progImages;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_image_list,null,true);
        TextView txtTilte = (TextView) rowView.findViewById(R.id.textView2);
        ImageView imgView = (ImageView) rowView.findViewById(R.id.imageView2);

        txtTilte.setText(progNames[position]);
        imgView.setImageResource(progImages[position]);

        return rowView;
    }
}
