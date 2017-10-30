package bitcamp.java100.ch08.ex7;

//클래스 C의 공부 목적
//수퍼 클래스보다 확장은 가능하지만 축소는 불가능하다.
public class A3 extends A{
	
	//접근 범위를 확장하기
	//
	@Override
	protected void m2() {}
	
	//public void m2() {}
	
	public void m3() {}
	//오버라이딩 할 때 상속 받은 메스드의 접근 범위를 확장 할 수는 있어도 축소 시킬 수는 없다.
	//private void m2() {} //컴파일 오류
	
	//void m3() {}
	
	//protected void m4() {}
	
	//void m4() {}
	
}
