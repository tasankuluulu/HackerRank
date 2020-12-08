package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quantity = scan.nextInt();
		int step = scan.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		int num = 1;
		for (int i = 0; i < quantity; i++) {
			array.add(num);
			num++;
		}
		int count = 0;
		for (int i = 0; i < array.size(); i++) {
			count++;
			if (count == 3) {
				array.remove(i);
				i--;
				count = 0;
			} else if (i == (array.size() - 1)) {
				i = -1;
			}
		}
		System.out.println(array);
	}
}
