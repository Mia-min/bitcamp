package bitcamp.java100.ch06.ex6;

public class Car02 {

	
	static int count;
	
	String model;
	int cc;
	long no;
	int type;
	int use;

	public Car02(String model, int cc, int type, int use) {
		count++;
		
		this.model = model;
		this.cc = cc;
		this.no = System.currentTimeMillis();
		this.type = type;
		this.use = use;

		try {
			Thread.currentThread().sleep(50);
		} catch (Exception e) {
		}
	}

}
