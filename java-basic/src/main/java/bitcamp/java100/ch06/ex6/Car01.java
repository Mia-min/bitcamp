package bitcamp.java100.ch06.ex6;

public class Car01 {

	static int count;
	
	String model;
	int cc;
	long no;

	public Car01(String model, int cc) {
		count++;
		
		this.model = model;
		this.cc = cc;
		this.no = System.currentTimeMillis();

		try {
			Thread.currentThread().sleep(50);
		} catch (Exception e) {
		}
	}

}
