package com.hackerrank.problems;

import java.util.*;

public class TryCatch {
	public static void main(String[] args) {
		int x = 0, y = 0;
		Scanner scanner = new Scanner(System.in);

		try {
			x = scanner.nextInt();
			y = scanner.nextInt();

			if (y != 0) {
				System.out.println(x / y);
			}
		} catch (Exception e) {
			if (y == 0 && x <= 2_147_483_647) {
				System.out.println("java.lang.ArithmeticException: / by zero");
			} else {
				System.out.println("java.util.InputMismatchException");
			}
		}
		scanner.close();
	}

}
