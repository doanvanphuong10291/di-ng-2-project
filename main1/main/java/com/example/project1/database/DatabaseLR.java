package com.example.project1.database;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseLR extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="databaselogin";
    public static final String TABLE_NAME="register";
    public static final String ID="ID";
    public static final String USER="User";
    public static final String PASSWORD="Password";
    public static int DB_VERSION = 1;

    public DatabaseLR(Context context) {
        super(context, DATABASE_NAME, null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " +TABLE_NAME+ "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                USER + " TEXT, " +
                PASSWORD + " TEXT)";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        onCreate(db);
    }
}

