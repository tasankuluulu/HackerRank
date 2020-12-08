package com.hackerrank.problems;

import java.util.Scanner;

public class ModuloAndTimeDifference {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testNum = scan.nextInt();

		for (int i = 0; i < testNum; i++) {
			int day1 = scan.nextInt();
			int hour1 = scan.nextInt();
			int min1 = scan.nextInt();
			int sec1 = scan.nextInt();
			int day2 = scan.nextInt();
			int hour2 = scan.nextInt();
			int min2 = scan.nextInt();
			int sec2 = scan.nextInt();

			long durationOfDay = 24 * 60 * 60;
			long duration1 = day1 * durationOfDay + hour1 * 60 * 60 + min1 * 60 + sec1;
			long duration2 = day2 * durationOfDay + hour2 * 60 * 60 + min2 * 60 + sec2;
			long difference = duration2 - duration1;

			int secFin = (int) difference % 60;
			difference /= 60;
			int minFin = (int) difference % 60;
			difference /= 60;
			int hourFin = (int) difference % 24;
			difference /= 24;
			int dayFin = (int) difference;

			System.out.printf("(%d %d %d %d) ", dayFin, hourFin, minFin, secFin);

		}
		scan.close();
	}
}
