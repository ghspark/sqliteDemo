package com.gh.app.sqlitedemo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by gaohang on 15/10/16.
 */
public class NewsOpenHelper extends SQLiteOpenHelper{
    private static final String DB_NAME="news.db";
    private static final int DB_VERSION=1;

    public NewsOpenHelper(Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.beginTransaction();
        db.execSQL("create table medicine(_id integer primary key autoincrement,name text,factory text," +
                "function text,coverUrl text,use text,attention text)");
        db.setTransactionSuccessful();
        db.endTransaction();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.setVersion(newVersion);

    }
}
