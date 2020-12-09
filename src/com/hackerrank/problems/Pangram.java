package com.hackerrank.problems;

import java.util.Arrays;

import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int sum = 0;
		for (int i = 97; i <= 122; i++) {
			sum += i;
		}
		str = str.toLowerCase().replace(" ", "");

		int[] array = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			array[i] = str.charAt(i);
		}

		Arrays.sort(array);
		int sumOfChars = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				continue;
			} else {
				sumOfChars += array[i + 1];
			}
		}

		if (sum == sumOfChars) {
			System.out.println("It is a pangram");
		} else {
			System.out.println("It is not a pangram");
		}

	}
}
