package com.example.ConstitutionHistoryGame;


import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 7/28/13
 * Time: 7:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class GamePlayed {

 private long game_id;
private long player_id;
private Date datePlayed;
private int amountOfCorrectAnswers;
 private int amountOfIncorrectAnswers;
 private int gameScore;

    public GamePlayed() {
    }

    public GamePlayed(long game_id, long player_id, Date datePlayed, int amountOfCorrectAnswers, int amountOfIncorrectAnswers, int gameScore) {
        this.game_id = game_id;
        this.player_id = player_id;
        this.datePlayed = datePlayed;
        this.amountOfCorrectAnswers = amountOfCorrectAnswers;
        this.amountOfIncorrectAnswers = amountOfIncorrectAnswers;
        this.gameScore = gameScore;
    }

    public long getGame_id() {
        return game_id;
    }

    public void setGame_id(long game_id) {
        this.game_id = game_id;
    }

    public long getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(long player_id) {
        this.player_id = player_id;
    }

    public Date getDatePlayed() {
        return datePlayed;
    }

    public void setDatePlayed(Date datePlayed) {
        this.datePlayed = datePlayed;
    }

    public int getAmountOfCorrectAnswers() {
        return amountOfCorrectAnswers;
    }

    public void setAmountOfCorrectAnswers(int amountOfCorrectAnswers) {
        this.amountOfCorrectAnswers = amountOfCorrectAnswers;
    }

    public int getAmountOfIncorrectAnswers() {
        return amountOfIncorrectAnswers;
    }

    public void setAmountOfIncorrectAnswers(int amountOfIncorrectAnswers) {
        this.amountOfIncorrectAnswers = amountOfIncorrectAnswers;
    }

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }
}
