package bitcamp.java100.ch07.ex5;

public class A {
	// 모든 클래스는 반드시 생성자를 가져야 한다.
	/*
	 * A() { // 모든 생성자는 첫번째 문장으로 수퍼클래스의 기본 생성자를 호출한다. // A 클래스의 수퍼클래스는 Object이기 때문에
	 * Object의 기본 생성자를 호출한다. super(); }
	 */
	
	A() {//아무런 파라미터 값도 받지 않는 생성자
		System.out.println("A() 생성자 실행!");
	}
	
	A(String str) {//스트링 값 받는 생성자
		super();
		System.out.println("A() 실행!");
	}
	
	A(int i) {//인트값 받는 생성자 
		System.out.println("A(int) 실행!");
		//super();//Constructor call must be the first statement in a constructor _ 컴파일 오류
	}

}
