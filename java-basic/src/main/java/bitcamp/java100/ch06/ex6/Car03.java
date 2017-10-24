package bitcamp.java100.ch06.ex6;

public class Car03 {

	public final static int TYPE_TRUCK = 1;
	public final static int TYPE_SEDAN = 2;
	public final static int TYPE_BUS = 3;
	
	public final static int USE_PRIVATE = 1;
	public final static int USE_COMPANY = 2;
	public final static int USE_COMMERCIAL = 3;
	
	static int count;
	
	String model;
	int cc;
	long no;
	int type;
	int use;

	public Car03(String model, int cc, int type, int use) {
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
