package com.hackerrank.problems;

import java.util.*;

public class Arrays {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(array[0]);
		System.out.println(array[4]);
		int len = array.length;
		String str = "Example";
		System.out.println(len);
		int len2 = str.length();
		System.out.println(len2);
		int[] scores = new int[10];
		System.out.println(scores[3]);
		scores[0] = 5;
		System.out.println(scores[0]);

		int[] scores2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.print(scores2[0] + " ");
		System.out.print(scores2[1] + " ");
		System.out.print(scores2[2] + " ");
		System.out.print(scores2[3] + " ");
		System.out.print(scores2[4] + " ");
		System.out.print(scores2[5] + " ");
		System.out.print(scores2[6] + " ");
		System.out.print(scores2[7] + " ");
		System.out.print(scores2[8] + " ");
		System.out.print(scores2[9] + " ");

		System.out.println("\n");
		int sum = 0;

		int[] scores3 = new int[10];
		System.out.print(scores3[3]);
		scores3[0] = 1;
		System.out.println("\n");
		System.out.println(scores3[0]);

		for (int index = 0; index < scores.length; index++) {
			System.out.print(scores2[index] + " ");
		}
		System.out.println("\n");
		for (int index = scores2.length - 1; index >= 0; index--) {
			System.out.print(scores2[index] + " ");
		}
		for (int index = 0; index < scores2.length; index++) {
			sum += scores2[index];
		}
		System.out.print("\n");
		System.out.println(sum);

		int max = scores2[0];
		int min = scores[0];

		for (int index = 0; index < scores2.length; index++) {
			if (scores2[index] > max) {
				max = scores2[index];
			}
			if (scores2[index] < min) {
				min = scores2[min];
			}
			System.out.println("\n\nThe maximum number in the Array is " + max);
			System.out.println("\nThe minimum number in the Array is " + min);
			System.out.println("\n");
		}
		numbers.close();

	}

}
