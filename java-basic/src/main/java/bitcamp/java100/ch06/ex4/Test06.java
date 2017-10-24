package bitcamp.java100.ch06.ex4;

public class Test06 {

	public static void main(String[] args) {

		Calculator02 c1 = new Calculator02();
		Calculator02 c2 = new Calculator02();
		
		
		// 첫번째 식 계산
		Calculator02.plus(c1, 2);
		Calculator02.plus(c1,5);
		Calculator02.multi(c1,3);
		Calculator02.minus(c1,7);
		Calculator02.devide(c1,2);

		System.out.println(Calculator02.result);

		// 두번째 식 계산
		Calculator02.result = 0;

		Calculator02.plus(c2,3);
		Calculator02.multi(c2,6);
		Calculator02.minus(c2,5);
		Calculator02.plus(c2,11);
		Calculator02.devide(c2,2);

		System.out.println(Calculator02.result);

	}

}
