package com.inheritance;
/**
 * 
 * @author radhika
 *
 */
public class B extends A{ // class A is parent class of class B
	public B() {
		super();//A Class's constructor is called// by default instruction
	}
	@Override
		public void m1() {
			System.out.println("I am M1 from B");
		}
	public static void main(String[] args) {
		A a = new B();//ref of parent and object of child
		a.m1();
	}
}
