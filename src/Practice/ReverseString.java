package Practice;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str = scan.next();
			String reverse = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				reverse += str.charAt(i);
			}
			System.out.print(reverse + " ");
		}
		scan.close();
	}
}
