//클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기

package bitcamp.java100.ch06.ex1;

//기본 생성자 호출하기2
public class Test8 {
	
	public static void main(String[] args) {

		Score7 score;
		
		score= new Score7();
		
		System.out.printf("이름 = %s\n", score.name);
		System.out.printf("총점 = %d\n", score.sum);
		System.out.printf("평균 = %f\n", score.aver);
	}
	
}
