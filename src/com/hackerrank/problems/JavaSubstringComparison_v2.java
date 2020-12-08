package com.hackerrank.problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparison_v2 {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		int start = 0;
		int end = k;
		List<String> list = new LinkedList<>();
		boolean check = true;
		while (check) {
			if (end <= s.length()) {
				list.add(s.substring(start, end));
				start++;
				end++;
			} else {
				check = false;
			}
		}
		smallest = list.get(0);
		largest = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).charAt(0) > largest.charAt(0)) {
				largest = list.get(i);
			} else if (list.get(i).charAt(0) < smallest.charAt(0)) {
				smallest = list.get(i);
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
