package com.hackerrank.problems;

import java.util.Scanner;

import java.lang.Math;

import java.util.ArrayList;

public class AvarageOfSeverealArrays {
	public static void main(String[] args) {
		int num = 0;
		int i = 0;
		int n = 1;
		System.out.println("How many line do you like to enter:");
		Scanner scanner = new Scanner(System.in);
		int numOfLines = scanner.nextInt();

		for (i = 0; i < numOfLines; i++) {
			ArrayList<Integer> array = new ArrayList<>();
			int sum = 0;
			int x = 0;
			do {
				num = scanner.nextInt();
				array.add(num);
				sum += array.get(x);
				x++;
			} while (num > 0);
			double avg = (double) sum / (array.size() - 1);
			System.out.print(Math.round(avg) + " ");

		}
		scanner.close();
	}
}
