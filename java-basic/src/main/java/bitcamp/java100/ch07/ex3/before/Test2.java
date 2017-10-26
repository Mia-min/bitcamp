package bitcamp.java100.ch07.ex3.before;

public class Test2 {

	public static void main(String[] args) {
		CalculatorB cal = new CalculatorB();
		
		cal.value = 1;
		
		cal.multiple(10);
		cal.multiple(17);
		cal.devide(3);
		cal.remainder(5);

		
		System.out.println(cal.value);


	}

}
