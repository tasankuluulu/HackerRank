package com.hackerrank.problems;

import java.util.Scanner;

public class TryCatch_v2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int res;
		try {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			res = num1 / num2;
			System.out.println(res);
		} catch (Exception e) {

			System.out.println(e.getClass().getName());
		}
		scan.close();

	}

}
