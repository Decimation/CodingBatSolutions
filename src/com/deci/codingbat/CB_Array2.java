package com.deci.codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CB_Array2 {

	public int[] shiftLeft(int[] nums) {
		if (nums.length == 0) return nums;
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length - 1; i++) {
			arr[i] = nums[i + 1];
		}
		arr[arr.length - 1] = nums[0];
		return arr;
	}

	public int[] zeroMax(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				int x = i;
				int max = 0x0;
				while (x < nums.length) {

					if (nums[x] % 2 != 0) {
						if (nums[x] > max)
							max = nums[x];
						nums[i] = max;
					}

					x++;
				}
			}
		}
		return nums;
	}

	public boolean has77(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i + 1 < nums.length && nums[i] == 7 && nums[i + 1] == 7)
				return true;
			if (i + 2 < nums.length && nums[i] == 7 && nums[i + 2] == 7)
				return true;
		}
		return false;
	}

	public int[] fizzArray3(int start, int end) {
		int[] out = new int[end - start];
		for (int i = 0; i < out.length; i++)
			out[i] = i + start;
		return out;
	}

	public boolean tripleUp(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (i < nums.length - 2) {
				int i1 = nums[i];
				int i2 = nums[i + 1];
				int i3 = nums[i + 2];
				if (i1 == i2 - 1 && i2 == i3 - 1) return true;
			}
		}
		return false;
	}

	public int[] post4(int[] nums) {
		ArrayList<Integer> il = new ArrayList<>();
		boolean post = false;
		for (int i : nums) {
			if (post)
				il.add(i);
			if (i == 4) post = true;

		}
		return il.stream().mapToInt(i -> i).toArray(); // ridiculous that we have to do this lol
	}

	public boolean isEverywhere(int[] nums, int val) {
		boolean result = true;
		for (int i = 0; i <= nums.length - 2; i++) {
			if (nums[i] != val && nums[i + 1] != val)
				result = false;
		}
		return result;
	}

	public int sum67(int[] nums) {
		int sum = 0;
		boolean ignore = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) ignore = true;

			if (!ignore)
				sum += nums[i];
			if (nums[i] == 7) ignore = false;
		}
		return sum;
	}

	public String[] fizzArray2(int n) {
		String[] out = new String[n];
		for (int i = 0; i < n; i++)
			out[i] = i + "";
		return out;
	}

	public boolean has22(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				if (i - 1 > 0 && nums[i - 1] == 2) return true;
				if (i + 1 < nums.length && nums[i + 1] == 2) return true;
			}

		}
		return false;

	}

	public boolean lucky13(int[] nums) {
		boolean noOne = true, noThree = true;
		for (int i : nums) {
			if (i == 1) noOne = false;
			if (i == 3) noThree = false;
		}
		return noOne && noThree;
	}


	public boolean more14(int[] nums) {
		int oneC = 0, fourC = 0;
		for (int i : nums) {
			if (i == 1) oneC++;
			if (i == 4) fourC++;
		}
		return oneC > fourC;
	}

	public int[] fizzArray(int n) {
		int[] out = new int[n];
		for (int i = 0; i < n; i++)
			out[i] = i;
		return out;
	}

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
