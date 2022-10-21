package com.inheritance;
/**
 * 
 * @author akshay
 *
 */
public class A { //object class is parent class --> by default
	private String name = "Avinash";
	int i = 10;//instance variable
	static int j = 20;//static variable
	{
		System.out.println("Instance block of A");
	}
	static {
		System.out.println("Static block of A");
	}
	public void m1() { //Instance method
		System.out.println("I am m1 from A");
	}
	public static void m2() { //Static method
		System.out.println("I am m2 from A");

	}
}
