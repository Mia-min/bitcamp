package bitcamp.java100.ch08.ex7;

//오버라이딩 할 때 많이 하는 실수!
//잘못된 오버라이딩을 방지하는 특별한 명령
public class B3 extends B{
	//메소드 명을 잘못 또는 다르게 적었을 때 m1 => ml
	void ml(int a, String s) {}
	
	//자바는 이런식의 잦은 오류를 방지하기 위해 특별한 주석을 제공한다.
	//오버라이딩 하는 메서드 앞에 @override 주석을 붙이면 된다.
	
	//@Override // 이 주석은 개발자가(너가) 오버라이딩을 제대로 하는지 미리 검사한다.
	//void mI(int a, String s) {}
}
