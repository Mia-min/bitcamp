package bitcamp.java100.ch06.ex6;

public class Test01 {

	public static void main(String[] args) throws Exception {

		Car01[] cars = new Car01[9];
		cars[0] = new Car01("벤츠", 900);
		cars[1] = new Car01("벤츠", 900);
		cars[2] = new Car01("벤츠", 900);

		cars[3] = new Car01("아우디", 1900);
		cars[4] = new Car01("아우디", 1900);
		cars[5] = new Car01("아우디", 1900);
		
		cars[6] = new Car01("쉐보레", 100);
		cars[7] = new Car01("쉐보레", 100);
		cars[8] = new Car01("쉐보레", 100);

		System.out.printf("총 생산량: %d 대\n",Car01.count);
		
		for (int i = 0; i < cars.length; i++) {
			System.out.printf("%s, %d, %d\n", cars[i].model, cars[i].no, cars[i].cc);
		}
	}

}
