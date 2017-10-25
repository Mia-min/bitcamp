package bitcamp.java100.ch07.ex1;

public class Test2 {

	public static void main(String[] args) {
		CalculatorA cal = new CalculatorA();
		cal.plus(10);
		cal.plus(20);
		cal.minus(7);
		cal.multiple(2);
		cal.devide(3);
		
		System.out.println(cal.result);


	}

}
