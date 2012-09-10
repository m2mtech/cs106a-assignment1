/*
 * File: BeeperTotingKarel.java
 * ----------------------------
 * The BeeperTotingKarel class extends the basic Karel class
 * so that Karel picks up a beeper from 1st Street and then
 * carries that beeper to the center of a ledge on 2nd Street.
 */

import stanford.karel.*;

public class BeeperTotingKarel extends Karel {
	public void run() {
		move();
		pickBeeper();
		move();
		turnLeft();
		move();
		turnRight();
		move();
		move();
		putBeeper();
		move();
	}
	
	/**
	 * Turns Karel 90 degrees to the right.
	 */
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	/**
	 * Turns Karel 180 degrees.
	 */
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
}