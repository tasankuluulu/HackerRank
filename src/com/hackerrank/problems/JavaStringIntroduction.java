package com.hackerrank.problems;

import java.util.Scanner;

public class JavaStringIntroduction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		System.out.println(str1.length() + str2.length());
		String check;
		if (str1.charAt(0) > str2.charAt(0)) {
			check = "Yes";
		} else {
			check = "No";
		}
		System.out.println(check);
		str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
		str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
		System.out.println(str1 + " " + str2);
	}

}
