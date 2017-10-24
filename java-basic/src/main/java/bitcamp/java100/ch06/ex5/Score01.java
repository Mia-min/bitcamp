package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Score01 {
	static String name;
	static int kor;
	static int eng;
	static int math;
	static int sum;
	static float aver;

	static void inputScore() {
		Scanner keyScan = new Scanner(System.in);

		System.out.print("이름? ");
		name = keyScan.nextLine();

		System.out.print("kor: ");
		kor = keyScan.nextInt();

		System.out.print("eng: ");
		eng = keyScan.nextInt();

		System.out.print("math: ");
		math = keyScan.nextInt();

		//keyScan.close();

	}

	static void computeScore() {
		sum = kor + eng + math;
		aver = sum / 3f;
	}

	static void printScore() {
		System.out.printf("%s, %d, %d, %d, %d, %f", name, kor, eng, math, sum, aver);
	}

}
