package com.hackerrank.problems;

import java.util.Scanner;

public class ArrayChecksum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many elemets would be in an array?");
		int arrayLength = scan.nextInt();
		int[] array = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			array[i] = scan.nextInt();
		}
		long result = 0;
		int seed = 113;
		int modulo = 10000007;
		for (int i = 0; i < arrayLength; i++) {
			result = (result + array[i]) * seed;
			if (result > modulo) {
				result %= modulo;
			}
		}
		System.out.println(result);

		scan.close();
	}

}
