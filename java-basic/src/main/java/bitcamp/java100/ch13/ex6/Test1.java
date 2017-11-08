// 예외처리 문법정리 : 예외 클래스의 상속 관계와 catch 블록
package bitcamp.java100.ch13.ex6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print("입력> ");
		String str = keyScan.nextLine().toLowerCase();

		try {
			System.out.println("try 블록 실행");

		} finally {
			System.out.println("finally 블록 실행");
		}

	}

}
