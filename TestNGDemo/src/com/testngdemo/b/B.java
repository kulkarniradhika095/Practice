package com.testngdemo.b;

import org.testng.annotations.Test;

public class B {
	
	@Test
	public void m1() {
		System.out.println("m1 of B");
	}
	@Test(groups = {"Sanity"})
	public void m2() {
		System.out.println("m2 of B");
	}
	@Test(groups = {"Sanity"})
	public void m3() {
		System.out.println("m3 of B");
	}
	@Test
	public void m4() {
		System.out.println("m4 of B");
	}
	@Test
	public void m5() {
		System.out.println("m5 of B");
	}
	@Test
	public void m6() {
		System.out.println("m6 of B");
	}
	@Test(groups = {"Sanity"})
	public void m7() {
		System.out.println("m7 of B");
	}
}
