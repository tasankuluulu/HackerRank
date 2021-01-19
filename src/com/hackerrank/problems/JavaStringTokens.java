package com.hackerrank.problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaStringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] array = s.split("[!?.,_'@ ]");
		List<String> list = new LinkedList<>();
		for (int i = 0; i < array.length; i++) {
			if (!array[i].isEmpty()) {
				list.add(array[i]);
			}
		}
		System.out.println(list.size());
		for (String element : list) {
			System.out.println(element);
		}
		scan.close();
	}
}
