 package com.testngdemo.c;

import org.testng.annotations.Test;

public class C {
	@Test
	public void m1() {
		System.out.println("m1 of C");
	}
	@Test
	public void m2() {
		System.out.println("m2 of C");
	}
	@Test
	public void m3() {
		System.out.println("m3 of C");
	}
	@Test(groups = {"Sanity","Production"})
	public void m4() {
		System.out.println("m4 of C");
	}
	@Test(groups = {"Sanity"})
	public void m5() {
		System.out.println("m5 of C");
	}
	@Test
	public void m6() {
		System.out.println("m6 of C");
	}
	@Test(groups = {"Sanity"})
	public void m7() {
		System.out.println("m7 of C");
	}
}
