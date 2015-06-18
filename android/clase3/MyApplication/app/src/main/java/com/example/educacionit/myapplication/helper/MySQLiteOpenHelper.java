package com.example.educacionit.myapplication.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by educacionit on 18/06/2015.
 */
public class MySQLiteOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "myDb";
    private static final int DATABASE_VERSION = 1;

    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.beginTransaction();
        db.execSQL("create table 'products' (id int, product TEXT, price FLOAT, quantity int)");
        db.execSQL("insert into products (id,product, price,quantity) values(1, 'mayonesa', 2.3, 2)");



        db.close();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        switch (oldVersion){
            case 1:
                // DO stuff
                db.execSQL("ALTER TABLE 'products' add column weigh int");
                // migrateFromOneToTwo(db);
            case 2:
                // migrateFromTwoToThree(db);
            case 3:
            case 4:

        }

    }
}
