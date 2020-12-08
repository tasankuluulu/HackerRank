package com.hackerrank.problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		scan.nextLine();
		List<String> list = new LinkedList<>();
		for (int i = 0; i < cases; i++) {
			String str = scan.nextLine();
			str = str.toLowerCase().replaceAll("[^a-z]", "");
			list.add(str);
		}

		for (int n = 0; n < list.size(); n++) {
			String reverseStr = "";
			for (int j = list.get(n).length() - 1; j >= 0; j--) {
				reverseStr += list.get(n).charAt(j);
			}

			if (list.get(n).equals(reverseStr)) {
				System.out.print("Y ");
			} else {
				System.out.print("N ");
			}
		}

		scan.close();
	}

}
