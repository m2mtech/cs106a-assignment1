/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */
import stanford.karel.*;

/*
 * Name: 
 * Section Leader: 
 */

public class CheckerboardKarel extends SuperKarel {

	/*
	 * Pre-condition:  Facing East at bottom left corner
	 * Post-condition: Facing North at top right or left corner
	 */
	public void run() {
		oddRow();
		faceNorth();
		while (frontIsClear()) {
			if (beepersPresent()) {
				move();
				faceRow();
				evenRow();
			} else {
				move();
				faceRow();
				oddRow();
			}
			faceNorth();
		}
	}
	
	/*
	 * Planting every second field, starting with the first one
	 * Pre-condition:  Facing into direction of row
	 * Post-condition: Last position of row
	 */
	private void oddRow() {
		putBeeper();
		while(frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
			}
 		}
	}

	/*
	 * Planting every second field, starting with the second one
	 * Pre-condition:  Facing into direction of row
	 * Post-condition: Last position of row
	 */
	private void evenRow() {
		while(frontIsClear()) {
			move();
			putBeeper();
			if (frontIsClear()) {
				move();
			}
 		}
	}

	/*
	 * Pre-condition:  Facing north
	 * Post-condition: Facing into direction of row
	 */
	private void faceRow() {
		if (rightIsBlocked()) {
			turnLeft();
		} else if (leftIsBlocked()) {
			turnRight();
		} 		
	}	

	/*
	 * Pre-condition:  Facing east or west
	 * Post-condition: Facing north
	 */
	private void faceNorth() {
		if (facingEast()) {
			turnLeft();
		} else if (facingWest()) {
			turnRight();
		} 		
	}

}
