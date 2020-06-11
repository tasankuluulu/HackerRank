package com.hackerrank.problems;

import java.util.Scanner;

public class MedianOfThreeAnotherWay {
	public static void main(String[] args) {
		System.out.printf("%S:%n", "How many lines would you like to enter");
		Scanner scanner = new Scanner(System.in);
		int numOfLines = scanner.nextInt();

		for (int i = 0; i < numOfLines; i++) {
			int num1, num2, num3;
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			num3 = scanner.nextInt();

			int a = num1;
			int b = num2;
			int c = num3;

			if (num1 > num2) {
				a = num2;
				b = num1;
			}
			if (b > c) {
				b = num3;
				c = num2;
			}
			if (a > b) {
				System.out.print(a + " ");
			} else {
				System.out.print(b + " ");
			}
		}
		scanner.close();
	}
}
