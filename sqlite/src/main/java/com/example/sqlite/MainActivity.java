package com.example.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private DbHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new DbHelper(this, "mydb", null, 1);
        findViewById(R.id.btnInsert).setOnClickListener(this::clicked);
        findViewById(R.id.btnUpdate).setOnClickListener(this::clicked);
        findViewById(R.id.btnDelete).setOnClickListener(this::clicked);
        findViewById(R.id.btnDisplay).setOnClickListener(this::clicked);
    }

    private void clicked(View view) {
        if (view.getId() == R.id.btnInsert) insertRaw();
        if (view.getId() == R.id.btnUpdate) Update();
        if (view.getId() == R.id.btnDelete) Delete();
        //if (view.getId() == R.id.btnDisplay) Display();
        if (view.getId() == R.id.btnDisplay) selectRawSql();
    }

    public void Insert() {

        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("myName",getMyName());
        values.put("myAge",getMyAge());
        db.insert("myTable",null,values);
        db.close();

    }

    public void Update() {
        SQLiteDatabase db = helper.getWritableDatabase();
        String table = "myTable";
        ContentValues values = new ContentValues();
        values.put("myName",getMyName());
        String whereClause = "myAge = ?";
        String[] whereArgs = {String.valueOf(getMyAge())};
        db.update(table,values,whereClause,whereArgs);
        db.close();
    }

    public void Delete() {
        SQLiteDatabase db = helper.getReadableDatabase();
        String table = "myTable";
        String whereClause = "myAge = ?";
        String[] whereArgs = {String.valueOf(getMyAge())};
        db.delete(table,whereClause,whereArgs);
        db.close();
    }

    public void Display() {

        SQLiteDatabase db = helper.getReadableDatabase();
        String table = "myTable";
        String[] columns = {"myName"};
        String selection = "myAge = ?";
        String[] selectionArgs = {"" + getMyAge()};
        String groupBy = null;
        String having = null;
        String orderBy = null;
        Cursor cursor = db.query(table,columns,selection,selectionArgs,groupBy,having,orderBy);

        while (cursor.moveToNext()){
            String myName = cursor.getString(cursor.getColumnIndex("myAge"));
            //Integer myAge = cursor.getInt(cursor.getColumnIndex("myAge"));
            Log.i("example","Name" + myName);

        }

        db.close();

    }

    private void selectRawSql(){
        SQLiteDatabase sqDb = helper.getReadableDatabase();
        Cursor cursor = sqDb.rawQuery("select * from myTable",null);
        while (cursor.moveToNext()){

            String myName = cursor.getString(cursor.getColumnIndex("myName"));
            int myAge = cursor.getInt(cursor.getColumnIndex("myAge"));
            Log.i("example","Name - " + myName + " Age  - " + myAge);
        }
        sqDb.close();
    }

    private void insertRaw(){
        SQLiteDatabase sqdb = helper.getWritableDatabase();
        sqdb.execSQL("insert into myTable values ('raw android',12)");
        sqdb.close();
    }

    private String getMyName(){
        return ((EditText)findViewById(R.id.edtMyName)).getText().toString();
    }
    private Integer getMyAge(){
        return Integer.parseInt(((EditText)findViewById(R.id.edtMyAge))
                .getText()
                .toString());
    }

}
