package com.testngdemo;
/**
 * for hard dependency==> dependsOnMethods --> skips a particular test case
 * for soft dependency==> alwaysRun --> runs the test case regardless of dependsOnMethods 
 * for hard dependency==> dependsOnGroups --> depends on group of test cases --> group test cases run first --> if any test case failed from a group then dependent test case will fail 
 * singleThreaded==> boolean --> if at class level @Test is written
 * threadPoolSize==> at class level @Test is written --> multithreaded environment
 * 
 */
import org.testng.annotations.Test;

public class TestParameters1 {
	
	@Test //(enabled = false)
	public void m2() {
		System.out.println("m2 test case");
	}
	@Test (priority=-5)
	public void m5() {
		System.out.println("m5 test case");
		throw new AssertionError();
	}
	@Test(priority =-6)
	public void m1() {
		System.out.println("m1 test case");
	}
	@Test(dependsOnMethods = {"m5"}, alwaysRun = true)
	public void m3() {
		System.out.println("m3 test case");
	}
	@Test(priority = 10)
	public void m4() {
		System.out.println("m4 test case");
	}
	@Test(priority = 134)
	public void m6() {
		System.out.println("m6 test case");
	}
}
