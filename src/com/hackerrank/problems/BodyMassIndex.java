package com.hackerrank.problems;

import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many lines to check?");
		int numOfLines = scanner.nextInt();

		for (int i = 0; i < numOfLines; i++) {

			double weight = scanner.nextDouble();
			double height = scanner.nextDouble();
			double index = weight / Math.pow(height, 2);

			if (index < 18.5) {
				System.out.print("under ");
			} else if (index >= 18.5 && index < 25) {
				System.out.print("normal ");
			} else if (index >= 25 && index < 30) {
				System.out.print("over ");
			} else {
				System.out.print("obese ");
			}

		}
		scanner.close();
	}
}
