package com.first;
/**
 * compare(String s):int
 * compareIgnoreCase (String s):int
 * replace (char s, char replacement):
 * replaceAll(String old, string new)
 * startsWith()
 * startsWith(String s , int index)
 * endsWith()
 * endsWith()
 * subString(int beginingIndex)
 * subString(int beginingIndex , int endIndex)
 * contains(ScharSequence c)
 * @author radhi
 *
 */
public class thirteen {
	public static void main(String[] args) {
		String s = "hello Testing Shastra hello";
		//s = s.replace('e', 'X');
		//System.out.println(s);
		s = s.replaceAll("hello", "olleh");
		System.out.println(s);
		
		String url = "https://www.testingshastra.com";
		if (url.startsWith("http")) {
			System.out.println("Url is insecure");
		}else {
			System.out.println("Url is secure");
		}
		if (url.endsWith(".com")) {
			System.out.println("url is secure");
		} else {
			System.out.println("url is insecure");
		}
		
		String subString = url.substring(12,26);
		System.out.println(subString);
		
		if (url.contains("https:")) {
			System.out.println("Url is secure");
		} else {
			System.out.println("Url is insecure");
		}
	}
}
