package bitcamp.java100.ch07.ex2;

public class CalculatorA extends Calculator {

	int result;

	void multiple(int value) {
		this.result *= value;
	}

	void devide(int value) {
		this.result /= value;
	}

	void plus(int value) {
		this.result += value;
	}

	void minus(int value) {
		this.result -= value;
	}

}
