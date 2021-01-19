package com.hackerrank.problems;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		boolean isPalindrome = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isPalindrome = false;
			}
		}
		System.out.println(isPalindrome);
	}
}
