/*
 * File: VoteCountingKarel.java
 * ----------------------------
 * The VoteCountingKarel subclass cleans out the chad from * a ballot as described in the section handout.
 */
import stanford.karel.*;

public class VoteCountingKarel extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				removeChad();
			}
			move(); 
		}
	}
	
	/**
	 * Removes any chad from a ballot, which consists of beepers
	 * in the squares to right and left of Karel's current position. */
	private void removeChad() {
		turnRight();
		checkPunchCorner();
		checkPunchCorner();
		turnLeft();
	}
	
	/**
	 * Removes any chad from the corner in front of Karel. The
	 * precondition is that Karel is facing one of the corners
	 * that represents a punch hole in a ballot; the postcondition
	 * is that Karel is on the same square but facing in the
	 * opposite direction since it has just come out of the hole. */
	private void checkPunchCorner() {
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
	} 
}