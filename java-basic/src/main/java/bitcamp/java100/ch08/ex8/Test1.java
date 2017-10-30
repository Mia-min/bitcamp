package bitcamp.java100.ch08.ex8;

public class Test1 {
	
	static int devide (int a, int b) {
		return a / b;
	}
	
	static float devide(float a, float b) {
		return a / b;
	}

	public static void main(String[] args) {
		
		System.out.println(devide(7,2));
		System.out.println(devide(7f,2f));
		
		//파라미터 타입이 메서드와 다를 때는 암시적 타입 캐스팅으로 가능한 메서드를 호출한다.
		System.out.println(devide(7,2f));
		System.out.println(devide(7f,2));
		
		//암시적으로 불가능한 경우 컴파일 오류
		//System.out.println(devide("7","2"));
		
	}
}
