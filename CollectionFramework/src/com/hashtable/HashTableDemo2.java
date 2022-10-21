package com.hashtable;

import java.util.Hashtable;

public class HashTableDemo2 {
	
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();//capacity: 11
		
		ht.put(17, "A");
		ht.put(28, "B");
		ht.put(10, "C");
		ht.put(8, "D");
		ht.put(13, "E");
		ht.put(14, "F");
		ht.put(15, "G");
		ht.put(16, "H");
		ht.put(18, "I");
		ht.put(19, "J");
		ht.put(20, "K");
		ht.put(21, "L");
		ht.put(10, "XX");
		
		System.out.println(ht);
	}
}
