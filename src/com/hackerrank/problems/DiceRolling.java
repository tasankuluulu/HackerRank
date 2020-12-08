package com.hackerrank.problems;

import java.util.Scanner;

public class DiceRolling {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many number do you want to enter?");
		int quanOfNum = scan.nextInt();

		for (int i = 0; i < quanOfNum; i++) {
			double num = scan.nextDouble();
			int result = (int) (num * 6) + 1;
			System.out.printf("%d ", result);
		}

		scan.close();
	}

}
