package com.hackerrank.problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparison {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int num = scan.nextInt();
		List<String> list = new LinkedList<>();
		int start = 0;
		int end = num;

		boolean check = true;
		while (check) {
			if (end <= str.length()) {
				list.add(str.substring(start, end));
				start++;
				end++;
			} else {
				check = false;
			}
		}
		String smallest = list.get(0);
		String largest = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).charAt(0) > largest.charAt(0)) {
				largest = list.get(i);
			} else if (list.get(i).charAt(0) < smallest.charAt(0)) {
				smallest = list.get(i);
			}
		}
		System.out.println(smallest);
		System.out.println(largest);

	}

}
