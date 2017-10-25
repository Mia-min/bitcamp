package bitcamp.java100.ch07.ex1;

public class Test4 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.result = 1;
		
		cal.multiple(5);

		cal.devide(0);
		
		cal.multiple(17);
		
		System.out.println(cal.result);


	}

}
