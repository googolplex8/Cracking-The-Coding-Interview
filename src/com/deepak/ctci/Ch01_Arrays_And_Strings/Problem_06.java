package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_06 {

	public static String compressString(String input) {
		if (input == null) {
			return null;
		}
		char[] array = input.toCharArray();
		String compressed = "";
		int count = 1;
		char curChar = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] == curChar) {
				count++;
			} else {
				compressed += curChar;
				compressed += count;
				curChar = array[i];
				count = 1;
			}
			if (i == array.length - 1) {
				compressed += curChar;
				compressed += count;
			}
		}
		if (compressed.length() < input.length()) {
			return compressed;
		} else {
			return input;
		}
	}

}