package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.HashMap;

public class Problem_04 {

	public static boolean isPalindromePermutation(String string) {
		if(string == null)
			return false;
		string = string.toLowerCase();
		string = string.replaceAll(" ", "");
		int numOdds = 0;
		HashMap<Character, Integer> m1 = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			if (m1.containsKey(string.charAt(i))) {
				m1.put(string.charAt(i), m1.get(string.charAt(i)) + 1);
			} else {
				m1.put(string.charAt(i), 1);
			}
		}
		for (char key : m1.keySet()) {
			if (m1.get(key) % 2 != 0) {
				numOdds += 1;
			}
		}
		if (numOdds > 1) {
			System.out.println(numOdds);
			return false;
		}
		return true;
	}
}
