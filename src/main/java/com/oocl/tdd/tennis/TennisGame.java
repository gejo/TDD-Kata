package com.oocl.tdd.tennis;

/**
 * Created by GEJO on 8/7/2014.
 */
public class TennisGame {
    public String getScore() {
        if (playerA.getScore() == 40 && playerB.getScore() == 40) {
            int ballDiff = playerA.getBall() - playerB.getBall();
            if (ballDiff == 1) {
                return "A Advantage";
            } else if (ballDiff == -1) {
                return "B Advantage";
            } else if (ballDiff > 1) {
                return "A Win";
            } else if (ballDiff < -1) {
                return "B Win";
            } else {
                return "Deuce";
            }
        }
        return playerA.getScore() + ":" + playerB.getScore();
    }

    private Player playerA = null;

    private Player playerB = null;

    public TennisGame() {
        playerA = new Player("A");
        playerB = new Player("B");
    }

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

}
