//## 메서드 - 용도의 사용 예
//

package bitcamp.java100;

public class Test17_5 {
	static String m1() {
		return "hello";
	}
	
	static int m2() {
		return 100;
	}
	
	static boolean m3() {
		return true;
	}
	
	public static void main(String[] args) {
		String v = m1();
		System.out.println(v);
		System.out.println(m1());
	 }
}