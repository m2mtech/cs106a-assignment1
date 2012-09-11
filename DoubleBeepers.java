/*
 * File: DoubleBeepers.java
 * ------------------------
 * Karel doubles the number of beepers on the corner directly
 * in front of him in the world. He then returns to his * original position/orientation.
 */
import stanford.karel.SuperKarel;

public class DoubleBeepers extends SuperKarel {

	public void run() {
		move();
		DoubleBeepersInPile();
		moveBackward();
	}

	/*
	 * For every beeper on the current corner, Karel places
	 * two beepers on the corner immediately ahead of him. 
	 */
	private void DoubleBeepersInPile() {
		while (beepersPresent()) {
			pickBeeper();
			PutTwoBeepersNextDoor();
		}
		MovePileNextDoorBack();	
	}
}
