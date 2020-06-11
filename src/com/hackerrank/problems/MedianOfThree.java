package com.hackerrank.problems;

import java.util.Scanner;

public class MedianOfThree {
	public static void main(String[] args) {
		System.out.printf("%S:%n", "How many lines would you like to enter");
		Scanner scanner = new Scanner(System.in);
		int numOfLines = scanner.nextInt();

		for (int i = 0; i < numOfLines; i++) {
			int num1, num2, num3;
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			num3 = scanner.nextInt();

			if ((num1 >= num2 && num1 <= num3) || (num1 >= num3 && num1 <= num2)) {
				System.out.print(num1 + " ");
			} else if ((num2 >= num3 && num2 <= num1) || (num2 >= num1 && num2 <= num3)) {
				System.out.print(num2+ " ");
			} else {
				System.out.print(num3+ " ");
			}
		}

		scanner.close();

	}
}
