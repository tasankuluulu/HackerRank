package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class SameParity {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int n;

		ArrayList<Integer> array = new ArrayList<>();
		do {
			n = num % 10;
			num = num / 10;
			array.add(n);
			} while(num > 0);
						
		int sum = 0;
		for (int i = 0; i < array.size(); i++) {
			sum += array.get(i);
		}
		if ((sum % 2 == 0 && num % 2 == 0) || (sum % 2 != 0 && num % 2 != 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		scan.close();

	}

}
