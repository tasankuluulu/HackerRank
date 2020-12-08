package com.hackerrank.problems;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequenceVer2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sets = scan.nextInt();

		BigDecimal num1 = new BigDecimal(0);
		BigDecimal num2 = new BigDecimal(1);
		BigDecimal sum;
		ArrayList<BigDecimal> array = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			array.add(num1);
			sum = num1.add(num2);
			num1 = num2;
			num2 = sum;
		}

		for (int i = 0; i < sets; i++) {
			BigDecimal num = scan.nextBigDecimal();
			int index = 0;
			int equality;
			for (BigDecimal element : array) {
				equality = num.compareTo(element);
				if (equality == 0) {
					break;
				} else {
					index++;
				}
			}
			System.out.print(index + " ");
		}
	}

}
