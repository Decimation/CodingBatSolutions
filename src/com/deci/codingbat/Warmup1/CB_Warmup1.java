package com.deci.codingbat.Warmup1;

import java.util.Map;

@SuppressWarnings({"WeakerAccess", "unused"})

public class CB_Warmup1 {

	public CB_Warmup1() {
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (vacation == weekday) return true;
		if (vacation) return true;
		return false;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile) return true;
		if (!aSmile && !bSmile) return true;
		return false;
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
		if (a == 10 || b == 10) return true;
		if (a + b == 10) return true;

		return false;
	}

	public boolean nearHundred(int n) {
		int sum1 = Math.abs(n - 100);
		int sum2 = Math.abs(n - 200);

		if (sum1 <= 10 || sum2 <= 10)
			return true;
		else
			return false;
	}

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return (a < 0) && (b < 0);
		}

		if (a < 0 && b > 0) {
			return true;
		}
		if (a > 0 && b < 0) {
			return true;
		}

		return false;
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
		StringBuilder sb = new StringBuilder();
		sb.append(str.substring(str.length() - 1, str.length()));
		sb.append(str);
		sb.append(str.substring(str.length() - 1, str.length()));
		return sb.toString();
	}


}
