package com.hashtable;

import java.util.Hashtable;

public class HashTableDemo1 {
	
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		Integer i = 27;//value=hashcode
		String s = "Hi";
		System.out.println("Hash Code: "+i.hashCode());
		System.out.println("Hash code of hi: "+s.hashCode());
	}
}
