// ## String 클래스 사용법 - String 인스턴스 생성
// - 개발자가 문자열을 쉽게 다룰 수 있도록 자바에게 기본으로 제공하는 부품이다.
// - 문자열을 저장하려면 char 배열이 필요한데,
//   개발자가 직접 char 배열을 다루는 것이 아니라
//   String 클래스에서 제공해주는 메서드를 사용하여 char 배열 메모리를 다룬다.
//

package bitcamp.java100;

import java.io.Console;


public class Test21_4 {

    public static void main(String[] args) {
    	
    	class Student{
    		String name;
        	int age;
        	boolean working;
        	float gpa;
    	}
    	
    	Console console = System.console();
    	
    	if (console == null) {
    		System.err.println("콘솔을 지원하지 않습니다.");
    		System.exit(1);
    	}
    	
    	Student s = new Student();
    	
    	s.name = console.readLine("이름?(예:홍길동)");
    	s.age = Integer.parseInt(console.readLine("나이?(예:20)"));
    	s.working = Boolean.parseBoolean(console.readLine("재직여부?(예: true 또는 false) "));
    	s.gpa = Float.parseFloat(console.readLine("졸업학점:(예:3.5)"));
    	
    	System.out.println("----------------------------------------------------");
    	
    	System.out.printf("이름: %s\n", s.name);
        System.out.printf("나이: %d\n", s.age);
        System.out.printf("재직여부: %b\n", s.working);
        System.out.printf("졸업학점: %.2f\n", s.gpa);
    }
    
}