
package bitcamp.java100;

public class Test18_4 {
	public static void main(String[] args) {
		
		String s1 = "ABC가각간";
		String s2 = new String("ABC가각간");
		
		if(s1 != s2)
			System.out.println("s1 != s2");
		
		//자바에서 문자열의 내용물이 같은지 비교할때는 반드시 equals()를 사용해야 한다.
		if(s1.equals(s2))System.out.println("s1과 s2의 내용물이 같다");
	}
}