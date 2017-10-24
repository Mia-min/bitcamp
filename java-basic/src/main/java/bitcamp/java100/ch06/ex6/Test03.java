package bitcamp.java100.ch06.ex6;

public class Test03 {

	public static void main(String[] args) throws Exception {

		Car03[] cars = new Car03[9];
		cars[0] = new Car03("벤츠", 900, Car03.TYPE_TRUCK, Car03.USE_COMPANY);
		cars[1] = new Car03("벤츠", 900, Car03.TYPE_TRUCK, Car03.USE_COMPANY);
		cars[2] = new Car03("벤츠", 900, Car03.TYPE_TRUCK, Car03.USE_COMPANY);

		cars[3] = new Car03("아우디", 1900, Car03.TYPE_SEDAN, Car03.USE_COMPANY);
		cars[4] = new Car03("아우디", 1900, Car03.TYPE_TRUCK, Car03.USE_PRIVATE);
		cars[5] = new Car03("아우디", 1900, Car03.TYPE_BUS, Car03.USE_COMPANY);

		cars[6] = new Car03("쉐보레", 100, Car03.TYPE_TRUCK, Car03.USE_COMPANY);
		cars[7] = new Car03("쉐보레", 100, Car03.TYPE_BUS, Car03.USE_COMMERCIAL);
		cars[8] = new Car03("쉐보레", 100, Car03.TYPE_SEDAN, Car03.USE_COMMERCIAL);

		System.out.printf("총 생산량: %d 대\n", Car03.count);

		for (int i = 0; i < cars.length; i++) {
			System.out.printf("%s, %d, %d, %d, %d\n", cars[i].model, cars[i].no, cars[i].cc, cars[i].type, cars[i].use);
		}
	}

}
