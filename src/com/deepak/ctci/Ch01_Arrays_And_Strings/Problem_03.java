package com.deepak.ctci.Ch01_Arrays_And_Strings;

public class Problem_03 {

	public static Object replaceSpacesWithSpecialCharacter(String string, int i) {
		if(string == null || string == "") {
			return null;
		}
		String url = "";
		for (int j = 0; j < i; j++) {
			if(string.charAt(j)==32) {
				url+="%20";
			}
			else {
				url+=string.charAt(j);
			}
		}
		return url;
	}

}
