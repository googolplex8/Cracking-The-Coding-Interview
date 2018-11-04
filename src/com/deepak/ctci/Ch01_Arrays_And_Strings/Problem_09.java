package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_09 {

	public static boolean isRotation(String string, String string2) {
		if(string == null || string2 == null) {
			return false;
		}
		if(string.length()==string.length()) {
			String str11 = string.concat(string);
			if(str11.indexOf(string2)>=0) {
				return true;
			}
		}
		return false;
	}

}