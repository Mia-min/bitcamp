//: ## ver 15
//: - ScoreDao를 다른 타입에 대해서도 처리할 수 있도록 변경하라!
//: - 학습목표
//:   - 다형성의 특징 중 다형적 변수를 활용하는 방법을 연습한다.
//: 
//: 
//: 여러 명의 성적을 저장하고 다음과 같이 출력하라!
//:
//: 출력내용:
//: ```
//: 홍길동, 100,  90,  80, 270,  90.0
//: 임꺽정,  80,  80,  80, 240,  80.0
//: 유관순, 100, 100, 100, 300, 100.0
//: ```
package java100.app;

import java.util.ArrayList;
import java.util.Scanner;
 
public class App {
    
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("y") || response.equals("yes"))
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        //제네릭Generic이 적용된 ArrayList를 사용
        // ArrayList는 Score 타입뿐만 아니라 자바의 모든 타입의 객체에 대해서도 
        // 사용할 수 있다.
        ArrayList<Score> list = new ArrayList<>();
        
        while (true) {
            Score score = new Score(); // 성적 데이터를 저장할 빈 객체를 준비한다.
            score.input(); // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.
            
            list.add(score);

            if (!confirm("계속하시겠습니까? "))
                break;
        }
        
        iterator<Scroe> itorator = list.iterator();
        
        while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
        
        for (int i = 0; i < list.size(); i++) {
        	//ArrayList에 어떤 값을 저장할 지 알려줬기 때문에
        	//값을 꺼낼때 따로 형 변환 할 필요가 없다.
            //((Score)list.get(i)).print();
        	list.get(i)).print();
        }
    }
}




