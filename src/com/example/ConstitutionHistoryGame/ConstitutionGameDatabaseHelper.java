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

    //static strings for player table

    public static final String DB_NAME = "ConstitutionGameDatabaseHelper.SQLite";//static variable definitions
    public static final int DB_VERSION = 1;
    public static String PLAYER_TABLE = "PlayerTable";
    public static String PLAYER_ID = "Player_ID";
    public static String FIRST_NAME = "First_Name";
    public static String LAST_NAME = "Last_Name";
    public static String EMAIL = "Email";
    public static String USERNAME = "User_Name";
    public static String PASSWORD = "Password";
    public static String HIGH_SCORE = "High_Score";
    public static String LOW_SCORE = "Low_Score";

    //static strings for game played table
    public static String GAME_PLAYED_TABLE = "GamePlayedTable";
    public static String GAME_DATE = "Game_Date";
    public static String AMOUNT_OF_CORRECT_ANSWERS = "Correct_Answers";
    public static String AMOUNT_OF_INCORRECT_ANSWERS = "Incorrect_Answers";
    public static String GAME_ID = "Game_ID";
    public static String GAME_SCORE = "Game_Score";

    /**
     *
     * @param context
     */
    public ConstitutionGameDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

     @Override
      public void onCreate(SQLiteDatabase constitutionGameDatabase) {//whats called when database helper is created
        //sql statement below to  player table
        String sqlStatement = "CREATE TABLE " + PLAYER_TABLE + "( "
                + PLAYER_ID + " INTEGER PRIMARY KEY autoincrement NOT NULL, "
                + FIRST_NAME + " TEXT not null, "
                + LAST_NAME + " TEXT not null, "
                + EMAIL + " TEXT UNIQUE not null, "
                + USERNAME + " TEXT UNIQUE not null, "
                + PASSWORD + " TEXT not null, "
                + HIGH_SCORE + " INTEGER NULL, "
                + LOW_SCORE + " INTEGER NULL "
                + ");";
        //sql statement below to create game table
        String sqlStatement2 = "CREATE TABLE " + GAME_PLAYED_TABLE + "( "
                + GAME_ID + " INTEGER PRIMARY KEY autoincrement NOT NULL,"
                + PLAYER_ID + " INTEGER NOT NULL,"
                + GAME_DATE + " DATE NOT NULL, "
                + AMOUNT_OF_CORRECT_ANSWERS + " INTEGER NOT NULL,"
                + AMOUNT_OF_INCORRECT_ANSWERS + " INTEGER NOT NULL,"
                + GAME_SCORE + " INTEGER NOT NULL,"
                + " FOREIGN KEY (" + PLAYER_ID + ") REFERENCES " + PLAYER_TABLE + " ( " + PLAYER_ID + " ) "
                + ");";

        //loging in log cat

        Log.d("creating constitution database", sqlStatement);


/* executing the sql statement */

        constitutionGameDatabase.execSQL(sqlStatement);
        constitutionGameDatabase.execSQL(sqlStatement2);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }
}