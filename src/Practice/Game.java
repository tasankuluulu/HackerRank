package Practice;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rightAnswers = 0;
		int incorrectAnswers = 0;
		for (int i = 0; i < 4; i++) {
			int x = (int) (Math.random() * 10);
			int y = (int) (Math.random() * 10);
			System.out.println(x + " +  " + y + " = ?");
			int answer = scan.nextInt();
			if (x + y == answer) {
				rightAnswers++;
				System.out.println("Correct");
			} else {
				incorrectAnswers++;
				System.err.println("Not correct");
			}

		}
		System.out.println("Right answers = " + rightAnswers);
		System.out.println("Incorrect answers = " + incorrectAnswers);
		scan.close();
	}

}
