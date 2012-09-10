/*
 * File: BeeperPickingKarel.java
 * -----------------------------
 * The BeeperPickingKarel class extends the basic Karel class
 * by defining a "run" method with three commands.  These
 * commands cause Karel to move forward one block, pick up
 * a beeper, and then move ahead to the next corner.
 */

import stanford.karel.*;

public class BeeperPickingKarel extends Karel {
	public void run() {
		move();
		pickBeeper();
		move();
	} 
}