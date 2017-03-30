package codekulmanagement.codekul.com.contentprovider;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fetchContact();
    }

    private void fetchContact(){

        ArrayList<String> contacts = new ArrayList<>();

        //Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;

        Uri uri = Uri.parse("content://com.example.own.Provider");

       // String[] projection = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,ContactsContract.CommonDataKinds.Phone.NUMBER};
        String[] projection = null;
        String selection = null;
        String[] selectionArgs = null;
        String sortOrder = null;
        ContentResolver resolver = getContentResolver();
        Cursor cursor = resolver.query(uri,projection,selection,selectionArgs,sortOrder);
        while (cursor.moveToNext()){
            //String name = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            String name = cursor.getString(cursor.getColumnIndex("myName"));
            //String num = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            Integer num = cursor.getInt(cursor.getColumnIndex("myAge"));
            Log.i("@example","Name - " + name + " Age - " + num);
            contacts.add(name + "\n" +  num);
        }
        ((ListView)findViewById(R.id.listContacts))
                .setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,contacts));
    }
}
