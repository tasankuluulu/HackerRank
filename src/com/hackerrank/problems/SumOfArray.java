package com.hackerrank.problems;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("How many numbers do you want to enter:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			int num = scanner.nextInt();
			array[i] = num;
		}
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("The sum of array is " + sum);
		scanner.close();
	}
}
