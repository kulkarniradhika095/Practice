package com.Abstaction;

public abstract class Abstract {
	int i = 10;// Instance variable
	static String x = "Hello";//Static variable
	
	{
		System.out.println("I am instance block");// instance block
	}
	static {
		System.out.println("I am static block");//static block
	}
	public Abstract() {//non para constructor
		
	}
	public Abstract(int x) {// para constructor
		
	}
	public abstract Object m1() ;

	
}
