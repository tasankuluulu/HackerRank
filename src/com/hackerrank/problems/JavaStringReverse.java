package com.hackerrank.problems;

import java.util.Scanner;

public class JavaStringReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String reverseString = "";
		for (int i = A.length() - 1; i >= 0; i--) {
			reverseString += A.toCharArray()[i];
		}
		if (A.equalsIgnoreCase(reverseString)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scan.close();
	}
}
