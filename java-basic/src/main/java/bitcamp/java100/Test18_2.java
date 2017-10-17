
package bitcamp.java100;

public class Test18_2 {
	public static void main(String[] args) {
		
		String s1;		
		s1 = "ABC가각간";
		
		String s2 = "ABC가각간";
		
		if(s1 == s2) //레퍼런스 s1에 저장된 주소와 s2에 저장된 주소가 같다
			System.out.println("s1 == s2");
		
		// 이유?
		//리터럴을 이용해서 암시적으로 String 인스턴스를 만들 때는 string pool이라는 별도의 영역에 인스턴스가 생성된다.
		//상수 풀(string pool, constants pool)에서는 중복된 내용의 인스턴스를 생성하지 않는다.
		//프리머티브 타입 8가지를 제외한 모든 타입은 주소타입이다. 
	}
}