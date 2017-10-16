package com.deci.codingbat.Recursion1;

@SuppressWarnings({"WeakerAccess", "unused"})

public class CB_Recursion1 {

	public CB_Recursion1() {
	}

	public String changePi(String str) {
		return str.replace("pi", "3.14");
	}

	public String noX(String str) {
		return str.replace("x", "");
	}

	public boolean array6(int[] nums, int index) {
		for (int i : nums) {
			if (i == 6) return true;
		}
		return false;
	}

	public int array11(int[] nums, int index) {
		int occurrences = 0;
		for (int i : nums) {
			if (i == 11) occurrences++;
		}
		return occurrences;
	}

	public boolean array220(int[] nums, int index) {
		if (index >= nums.length - 1) return false;
		if (nums[index + 1] == nums[index] * 10) return true;
		return array220(nums, index + 1);
	}

	public String allStar(String str) {
		if (str.equals("") || str.length() == 1) return str;
		return str.charAt(0) + "*" + allStar(str.substring(1));
	}
}
