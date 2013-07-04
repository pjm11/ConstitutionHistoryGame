package com.example.ConstitutionHistoryGame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 7/4/13
 * Time: 7:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class SplashScreen extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);//setting layout

        Thread timer = new Thread() {//creating timer for splash
            public void run() {//beggining splash
                try {
                    sleep(10000);//lasts 10 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent i = new Intent(SplashScreen.this,
                            HomeScreenActivity.class);//going to home screen
                    startActivity(i);
                }
            }
        };
        timer.start();//strting timer
        Toast.makeText(getApplicationContext(),//toasting
                "Bobby's finger will get ya",
                Toast.LENGTH_LONG).show();
    }//end on create
    }
