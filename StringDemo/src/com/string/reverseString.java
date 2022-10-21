package com.string;

public class reverseString {
	public void reverse() {
		String s = "Hello World";
		String rev = "";
		for (int i = s.length()-1; i >= 0; i--) {
			rev = rev + s.charAt(i);//either
			//rev = rev.concat(""+s.charAt(i));//or
	}
		System.out.println("Reverse: "+rev);
	}
	public static void main(String[] args) {
		new reverseString().reverse();
	}
}