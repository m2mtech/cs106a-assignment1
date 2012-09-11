￼￼/*
 * File: SteepleChase.java
 * -----------------------
 * Karel runs a steeple chase the is 9 avenues long. * Hurdles are of arbitrary height and placement.
 */
import stanford.karel.*;
public class SteepleChase extends SuperKarel {
	/*
	 * To run a race that is 9 avenues long, we
	 * forward or jump hurdles 8 times.
	 */
	public void run() {
		for (int i = 0; i < 8; i++) {
			if (frontIsClear()) {
				move();
			} else {
				jumpHurdle();
			}
		}
	}
}