package com.hackerrank.problems;

import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		System.out.printf("%S%n", "How many lines would you like to enter:");
		Scanner scanner = new Scanner(System.in);
		int numOfLines = scanner.nextInt();
		String str = scanner.nextLine();

		for (int i = 0; i < numOfLines; i++) {
			String str2 = scanner.nextLine();
			char[] array = str2.toCharArray();
			int num = array.length;
			int sum = 0;
			for (int x = 0; x < num; x++) {
				if (array[x] == 'a' || array[x] == 'o' || array[x] == 'u' || array[x] == 'i' || array[x] == 'e'
						|| array[x] == 'y') {
					sum++;
				}

			}
			System.out.printf("%d ", sum);

		}
		
		scanner.close();
	}
}