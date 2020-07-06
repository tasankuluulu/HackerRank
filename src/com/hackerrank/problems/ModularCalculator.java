package com.hackerrank.problems;

import java.math.BigDecimal;
import java.util.Scanner;

public class ModularCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigDecimal num = scan.nextBigDecimal();
		String sign;
		BigDecimal result = num;
		BigDecimal nextNum;

		do {
			sign = scan.next();
			nextNum = scan.nextBigDecimal();

			if (sign.equals("+")) {
				result = result.add(nextNum);
			} else if (sign.equals("*")) {
				result = result.multiply(nextNum);
			} else {
				result = result.remainder(nextNum);
				break;
			}
		} while (!sign.equals("%"));

		System.out.println(result);
		scan.close();
	}
}
