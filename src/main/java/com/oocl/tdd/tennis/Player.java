/**
 * 
 */
package com.oocl.tdd.tennis;

/**
 * @author HUANGMA4
 * 
 */
public class Player {
	private int ball;

	private String name;

	public Player(String name) {
		this.name = name;
	}

	public void winBall(int ball) {
		this.ball += ball;
	}

	public int getScore() {
		if (ball < 3) {
			return ball * 15;
		} else {
			return 40 + (ball - 3) * 15;
		}
	}

	public String getName() {
		return this.name;
	}
}
