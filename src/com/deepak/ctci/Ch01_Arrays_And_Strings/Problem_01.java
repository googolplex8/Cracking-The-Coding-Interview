package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.HashMap;

public class Problem_01 {

	public static boolean hasUniqueUnicode(String string) {
		HashMap<Character, Integer> m = new HashMap<>();
		if (string == null || string == "") {
			return false;
		} else {
			for (int i = 0; i < string.length(); i++) {
				if (m.containsKey(string.charAt(i))) {
					m.put(string.charAt(i), m.get(string.charAt(i)) + 1);
				} else {
					m.put(string.charAt(i), 1);
				}
			}
		}
		for (int i = 0; i < string.length(); i++) {
			if (m.get(string.charAt(i)) > 1)
				return false;
		}
		return true;
	}
}