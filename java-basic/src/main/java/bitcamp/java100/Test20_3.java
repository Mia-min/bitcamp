// ## String 클래스 사용법 - String 인스턴스 생성
// - 개발자가 문자열을 쉽게 다룰 수 있도록 자바에게 기본으로 제공하는 부품이다.
// - 문자열을 저장하려면 char 배열이 필요한데,
//   개발자가 직접 char 배열을 다루는 것이 아니라
//   String 클래스에서 제공해주는 메서드를 사용하여 char 배열 메모리를 다룬다.
//

package bitcamp.java100;

import java.io.File;

public class Test20_3 {

	static void print1(String value) {
		System.out.println(value);
	}
	
	static void print2(int value) {
		System.out.println(value);
	}
	
	static void print3(float value) {
		System.out.println(value);
	}
	
	static void print4(Object value) {
		System.out.println(value);
	}
	
    public static void main(String[] args) {
    	print1("문자열");
    	print2(200);
    	print3(3.14f);
    	
    	String v1 = "홍길동";
    	StringBuffer v2 = new StringBuffer("임꺽정");
    	File v3 = new File(",");
    	
    	print1(v1);
    	//print1(v2);
    	//print1(v3);
    	
    	print4(v1);
    	print4(v2);
    	print4(v3);
    	
    	print4(new Integer (300));
    	print4(new Float (3.14f));
    	print4(new Boolean(true));
    	
    	print4(300);
    	print4(3.14f);
    	print4(true);
    }
    
}