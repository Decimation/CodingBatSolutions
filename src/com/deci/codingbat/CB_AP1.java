package com.deci.codingbat;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})

public class CB_AP1 {

	public CB_AP1() {
	}

	public boolean scoresIncreasing(int[] scores) {
		boolean match = false;
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i + 1] >= scores[i])
				match = true;
			else
				return false;
		}
		return match;
	}

	public boolean scores100(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			if (i + 1 != scores.length) {
				if (scores[i] == nextElement(scores, i)) {

					return true;
				}
			}
		}
		return false;
	}

	// fug
	public boolean scoresClump(int[] scores) {
		final byte difMax = 2;
		final byte difMin = 1;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == scores[i + 1] + difMin || scores[i] == scores[i + 1] + difMax) {
				continue;
			}
			if (scores[i] == scores[i + 2] + difMin || scores[i] == scores[i + 2] + difMax) {
				continue;
			}
			//if (scores.length <= 3) return true;
			if (scores[i] == scores[i + 3] + difMin || scores[i] == scores[i + 3] + difMax) {
				return true;
			}
		}
		return false;
	}

	public int[] copyEndy(int[] nums, int count) {
		List<Integer> buffer = new ArrayList<Integer>();

		for (int i : nums) {
			if (count == 0) {
				return primitiveCpy(buffer);
			}
			if (isEndy(i)) {
				buffer.add(i);
				count--;
			}
		}

		return primitiveCpy(buffer);
	}

	private int[] primitiveCpy(List<Integer> i) {
		int[] buffer = new int[i.size()];

		for (int a = 0; a < buffer.length; a++) {
			buffer[a] = i.get(a);
		}

		return buffer;
	}

	private boolean isEndy(int n) {
		if (10 >= n && n >= 0) {
			return true;
		}
		if (100 >= n && n >= 90) {
			return true;
		}
		return false;
	}

	private int nextElement(int[] array, int index) {
		return array[++index];
	}

	public int scoresAverage(int[] scores) {
		int split = scores.length / 2;
		int s1 = average(scores, 0, split);
		int s2 = average(scores, split, scores.length);

		if (s1 > s2) return s1;
		if (s2 > s1) return s2;
		return -1;
	}

	private int average(int[] scores, int start, int end) {
		int avg = 0;
		for (int i = start; i < end; i++) {
			avg += scores[i];
		}

		return avg / (end - start);
	}

	public int wordsCount(String[] words, int count) {
		int matches = 0;
		for (String s : words) {
			int charCount = s.toCharArray().length;
			if (charCount == count) {
				matches++;
			}
		}

		return matches;
	}

	public String[] wordsFront(String[] words, int n) {
		String[] out = new String[n];
		for (int i = 0; i < n; i++) {
			out[i] = words[i];
		}
		return out;
	}

	public List wordsWithoutList(String[] words, int len) {
		List<String> out = new ArrayList<String>();

		for (String s : words) {
			if (s.toCharArray().length != len) {
				out.add(s);
			}
		}

		return out;
	}

	public boolean hasOne(int n) {
		String split = Integer.toString(n);
		return split.contains(Integer.toString(1));
	}

	public boolean dividesSelf(int n) {
		return isPrime(n);
	}

	private boolean isPrime(int n) {
		int tmp = n;
		if (n % 10 == 0)
			return false;
		while (n != 0) {
			if (tmp % (n % 10) != 0)
				return false;
			n /= 10;
		}

		return true;
	}

}
