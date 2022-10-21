package com.polymorphism;
/**
 * 
 * @author pallavi
 *
 */
public class C extends B{
@Override
public void makepizza(int size) {
	System.out.println("Prepere a base of diameter " +size);
	System.out.println("Add Sauce");
	System.out.println("Add Chicken");
	System.out.println("Add Cheese");
	System.out.println("Bake for 10 mins");
}
}
