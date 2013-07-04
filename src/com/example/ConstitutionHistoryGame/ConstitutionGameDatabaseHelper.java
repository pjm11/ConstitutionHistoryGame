package com.example.ConstitutionHistoryGame;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 7/4/13
 * Time: 7:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConstitutionGameDatabaseHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "ConstitutionGameDatabaseHelper.SQLite";//static variable definitions
    public static final int DB_VERSION = 1;
    public static String PLAYER_TABLE = "PlayerTable";
    public static String PLAYER_ID = "ID";
    public static String FIRST_NAME = "First_Name";
    public static String LAST_NAME = "Last_Name";
    public static String EMAIL = "Email";
    public static String USERNAME = "User_Name";
    public static String PASSWORD = "Password";


    public ConstitutionGameDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase constitutionGameDatabase) {//whats called when database helper is created
        //sql statement below to create table
        String sqlStatement = "CREATE TABLE " + PLAYER_TABLE + "("
                + PLAYER_ID + " INTEGER PRIMARY KEY autoincrement NOT NULL,"
                + FIRST_NAME + " TEXT not null,"
                + LAST_NAME + " TEXT not null,"
                + EMAIL + " TEXT UNIQUE not null,"
                + USERNAME + " TEXT UNIQUE not null,"
                + PASSWORD + " TEXT not null "
                + ");";

        //loging in log cat

        Log.d("creating constitution database", sqlStatement);


/* executing the sql statement */

        constitutionGameDatabase.execSQL(sqlStatement);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }
}