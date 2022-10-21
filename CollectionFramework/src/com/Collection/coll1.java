package com.Collection;
/**
 * homogenous array though the datatypes declared in an array are different in nature 
 * @author radhi
 *
 */
public class coll1 {
	
	public static void main(String[] args) {
		Object[] obj = {10, "Hello", 3.14f,true};// not an heterogeneous array
		int r = obj[0] + 5;// thus this operation can't be performed.
	}
}
