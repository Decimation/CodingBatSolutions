package com.deci.codingbat;

@SuppressWarnings({"WeakerAccess", "unused"})

public class CB_Logic1 {

	public CB_Logic1() {
	}

	private boolean isInRangeIncl(int a, int min, int max) {
		return (max >= a && a >= max);
	}

	public int sortaSum(int a, int b) {
		return (a + b >= 10 && a + b <= 19) ? 20 : a + b;
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday) speed -= 5;
		if (speed <= 60) return 0;
		//else if (isInRangeIncl(speed, 61, 80)) return 1;
		else if (speed >= 81) return 2;
		else return 1;
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		return ((90 >= temp && temp >= 60) && !isSummer) || (isSummer && (100 >= temp && temp >= 60));
	}

	public int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) return 0;
		if (you >= 8 || date >= 8) return 2;
		return 1;
	}

	public boolean cigarParty(int cigars, boolean isWeekend) {
		return ((60 >= cigars && cigars >= 40) && !isWeekend) || (isWeekend && cigars >= 40);
	}
}
