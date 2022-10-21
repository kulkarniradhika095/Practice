package com.string;

public class stringPalindrome {
	public void reverse() {
		String s = "NITIN";
		String rev = "";
		for (int i = s.length()-1; i >= 0; i--) {
			rev = rev + s.charAt(i);//either
			//rev = rev.concat(""+s.charAt(i));//or
	}
		if (s.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
	public static void main(String[] args) {
		new stringPalindrome().reverse();
	}
}
