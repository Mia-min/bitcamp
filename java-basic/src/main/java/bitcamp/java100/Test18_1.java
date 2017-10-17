
package bitcamp.java100;

public class Test18_1 {
	// String 클래스로 문자열 배열 만들기

	public static void main(String[] args) {
		// string 메모리의 주소를 저장 할 래퍼런스 선언
		String s1;
		
		//문자열을 저장 할 메모리 준비
		s1 = new String("ABC가각간");
		
		String s2;
		s2 = new String("ABC가각간");
		
		if(s1 !=s2)
			System.out.println("s1 !=s2");
	}
}