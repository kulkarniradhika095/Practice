package com.regexExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class capitaliseFirstLetter {
	public void smallCaps() {
		String smallCaps = "hello testing shastra";
		Pattern pat = Pattern.compile("\\w");
		Matcher match = pat.matcher(smallCaps);
		String result = "";
	}
	public static void main(String[] args) {
	
}
}
