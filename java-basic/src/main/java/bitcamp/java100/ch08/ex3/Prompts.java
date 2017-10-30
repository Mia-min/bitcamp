package bitcamp.java100.ch08.ex3;

import java.util.Scanner;

public class Prompts {
	static boolean confirm(String message) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("y") || response.equals("yes"))
			return true;
		return false;	
	}
}
