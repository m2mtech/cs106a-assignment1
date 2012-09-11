/* /*
 * File: RoadRepairKarel.java
 * --------------------------
 * The RoadRepairKarel class fills a series of regularly
 * spaced potholes until it reaches the end of the roadway.
 */
import stanford.karel.*;
public class RoadRepairKarel extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			move();
			fillPothole();
			move(); }
	}
	/**
	 * Fills the hole beneath Karel's current position by
	 * placing a beeper in the hole.  For this method to
	 * work correctly, Karel must be facing east immediately
	 * above the hole.  When execution is complete, Karel
	 * will have returned to the same square and will again
	 * be facing east.  This version of fillPothole checks to
	 * see if there is already a beeper present before putting
	 * a new one down.
	 */
	private void fillPothole() {
		turnRight();
		move();
		if (noBeepersPresent()) {
			putBeeper();
		}
		turnAround();
		move();
		turnRight();
	} 
}