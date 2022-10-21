package exceptionHandling;
/**
 * Custom Exception / own exception
 * ATM example for the introduction of exception using 'throw' keyword
 * @author radhi
 */
import java.util.Scanner;

import com.myException.CardBlocked;

public class excepHand8 {
	private int pin = 1234;
	
	public void withdraw(int pin) {
		int count = 1;
		while (pin != this.pin) {
			System.out.println("Invalid Pin number! Please try again.");
			Scanner sc = new Scanner(System.in);
			pin = sc.nextInt();
			count ++;
			if (count >= 3) {
				throw new CardBlocked();
			} 

			}
	
		}
		public static void main (String [] args) {
		excepHand8 e = new excepHand8();
		System.out.println("Enter pin number: ");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		e.withdraw(pin);
	}
}

