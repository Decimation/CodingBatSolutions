package com.deci.codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})

public class CB_String1 {

	public CB_String1() {
	}

	public String minCat(String a, String b) {
		return null; // Placeholder

	}

	public boolean frontAgain(String str) {
		return str.length() != 1 && !str.isEmpty() && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()));
	}

	public String seeColor(String str) {
		if (str.startsWith("red")) return "red";
		if (str.startsWith("blue")) return "blue";
		else return "";
	}

	public String lastTwo(String str) {
		if (str.isEmpty() || str.length() < 2) return str;
		if (str.length() == 2) return new String(new char[]{str.charAt(1), str.charAt(0)});
		return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
	}

	public String conCat(String a, String b) {
		if (a.isEmpty()) return b;
		if (b.isEmpty()) return a;

		if (a.charAt(a.length() - 1) == b.charAt(0)) {
			return a.substring(0, a.length() - 1) + b;
		}
		return a + b;
	}

}
