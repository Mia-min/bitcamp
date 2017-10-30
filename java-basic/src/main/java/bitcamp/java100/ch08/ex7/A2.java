package bitcamp.java100.ch08.ex7;

public class A2 extends A{//A를 상속 받는 B

	public void test1() {
		m4(); //상속 받은 퍼블릭 사용 가능
		m3(); //서브 클래스에서 상속 받은 프로텍티드 멤버 사용 가능
		m2(); //같은 패키지에서 상속 받은 디폴트 멤버 사용 가능
		m1(); //프라이빗 멤버는 오직 그 클래스 안에서만 사용 가능하다. 컴파일 오류
	}
	private void m1() {
		System.out.println("B.m1()");
	}
	
	//수퍼클래스 A의 m2() 메서드를 오버라이딩한다.
	@Override
	void m2() {
		//super.m2();
	}
	
	@Override
	protected void m3() {
		//super.m3();
	}
	
	@Override
	public void m4() {
		//super.m4();
	}
}
