package packagea;

import java.util.Scanner;
//ctrl+space
public class Methods {
	public int subtract(int x, int y) {
		return x-y;
	}
	public int multiply(int x, int y) {
		return x*y;
	}
	public int divide(int x, int y) {
		return x/y;
	}
		public int add(int x, int y) {
			return x+y;
			}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("===========Menu==========");
		System.out.println("1.Addition");//copy paste= ctrl+alt+down
		System.out.println("2.Subtraction");//delete= ctrl+d
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("===========================");
		System.out.println("Enter Your Choice: ");
		int choice = sc.nextInt();
		Methods m = new Methods();
switch (choice) {
case 1:
	System.out.println("Addition: "+m.add(x, y));
	break;
case 2:
	System.out.println("Subtraction: "+m.subtract(x, y));
	break;
case 3:
	System.out.println("Multiplication: "+m.multiply(x, y));
	break;
case 4:
	System.out.println("Divide: "+m.divide(x, y));
	break;
default:
	System.err.println("Invalid Choice!");
	break;
}
}
}

