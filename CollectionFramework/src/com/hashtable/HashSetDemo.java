package com.hashtable;

import java.util.HashSet;
import java.util.Hashtable;

public class HashSetDemo {
	public static void main(String[] args) {
	 
		HashSet hs = new HashSet();//Capacity: 16 , loadFactor(LF): 75%
		
		hs.add(10);//10%16=10
		hs.add(27);//27%16=9
		hs.add(18);//18%16=2
		hs.add(12);//12%16=12
		hs.add(41);//41%16=9
		hs.add(39);//39%16=7
		hs.add(24);//24%16=8
		hs.add("Hello");
		hs.add(null);
		boolean isInserted = hs.add(24);//boolean, it will not ass element in hashset
		
		System.out.println(hs);
	
}
}