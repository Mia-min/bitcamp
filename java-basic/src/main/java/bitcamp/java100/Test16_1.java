// ## 문자 - 블록과 변수의 범위
//

package bitcamp.java100;

public class Test16_1 {

    public static void main(String[] args) {
    	int a= 100;
    	
    	{
    		//바깥 블록에 선언된 변수와 같은 이름으로 변수를 만들 수 없다.
    		//int a = 200;
    		System.out.println(a);
    		
    		// 블록 안에 새 변수를 만들 수 있다.
    		int b = 200;
    		System.out.println(b);
    	}
    	System.out.println(a);
    	
    	//블록을 벗어난 변수는 사용할 수 없다.
    	//System.out.println(b);
    	
    	
    }
}
 