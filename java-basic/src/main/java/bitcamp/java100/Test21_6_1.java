package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;

public class Test21_6_1 {
	// ## 키보드로부터 입력 받기 - 연습2
	// - 다음과 같이 사용자로부터 숫자를 입력 받아 각 숫자의 개수를 세시오.
	// - 실행 예)
	// 숫자? 23347651
	// 0 = 0
	// 1 = 1
	// 2 = 1
	// 3 = 2
	// 4 = 1
	// 5 = 1
	// 6 = 1
	// 7 = 1
	// 8 = 0
	// 9 = 0
	// >

	static Console console;
	
	static void prepareConsole() {
		System.console();
	}
	
	static long inputNumber() {
		return Long.parseLong(console.readLine("숫자"));
	}

	static int[] countNumbers(long i) {
		int[] num = new int[10];

		while (i > 0) {
			num[(int)(i % 10)]++;
			i /= 10;
		}
		return num;
	}

	static void printNumberCount(int[] cnt) {
		int x = 0;
		while (x < cnt.length) {
			System.out.printf("%d = %d\n", x, cnt[x]);
			x++;
		}
	}

	public static void main(String[] args) {
		prepareConsole();
		long value = inputNumber();
		int[] cnt = countNumbers(value);
		printNumberCount(cnt);
		
	}
}
