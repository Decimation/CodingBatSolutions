package com.deci.codingbat;

import java.util.*;

public class CB_Logic2 {

	public int loneSum(int a, int b, int c) {
		List<Integer> ls = new ArrayList<>(Arrays.asList(a, b, c));
		Map<Integer, Integer> freqMap = new HashMap<>();

		for (int i : ls)
			freqMap.put(i, Collections.frequency(ls, i));

		for (Map.Entry<Integer, Integer> m : freqMap.entrySet())
			if (m.getValue() >= 2) ls.removeAll(Collections.singleton(m.getKey()));

		return ls.stream().mapToInt(Integer::intValue).sum();
	}

	public int luckySum(int a, int b, int c) {
		List<Integer> ls = Arrays.asList(a, b, c);
		int sum = 0;
		int i = 0;
		while (i < 3 && ls.get(i) != 13) {
			sum += ls.get(i);
			i++;
		}
		return sum;
	}



	public boolean closeFar(int a, int b, int c) {
		if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2){
			return true;
		} else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2){
			return true;
		}else{
			return false;
		}
	}

	public int roundSum(int a, int b, int c) {
		int sum = 0;
		for (int i : new int[]{a, b, c})
			sum += round10(i);
		return sum;
	}

	public int round10(int num) {
		return (int) Math.round(num / 10.0) * 10;
	}

	public int blackjack(int a, int b) {
		if (a > 21 && b > 21) return 0;
		if (b > 21 || a <= 21 && a > b) return a;
		return b;
	}
}
