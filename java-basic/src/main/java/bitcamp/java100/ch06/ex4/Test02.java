package bitcamp.java100.ch06.ex4;

public class Test02 {

	static int plus(int a, int b) {
		return a + b;
	}
	
	static int minus(int a, int b) {
		return a - b;
	}
	
	static int multi(int a, int b) {
		return a * b;
	}
	
	static int devide(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		
		int result = 0;

		result = plus(2, 5);
		result = multi(result, 3);
		result = minus(result, 7);
		result = devide(result, 2);

		System.out.println(result);

	}

}
