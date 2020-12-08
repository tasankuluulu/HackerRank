package com.hackerrank.problems;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String listOfWords = scan.nextLine();

		for (int i = 1; i <= listOfWords.length(); i++) {
			System.out.print(listOfWords.charAt(listOfWords.length() - i));
		}

		scan.close();
	}
}
