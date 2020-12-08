package com.hackerrank.problems;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigDecimal num1 = new BigDecimal(2);
		BigDecimal num2 = new BigDecimal(1);
		
		
		
		List<BigDecimal> numbers = new LinkedList<>();
		numbers.add(num1);
		numbers.add(num2);

		for (int n = 2; n < 1000; n++) {
			BigDecimal sum = new BigDecimal(0);
			sum.add(num1);
			sum.add(num2);
			numbers.add(sum);
			num1 = num2;
			num2 = sum;
		}
		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++) {
			BigDecimal inputNum = scan.nextBigDecimal();

			for (int j = 0; j < numbers.size(); j++) {
				if (inputNum == numbers.get(j)) {
					System.out.print(numbers.indexOf(inputNum) + " ");
				}
			}

		}
		scan.close();
	}

}
