package com.hackerrank.problems;

public class BreakingTheRecords {

	static int[] breakingRecords(int[] scores) {
		int[] breakingRecords = new int[2];
		int max = scores[0];
		int min = scores[0];
		int breakingHighest = 0, breakingLowest = 0;
		for (int i = 1; i < scores.length; i++) {
			if (max < scores[i]) {
				breakingHighest++;
				max = scores[i];
			} else if (min > scores[i]) {
				breakingLowest++;
				min = scores[i];
			}
		}
		breakingRecords[0] = breakingHighest;
		breakingRecords[1] = breakingLowest;
		return breakingRecords;
	}

	public static void main(String[] args) {
		int[] scores = { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };
		int[] breakingRecords = breakingRecords(scores);
		for(int score:breakingRecords) {
			System.out.print(score + " ");
		}
	}
}
