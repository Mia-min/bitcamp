//클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기

package bitcamp.java100.ch06.ex1;

//인스턴스를 만들 때 생성자 호출하기
public class Test4 {
	
	public static void main(String[] args) {

		Score4 score = new Score4();
		
		System.out.printf("이름 = %s\n", score.name);
		System.out.printf("총점 = %d\n", score.sum);
		System.out.printf("평균 = %f\n", score.aver);
		
		//score3 = new Score3(); //컴파일 오류
		score= new Score4();
	}
	
}
