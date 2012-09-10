/*
 * File: PotholeFillingKarel.java
 * ------------------------------
 * The PotholeFillingKarel class puts a beeper into a pothole
 * on 2nd Avenue.  This version of the program uses no
 * decomposition other than turnRight and turnAround,
 * which are inherited from SuperKarel.
 */
import stanford.karel.*;
public class PotholeFillingKarel extends SuperKarel {
	public void run() {
		move();
		turnRight();
		move();
		putBeeper();
		turnAround();
		move();
		turnRight();
		move();
	} 
}