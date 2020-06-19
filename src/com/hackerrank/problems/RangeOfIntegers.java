package com.hackerrank.problems;

import java.util.Scanner;

public class RangeOfIntegers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the start point");
		int startNum = scan.nextInt();

		System.out.println("Please enter the end point");
		int endNum = scan.nextInt();
		int sumOfEven = 0;
		int sumOfOdd = 0;
		for (int i = startNum; i <= endNum; i++) {
			if (i % 2 == 0) {
				sumOfEven += i;
			} else {
				sumOfOdd += i;
			}
		}
		System.out.printf("The sum of even is %d and the sum of odd is %d", sumOfEven, sumOfOdd);
		scan.close();

	}

}

//Write a program that reads a range of integers (start and end point), provided by a user
//and then from that range prints the sum of the even and odd integers.
