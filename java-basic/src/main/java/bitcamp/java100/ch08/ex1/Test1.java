package bitcamp.java100.ch08.ex1;

public class Test1 {

	public static void main(String[] args) {
		A.v1 = 100;//비공개이기 때문에 접근 불가
		
		A.v2 = 100;
		
		A.v3 = 300;//디폴트 + 서브 패키지
		
		A.v4 = 100;

	}

}
