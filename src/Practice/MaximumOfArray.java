package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < 300; i++) {
			int num = scan.nextInt();
			array.add(num);
		}
		int max = array.get(0);
		int min = array.get(0);
		for (int i = 1; i < array.size(); i++) {
			if (max < array.get(i)) {
				max = array.get(i);
			} else if (min > array.get(i)) {
				min = array.get(i);
			}
		}

		System.out.println(max + " " + min);

		scan.close();
	}

}
