package com.hackerrank.problems;

import java.lang.Math;

import java.util.Scanner;

public class Rounding {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.printf("%s", "How many lines would you like to enter:");
		int numOfLines = num.nextInt();

		for (int i = 0; i < numOfLines; i++) {
			int num1 = num.nextInt();
			int num2 = num.nextInt();
			double res = (double) num1 / num2;
			System.out.printf("%d ", Math.round(res));
		}
		num.close();
	}
}
