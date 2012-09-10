/*
 * File: PotholeFillingKarel.java
 * ------------------------------
 * The PotholeFillingKarel class puts a beeper into a pothole
 * on 2nd Avenue.  This version of the program decomposes
 * the problem so that it makes use of a fillPothole method.
 */
import stanford.karel.*;
public class PotholeFillingKarel extends SuperKarel {
	public void run() {
		move();
		fillPothole();
		move();
	}
	/**
	 * Fills the pothole beneath Karel's current position by
	 * placing a beeper on that corner.  For this method to
	 * work correctly, Karel must be facing east immediately
	 * above the pothole.  When execution is complete, Karel
	 * will have returned to the same square and will again
	 * be facing east.
	 */
	private void fillPothole() {
		turnRight();
		move();
		putBeeper();
		turnAround();
		move();
		turnRight();
	} 
}