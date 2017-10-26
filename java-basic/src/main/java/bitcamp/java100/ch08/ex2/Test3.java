package bitcamp.java100.ch08.ex2;

public class Test3 {

	public static void main(String[] args) {
		Car c = new Sedan();
		
		c.model = "audi";
		c.capacity = 4;
		c.enginType = 1;
		c.cylinder = 4;
		c.valve = 16;
		
		Sedan c2 = new Sedan();
		c2.auto = true;
		c2.sunroof = false;
		
		System.out.printf("%s, %d, %d, %d, %d, %b, %b\n",
			c.model,
			c.capacity,
			c.enginType,
			c.cylinder,
			c.valve, 
			c2.auto,
			c2.sunroof);

	}

}
