package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfMultiples {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int length = scan.nextInt();
		int next = num;
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			array.add(next);
			next += num;
		}
		System.out.println(array);

	}
}
