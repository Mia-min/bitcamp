// ## String 클래스 사용법 - String 인스턴스 생성
// - 개발자가 문자열을 쉽게 다룰 수 있도록 자바에게 기본으로 제공하는 부품이다.
// - 문자열을 저장하려면 char 배열이 필요한데,
//   개발자가 직접 char 배열을 다루는 것이 아니라
//   String 클래스에서 제공해주는 메서드를 사용하여 char 배열 메모리를 다룬다.
//

package bitcamp.java100;

import java.io.Console;


public class Test21_5 {

	public static void main(String[] args) {

		Console console = System.console();

		int j = Integer.parseInt(console.readLine("구구단? "));
		int i = 1;

		if (j == 1 || j > 10) {
			System.out.println("2에서 9단까지만 가능합니다!");
			System.exit(1);
		}
		if (j < 0) {
			System.out.println("다음에 만나요!");
			System.exit(1);
		}

		for (; j < 10; j++) {
			for (; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", j, i, j * i);
			}
		}

	}
    
}