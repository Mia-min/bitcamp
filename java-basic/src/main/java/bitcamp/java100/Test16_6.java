
//## 문자 - 블록과 변수의 범위
//

package bitcamp.java100;

public class Test16_6 {

 public static void main(String[] args) {
 	String[] name = {"홍길동","임꺽정","유관순","안중근","윤봉길"}; //name이라는 문자 배열 선언하고 홍길동,임꺽정,유관순,안중근,윤봉길을 나열해라
 	for(int index = 0; index < name.length; index++) { //인덱스는 초기화하고 name만큼 방의 크기를 만들고 반복되게 해라 
 		System.out.println(name[index]); // name의 0번부터 출력되게 해라
 	}
 	System.out.println("--------------------------");

 	for(int s = 1; s < 7; s++) { //s 는 1로 초기화해주고, s가 7보다 작으면, s를 반복한다.
 		for(int b = 0; b < s; b++) { // b는  0으로 초기화해주고, b가 s보다 작을때까지 b를 반복해라.
 			System.out.print("*");// *모양으로 출력해라
 		}
 		System.out.println(); 		
 	}
 	System.out.println("--------------------------");
 	
 	label1:{
	 	for(int s = 1; s < 7; s++) {
	 		for(int b = 0; b < s; b++) {
	 			System.out.print("*");
	 			if(b == 2)
	 				break label1;
	 		}
	 		System.out.println(); 		
	 	}
 	}
 	System.out.println(); 		
 	
 	System.out.println("--------------------------");
 	
 	for (int a = 2; a <= 9; a++) {
        for (int b = 1; b <= 9; b++) {
            System.out.printf("%d x %d = %d\n", a, b, a * b);
        }
    }
 	
 	System.out.println("--------------------------");
 	
 	int v = 98761234;
	    for (; v > 0; v /= 10) {
	        System.out.printf("%d ", v % 10);
	    }
	    System.out.println();
	    
	    System.out.println("--------------------------");
	    
	    for(int i = 0; i < 5; i++)	
	 		System.out.println(i);
	 	
	 	System.out.println("--------------------------");
	 	
	 	for(int i = 0, j = 0; i < 5; i++, j += 2)
	 		System.out.printf("%d, %d\n", i, j);
	 	
	 	System.out.println("--------------------------");
	 	
	 	int sum = 0;
	 	for (int i = 1; i <= 10; i++)
	 		sum += i;
	 	System.out.println(sum);
	 	
	 	System.out.println("--------------------------");
	 	
	 	for(int i = 1; i <= 10; i++) {
	 		System.out.print("=> ");
	 		System.out.println(i);
	 	}
	 	
	 	System.out.println("--------------------------");
	 	

	 	for(int i = 1; i <= 10; i++) {
	 		if (i == 7)
	 			break; //7이 되기 전에 끝내라
	 		System.out.println(i);
	 	}
	 	
	 	System.out.println("--------------------------");
	 	

	 	for(int i = 1; i <= 10; i++) {
	 		if (i == 7)//만약 i가 7이라면
	 			continue; //7을 뛰어넘고 다음부터 다시 출력해라
	 		System.out.println(i);
	 	}
	 	
	 	System.out.println("--------------------------");
	 	
	 	int i = 0;
	 	for(; i <= 5; i++) {
	 		System.out.println(i);
	 	}
	 	System.out.println(i);
	 	
	 	System.out.println("--------------------------");
	 	
	 	i = 0; //i = 0부터 시작하고
	 	for(; i < 5;) { // i는 5까지 증가한다. <=생략할 수는 있지만 거의 사용하지 않는다.
	 		System.out.println(i); //i를 출력해라
	 		i++;// <= 붙어 있지 않으면 무한으로 증가한다.
	 	}
	 	
	 	System.out.println("--------------------------");
	 	
	 	i = 0; 
	 	for(;;) { // 조건 검사를 하지 않으니까 무한으로 반복한다.
	 		System.out.println(i); 
	 		i++;
	 		if(i == 5)
	 			break;
	 	}
 	 }
}