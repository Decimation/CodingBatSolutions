package com.deci.codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CB_Array2 {

	public boolean sum28(int[] nums) {
		int out = 0;
		for (int i : nums) {
			if (i == 2) out += i;
		}

		return out == 8;
	}

	public boolean only14(int[] nums) {
		int c = 0;
		for (int i : nums) {
			if (i == 1 || i == 4) c++;
		}
		return c == nums.length;
	}

	public boolean no14(int[] nums) {
		boolean hasOne = false, hasFour = false;

		for (int i : nums) {
			if (i == 1) hasOne = true;
			if (i == 4) hasFour = true;
		}

		return !hasOne || !hasFour;
	}

	public int countEvens(int[] nums) {
		int evens = 0;
		for (int i : nums)
			if (i % 2 == 0) evens++;
		return evens;
	}

	public int bigDiff(int[] nums) {
		List<Integer> nlist = Arrays.stream(nums).boxed().collect(Collectors.toList());
		int max = Collections.max(nlist);
		int min = Collections.min(nlist);
		return max - min;
	}

	public int sum13(int[] nums) {
		int out = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				if (i + 1 < nums.length)
					i++;
			} else out += nums[i];
		}

		return out;
	}
}
