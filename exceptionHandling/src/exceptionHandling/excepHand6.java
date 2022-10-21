package exceptionHandling;

import java.io.FileNotFoundException;

public class excepHand6 {
	public void m2() {
		excepHand5 e = new excepHand5();
		try {
			e.m1();
		} catch (FileNotFoundException e2) {
		}
		
	}
}
