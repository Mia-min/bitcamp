// ## 연산자 - 복합 대입(할당) 연산자 응용
// - 비트 연산자의 활용 예
//

package bitcamp.java100;

public class Test15_13 {

    public static void main(String[] args) {
    	int k1 = 100;
    	int sum = 0;
    	
    	//일반 대입 연산자 입력 방법
    	sum = sum + 100;
    	sum = sum + k1;
    	
    	System.out.println(sum);
    	
    	//복합 대입 연산자 입력 방법 
    	sum = 0;
    	sum += 100;
    	sum += k1;
    	
    	System.out.println(sum);
    }
}




















