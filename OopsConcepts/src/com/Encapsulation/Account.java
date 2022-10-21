package com.Encapsulation;
/**
 * Encapsulation
 * @author radhi
 *
 */
public class Account {
	private float balance;
	private int age;
	//setter method
	public void setAge(int age) {
		if (age<1) {
		System.err.println("Invalid age!"+age);
		}else if (age>120) {
			System.err.println("Invalid age!"+age);
		} else {
		this.age = age;
		}
	}
	//getter method
	public int getAge() {
		return age;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void addBalance() {

	}
}
