package bitcamp.java100.ch06.ex1;

public class Score2 {
	//필드 선언하기 - new라는 명령어가 있으면 실행된다.
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	//메서드 정의 = 연산자 정의
	
	void method() {//<= 인스턴스 메서드라고 부른다.
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
	
}
