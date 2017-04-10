package codekulmanagement.codekul.com.sqlitesample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ajinkya Virkud on 4/9/2017.
 */

public class MyDBHandler extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "products.db";
    public static final String TABLE_PRODUCT = "products";
    public static final String COLOUM_ID = "_id";
    public static final String COLOUM_PRODUCT_NAME = "productName";


    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        String query = "CREATE TABLE " + TABLE_PRODUCT + "(" +
//                COLOUM_ID + " INTEGER PRIMARY KEY AUTOINCREMENT " +
//                COLOUM_PRODUCT_NAME + " TEXT " +
//                ")";
        String query = "create table products(_id number, productName text)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP_TABLE_IF_EXISTS " + TABLE_PRODUCT);
        onCreate(db);
    }

    public void addProduct(Products products){
        ContentValues values = new ContentValues();
        values.put(COLOUM_PRODUCT_NAME, products.getProductName());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_PRODUCT, null, values);
        db.close();
    }

    public void deleteProduct(String ProductName){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_PRODUCT + " WHERE " + COLOUM_PRODUCT_NAME + "=" + ProductName + ";");
    }

    public String databaseToString(){
        String dbString = " ";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_PRODUCT + " WHERE 1";
        Cursor c = db.rawQuery(query,null);
        c.moveToNext();


        while (!c.isAfterLast()){
            if (c.getString(c.getColumnIndex("productName"))!= null){
                dbString += c.getString(c.getColumnIndex("productName"));
                dbString += "\n";
            }

        }
        db.close();
        return dbString;
    }

}
