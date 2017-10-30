package bitcamp.java100.ch08.ex7;

public class C4 extends C3 {
	@Override
	void m1() {
		System.out.println("C4.m1()입니다.");
	}
	
	@Override
	void m2() {
		System.out.println("C4.m2()");
	}
	
	void test1() {
		this.m1();//메서드 앞에 this를 주면 현재 클래스부터 메서드를 찾는다.
		super.m1(); //메서드 앞에 super를 주면 수퍼클래스부터 메서드를 찾는다.
		
		this.m2(); //현재클래스에서 m2를 찾아라
		super.m2(); //수퍼클래스에서부터 m2를 찾아 올라가서 찾았다면 나타내라 => C3에 m2가 없어서 C2까지 올라갔다.
		
		this.m3();
		super.m3();
	}
	
	public static void main(String[] args) {
		C4 obj = new C4();
		obj.test1();
	}
}
