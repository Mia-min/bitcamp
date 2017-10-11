// ## 문자 - 조건문 if
//

package bitcamp.java100;

public class Test16_2 {

    public static void main(String[] args) {
    	//나이 조건에 따라 성년과 미성년 구분하기
    	int age = 23;
    	
    	if (age <= 20) {
    		System.out.println("미성년자입니다.");
    	}
    	else { 
    		System.out.println("성년입니다.");
    	}
    	
    	System.out.println("--------------------------------");
    	
    	age = 19;
    	
    	if (age >= 65) {
    		System.out.println("경로 우대 대상자입니다.");
    	}
    	
    	//age = 57;
    	else { 
    		System.out.println("경로 우대 대상자가 아닙니다.");
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
    	
    	age = 15;
    	
    	if (age <= 19)
    		if(age > 13)
    		System.out.println("청소년입니다.");
    	
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
    	
    	age = 10;
    	
    	if (age <= 19)
    		if(age > 13)
        		System.out.println("청소년입니다.");
			else 
		    	System.out.println("어린이 또는 유아입니다.");
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
 