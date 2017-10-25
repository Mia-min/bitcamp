package bitcamp.java100.ch07.ex2;

public class Test3 {

	public static void main(String[] args) {
		CalculatorB cal = new CalculatorB();
		
		cal.result = 1;
		
		cal.multiple(10);
		cal.multiple(17);
		cal.devide(0);
		cal.remainder(5);

		
		System.out.println(cal.result);


	}

}
