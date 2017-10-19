// ## String 클래스 사용법 - String 인스턴스 생성
// - 개발자가 문자열을 쉽게 다룰 수 있도록 자바에게 기본으로 제공하는 부품이다.
// - 문자열을 저장하려면 char 배열이 필요한데,
//   개발자가 직접 char 배열을 다루는 것이 아니라
//   String 클래스에서 제공해주는 메서드를 사용하여 char 배열 메모리를 다룬다.
//

package bitcamp.java100;

import java.io.Console;


public class Test21_2 {

    public static void main(String[] args) {
    	Console console = System.console();
    	if (console == null) {
    		System.err.println("콘솔을 지원하지 않습니다.");
    		System.exit(1);
    	}
    	String line = console.readLine("입력하세요:");
    	System.out.println(line);
    }
    
}











