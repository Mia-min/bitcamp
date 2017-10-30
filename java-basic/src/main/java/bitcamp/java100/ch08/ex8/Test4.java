package bitcamp.java100.ch08.ex8;

public class Test4 {
	
	public static void main(String[] args) {
		
	A obj = new A();
	
	obj.m1(100);
	
	//값을 안주는데 받겠다고 하면 오류. 값을 리턴하지 않는 메서드에서 값을 받을 수 없다.
	//int value = obj.m1(200);
	
	obj.m2();
	
	int result = obj.m2();
		
	}
}
