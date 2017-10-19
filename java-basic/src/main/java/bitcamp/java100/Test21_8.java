// ## String 클래스 사용법 - String 인스턴스 생성
// - 개발자가 문자열을 쉽게 다룰 수 있도록 자바에게 기본으로 제공하는 부품이다.
// - 문자열을 저장하려면 char 배열이 필요한데,
//   개발자가 직접 char 배열을 다루는 것이 아니라
//   String 클래스에서 제공해주는 메서드를 사용하여 char 배열 메모리를 다룬다.
//

package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;


public class Test21_8 {

    public static void main(String[] args) {
    	class Student{
    		String name;
            String email ;
            int tel;
    	}
    	Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
        Student s = new Student();
    	
    	s.name = console.readLine("이름? ");
    	s.email = console.readLine(console.readLine("이메일? "));
    	s.tel = Integer.parseInt(console.readLine("전화번호? "));
    	
    	Scanner keyScan = new Scanner(System.in);
    	System.out.print("계속 입력하시겠습니까?");
        String line = keyScan.nextLine();	
    	if (s) {//만약 계속 입력한다면            
    		return;
        } else { //계속 입력하지 않는다면
        	
        }
    	
    	System.out.println("----------------------------------------------------");
    	
    	
    }
    
}