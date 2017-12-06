package com.deci.codingbat;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

@SuppressWarnings({"unused", "WeakerAccess"})

public class CB_Warmup2 {

	public CB_Warmup2() {
	}

	public String stringSplosion(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.substring(0, i + 1));
		}
		return sb.toString();
	}


	public String stringBits(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i += 2) {
			sb.append(str.charAt(i));
		}

		return sb.toString();
	}

	public boolean doubleX(String str) {
		if (str.isEmpty()) return false;

		boolean hadX = false;
		for (int i = 0; i < str.length(); i++) {
			if (i + 1 == str.length()) return false;
			if (str.charAt(i) == 'x' && str.charAt(i + 1) != 'x') return false;
			if (str.charAt(i) == 'x') hadX = true;
			if (hadX && str.charAt(i + 1) == 'x') return true;
			hadX = false;
		}
		return true;
	}

	public int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("xx")) count++;
		}
		return count;
	}

	public String stringTimes(String str, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

	public String frontTimes(String str, int n) {
		final String sub;
		if (str.length() <= 3) sub = str;
		else sub = str.substring(0, 3);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(sub);
		}

		return sb.toString();
	}
}
