package com.Abstraction.interfacedemo;

public interface I1 {
	int x =10; //static variable
	static int y = 20;//static variable
	//all variables in interface are static in nature
	public void m1();
	public void m2();
	
	// new feature of java 1.8 --> default concrete methods are allowed in interfaces
	default void m3() {
		
	}
	}
