package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class SumInLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sets = scan.nextInt();
		int total = 0;
		for (int i = 0; i < sets; i++) {
			int num = scan.nextInt();
			total += num;
		}
		System.out.println(total);
		scan.close();
	}

}
