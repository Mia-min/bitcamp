package bitcamp.java100.ch06.ex1;

//생성자에서 다른 생성자 호출하기
public class Score7 {
	//필드 선언하기 - new라는 명령어가 있으면 실행된다.
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	//파라미터가 없는 생성자
	Score7(){
		this.name = "홍길동";
		this.kor = 50;
		this.eng = 50;
		this.math = 50;
		
		this.method();
	}
	
	Score7(String name){
		this(name, 50, 50, 50);
		/*
		this.name = "홍길동";
		this.kor = 50;
		this.eng = 50;
		this.math = 50;
		
		this.method();
		*/
	}
	
	Score7(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.method();
	}
	
	
	//메서드 정의 = 연산자 정의
	void method() {//<= 인스턴스 메서드라고 부른다.
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
	
}
