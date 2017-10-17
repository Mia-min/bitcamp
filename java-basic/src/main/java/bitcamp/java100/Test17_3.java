//## 메서드 - 용도의 사용 예
//

package bitcamp.java100;

public class Test17_3 {
	
	static void m1(String name) {
		 System.out.printf("%s님 반갑습니다!\n", name);
	 }
	
	static void m2(String name, int count) {
		System.out.printf("%s(%d)님 반갑습니다!\n", name, count);
	}
	
	 public static void main(String[] args) {
		m1("방문자");
		m1("회원");
		m1("관리자");
		
		m2("방문자", 1);
		m2("회원",2);
		m2("관리자", 10);
	 }
}