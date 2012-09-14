/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */
import stanford.karel.*;

/*
 * Name: 
 * Section Leader: 
 */

public class MidpointFindingKarel extends SuperKarel {

	/*
	 * Pre-condition:  Facing East at bottom left corner
	 * Post-condition: At midpoint
	 */
	public void run() {
		moveUp();
		searchWall();
		while (beepersPresent()) {
			searchWall();
		}
		moveDown();
		putBeeper();
		cleanUp();
	}
	
	/*
	 * Pre-condition:  Facing East or West
	 * Post-condition: Facing East or West, one row above
	 */
	private void moveUp() {
		if (facingEast()) {
			turnLeft();
			move();
			turnRight();			
		} else {
			turnRight();						
			move();
			turnLeft();
		}
	}

	/*
	 * Pre-condition:  Facing East or West
	 * Post-condition: Facing East or West, one row below
	 */
	private void moveDown() {
		if (facingEast()) {
			turnRight();
			move();
			turnLeft();			
		} else {
			turnLeft();
			move();
			turnRight();			
		}
	}

	/*
	 * Pre-condition:  Facing East or West "at edge of markings"
	 * Post-condition: Facing other direction one step inside markings 
	 *                 with beeper present if middle not reached yet
	 */
	private void searchWall() {
		if (frontIsClear()) {
			move();
		}
		while(frontIsClear() && noBeepersPresent()) {
			move();
		}
		turnAround();
		if (frontIsClear()) {
			move();
			if (beepersPresent()) {
				pickBeeper(); // finished !!!
			} else {
				putBeeper();
			}			
		}
	}
	
	/*
	 * Pre-condition:  Midpoint in first row
	 * Post-condition: Midpoint in first row
	 */
	private void cleanUp() {
		moveUp();
		while (frontIsClear()) {
			move();
			if (beepersPresent()) pickBeeper();
		}
		turnAround();
		while (frontIsClear()) {
			move();
			if (beepersPresent()) pickBeeper();
		}
		moveDown();
		turnAround();
		while (frontIsClear() && noBeepersPresent()) {
			move();
		}
	}
	
}
