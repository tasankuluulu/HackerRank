package com.hackerrank.problems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sets = scan.nextInt();
		for (int i = 0; i < sets; i++) {
			double startAmount = scan.nextInt();
			double reqSum = scan.nextInt();
			double interest = scan.nextInt();
			double total = 0;
			int yearsCount = 0;
			DecimalFormat df = new DecimalFormat("#.##");

			while (total < reqSum) {
				total = startAmount + (startAmount / 100) * interest;
				total = Double.parseDouble(df.format(total));
				yearsCount++;
				startAmount = total;
			}

			System.out.print(yearsCount + " ");
		}

	}

}
