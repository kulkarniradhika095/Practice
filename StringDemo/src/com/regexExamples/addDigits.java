package com.regexExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class addDigits {
	public void addDigit() {
		String input = "He110 Te5tin9 5hastra8";
		Pattern p = Pattern.compile("\\d"); //Escape character
		Matcher m = p.matcher(input);
		
		int result = 0;
		while(m.find()) {
			int digit = Integer.parseInt(m.group());
			result = result + digit;
			
		}
		System.out.println("Addition of the digits present in the input string: "+result);
	}
	public static void main(String[] args) {
		addDigits p = new addDigits();
		p.addDigit();
	}
}
