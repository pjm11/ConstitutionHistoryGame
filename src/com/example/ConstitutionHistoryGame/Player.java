package com.example.ConstitutionHistoryGame;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 7/4/13
 * Time: 8:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class Player {


    //class level vars
    private long player_id;
    private int highScore;
    private String userName;
    private int lowScore;

    //default constructor
    public Player() {
    }

    public Player(long player_id, int highScore, String userName, int lowScore) {
        this.player_id = player_id;
        this.highScore = highScore;
        this.userName = userName;
        this.lowScore = lowScore;
    }

    public long getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLowScore() {
        return lowScore;
    }

    public void setLowScore(int lowScore) {
        this.lowScore = lowScore;
    }
}

