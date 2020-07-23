package com.example.ex22;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {
    public Database(@Nullable Context context) {
        super(context, "project.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sql) {
        sql.execSQL("create table address(_id integer primary key autoincrement,name text,tel text,address text)");
        sql.execSQL("insert into address(name,tel,address) values('홍길동','010-0000-0000','인천시 서구');");
        sql.execSQL("insert into address(name,tel,address) values('심청이','010-1234-5678','경기도 시흥시')");
        sql.execSQL("insert into address(name,tel,address) values('이몽룡','010-4356-4852','서울 압구정동')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
