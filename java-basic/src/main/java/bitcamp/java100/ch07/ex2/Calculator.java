package bitcamp.java100.ch07.ex2;

public class Calculator {

	int result;
	
	void multiple(int value) {
		this.result *= value;
	}
	/* 
	void devide(int value) {
		this.result /= value;
	}
	*/
	
	void devide(int value) {
		if(value == 0) {
			System.err.println("0 ㄴㄴ");
			return;
		}
		this.result /= value;
	}
	

}
