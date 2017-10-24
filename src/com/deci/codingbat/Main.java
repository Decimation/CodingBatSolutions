package com.deci.codingbat;

public class Main {

    public static void main(String[] args) {

		CB_String1 cb = new CB_String1();
		System.out.println(cb.lastTwo("coding"));


		int methodCount = 0;
		methodCount += getMethodCount(CB_AP1.class);
		methodCount += getMethodCount(CB_Functional1.class);
		methodCount += getMethodCount(CB_Functional2.class);
		methodCount += getMethodCount(CB_Logic1.class);
		methodCount += getMethodCount(CB_Map1.class);
		methodCount += getMethodCount(CB_Recursion1.class);
		methodCount += getMethodCount(CB_Recursion2.class);
		methodCount += getMethodCount(CB_Warmup1.class);

		System.out.println(methodCount);
	}

	private static int getMethodCount(Class clazz) {
    	return clazz.getDeclaredMethods().length;
	}
}
