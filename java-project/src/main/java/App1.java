//: ## ver 07
//: - 배열 응용 II
//: ver-06에서 Score 객체를 배열에 저장하라!
//: 
//: 여러 명의 성적을 저장하고 다음과 같이 출력하라!
//:
//: 출력내용:
//: ```
//: 홍길동, 100,  90,  80, 270,  90.0
//: 임꺽정,  80,  80,  80, 240,  80.0
//: 유관순, 100, 100, 100, 300, 100.0
//: ```
 
public class App1 {
	
	static void col(Score score) {
		for (int sub : score.subjects) {
			score.sum += sub;
        }
		score.aver = score.sum / 3f;
	}
	
	static void print(Score score) {
		System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
		score.name,
        score.subjects[0],
        score.subjects[1],
        score.subjects[2],
        score.sum,
        score.aver);
        
	}
	
	static void init (Score score, String name, int kor, int eng, int math) {
		 score.name = name;
	     score.subjects[0] = kor;
	     score.subjects[1] = eng;
	     score.subjects[2] = math;
	     score.sum = kor + eng + math;
	     score.aver = score.sum / 3f;
	}
	
    public static void main(String[] args) {
        
        Score[] scores = {new Score(), new Score(), new Score()};
        
        init(scores[0], "가", 1, 2, 3);
        init(scores[1], "가", 1, 2, 3);
        init(scores[2], "가", 1, 2, 3);
        
        //: 학생 성적을 출력한다.
        for (Score s : scores) {
            print(s);
        }
    }
}




