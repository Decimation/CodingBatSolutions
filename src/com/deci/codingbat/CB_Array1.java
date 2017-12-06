package com.deci.codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@SuppressWarnings({"unused", "WeakerAccess"})

public class CB_Array1 {

	public CB_Array1() {
	}

	public int[] front11(int[] a, int[] b) {

		if (a.length == 0 && b.length == 0) return new int[]{};
		if (a.length == 1 && b.length == 1) return new int[]{a[0], b[0]};
		if (a.length == 0) return new int[]{b[0]};
		if (b.length == 0) return new int[]{a[0]};

		return new int[]{a[0], b[0]};
	}

	/**
	 * This question made no sense lol
	 */
	public int[] make2(int[] a, int[] b) {
		int[] myArray = new int[2];
		final int aLen = a.length;
		final int bLen = b.length;

		if (aLen == 0) {
			myArray[0] = b[0];
			myArray[1] = b[1];
			return myArray;
		} else if (aLen == 1 && bLen == 1) {
			myArray[0] = a[0];
			myArray[1] = b[0];
			return myArray;
		} else if (aLen == 1) {
			myArray[0] = a[0];
			myArray[1] = b[0];
			return myArray;
		} else {
			myArray[0] = a[0];
			myArray[1] = a[1];
			return myArray;
		}
	}

	public boolean unlucky1(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if ((i + 1 != nums.length) && (i <= 1 || i == nums.length - 2) && (nums[i] == 1) && (nums[i + 1] == 3))
				return true;
		}
		return false;
	}

	public int[] frontPiece(int[] nums) {
		return (nums.length <= 2) ? nums : new int[]{nums[0], nums[1]};
	}

	public int maxTriple(int[] nums) {
		final int length = nums.length / 2;
		int[] coll = new int[]{nums[0], nums[length], nums[nums.length - 1]};
		return Collections.max(Arrays.asList(coll[0], coll[1], coll[2]));
	}

	public int[] midThree(int[] nums) {
		final int length = nums.length / 2;
		return new int[]{nums[length - 1], nums[length], nums[length + 1]};
	}

	public int[] swapEnds(int[] nums) {
		final int lastE = nums[nums.length - 1];
		final int startE = nums[0];

		nums[0] = lastE;
		nums[nums.length - 1] = startE;
		return nums;
	}

	public int[] plusTwo(int[] a, int[] b) {
		return new int[]{a[0], a[1], b[0], b[1]};
	}

	public int[] makeMiddle(int[] nums) {
		final int length = nums.length / 2;
		return new int[]{nums[length - 1], nums[length]};
	}

	public int[] biggerTwo(int[] a, int[] b) {
		int aSum = 0, bSum = 0;

		for (int value : a) {
			aSum += value;
		}
		for (int value : b) {
			bSum += value;
		}

		return (aSum >= bSum) ? a : b;
	}

	private <T> boolean isNull(int[] array) {
		return (array.length == 0);
	}

	public int start1(int[] a, int[] b) {
		int hasOnes = 0;
		if (!isNull(a) && a[0] == 1) hasOnes++;
		if (!isNull(b) && b[0] == 1) hasOnes++;
		return hasOnes;
	}

	public int[] fix23(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 && nums[i + 1] == 3) nums[i + 1] = 0;
		}
		return nums;
	}

	public boolean double23(int[] nums) {
		int occur_2 = 0, occur_3 = 0;
		for (int i : nums) {
			if (i == 2) occur_2++;
			if (i == 3) occur_3++;
			if (occur_2 == 2 || occur_3 == 2) return true;
		}
		return false;
	}

	public int[] makeLast(int[] nums) {
		int[] ret = new int[nums.length * 2];
		ret[ret.length - 1] = nums[nums.length - 1];
		return ret;
	}

	public boolean no23(int[] nums) {
		return new ArrayList<>(Arrays.asList(nums[0], nums[1])).stream().noneMatch(x -> x == 2 || x == 3);
	}

	public boolean has23(int[] nums) {
		return new ArrayList<>(Arrays.asList(nums[0], nums[1])).stream().anyMatch(x -> x == 2 || x == 3);
	}

	public int[] makeEnds(int[] nums) {
		return new int[]{nums[0], nums[nums.length - 1]};
	}

	public int[] middleWay(int[] a, int[] b) {
		return new int[]{a[1], b[1]};
	}

	public int sum2(int[] nums) {
		if (nums.length == 0) return 0;
		if (nums.length == 1) return nums[0];
		return nums[0] + nums[1];
	}

	public int[] maxEnd3(int[] nums) {
		final int max;
		if (nums[0] > nums[nums.length - 1]) max = nums[0];
		else max = nums[nums.length - 1];
		return new int[]{max, max, max};
	}

	public int[] reverse3(int[] nums) {
		return new int[]{nums[2], nums[1], nums[0]};
	}

	public int[] rotateLeft3(int[] nums) {
		return new int[]{nums[1], nums[2], nums[0]};
	}

	public int sum3(int[] nums) {
		int out = 0;
		for (int i : nums)
			out += i;
		return out;
	}

	public boolean commonEnd(int[] a, int[] b) {
		return a[a.length - 1] == b[b.length - 1] || a[0] == b[0];
	}

	public int[] makePi() {
		return new int[]{3, 1, 4};
	}

	public boolean sameFirstLast(int[] nums) {
		return !(nums.length == 0) && (nums[nums.length - 1] == nums[0]);
	}

	public boolean firstLast6(int[] nums) {
		return (nums[nums.length - 1] == 6 || nums[0] == 6);
	}

}
