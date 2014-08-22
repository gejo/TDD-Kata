package com.oocl.tdd.tennis;

/**
 * Created by GEJO on 8/7/2014.
 */
public class TennisGame {
	public String getScore() {
		return playerA.getScore() + ":" + playerB.getScore();
	}

	private Player playerA = null;
	private Player playerB = null;

	public TennisGame() {
		playerA = new Player();
		playerB = new Player();
	}

	public Player getPlayerA() {
		return playerA;
	}

	public Player getPlayerB() {
		return playerB;
	}

}
