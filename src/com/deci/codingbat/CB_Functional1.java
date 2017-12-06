package com.deci.codingbat;

import java.util.List;

public class CB_Functional1 {

	public CB_Functional1() {
	}

	public List<String> noX(List<String> strings) {
		int i = 0;
		for (String s : strings) {
			strings.set(i, s.replace("x", ""));
			i++;
		}
		return strings;
	}


	public List<String> lower(List<String> strings) {
		int index = 0;
		for (String s : strings) {
			strings.set(index, s.toLowerCase());
			index++;
		}
		return strings;
	}

	public List<Integer> rightDigit(List<Integer> nums) {
		int in = 0;
		for (Integer i : nums) {
			nums.set(in, i % 10);
			in++;
		}
		return nums;
	}


	public List<Integer> math1(List<Integer> nums) {
		int index = 0;
		for (Integer i : nums) {
			nums.set(index, (i + 1) * 10);
			index++;
		}
		return nums;
	}

	public List<String> moreY(List<String> strings) {
		int index = 0;
		for (String s : strings) {
			strings.set(index, "y" + s + "y");
			index++;
		}
		return strings;
	}

	public List<String> copies3(List<String> strings) {
		int index = 0;
		for (String s : strings) {
			strings.set(index, s + s + s);
			index++;
		}
		return strings;
	}

	public List<String> addStar(List<String> strings) {
		int index = 0;
		for (String s : strings) {
			strings.set(index, s + "*");
			index++;
		}
		return strings;
	}

	public List<Integer> square(List<Integer> nums) {
		int index = 0;
		for (Integer i : nums) {
			nums.set(index, (int) Math.pow(i, 2));
			index++;
		}
		return nums;
	}

	public List<Integer> doubling(List<Integer> nums) {
		int index = 0;
		for (Integer i : nums) {
			nums.set(index, i * 2);
			index++;
		}
		return nums;
	}


}
