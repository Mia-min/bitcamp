package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;

public class Test21_6_2 {
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
	public static void main(String[] args) {
		// 콘솔 객체를 준비한다.

		Console console = System.console();

		StringBuffer buf = new StringBuffer(console.readLine("주어지는 값 : "));

		int[] num = new int[10];

		for (int i = 0; i < buf.length(); i++) {
			num[(buf.charAt(i) - '0')]++;
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%d = %d\n", i, num[i]);
		}
	}
}
