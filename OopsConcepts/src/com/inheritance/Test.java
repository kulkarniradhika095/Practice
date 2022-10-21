package com.inheritance;
/**
 * 
 * @author abhijeet
 *
 */
public class Test {
public static void main(String[] args) {
	B b = new B();
	C c = new C();
	
	
	A a = new B();
	a = new C();
}
}
