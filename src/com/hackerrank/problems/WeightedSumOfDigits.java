package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class WeightedSumOfDigits {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numOfCases = scanner.nextInt();

		for (int i = 0; i < numOfCases; i++) {
			int num = scanner.nextInt();
			ArrayList<Integer> array = new ArrayList<>();
			int result = 0;

			while (num > 0) {
				int remainder = num % 10;
				array.add(remainder);
				num /= 10;
			}

			for (int x = 0; x < array.size(); x++) {
				int mult = array.get(x) * (array.size() - x);
				result += mult;
			}
			System.out.print(result + " ");

			System.out.println();


			System.out.println();


		}

		scanner.close();

	}
}
