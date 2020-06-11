package com.hackerrank.problems;

import java.lang.Math;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		System.out.printf("%s%n", "How many operations whould you like to enter:");
		Scanner scanner = new Scanner(System.in);
		int numOfOper = scanner.nextInt();

		for (int i = 0; i < numOfOper; i++) {
			double gradusFar = scanner.nextInt();
			double gradusCel = (gradusFar + 40) / 1.8 - 40;
			System.out.print(Math.round(gradusCel) + " ");
		}

		scanner.close();

	}
}
