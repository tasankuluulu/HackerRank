package com.hackerrank.problems;

import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfCases = scan.nextInt();

		for (int i = 0; i < numOfCases; i++) {
			int num = scan.nextInt();
			int counter = 0;
			do {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = 3 * num + 1;
				}
				counter++;
			} while (num != 1);

			System.out.print(counter + " ");
		}

		scan.close();

	}

}
