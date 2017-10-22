package bitcamp.java100.ch06.ex1;

//특별한 인스턴스 메소드 = 생성자
public class Score3 {
	//필드 선언하기 - new라는 명령어가 있으면 실행된다.
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	//인스턴스를 만들 때 자동으로 호출되는 메서드 = 생성자
	Score3(){
		System.out.println("스코어3 호출 완료");
		
		this.name = "홍길동";
		this.kor = 50;
		this.eng = 50;
		this.math = 50;
		this.method();
	}
	
	//메서드 정의 = 연산자 정의
	void method() {//<= 인스턴스 메서드라고 부른다.
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
	
}
