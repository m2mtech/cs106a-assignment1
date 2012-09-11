/*
 * File: NewImprovedKarel.java
 * ---------------------------
 * The NewImprovedKarel class extends the basic Karel class
 * so that any subclasses have access to the turnRight and
 * turnAround methods.  It does not define any run method
 * of its own.
 */
import stanford.karel.*;

public class NewImprovedKarel extends Karel {

	/**
	 * Turns Karel 90 degrees to the right.
	 */
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

	/**
	 * Turns Karel around 180 degrees.
	 */
	public void turnAround() {
		turnLeft();
		turnLeft();
	}

}