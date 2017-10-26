package com.deci.codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})

public class CB_String1 {

	public CB_String1() {
	}

	// Doesnt work
	public String deFront(String str) {
		boolean keep0 = false, keep1 = false;
		if (str.charAt(0) == 'a') keep0 = true;
		if (str.charAt(1) == 'b') keep1 = true;

		if (keep0 && !keep1) {
			StringBuilder sb = new StringBuilder();
			sb.append('a');
			sb.append(str.substring(2, str.length()));
			return sb.toString();
		}
		if (!keep0 && keep1) {
			StringBuilder sb = new StringBuilder();
			sb.append('b');
			sb.append(str.substring(2, str.length()));
			return sb.toString();
		}
		if (keep0 && keep1) return str.substring(1, str.length()-1);
		return str;
	}

	public String extraFront(String str) {
		if (str.isEmpty()) return str;
		if (str.length() == 1) return str + str + str;
		final String front = str.substring(0, 2);
		return front + front + front;
	}

	public String lastChars(String a, String b) {
		if (a.isEmpty()) a = "@";
		if (b.isEmpty()) b = "@";

		return new String(new char[]{a.charAt(0), b.charAt(b.length() - 1)});
	}

	public String atFirst(String str) {
		if (str.isEmpty()) return "@@";
		return (str.length() < 2) ? str + '@' : str.substring(0, 2);
	}

	public boolean hasBad(String str) {
		return !str.isEmpty() && (str.substring(1).startsWith("bad") || str.startsWith("xbad") || str.startsWith("bad") || str.equals("bad"));
	}

	public String middleThree(String str) {
		int mid = str.length() / 2;
		return str.substring(mid - 1, mid + 2);
	}

	public String twoChar(String str, int index) {
		if (index + 2 > str.length() || index < 0)
			return str.substring(0, 2);

		return str.substring(index, index + 2);
	}

	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n, str.length());
	}

	public boolean endsLy(String str) {
		return str.endsWith("ly");
	}

	public String middleTwo(String str) {
		int i = str.length() / 2;
		return str.substring(i - 1, i + 1);
	}

	public String withouEnd2(String str) {
		if (str.length() == 1) return "";
		return (str.isEmpty()) ? str : str.substring(1, str.length() - 1);
	}

	public String theEnd(String str, boolean front) {
		return front ? str.substring(0, 1) : str.substring(str.length() - 1, str.length());
	}

	public String right2(String str) {
		if (str.length() <= 2) return str;
		char[] front = {str.charAt(str.length() - 2), str.charAt(str.length() - 1)};
		return new String(front) + str.substring(0, str.length() - 2);
	}

	public String left2(String str) {
		if (str.length() <= 2) return str;
		return str.substring(2, str.length()) + str.substring(0, 2);
	}

	public String nonStart(String a, String b) {
		return a.substring(1, a.length()) + b.substring(1, b.length());
	}

	public String comboString(String a, String b) {
		final String shortest, longest;
		if (a.length() > b.length()) {
			shortest = b;
			longest = a;
		} else {
			shortest = a;
			longest = b;
		}

		return shortest + longest + shortest;
	}

	public String withoutEnd(String str) {
		return (str.length() < 2) ? str : str.substring(1, str.length() - 1);
	}

	public String firstHalf(String str) {
		return (str.length() <= 1) ? str : str.substring(0, str.length() / 2);
	}

	public String firstTwo(String str) {
		return (str.length() <= 2) ? str : str.substring(0, 2);
		/*if (str.length() <= 2) return str;
		return str.substring(0, 2);*/
	}

	public String extraEnd(String str) {
		final String end = str.substring(str.length() - 2, str.length());
		return end + end + end;
	}

	public String makeOutWord(String out, String word) {
		return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2, out.length());
	}

	public String makeTags(String tag, String word) {
		return String.format("<%s>%s</%s>", tag, word, tag);
	}

	public String makeAbba(String a, String b) {
		return String.format("%s%s%s%s", a, b, b, a);
	}

	public String helloName(String name) {
		return String.format("Hello %s!", name);
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
