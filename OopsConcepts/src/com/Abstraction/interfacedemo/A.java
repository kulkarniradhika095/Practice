package com.Abstraction.interfacedemo;
// allowed in case of interfaces, but not allowed in case of class
public class A implements I1, I2, I3 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void m3() {
		I1.super.m3();
	}

	@Override
	public void m12() {
		// TODO Auto-generated method stub
		
	}
	

}
