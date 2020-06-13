package com.hackerrank.problems;

import java.util.Scanner;

public class ArrayCounters {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numQuantity = scanner.nextInt();
		int numVariety = scanner.nextInt();
		int[] array = new int[numVariety];

		for (int i = 0; i < numQuantity; i++) {
			int num = scanner.nextInt();
			array[num - 1] += 1;
		}
		for (int i = 0; i < numVariety; i++) {
			System.out.print(array[i] + " ");
		}

		scanner.close();
	}
}
