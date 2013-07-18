package com.example.ConstitutionHistoryGame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 7/4/13
 * Time: 7:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class HomeScreenActivity extends Activity {

    private Button playGameButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreenlayout);

        setUpViews();
    }
    private void setUpViews() {

        //binding button to playgame button
        playGameButton = (Button)findViewById(R.id.btnPlayGame);
        playGameButton.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(final View v) {

               switch(v.getId()){

                   case R.id.btnPlayGame:
                       Intent i=new Intent(
                                HomeScreenActivity.this,
                               GameActivity.class);
                       startActivity(i);
                       break;
                   default:

               }
        }
    };
}