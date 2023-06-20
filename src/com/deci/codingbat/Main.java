package com.deci.codingbat;

import java.util.ArrayList;

import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {


		CB_Logic2 cb = new CB_Logic2();
		System.out.println(cb.round10(15));
		System.out.println(cb.round10(12));
		System.out.println(cb.round10(20));
		System.out.println(cb.round10(17));




	}

	private static int getMethodCount(Class clazz) {
		return clazz.getDeclaredMethods().length;
	}
}
