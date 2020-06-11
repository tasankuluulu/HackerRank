package com.hackerrank.problems;

import java.util.Scanner;

public class ArrayCounters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter M and N values");
		int arrLength = scanner.nextInt();
		int numOfValues = scanner.nextInt();

		int[] array = new int[arrLength];

		for (int i = 0; i < array.length; i++) {
			int num = scanner.nextInt();
			array[i] = num;
		}
		
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0, num10 = 0, num11 = 0, num12 = 0, 
				num13 = 0, num14 = 0, num15 = 0, num16 = 0, num17 = 0, num18 = 0, num19 = 0, num20 = 0;
		
		
		for (int i = 0; i < 20; i++) {
			if (array[i] == 1) {
				num1++;
			} else if (array[i] == 2) {
				num2++;
			} else if (array[i] == 3) {
				num3++;
			} else if (array[i] == 4) {
				num4++;
			} else if (array[i] == 5) {
				num5++;
			} else if (array[i] == 6) {
				num6++;
			} else if (array[i] == 7) {
				num7++;
			} else if (array[i] == 8) {
				num8++;
			} else if (array[i] == 9) {
				num9++;
			} else if (array[i] == 10) {
				num10++;
			} else if (array[i] == 11) {
				num11++;
			} else if (array[i] == 12) {
				num12++;
			} else if (array[i] == 13) {
				num13++;
			} else if (array[i] == 14) {
				num14++;
			} else if (array[i] == 15) {
				num15++;
			} else if (array[i] == 16) {
				num16++;
			} else if (array[i] == 17) {
				num17++;
			} else if (array[i] == 18) {
				num18++;
			} else if (array[i] == 19) {
				num19++;
			} else if (array[i] == 20) {
				num20++;
			}
			System.out.printf("%d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d", num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18, num19, num20);
		}

		scanner.close();

	}

}
