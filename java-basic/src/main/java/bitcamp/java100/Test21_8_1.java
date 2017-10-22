// ## String 클래스 사용법 - String 인스턴스 생성
// - 개발자가 문자열을 쉽게 다룰 수 있도록 자바에게 기본으로 제공하는 부품이다.
// - 문자열을 저장하려면 char 배열이 필요한데,
//   개발자가 직접 char 배열을 다루는 것이 아니라
//   String 클래스에서 제공해주는 메서드를 사용하여 char 배열 메모리를 다룬다.
//

package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;

public class Test21_8_1 {

	public static void main(String[] args) {

		Console console = System.console();

		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다.");
			System.exit(1);
		}

		String[] names = new String[3];
		String[] emails = new String[3];
		String[] tels = new String[3];

		int cursor = 0;

		while (cursor < names.length) {
			names[cursor] = console.readLine("이름은? ");
			emails[cursor] = console.readLine("이메일? ");
			tels[cursor] = console.readLine("전화는? ");
			cursor++;
		}

		cursor = 0;

		while (cursor < names.length) {
			System.out.println(names[cursor]);
			System.out.println(emails[cursor]);
			System.out.println(tels[cursor]);
			cursor++;
		}

	}

}