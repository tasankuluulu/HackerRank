package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String numbers = scan.nextLine();
		String[] array = numbers.split(" ");
		int[] arrayOfNum = new int[array.length - 1];
		for (int i = 0; i < array.length - 1; i++) {
			arrayOfNum[i] = Integer.parseInt(array[i]);
		}
		int temp;
		int count = 0;
		for (int i = 0; i < arrayOfNum.length - 1; i++) {
			if (arrayOfNum[i] > arrayOfNum[i + 1]) {
				temp = arrayOfNum[i + 1];
				arrayOfNum[i + 1] = arrayOfNum[i];
				arrayOfNum[i] = temp;
				count++;
			}

		}
		long result = 0;
		int seed = 113;
		int modulo = 10000007;
		for (int i = 0; i < arrayOfNum.length; i++) {
			result = (result + arrayOfNum[i]) * seed;
			if (result > modulo) {
				result %= modulo;
			}
		}
		System.out.println(count + " " + result);

		scan.close();
	}
}
