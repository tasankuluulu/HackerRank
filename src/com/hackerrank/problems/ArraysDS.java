package com.hackerrank.problems;

import java.util.Scanner;

public class ArraysDS {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantityOfNum = scanner.nextInt();
		int[] array = new int[quantityOfNum];

		for (int i = 0; i < array.length; i++) {
			int num = scanner.nextInt();
			array[i] = num;
		}
		for (int i = 1; i < array.length + 1; i++) {
			System.out.print(array[array.length - i] + " ");
		}
		scanner.close();
	}

}
