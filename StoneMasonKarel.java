/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */
import stanford.karel.*;

/*
 * Name: 
 * Section Leader: 
 */

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		repairColumn();
		climbDown();
		while(frontIsClear()) {
			moveToNextColumn();
			repairColumn();
			climbDown();
		}
	}
	
	private void repairColumn() {
		turnLeft();
		repairCurrentColumnPosition();
		while (frontIsClear()) {
			move();
			repairCurrentColumnPosition();
		}
	}

	private void repairCurrentColumnPosition() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}

	private void climbDown() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}

	private void moveToNextColumn() {
		for (int i = 0; i < 4; i++) {
			move();
		}
	}

}
