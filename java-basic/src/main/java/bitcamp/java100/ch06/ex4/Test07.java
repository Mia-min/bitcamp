package bitcamp.java100.ch06.ex4;

public class Test07 {

	public static void main(String[] args) {

		Calculator03 c1 = new Calculator03();
		Calculator03 c2 = new Calculator03();
		
		
		// 첫번째 식 계산
		c1.plus(2);
		c1.plus(5);
		c1.multi(3);
		c1.minus(7);
		c1.devide(2);

		System.out.println(c1.result);

		// 두번째 식 계산
		Calculator02.result = 0;

		c2.plus(3);
		c2.multi(6);
		c2.minus(5);
		c2.plus(11);
		c2.devide(2);

		System.out.println(c2.result);

	}

}
