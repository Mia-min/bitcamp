import java.util.Scanner;

//: ## 생성자와 인스턴스 메서드 도입
//: - init() 메서드 대신 생성자를 이용하여 인스턴스를 초기화시킨다.
//: - print() 메서드는 인스턴스 데이터를 다루기 때문에 스태틱 메서드 대신
//:   인스턴스 메서드로 전환한다. 
public class Score {
    
    String name;
    int[] subjects; 
    int sum;
    float aver;
    
    public Score() {
		// TODO Auto-generated constructor stub
	}

    //: ### 생성자 
    Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[]{kor, eng, math};
        
        this.compute();
    }
    

	void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        
        System.out.print("국어점수? ");
        this.subjects[0] = keyScan.nextInt();
        
        System.out.print("영어점수? ");
        this.subjects[1] = keyScan.nextInt();
        
        System.out.print("수학점수? ");
        this.subjects[2] = keyScan.nextInt();
        
        keyScan.close(); // Scanner는 사용 후 닫아야 한다.
                         // 즉 Scanner가 사용한 공용 자원(키보드)을 해제해야 한다.
    }

	// : ### 인스턴스 메서드
	// : 인스턴스 데이터를 다루는 메서드는 스태틱 보다 인스턴스 메서드로 선언해야 한다.
	void compute() {
		this.sum = this.subjects[0] + this.subjects[1] + this.subjects[2];
		this.aver = this.sum / 3f;
	}

	void print() {
		System.out.printf("%s, %d, %d, %d, %d, %f\n", this.name, this.subjects[0], this.subjects[1], this.subjects[2], this.sum, this.aver);
	}
}
