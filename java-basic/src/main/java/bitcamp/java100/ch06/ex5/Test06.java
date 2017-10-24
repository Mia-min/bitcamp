package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Test06 {

	static boolean confirm(String message) {
		Scanner keyScan = new Scanner(System.in);
		System.out.println(message);
		String response = keyScan.nextLine().toLowerCase();
		// keyScan.close();

		if (response.equals("y") || response.equals("yes"))
			return true;
		return false;
	}

	public static void main(String[] args, Score02 score) {

		Score02[] scores = new Score02[100];
		int cursor = 0;

		score.input();

		scores[cursor++] = score;

		if (!confirm("계속 하시겠습니까?")) {
		
		}

	}
}
