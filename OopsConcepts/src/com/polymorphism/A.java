package com.polymorphism;
/**
 * Method overloading
 * @author radhi
 *
 */
public class A {
	public A() {//constructor overloading --> two ways to create object of the class
		System.out.println("No argument constructor");
	}
	public A (int x, int y) {
		
	}
	public void add(byte a, byte b) {
	}
	public void add(short a, short b) {

	}
	public int add(int a, int b) {
		return a+b;
	}
	public void add(long a, long b) {
	}
	public static void main(String[] args){
		A a = new A();//first way
		A a1 = new A(5,6);//second way
		System.out.println(a);
		System.out.println(a1);
	}
}
