package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
		
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float aver;
		
		System.out.print("이름? ");
		name = keyScan.nextLine();

		System.out.print("kor: ");
		kor = keyScan.nextInt();
		
		System.out.print("eng: ");
		eng = keyScan.nextInt();
		
		System.out.print("math: ");
		math = keyScan.nextInt();
		
		sum = kor + eng + math;
		aver = sum / 3f;
		
		System.out.printf("%s, %d, %d, %d, %d, %f", name, kor, eng, math, sum, aver);
		
		
	}

}
