//클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기

package bitcamp.java100.ch06.ex2;

import java.io.Console;

//사용자 데이터 타입 적용 전
public class Test02 {

	static Console console;

	static void prepareConsole() {
		console = System.console();
		if (console == null) {
			System.err.println("콘솔 출력을 지원하지 않습니다!");
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		prepareConsole();

		while (true) {
			Score score = new Score();
			ScoreView.input(score);
			ScoreDao.add(score);
		}

	}
}
