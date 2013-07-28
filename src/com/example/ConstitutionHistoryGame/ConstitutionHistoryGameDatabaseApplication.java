package com.example.ConstitutionHistoryGame;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

//importing the constitution history game class as static
import static com.example.ConstitutionHistoryGame.ConstitutionGameDatabaseHelper.*;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 7/4/13
 * Time: 8:17 AM
 * To change this template use File | Settings | File Templates.
 * Class used to run database application
 */
public class ConstitutionHistoryGameDatabaseApplication extends Application {

    //creating list to store players scores
   private int[] allScores;
   private SQLiteDatabase constitutionGameDatabase;

    @Override
    public void onCreate() {
        super.onCreate();

          ConstitutionGameDatabaseHelper dbHelper = new ConstitutionGameDatabaseHelper(this);
           constitutionGameDatabase =  dbHelper.getWritableDatabase();
            constitutionGameDatabase.execSQL("PRAGMA foreign_keys=ON;");

    }



    @Override
    public void onTerminate() {
        super.onTerminate();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void registerComponentCallbacks(ComponentCallbacks callback) {
        super.registerComponentCallbacks(callback);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void unregisterComponentCallbacks(ComponentCallbacks callback) {
        super.unregisterComponentCallbacks(callback);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.registerActivityLifecycleCallbacks(callback);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.unregisterActivityLifecycleCallbacks(callback);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
