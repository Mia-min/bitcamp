package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Test04 {

	static boolean confirm(String message) {
		Scanner keyScan = new Scanner(System.in);
		System.out.println(message);
		String response = keyScan.nextLine().toLowerCase();
		//keyScan.close();

		if (response.equals("y") || response.equals("yes"))
			return true;
		return false;
	}

	public static void main(String[] args) {

		while (true) {
			Score01.inputScore();
			Score01.computeScore();
			Score01.printScore();
			
			if(!confirm("계속 하시겠습니까?")){
				break;
			}
		}
	}

}
