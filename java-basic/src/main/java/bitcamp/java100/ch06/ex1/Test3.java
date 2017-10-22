//클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기

package bitcamp.java100.ch06.ex1;

//메서드 문법을 이용하여 클래스에 연산자 추가
public class Test3 {
	
	public static void main(String[] args) {

		Score2 score = new Score2();
		
		score.name = "홍길동";
		score.kor = 100;
		score.eng = 100;
		score.math = 100;
		score.sum = score.kor + score.eng + score.math;
		score.aver = score.sum / 3f;
		
		score.method();

	}

}
