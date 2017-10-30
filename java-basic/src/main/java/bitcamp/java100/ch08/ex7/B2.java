package bitcamp.java100.ch08.ex7;

//오버라이딩 규칙
//접근 범위가 같거나 확장
//리턴 타입은 반드시 일치
//메서드명도 반드시 일치
//파라미터 타입 및 개수 및 순서도 반드시 일치
//파라미터 명은 상관 없음
public class B2 extends B{
	
	//X와 모두 일치
	//void m1(int a, String s) {}
	
	//protected void m1(int a, String s) {}
	
	//X에서 확장
	//public void m1(int a, String s) {}
	
	//파라미터 명(=변수명)은 달라도 된다.
	//void m1(int x, String y) {}
	
	//리턴 타입 불일치
	//int m1(int a, String s) {}
	
	//void m1_1(int a, String s) {}
	
	//void m1(String s, String a) {}

	//파라미터의 순서가 다르면 새 메서드가 추가 된 것으로 간주한다. = 오버로딩
	//void m1(String s, int a) {}
}
