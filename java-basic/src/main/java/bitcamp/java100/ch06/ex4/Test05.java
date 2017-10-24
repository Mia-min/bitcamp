package bitcamp.java100.ch06.ex4;

public class Test05 {

	public static void main(String[] args) {

		// 첫번째 식 계산
		Calculator01.plus(2);
		Calculator01.plus(5);
		Calculator01.multi(3);
		Calculator01.minus(7);
		Calculator01.devide(2);

		System.out.println(Calculator01.result);

		// 두번째 식 계산
		Calculator01.result = 0;

		Calculator01.plus(3);
		Calculator01.multi(6);
		Calculator01.minus(5);
		Calculator01.plus(11);
		Calculator01.devide(2);

		System.out.println(Calculator01.result);

	}

}
