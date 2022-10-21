package com.regexExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findDigits {
	public void findDigit() {
		String input = "He110 Te5tin9 5hastra8";
		Pattern p = Pattern.compile("\\d"); //Escape character
		Matcher m = p.matcher(input);
		
		while(m.find()) {
			int digit = Integer.parseInt(m.group());
			System.out.print(digit+" ");
		}
	}
	public static void main(String[] args) {
		findDigits p = new findDigits();
		p.findDigit();
	}
}
