package com.hackerrank.problems;

import java.util.Scanner;

public class SortWithIndexes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		int[] array2 = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}

		boolean compare = true;

		while (compare) {
			compare = false;
			int temp = 0;
			for (int i = 0; i < array2.length - 1; i++) {
				if (array2[i] > array2[i + 1]) {
					temp = array2[i];
					array2[i] = array2[i + 1];
					array2[i + 1] = temp;
					compare = true;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array2[i] == array[j]) {
					System.out.print(j + 1 + " ");
				}
			}

		}

		scan.close();
	}

}
