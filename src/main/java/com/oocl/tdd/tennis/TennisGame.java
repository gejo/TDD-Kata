package com.oocl.tdd.tennis;

/**
 * Created by GEJO on 8/7/2014.
 */
public class TennisGame {
    public String getScore() {
        return playerA + ":" + playerB;
    }

    public String getGameResult() {
        return null;
    }

    private int playerA;

    private int playerB;

    public TennisGame() {
        playerA = 0;
        playerB = 0;
    }
}
