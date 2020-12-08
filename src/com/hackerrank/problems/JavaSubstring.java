package com.hackerrank.problems;

import java.util.Scanner;

public class JavaSubstring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int start = scan.nextInt();
		int end = scan.nextInt();
		System.out.println(str.substring(start, end));
	}

}
