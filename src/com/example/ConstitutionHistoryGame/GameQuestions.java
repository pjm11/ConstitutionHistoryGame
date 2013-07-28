package com.example.ConstitutionHistoryGame;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 7/28/13
 * Time: 7:38 AM
 * To change this template use File | Settings | File Templates.
 */

public class GameQuestions {

    private long question_id;
    private String correctAnswer;
    private String IncorrectAnswerOne;
    private String IncorrectAnswerTwo;
    private String IncorrectAnswerThree;

    /**
     * default constructor
     */
    public GameQuestions() {
    }

    /**
     * overloaded constructor
     * @param question_id
     * @param correctAnswer
     * @param incorrectAnswerOne
     * @param incorrectAnswerTwo
     * @param incorrectAnswerThree
     */
    public GameQuestions(long question_id, String correctAnswer, String incorrectAnswerOne, String incorrectAnswerTwo, String incorrectAnswerThree) {
        this.question_id = question_id;
        this.correctAnswer = correctAnswer;
        IncorrectAnswerOne = incorrectAnswerOne;
        IncorrectAnswerTwo = incorrectAnswerTwo;
        IncorrectAnswerThree = incorrectAnswerThree;
    }

    /**
     * method to get question ID
     * @return
     */
    public long getQuestion_id() {
        return question_id;
    }

    /**
     * method to set question ID
     * @param question_id
     */
    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }

    /**
     * method to get correct answer
     * @return
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getIncorrectAnswerOne() {
        return IncorrectAnswerOne;
    }

    public void setIncorrectAnswerOne(String incorrectAnswerOne) {
        IncorrectAnswerOne = incorrectAnswerOne;
    }

    public String getIncorrectAnswerTwo() {
        return IncorrectAnswerTwo;
    }

    public void setIncorrectAnswerTwo(String incorrectAnswerTwo) {
        IncorrectAnswerTwo = incorrectAnswerTwo;
    }

    public String getIncorrectAnswerThree() {
        return IncorrectAnswerThree;
    }

    public void setIncorrectAnswerThree(String incorrectAnswerThree) {
        IncorrectAnswerThree = incorrectAnswerThree;
    }
}
