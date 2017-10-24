package bitcamp.java100.ch06.ex4;

public class Calculator02 {

	static int result;

	static void plus(Calculator02 that, int value) {
		that.result += value;
	}

	static void minus(Calculator02 that, int value) {
		that.result -= value;
	}

	static void multi(Calculator02 that, int value) {
		that.result *= value;
	}

	static void devide(Calculator02 that, int value) {
		that.result /= value;
	}
}
