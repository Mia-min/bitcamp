// ## 문자 - 조건문 if
//

package bitcamp.java100;

public class Test16_2 {

    public static void main(String[] args) {
    	//나이 조건에 따라 성년과 미성년 구분하기
    	int age = 23; // int 나이가 23 이다.
    	
    	if (age <= 20) { //만약 나이가 20보다 작거나 같으면
    		System.out.println("미성년자입니다."); //미성년자입니다라고 출력해라
    	}
    	else { //만약 그것이 아니라면
    		System.out.println("성년입니다."); //성년입니다 라고 출력해라
    	}
    	
    	System.out.println("--------------------------------");
    	
    	age = 19; //나이가 19살이다.
    	
    	if (age >= 65) { // 만약 나이가  65보다 크거나 같다면
    		System.out.println("경로 우대 대상자입니다."); //경로우대 대상자입니다라고 출력해라
    	}
    	
    	//age = 57; 나이가 57이라면 <= int를 또 한번 선언할 경우 컴파일 오류가 뜬다.
    	else { // 만약 그것이 아니라면
    		System.out.println("경로 우대 대상자가 아닙니다."); // 경로우대 대상자가 아닙니다 라고 출력해라
    	}
    	
    	System.out.println("--------------------------------");
    	
    	age = 17;
    	if (age <= 20) {
    		System.out.println("미성년자입니다.");
    		System.out.println("청소년 할인을 받을 수 있습니다.");
    	}
    	else { 
    		System.out.println("성년입니다.");
    		System.out.println("청소년 할인을 받을 수 없습니다.");
    	}
    	
    	System.out.println("--------------------------------");
    	
    	age = 15; //나이가 15살이다.
    	
    	if (age <= 19) // 만약 나이가 19보다 작거나 같다면
    		if(age > 13) //만약 나이가 13보다 크다면
    		System.out.println("청소년입니다."); //청소년입니다라고 출력해라
    	
    	System.out.println("--------------------------------");
    	
    	age = 27;
    	
    	if (age <= 19)
    		if(age > 13)
        		System.out.println("청소년입니다.");
    		else
    	    	System.out.println("성년입니다.");
    	
    	System.out.println("--------------------------------");
    	
    	age = 27;
    	
    	if (age <= 19) {
    		if(age > 13)
        		System.out.println("청소년입니다.");
    	}
		else {
	    	System.out.println("성년입니다.");
		}
    	
    	System.out.println("--------------------------------");
    	
    	age = 10; //나이가 10살일때 
    	
    	if (age <= 19) //만약 나이가 19보다 작거나 같을때
    		if(age > 13)//만약 나이가 13보다 클때
        		System.out.println("청소년입니다."); // 청소년입니다라고 출력하라
			else //그렇지 않다면
		    	System.out.println("어린이 또는 유아입니다.");//어린이 또는 유아입니다라고 출력해라
    	else 
	    	System.out.println("성년입니다.");

    	
    	System.out.println("--------------------------------");
    	
    	age = 100;
    	
    	if (age <= 19) {
    		if(age > 13)
        		System.out.println("청소년입니다.");
			else 
		    	System.out.println("어린이 또는 유아입니다.");
    	}
    	else { 
    		if (age < 65)
    		System.out.println("성년입니다.");
    		else
    			System.out.println("노인입니다.");
    	}
    	
    	System.out.println("--------------------------------");
    	
    	age = 5;
    	
    	if (age < 8) {
        	System.out.println("유아입니다.");
    	}
		else { 
			if (age < 14)
				System.out.println("어린이입니다.");
			else
				if (age < 20)
					System.out.println("청소년입니다.");
				else
					if (age < 65)
						System.out.println("성년입니다.");
					else
						System.out.println("노인입니다.");
    	}
    	
    	System.out.println("--------------------------------");
    	
    	age = 5;
    	
    	if (age < 8)
        	System.out.println("유아입니다.");
		else if (age < 14)
			System.out.println("어린이입니다.");
		else if (age < 20)
			System.out.println("청소년입니다.");
		else if (age < 65)
			System.out.println("성년입니다.");
		else
			System.out.println("노인입니다.");

    	System.out.println("--------------------------------");
    	
    	age = 5;
    	
    	if (age < 8) {
        	System.out.println("유아입니다.");
    	} else if (age < 14) {
			System.out.println("어린이입니다.");
    	} else if (age < 20) {
			System.out.println("청소년입니다.");
    	} else if (age < 65) {
			System.out.println("성년입니다.");
    	} else { 
			System.out.println("노인입니다.");
    	}
    	
    	System.out.println("--------------------------------");
    	
    }
}
 