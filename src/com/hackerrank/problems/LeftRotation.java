package com.hackerrank.problems;

import java.util.Scanner;

public class LeftRotation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[scan.nextInt()];
		int numRoration = scan.nextInt();
		
		for (int i  = 0; i < array.length; i ++) {
			array[i] = scan.nextInt();
		}
//		for (int i = numRoration; i < array.length + numRoration; i++) {
//			array[] ;
//		}
		
		scan.close();
	}

}
