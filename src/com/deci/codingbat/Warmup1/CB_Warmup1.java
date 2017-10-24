package com.deci.codingbat.Warmup1;

import java.util.Arrays;
import java.util.Collections;

@SuppressWarnings({"WeakerAccess", "unused"})

public class CB_Warmup1 {

	public CB_Warmup1() {
	}

	public int close10(int a, int b) {
		int distA = Math.abs(a - 10);
		int distB = Math.abs(b - 10);
		if (distA < distB) return a;
		if (distA == distB) return 0;
		return b;
	}

	public boolean stringE(String str) {
		int eCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') eCount++;
		}

		return (3 >= eCount && eCount >= 1);
	}

	public int max1020(int a, int b) {
		if (b > a) {
			a += b;
			b = a - b;
			a -= b;
		}

		if (10 <= a && a <= 20)
			return a;

		if (10 <= b && b <= 20)
			return b;

		return 0;
	}

	public boolean in3050(int a, int b) {
		return ((40 >= a && a >= 30) && (40 >= b && b >= 30)) || ((50 >= a && a >= 40) && (50 >= b && b >= 40));
	}

	public boolean lastDigit(int a, int b) {
		return (a % 10 == b) || (b % 10 == a);
	}

	public String endUp(String str) {
		if (str.length() <= 3) return str.toUpperCase();
		final String sub = str.substring(str.length() - 3, str.length()).toUpperCase();
		return str.substring(0, str.length() - 3) + sub;
	}

	public String everyNth(String str, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i += n) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public int intMax(int a, int b, int c) {
		return Collections.max(Arrays.asList(a, b, c)); // lol
	}

	public String startOz(String str) {
		StringBuilder sb = new StringBuilder();

		if (str.length() <= 2) return str;
		if (str.charAt(0) == 'o') sb.append(str.charAt(0));
		if (str.charAt(1) == 'z') sb.append(str.charAt(1));

		return sb.toString();
	}

	public boolean mixStart(String str) {
		return str.contains("ix");
	}

	public String delDel(String str) {
		if (str.isEmpty()) {
			return str;
		}
		if (str.substring(1).startsWith("del")) {
			return str.charAt(0) + str.substring(4, str.length());
		} else {
			return str;
		}
	}

	public boolean loneTeen(int a, int b) {
		int[] arr = {a, b};
		boolean[] condition = new boolean[2];

		// Recursive check
		for (int i = 0; i < arr.length; i++) {
			if (13 <= arr[i] && arr[i] <= 19) {
				condition[i] = true;
			}
		}

		return condition[0] != condition[1];
	}

	public boolean hasTeen(int a, int b, int c) {
		int[] arr = {a, b, c};

		// Recursive check
		for (int i : arr) {
			if (13 <= i && i <= 19) {
				return true;
			}
		}

		return false;
	}

	public boolean in1020(int a, int b) {
		return (10 <= a && a <= 20) || (10 <= b && b <= 20);
	}


	public boolean icyHot(int temp1, int temp2) {
		return ((temp1 < 0) && (temp2 > 100)) || ((temp1 > 100) && (temp2 < 0));
	}

	public boolean startHi(String str) {
		return str.startsWith("hi");
	}

	public String front22(String str) {
		final String sub;

		if (str.length() <= 2) {
			sub = str;
		} else {
			sub = str.substring(0, 2);
		}

		return sub + str + sub;
	}

	public boolean or35(int n) {
		return (n % 3 == 0) || (n % 5 == 0);
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return vacation == weekday || vacation;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return aSmile && bSmile || !aSmile && !bSmile;
	}

	public int sumDouble(int a, int b) {
		if (a == b) {
			return (a + b) * 2;
		}

		return a + b;
	}

	public int diff21(int n) {
		if (n >= 21) {
			return 2 * (n - 21);
		}

		return Math.abs(n - 21);
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		if (talking) {
			if (hour < 7) {
				return true;
			}

			if (hour > 20) {
				return true;
			}
		}

		return false;
	}

	public boolean makes10(int a, int b) {
		return a == 10 || b == 10 || a + b == 10;
	}

	public boolean nearHundred(int n) {
		int sum1 = Math.abs(n - 100);
		int sum2 = Math.abs(n - 200);

		return sum1 <= 10 || sum2 <= 10;
	}

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return (a < 0) && (b < 0);
		}

		return a < 0 && b > 0 || a > 0 && b < 0;
	}

	public String notString(String str) {
		if (str.startsWith("not")) {
			return str;
		}

		return "not " + str;
	}

	public String missingChar(String str, int n) {
		String buf = str.charAt(n) + "";
		return str.replace(buf, "");
	}

	public String frontBack(String str) {
		if (str.length() <= 1) return str;
		final char front = str.charAt(0);
		final char back = str.charAt(str.length() - 1);

		final char[] internal = str.toCharArray();
		internal[0] = back;
		internal[internal.length - 1] = front;

		return new String(internal);
	}

	public String front3(String str) {
		final String front;
		if (str.length() <= 3) {
			front = str;
		} else {
			front = str.substring(0, 3);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			sb.append(front);
		}

		return sb.toString();
	}

	public String backAround(String str) {
		return str.substring(str.length() - 1, str.length()) +
				str +
				str.substring(str.length() - 1, str.length());
	}


}
