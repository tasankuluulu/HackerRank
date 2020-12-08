package com.hackerrank.problems;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[scan.nextInt()];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		int temp, passCount = 0, swapCount = 0;
		boolean pass = true;
		while (pass) {
			pass = false;
			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] > array[i + 1]) {
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
					swapCount++;
					pass = true;
				}

			}
			passCount++;
		}
		System.out.println(passCount + " " + swapCount);
		scan.close();
	}

}
