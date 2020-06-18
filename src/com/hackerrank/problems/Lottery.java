package com.hackerrank.problems;

import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean askQuestion = true;
		System.out.println("Please enter any number from 1 to 20");

		while (askQuestion) {

			try {

				int num = scanner.nextInt();
				if (num < 1 || num > 20) {
					System.err.println("Please enter any number from 1 to 20 only! Enter one more time.");
				} else if (num == 17) {
					System.out.println("Congrats, you won!");
					askQuestion = false;
				} else {
					System.out.println("Try one more time!");
				}
			} catch (Exception e) {
				System.err.println("Invalid input. Enter any number from 1 to 20 only! Enter one more time.");
				String str = scanner.next();
			}
		}
		scanner.close();

	}

}
