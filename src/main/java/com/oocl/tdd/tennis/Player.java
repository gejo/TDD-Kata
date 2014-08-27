/**
 * 
 */
package com.oocl.tdd.tennis;

/**
 * @author HUANGMA4
 * 
 */
public class Player {

    private int score;

    private String name;

    public Player(String name) {
        score = 0;
        this.name = name;
    }

    public void winBall(int ball) {
        if (ball < 3) {
            score = ball * 15;
        } else {
            score = 40 + (ball - 3) * 15;
        }
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return this.name;
    }
}
