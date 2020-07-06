package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class WeightedSumOfDigits {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numOfCases = scanner.nextInt();

		for (int i = 0; i < numOfCases; i++) {
			int num = scanner.nextInt();
<<<<<<< HEAD
=======

>>>>>>> 989a3b8e30c854edadaa41ee48d112b3bf9d9586
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
<<<<<<< HEAD
			System.out.println();
=======

			System.out.println();

>>>>>>> 989a3b8e30c854edadaa41ee48d112b3bf9d9586
		}

		scanner.close();

	}
}
