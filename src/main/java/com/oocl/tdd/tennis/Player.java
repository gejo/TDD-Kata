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

	/**
	 * 
	 */
	public Player() {
		// TODO Auto-generated constructor stub
		score = 0;
	}

	public void winBall(int ball) {
		score = ball * 15;
	}

	public int getScore() {
		return score;
	}
}
