package com.deci.codingbat;

public class CB_String3 {

	public boolean gHappy(String str) {
		final char[] ch = str.toCharArray();
		int Gs = 0;
		int happyGs = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'g') {
				Gs++;

				if (i - 1 >= 0)
					if (ch[i - 1] == 'g')
						happyGs++;
					else if (i + 1 < ch.length)
						if (ch[i + 1] == 'g')
							happyGs++;
			}
		}

		return Gs == happyGs || (Gs == ch.length && Gs > 1);
	}

	public boolean equalIsNot(String str) {
		int is = 0, not = 0;
		final char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (i + 1 >= ch.length) break;
			if (ch[i] == 'i' && ch[i + 1] == 's') is++;

			if (i + 2 >= ch.length) break;
			if (ch[i] == 'n' && ch[i + 1] == 'o' && ch[i + 2] == 't') not++;
		}

		return not == is;
	}

	public int countYZ(String str) {
		char[] ch = str.toCharArray();
		int count = 0;

		if (ch[ch.length - 1] == 'y' || ch[ch.length - 1] == 'z') count++;
		else if (ch[ch.length - 1] == 'Y' || ch[ch.length - 1] == 'Z') count++;

		for (int i = 0; i < ch.length; i++) {
			char c = Character.toLowerCase(ch[i]);
			if (c == 'y' || c == 'z') {

				if (i + 1 != ch.length)
					if (!Character.isLetter(ch[i + 1]))
						count++;

			}
		}
		return count;
	}
}
