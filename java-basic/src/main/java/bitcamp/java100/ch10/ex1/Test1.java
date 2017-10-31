package bitcamp.java100.ch10.ex1;

import bitcamp.java100.ch10.ex1.other.C;

public class Test1 {
	public static void main(String[] args) {
		
		A obj = new A();
		
		bitcamp.java100.ch10.ex1.other.B obj2 = new 
				bitcamp.java100.ch10.ex1.other.B();
		
		C obj4 = new C();
		
		/*
		bitcamp.java100.ch10.ex1.other.D obj5 = new 
				bitcamp.java100.ch10.ex1.other.D(); //공개되지 않은 클래스이기 때문에 다른 패키지에서 사용할 수 없다.
		*/
		
		F obj6 = new F();
		
		G obj7 = new G();
	}
}
