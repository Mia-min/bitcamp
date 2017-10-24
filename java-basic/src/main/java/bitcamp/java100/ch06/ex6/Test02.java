package bitcamp.java100.ch06.ex6;

public class Test02 {

	public static void main(String[] args) throws Exception {

		Car02[] cars = new Car02[9];
		cars[0] = new Car02("벤츠", 900, 0, 0);
		cars[1] = new Car02("벤츠", 900, 0, 0);
		cars[2] = new Car02("벤츠", 900, 0, 0);

		cars[3] = new Car02("아우디", 1900, 0, 0);
		cars[4] = new Car02("아우디", 1900, 0, 0);
		cars[5] = new Car02("아우디", 1900, 0, 0);
		
		cars[6] = new Car02("쉐보레", 100, 0, 0);
		cars[7] = new Car02("쉐보레", 100, 0, 0);
		cars[8] = new Car02("쉐보레", 100, 0, 0);

		System.out.printf("총 생산량: %d 대\n",Car02.count);
		
		for (int i = 0; i < cars.length; i++) {
			System.out.printf("%s, %d, %d\n", cars[i].model, cars[i].no, cars[i].cc);
		}
	}

}
