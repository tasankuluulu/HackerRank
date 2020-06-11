package com.hackerrank.problems;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			try {
				long a = scanner.nextLong();
				if (a >= -128 && a <= 127) {
					System.out.println(a + " can be fitted in:");
					System.out.printf("* byte %n" + "* short %n" + "* int %n" + "* long %n");
				} else if (a >= Math.pow(-2, 15) && a <= Math.pow(2, 15)) {
					System.out.println(a + " can be fitted in:");
					System.out.printf("* short %n" + "* int %n" + "* long %n");
				} else if (a >= Math.pow(-2, 31) && a <= Math.pow(2, 31)) {
					System.out.println(a + " can be fitted in:");
					System.out.printf("* int %n" + "* long %n");
				} else if (a >= Math.pow(-2, 63) && a <= Math.pow(2, 63)) {
					System.out.println(a + " can be fitted in:");
					System.out.printf("* byte %n" + "* short %n" + "* int %n" + "* long %n");
				}
			} catch (Exception e) {
				System.out.println(scanner.next() + " can't be fitted anywhere.");
			}
		}
	}
}
