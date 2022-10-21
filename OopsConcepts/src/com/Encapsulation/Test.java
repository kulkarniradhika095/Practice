package com.Encapsulation;

public class Test {
public static void main(String[] args) {
	Account ankush = new Account();
	ankush.setAge(750);
	System.out.println("Your age is: "+ankush.getAge());
	
	Account rushikesh = new Account();
	rushikesh.setAge(-98);
	System.out.println("Your age is: "+rushikesh.getAge());
	
	Account radhika = new Account();
	radhika.setBalance(5000);
}
}
