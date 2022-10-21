package com.testngdemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/**
 * invocationCount==> test case execution count
 * @author radhi
 */
public class TestParameters2 {
	int r=0;
	@Test(invocationCount = 3)
	public void m2() {

	}
	@Test(invocationCount = 0)
	public void m5() {

	}
	@Ignore
	public void m1() {

	}
	@Test(timeOut = 5000)
	public void m3() throws InterruptedException {
		System.out.println("m3 test case");
		Thread.sleep(6000);
	}
	@Test(invocationCount = 5 , invocationTimeOut = 5000)
	public void m4() throws InterruptedException {
		System.out.println("m4 test case");
		Thread.sleep(1000);
	}
	@Test(invocationCount = 7, successPercentage = 20)
	public void m6() {
		
		System.out.println("m6 test case");
		if (r==5 || r==1 || r==3 || r==6) {
			System.out.println("Pass");
			r++;
		}else {
			r++;
			System.out.println("r = "+r);
			throw new AssertionError("Fail");
		}
	}
	@Test(expectedExceptions = {ArithmeticException.class})
	public void m7() {
		throw new ArithmeticException();
	}
	@Test(description = "This is the Test-Case Description")
	public void m8() {

	}
}
