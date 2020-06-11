package com.hackerrank.problems;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.printf("%S%n", "How many lines would you like to enter:");
		Scanner scanner = new Scanner(System.in);
		int numOfLines = scanner.nextInt();
		for (int i = 0; i < numOfLines; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			int res = a * b + c;
			int sum = 0;
			int div = 0, remainder = 0;

			div = res / 10;
			remainder = res % 10;
			sum += remainder;

			do {
				remainder = div % 10;
				div /= 10;
				sum += remainder;
			} while (div > 0);
			System.out.printf("%d ", sum);
		}

		scanner.close();

	}

}
