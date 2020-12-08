package com.hackerrank.problems;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int caseNum = scan.nextInt();

		for (int i = 0; i < caseNum; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int temp1 = num1;
			int temp2 = num2;

			do {
				if (temp1 < temp2) {
					temp2 -= temp1;
				} else {
					temp1 -= temp2;
				}
			} while (temp1 != temp2);

			int lcm = num1 * num2 / temp1;
			System.out.printf("(%d %d) ", temp1, lcm);
		}
		scan.close();
	}
}
