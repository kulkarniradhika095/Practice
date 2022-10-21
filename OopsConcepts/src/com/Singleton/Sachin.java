package com.Singleton;
/**
 * This class is {@code Singleton}. Please use {@code getInstance} method to create an object.
 * @author radhi
 *
 */
public class Sachin {
	//Private static class variable
	private static Sachin s = new Sachin();
	private Sachin() {
	//Private constructor	
	}
	//public static method which will return object class
	public static Sachin getInstance() {
		return s;
	}
}
