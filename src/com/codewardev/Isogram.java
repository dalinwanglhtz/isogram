package com.codewardev;

import java.util.Arrays;

// https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java

public class Isogram {

	public static boolean isIsogram(String string) {
		if(string.isEmpty()) return true;

		String[] newString = Arrays.stream(string.split("")).map(String::toLowerCase).distinct().toArray(String[]::new);
		if(newString.length != string.length()) return false;
		
		return true;
	}

}
