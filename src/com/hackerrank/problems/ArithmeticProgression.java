package com.hackerrank.problems;

import java.util.Scanner;

public class ArithmeticProgression {
	public static void main(String[] args) {
		System.out.printf("%S:%n", "how many lines do you want to enter");
		Scanner scanner = new Scanner(System.in);
		int numOfLines = scanner.nextInt();

		for (int i = 0; i < numOfLines; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();
			int sum = 0;

			for (int x = 0; x < n - 1; x++) {
				int res = a + b * (x + 1);
				sum += res;
			}
			System.out.printf("%d ", (a + sum));
		}

		scanner.close();

	}
}
