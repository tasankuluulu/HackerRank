package com.hackerrank.problems;

import java.util.Scanner;

public class DataTypes_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long num = 0;

		for (int i = 0; i < n; i++) {

			try {

				num = scanner.nextLong();
				System.out.println(num + " can be fitted in:");
				if (num >= -128 && num <= 127) {
					System.out.println("* byte");
				}
				if (num >= Math.pow(-2, 15) && num <= Math.pow(2, 15)) {
					System.out.println("* short");
				}
				if (num >= Math.pow(-2, 31) && num <= Math.pow(2, 31)) {
					System.out.println("* int");
				}
				if (num >= Math.pow(-2, 63) && num <= Math.pow(2, 63)) {
					System.out.println("* long");
				}
			} catch (Exception e) {
				System.out.println(scanner.next() + " can't be fitted anywhere.");
			}
		}
		scanner.close();
	}

}
