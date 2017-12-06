package com.deci.codingbat;

import java.util.Iterator;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})

public class CB_Functional2 {

	public CB_Functional2() {
	}

	public List<Integer> square56(List<Integer> nums) {
		Iterator<Integer> iterator = nums.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			Integer _int = iterator.next();
			nums.set(i, (int) Math.pow(_int, 2) + 10);
			i++;
		}
		nums.removeIf(_i -> _i % 10 == 5 || _i % 10 == 6);
		return nums;
	}

	public List<Integer> two2(List<Integer> nums) {
		Iterator<Integer> iterator = nums.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			Integer _int = iterator.next();
			nums.set(i, _int * 2);
			i++;
		}
		nums.removeIf(_i -> _i % 10 == 2);
		return nums;
	}

	public List<String> noYY(List<String> strings) {
		Iterator<String> iterator = strings.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			String s = iterator.next();
			strings.set(i, s + "y");
			i++;
		}
		strings.removeIf(str -> str.contains("yy"));
		return strings;
	}

	public List<String> no34(List<String> strings) {
		strings.removeIf(str -> str.length() == 3 || str.length() == 4);
		return strings;
	}

	public List<String> noZ(List<String> strings) {
		strings.removeIf(str -> str.contains("z"));
		return strings;
	}

	public List<String> noLong(List<String> strings) {
		strings.removeIf(str -> str.length() >= 4);
		return strings;
	}

	public List<Integer> noTeen(List<Integer> nums) {
		nums.removeIf(i -> 13 <= i && i <= 19);
		return nums;
	}

	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf(i -> i % 10 == 9);
		return nums;
	}

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(i -> i < 0);
		return nums;
	}
}
