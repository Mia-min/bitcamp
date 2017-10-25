package bitcamp.java100.ch07.ex1;

public class Test1 {

	public static void main(String[] args) {
		CalculatorB cal = new CalculatorB();
		cal.result = 10;
		cal.multiple(2);
		cal.multiple(3);
		cal.devide(10);
		
		System.out.println(cal.result);

	}

}
