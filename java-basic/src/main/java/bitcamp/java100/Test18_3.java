
package bitcamp.java100;

public class Test18_3 {
	public static void main(String[] args) {
		
		//문자열 리터럴로 String 인스턴스를 암시적으로 생성하기
		//=> constants pool(상수 풀)에 생성
		String s1 = "ABC가각간";
		String s2 = "ABC가각간";
		String s3 = "ABC가각간";
		
		//String 인스턴스를 명시적으로 생성하기
		//=>heap에 생성
		String s4 = new String("ABC가각간");
		String s5 = new String("ABC가각간");
		String s6 = new String("ABC가각간");
		
		//인스턴스의 주소를 확인해보자
		if(s1 == s2)
			System.out.println("s1 == s2");
			System.out.println("s1 == s3");
		
		if(s1 != s4)
			System.out.println("s1 != s4");
		if(s1 != s5)
			System.out.println("s1 != s5");
		if(s1 != s6)// !=를 ==로 바꾸면 s1과 s6는 서로 다르기 때문에 출력이 되지 않는다.
			System.out.println("s1 != s6");
		
		if(s1 == "ABC가각간")
			System.out.println("s1 == ABC가각간");
		if(s4 != "ABC가각간")//자바에서 문자열을 비교할 때 ==로 비교하면 안된다!! 주소를 비교하기 때문이다.
			System.out.println("s4 != ABC가각간");
	}
}