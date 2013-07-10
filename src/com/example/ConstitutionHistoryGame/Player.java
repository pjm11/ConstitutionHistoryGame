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
    private int player_id;
    private String fName;
    private String lName;
    private int highScore;
    private String email;
    private String userName;
    private String password;
    private int lowScore;

    //default constructor
    public Player() {
    }

     /**
     * Overloaded constructor
     * @param player_id
     * @param fName
     * @param lName
     * @param highScore
     * @param email
     * @param userName
     * @param password
     * @param lowScore
     */
    public Player(int player_id, String fName, String lName, int highScore, String email, String userName, String password, int lowScore) {
        this.player_id = player_id;
        this.fName = fName;
        this.lName = lName;
        this.highScore = highScore;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.lowScore = lowScore;
    }

    /**
     * method used to return player id
     * @return player_id
     */
    public int getPlayer_id() {
        return player_id;
    }

    /**
     *
     * @param player_id
     */
    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    /**
     *
     * @return fname
     */
    public String getfName() {
        return fName;
    }

    /**
     *
     * @param fName
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     *
     * @return
     */
    public String getlName() {
        return lName;
    }

    /**
     *
     * @param lName
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     *
     * @return
     */
    public int getHighScore() {
        return highScore;
    }

    /**
     *
     * @param highScore
     */
    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public int getLowScore() {
        return lowScore;
    }

    /**
     *
     * @param lowScore
     */
    public void setLowScore(int lowScore) {
        this.lowScore = lowScore;
    }
}
