package bitcamp.java100.ch13.ex9;

public class Test1 {

	static void m1() throws Exception {
		throw new Exception();
	}

	static void m2() throws Exception {
		throw new Exception("예외가 발생했습니다.");
	}
	
	public static void main(String[] args) {
		try {
			m1();
		}catch(Exception e){
			
		}
		
		try {
			m2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
