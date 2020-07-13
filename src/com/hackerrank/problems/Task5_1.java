package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0:");

		ArrayList<Integer> array = new ArrayList<>();
		boolean takeNumber = true;
		int i = -1;

		do {
			array.add(scan.nextInt());
			i++;
		} while (array.get(i) != 0);

		int posCount = 0, negCount = 0;
		double sum = 0;
		for (int j = 0; j < array.size() - 1; j++) {
			sum += array.get(j);
			if (array.get(j) > 0) {
				posCount++;
			} else {
				negCount++;
			}
		}

		if (array.get(0) == 0) {
			System.out.println("No numbers are entered except 0");
		} else {
			System.out.printf("The number of positives is %d%n", posCount);
			System.out.printf("The number of negatives is %d%n", negCount);
			System.out.printf("The total is %.2f%n", sum);
			System.out.printf("The average is %.2f%n", sum / (array.size() - 1));
		}
		scan.close();
	}

}
