package com.deci.codingbat;

@SuppressWarnings("WeakerAccess")
public class CB_String2 {

	public String doubleChar(String str) {
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			sb.append(c).append(c);
		}

		return sb.toString();
	}

	public String zipZap(String str) {
		if (str.length() <= 2) return str;
		StringBuilder sb = new StringBuilder();
		final char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'z' && ch[i + 2] == 'p') {
				sb.append(ch[i]).append(ch[i + 2]);
				System.out.printf("%c%c%c\n", ch[i], ch[i + 1], ch[i + 2]);
				i += 2;
			} else sb.append(ch[i]);
		}
		return sb.toString();
	}

	public boolean catDog(String str) {
		int cat = 0, dog = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i + 3 > str.length()) break;
			if (str.substring(i, i + 3).equals("cat")) cat++;
			if (str.substring(i, i + 3).equals("dog")) dog++;
		}
		return cat == dog;
	}


	public boolean endOther(String a, String b) {
		final String end_a = a.toLowerCase();
		final String end_b = b.toLowerCase();
		return end_a.endsWith(end_b) || end_b.endsWith(end_a); // hehe
	}

	public int countCode(String str) {

		int a = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'c' && !(i + 3 >= ch.length) && ch[i + 1] == 'o') {
				if (ch[i + 3] == 'e') a++;
			}
		}

		return a;
	}

	public boolean bobThere(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'b') {

				if (!(i + 2 >= ch.length) && ch[i + 2] == 'b') return true;
			}
		}
		return false;
	}

	public String repeatEnd(String str, int n) {
		String out = "";
		for (int i = 0; i < n; i++) {
			out += str.substring(str.length() - n);
		}

		return out;
	}

	public int countHi(String str) {
		final String HI = "hi";
		int occ = 0;
		int last = 0;

		while (last != -1) {
			last = str.indexOf(HI, last);

			if (last != -1) {
				occ++;
				last += HI.length();
			}
		}
		return occ;
	}

	public String repeatFront(String str, int n) {
		String out = "";
		int index = n;
		for (int i = 0; i < n; i++) {
			out += str.substring(0, index);
			index -= 1;
		}

		return out;
	}

	public String mixString(String a, String b) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length() + b.length(); i++) {

			if (i >= a.length()) {
				sb.append(b.substring(i));
				break;
			}

			if (i >= b.length()) {
				sb.append(a.substring(i));
				break;
			}

			sb.append(a.charAt(i));
			sb.append(b.charAt(i));
		}

		return sb.toString();
	}
}