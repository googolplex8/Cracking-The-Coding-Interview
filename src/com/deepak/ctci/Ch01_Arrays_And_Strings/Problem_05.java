package com.deepak.ctci.Ch01_Arrays_And_Strings;

import java.util.HashMap;

public class Problem_05 {

	public static boolean isOneEditAway(String string, String string2) {
		if(string == null)
			return false;
		int numOffs = 0;
		HashMap<Character, Integer> m1 = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			if (m1.containsKey(string.charAt(i))) {
				m1.put(string.charAt(i), m1.get(string.charAt(i)) + 1);
			} else {
				m1.put(string.charAt(i), 1);
			}
		}

		HashMap<Character, Integer> m2 = new HashMap<>();
		for (int i = 0; i < string2.length(); i++) {
			if (m2.containsKey(string2.charAt(i))) {
				m2.put(string2.charAt(i), m2.get(string2.charAt(i)) + 1);
			} else {
				m2.put(string2.charAt(i), 1);
			}
		}
		for (char key : m1.keySet()) {
			if (m1.get(key) != m2.get(key)) {
				numOffs+=1;
			}
		}
		if(numOffs>1) {
			return false;
		}
		return true;
	}

}
