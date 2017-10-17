//## 메서드 - 용도의 사용 예
//

package bitcamp.java100;

public class Test17_4 {
	
	static void m1(int...values) {
		 System.out.printf("아규먼트 개수: %d\n",values.length);
		 for(int v : values) {
			 System.out.println(v);
		 }
	 }
	
	static void m2(int...values) {
		
	}
	
	static void m3(String name, int count, int... values) {}
	
	static void sum(int... values) {
		int s = 0;
		for(int v : values) {
			s += v;
			System.out.printf("합계: %d\n", s);
		}
	}
	
	 public static void main(String[] args) {
		m1();
		m1(10);
		m1(10, 20);
		m1(10, 20, 30, 50, 70);
		
		sum();
		sum(10);
		sum(80, 20);
		sum(10, 50, 40, 90, 70);

	 }
}