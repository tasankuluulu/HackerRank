package com.hackerrank.problems;

import java.util.Scanner;

public class Triangles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many lines would you like me to check?");
		int numOfLines = scanner.nextInt();

		for (int i = 0; i < numOfLines; i++) {

			int a, b, c;
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();

			if ((a + b) < c || (a + c) < b || (b + c) < a) {
				System.out.print(0 + " ");
			} else {
				System.out.print(1 + " ");
			}
		}

		scanner.close();

	}

}
