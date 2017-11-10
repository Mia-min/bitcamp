package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test3 {

	static void m1(int i) throws RuntimeException, Error, ArithmeticException, IndexOutOfBoundsException {
		switch (i) {
		case 1:
			throw new RuntimeException();
		case 2:
			throw new Error();
		case 3:
			throw new ArithmeticException();
		case 4:
			throw new IndexOutOfBoundsException();
		}
	}
	
	//에러 계열과 런타임 계열의 예외를 던질때는 메서드 선언부에 예외타입을 나열하지 않아도 된다.
	//선택 사항이다.
	static void m2(int i) {
		switch (i) {
		case 1:
			throw new RuntimeException();
		case 2:
			throw new Error();
		case 3:
			throw new ArithmeticException();
		case 4:
			throw new IndexOutOfBoundsException();
		}
	}
	
	//익셉션 계열과 아이오등 계열의 예외를 던질때는 메서드 선언부에 꼭 예외 타입을 나열해주어야 한다.
	//나열하지 않으면 오류가 뜬다.
	static void m3(int i) throws Exception, SQLException, IOException, FileNotFoundException {
		switch (i) {
		case 1:
			throw new Exception();
		case 2:
			throw new SQLException();
		case 3:
			throw new IOException();
		case 4:
			throw new FileNotFoundException();
		}
	}

	public static void main(String[] args) {
		try {
			m1(2);
		} catch (FileNotFoundException e) {
		} catch (SQLException e) {
		} catch (IOException e) {
		} catch (Exception e) {
		}
		
		try {
			m1(1);
		} catch (Exception e) {
		}
		
		try {
			m1(3);
		} catch (FileNotFoundException e) {
		} catch (SQLException e) {
		} catch (Exception e) {
		}
	}
}
