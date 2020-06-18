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
=======
			System.out.println();
>>>>>>> 2ba4b0fe47dac85b28ade8bf6bd27197dee437d5
		}

		scanner.close();

	}
}
