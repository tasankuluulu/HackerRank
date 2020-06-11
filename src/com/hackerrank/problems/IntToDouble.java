package com.hackerrank.problems;

public class IntToDouble {
	public static void main(String[] args) {
		int i = 14;
		int j = 4;

		double s = 5.8;
		double g = 5.8;
		int result1 = i / j;

		double result2 = (double) i / j;

		int result3 = (int) (s / g);
		double result4 = s / g;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
