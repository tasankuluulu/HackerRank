package com.hackerrank.problems;

import java.util.Scanner;

public class MaximumOfArray {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int n = 300;
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			array[i] = num.nextInt();
		}
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++)
		{
			if (max < array[i])
			{
				max = array[i];
			}
			if (min > array[i])
			{
				min = array[i];
			}
	}
		System.out.println(max + " " + min);
		num.close();
	}
	
}



