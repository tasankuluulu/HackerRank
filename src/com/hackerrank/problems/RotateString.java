package com.hackerrank.problems;

import java.util.Scanner;

public class RotateString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			int index = scan.nextInt();
			String str = scan.next();
			if (index > 0) {
				str = str.substring(index) + str.substring(0, index);
			} else {
				str = str.substring(str.length() - Math.abs(index)) + str.substring(0, str.length() - Math.abs(index));
			}
			System.out.print(str + " ");
		}

		scan.close();
	}
}
