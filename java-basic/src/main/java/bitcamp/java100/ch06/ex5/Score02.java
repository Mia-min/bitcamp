package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Score02 {

	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	void input() {
		Scanner keyScan = new Scanner(System.in);

		System.out.print("이름? ");
		this.name = keyScan.nextLine();

		System.out.print("kor: ");
		this.kor = keyScan.nextInt();

		System.out.print("eng: ");
		this.eng = keyScan.nextInt();

		System.out.print("math: ");
		this.math = keyScan.nextInt();
		
		this.compute();

		// keyScan.close();

	}

	void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}

	void print() {
		System.out.printf("%s, %d, %d, %d, %d, %f", this.name, this.kor, this.eng, this.math, this.sum, this.aver);
	}

}
